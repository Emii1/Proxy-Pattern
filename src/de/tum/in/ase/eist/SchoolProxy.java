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

    public void login(int teacherID){}

    public void logout(){}

    private  Set<String> denyListedHosts;
     private URL redirectPage;
    private Set<Integer> teacherIDs;
     private  boolean authorized;

    public SchoolProxy(Set<String> denyListedHosts,URL redirectPage,Set<Integer> teacherIDs,boolean authorized) {
        this.denyListedHosts = denyListedHosts;
        this.redirectPage = redirectPage;
        this.teacherIDs = teacherIDs;
        this.authorized = false;
    }

    // TODO: Implement the SchoolProxy

}
