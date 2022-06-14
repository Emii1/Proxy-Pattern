package de.tum.in.ase.eist;

import java.net.URL;

import java.util.Set;

public class SchoolProxy implements ConnectionInterface {


    private Set<String> denylistedHosts;
    private URL redirectPage;
    private Set<Integer> teacherIDs;
    private boolean authorized;
    private NetworkConnection networkConnection;





    public void login(int teacherID) {
        if (teacherIDs.contains(teacherID)) { networkConnection.connect(redirectPage); }
        authorized = true;
    }

    public void setAuthorized(boolean authorized) {
        this.authorized = authorized;
    }

    public void logout() { authorized = false; }




    public SchoolProxy(Set<String> denylistedHosts, URL redirectPage, Set<Integer> teacherIDs) {
        this.networkConnection = new NetworkConnection();
        this.authorized = false;

        this.teacherIDs = teacherIDs;
        this.redirectPage = redirectPage;
        this.denylistedHosts = denylistedHosts;
    }

    public boolean isAuthorized() {
        return authorized;
    }

    @Override
    public boolean isConnected() {
         return networkConnection.isConnected(); }


    public void disconnect() {
        networkConnection.disconnect();
    }
    public void connect(URL url) {
        if (denylistedHosts.contains(url.getHost())) System.out.println(redirectPage);
        System.err.println("Connection to" + url + "was rejected");
        networkConnection.connect(url);

    }




}
