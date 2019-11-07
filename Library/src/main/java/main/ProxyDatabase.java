package main;
import java.util.ArrayList;
import java.util.List;
public class ProxyDatabase implements Database {
    private Database database = new RealDatabase();
    private static List<Integer> bannedIDs;
    static {
        bannedIDs = new ArrayList<Integer>();
        bannedIDs.add(12345678);
        bannedIDs.add(23456789);
        bannedIDs.add(34567890);
    }
    @Override
    public void processRequest(int personID) throws Exception {
        if (bannedIDs.contains(personID)) {
            throw new Exception("Access Denied - User banned from Library resources");
        }
        database.processRequest(personID);
    }
}