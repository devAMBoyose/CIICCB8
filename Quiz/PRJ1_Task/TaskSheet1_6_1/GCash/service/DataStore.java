package GCash.service;

import GCash.model.Account;
import java.util.*;

public class DataStore {
    public final Map<String, Account> accounts = new HashMap<String, Account>();
    public final List<String> logs = new ArrayList<String>();

    public DataStore() {
        seedData();
    }

    private void seedData() {
        accounts.put("anna", new Account("anna", 1234, 1500.00));
        accounts.put("bamby", new Account("bamby", 4321, 750.00));
        accounts.put("guest", new Account("guest", 1111, 100.00));
        accounts.put("sample", new Account("sample", 2222, 100.00));
    }

    public void log(String message) {
        logs.add(new Date() + " | " + message);
    }

    public static String php(double v) {
        return String.format("PHP %.2f", v);
    }
}
