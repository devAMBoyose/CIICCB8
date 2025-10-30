package GCash.service;

import GCash.model.Account;

public class AuthService {
    private final DataStore db;

    public AuthService(DataStore db) {
        this.db = db;
    }

    public Account authenticateCustomer(String username, int pin) {
        if (username == null)
            return null;
        Account acc = db.accounts.get(username.toLowerCase());
        if (acc != null && acc.getPin() == pin) {
            db.log("AUTH OK for user " + acc.getUsername());
            return acc;
        }
        db.log("AUTH FAIL for user " + username);
        return null;
    }

    public boolean authenticateEngineer(String id, int pin) {
        boolean ok = "engineer".equalsIgnoreCase(id) && pin == 9999;
        db.log(ok ? "ENGINEER AUTH OK" : "ENGINEER AUTH FAIL");
        return ok;
    }
}
