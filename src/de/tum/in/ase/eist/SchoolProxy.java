package de.tum.in.ase.eist;

import java.net.URL;
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

    public  Set<String> denyListedHosts;
     public URL redirectPage;
    public Set<Integer> teacherIDs;
     public  boolean authorized;

    public SchoolProxy(boolean authorized) {
        NetworkConnection networkConnection = new NetworkConnection();
        this.authorized = false;
    }

    // TODO: Implement the SchoolProxy

}
