package GCash.service;

import GCash.model.Account;
import java.util.Iterator;
import java.util.Map;

public class MaintenanceService {
    private final DataStore db;

    public MaintenanceService(DataStore db) {
        this.db = db;
    }

    // UC9
    public String softwareUpdates() {
        db.log("SOFTWARE UPDATE applied");
        return "Applying software update... Done. System is up to date.";
    }

    // UC10
    public String diagnostics() {
        // Sum balances (Java 8 friendly, no fancy streams needed)
        double total = 0.0;
        for (Map.Entry<String, Account> e : db.accounts.entrySet()) {
            total += e.getValue().getBalance();
        }

        // Build last 10 logs
        StringBuilder recent = new StringBuilder();
        int start = Math.max(0, db.logs.size() - 10);
        for (int i = start; i < db.logs.size(); i++) {
            recent.append(" - ").append(db.logs.get(i)).append("\n");
        }

        db.log("DIAGNOSTICS viewed");

        StringBuilder sb = new StringBuilder();
        sb.append("=== Diagnostics ===\n");
        sb.append("Users: ").append(db.accounts.size()).append("\n");
        sb.append("Total system balance: ").append(DataStore.php(total)).append("\n");
        sb.append("Recent logs:\n");
        sb.append(recent.toString());
        sb.append("===================\n");
        return sb.toString();
    }
}
