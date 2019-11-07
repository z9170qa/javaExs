package main;
public class RealDatabase implements Database {
    @Override
    public void processRequest(int personID) {
        System.out.println("Processing request for " + personID);
    }
}