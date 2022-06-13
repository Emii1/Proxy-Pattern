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

    private  Set<String> denyListedHosts;
     private URL redirectPage;
    private Set<Integer> teacherIDs;
     private  boolean authorized;

    public SchoolProxy(boolean authorized) {
        NetworkConnection networkConnection = new NetworkConnection();
        this.authorized = false;
        Set<String> set = new HashSet<String>();

    }

    // TODO: Implement the SchoolProxy

}
