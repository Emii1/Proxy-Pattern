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

    public  Set<String> denylistedHosts;
     public URL redirectPage;
    public Set<Integer> teacherIDs;
     public boolean authorized;
     public NetworkConnection networkConnection;


    public SchoolProxy(Set<String> denylistedHosts, URL redirectPage, Set<Integer> teacherIDs) {
        this.networkConnection = new NetworkConnection();
        this.authorized = false;

        this.teacherIDs = teacherIDs;
        this.redirectPage = redirectPage;
        this.denylistedHosts = denylistedHosts;
    }

    // TODO: Implement the SchoolProxy

}
