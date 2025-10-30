/**Documentation
/**
 * USER CUSTOMER
 * UC1 Authentication (PIN)
 * UC2 Check Balance
 * UC3 Deposit Cash
 * UC4 Withdraw Cash
 * UC5 Transfer Funds
 * UC6 App Transaction entry (Menu)
 * UC7 App Help (from Menu / during transaction)
 * UC8 Maintenance (Engineer only)
 * UC9 Software Updates (includes by Maintenance)
 * UC10 Diagnostics (includes by Maintenance)
 * 
 * USER ACCOUNT
 * anna	1234	₱1500.00	Customer 1
 * bamby 4321	₱750.00	Customer 2
 * guest 1111 ₱100.00	Customer 3 (test/low balance)
 * Support : engineer 9999
 * 
 */


package GCash;

import GCash.model.Account;
import GCash.service.AuthService;
import GCash.service.DataStore;
import GCash.service.MaintenanceService;
import GCash.service.TransactionService;

import java.util.Scanner;

public class Main {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        DataStore db = new DataStore();
        AuthService auth = new AuthService(db);
        TransactionService tx = new TransactionService(db);
        MaintenanceService mnt = new MaintenanceService(db);

        System.out.println("=== GCash Project (CIICC Task 1-6-1) ===");

        while (true) {
            System.out.println("\nLogin as:");
            System.out.println("1) Customer");
            System.out.println("2) GCash Software Engineer");
            System.out.println("0) Exit");
            System.out.print("Choose: ");
            String choice = in.nextLine().trim();

            switch (choice) {
                case "1":
                    customerFlow(auth, tx);
                    break;
                case "2":
                    engineerFlow(auth, mnt);
                    break;
                case "0":
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    // ---------------- Customer Flow (UC1 → UC6 → UC2–UC5, UC7) ----------------
    private static void customerFlow(AuthService auth, TransactionService tx) {
        System.out.print("Username: ");
        String user = in.nextLine().trim();
        System.out.print("PIN: ");
        int pin = readInt();

        Account acc = auth.authenticateCustomer(user, pin);
        if (acc == null) {
            System.out.println("Login failed.");
            return;
        }

        while (true) {
            System.out.println("\n--- Customer Menu ---");
            System.out.println("1) Check Balance");
            System.out.println("2) Deposit Cash ");
            System.out.println("3) Withdraw Cash ");
            System.out.println("4) Transfer");
            System.out.println("5) App Help");
            System.out.println("0) Logout");
            System.out.print("Choose: ");
            String c = in.nextLine().trim();

            switch (c) {
                case "1":
                    System.out.println(tx.checkBalance(acc));
                    break;
                case "2":
                    System.out.print("Amount: ");
                    double dep = readDouble();
                    System.out.println(tx.deposit(acc, dep));
                    break;
                case "3":
                    System.out.print("Amount: ");
                    double wd = readDouble();
                    System.out.println(tx.withdraw(acc, wd));
                    break;
                case "4":
                    System.out.print("To username: ");
                    String to = in.nextLine().trim();
                    System.out.print("Amount: ");
                    double amt = readDouble();
                    System.out.println(tx.transfer(acc, to, amt));
                    break;
                case "5":
                    System.out.println(tx.helpText());
                    break;
                case "0":
                    System.out.println("Logged out.");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    // ---------------- Engineer Flow (UC8 → UC9, UC10) ----------------
    private static void engineerFlow(AuthService auth, MaintenanceService mnt) {
        System.out.print("Engineer ID: ");
        String id = in.nextLine().trim();
        System.out.print("Engineer PIN: ");
        int pin = readInt();

        if (!auth.authenticateEngineer(id, pin)) {
            System.out.println("Access denied.");
            return;
        }

        while (true) {
            System.out.println("\n--- Maintenance Menu ---");
            System.out.println("1) Software Updates");
            System.out.println("2) Diagnostics");
            System.out.println("0) Back");
            System.out.print("Choose: ");
            String c = in.nextLine().trim();

            switch (c) {
                case "1":
                    System.out.println(mnt.softwareUpdates());
                    break;
                case "2":
                    System.out.println(mnt.diagnostics());
                    break;
                case "0":
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    // ---------------- Input helpers ----------------
    private static int readInt() {
        while (true) {
            try {
                return Integer.parseInt(in.nextLine().trim());
            } catch (Exception e) {
                System.out.print("Enter a whole number: ");
            }
        }
    }

    private static double readDouble() {
        while (true) {
            try {
                return Double.parseDouble(in.nextLine().trim());
            } catch (Exception e) {
                System.out.print("Enter a valid number: ");
            }
        }
    }
}
