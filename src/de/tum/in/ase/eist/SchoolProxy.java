package de.tum.in.ase.eist;

import java.net.URL;
import java.util.HashSet;
import java.util.Set;

public class SchoolProxy implements ConnectionInterface{

    public void connect(URL url) {

    }
    public void disconnect() {

    }

    public boolean isConnected() {
        return false;
    }

    public void login(int teacherID) {}

    public void logout() {}

    private Set<String> denylistedHosts ;
     private URL redirectPage;
    private Set<Integer> teacherIDs;
     private boolean authorized;
     private NetworkConnection networkConnection;


    public SchoolProxy(Set<String> denylistedHosts, URL redirectPage, Set<Integer> teacherIDs) {
        this.networkConnection = new NetworkConnection();
        this.authorized = false;

        this.teacherIDs = teacherIDs;
        this.redirectPage = redirectPage;
        this.denylistedHosts = denylistedHosts;
    }

    // TODO: Implement the SchoolProxy

}
