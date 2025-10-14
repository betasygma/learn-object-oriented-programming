
/**
 * Appender-style collection of Transaction records. Stores 
 * Transactions in an ArrayList, supports adding new records, 
 * printing a detailed report, and computing simple aggregates 
 * such as total sales.
 *
 * @author (Bara S. Rohmani)
 * @version (v1.0 — 2025-10-14)
 */

import java.util.ArrayList;

public class TransactionLog {
    private ArrayList<Transaction> Transactions;
    
    public TransactionLog() {
        Transactions = new ArrayList<Transaction>();
    }
    
    public void add(Transaction t) {
        Transactions.add(t);
    }
    
    public void print() {
        System.out.println("Laporan Transaksi:");
        double total = 0.0;
        for(Transaction t : Transactions) {
            System.out.println(t.toString());
            total += t.getPrice();
        }
        System.out.println("Total penjualan: Rp" + 
        String.format("%.2f", total));
    }
}