
/**
 * Central orchestrator for the simulator. Holds references to 
 * Inventory, PaymentProcessor, and TransactionLog, coordinates 
 * purchase and admin workflows, seeds initial products, and 
 * enforces high-level rules such as checking stock, dispensing 
 * items, logging transactions, and warning about low stock.
 *
 * @author (Bara S. Rohmani)
 * @version (v1.0 — 2025-10-14)
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class VendingMachine {
    private Inventory inventory;
    private TransactionLog log;
    private PaymentProcessor processor;
    private Scanner scanner;

    public VendingMachine(Scanner scanner) {
        this.scanner = scanner;
        inventory = new Inventory();
        log = new TransactionLog();
        processor = new PaymentProcessor(scanner);
        seedProducts();
    }

    private void seedProducts() {
        inventory.addProduct(new Product(
                1, "Soda", "Drink", 10000, 8, 2));
        inventory.addProduct(new Product(
                2, "Kukis", "Snack", 5000, 3, 2));
        inventory.addProduct(new Product(
                3, "Cola", "Drink", 12500, 5, 3));
        inventory.addProduct(new Product(
                4, "Chips", "Snack", 15000, 4, 2));
        inventory.addProduct(new Product(
                5, "Susu", "Drink", 7500, 2, 2));
    }

    public void displayMenu() {
        inventory.listProducts();
    }

    public void purchaseFlow() {
        displayMenu();
        System.out.println("\nMasukkan ID produk untuk membeli (atau 0 untuk membatalkan): ");
        String line = scanner.nextLine();

        int id;
        try { 
            id = scanner.nextInt();
            scanner.nextLine();
        } catch(Exception e) { 
            System.out.println("ID tidak valid.");
            return;
        }
        if(id == 0) {
            System.out.println("Pembayaran dibatalkan.");
            return;
        }

        Product p = inventory.getProductById(id);
        if(p == null) {
            System.out.println("Produk tidak ditemukan!");
            return;
        }
        if(p.getStock() <= 0) {
            System.out.println("Maaf, stok produk habis.");
            return;
        }

        System.out.println("\nMemilih: " + p.getName() + 
            "\nHarga: Rp" + String.format("%.2f", p.getPrice()));

        double paid = processor.acceptPayment(p.getPrice());
        double change = processor.computeChange(paid, p.getPrice());

        p.decrementStock();
        System.out.println("Mengeluarkan " + p.getName() +
            " ...\n\nSelamat menikmati!");
        if(change > 0.0) {
            System.out.println("Memberi kembalian: Rp" + 
                String.format("%.2f", change));
        }

        Transaction t = new Transaction(p.getId(), p.getName(), 
                p.getPrice(), paid, change);
        log.add(t);

        if(p.needsRefill()) {
            System.out.println("Perhatian: stok produk " + p.getName() 
                + " menipis (kini " + p.getStock() + ")");
        }
    }

    public void adminMenu() {
        while(true) {
            System.out.println("\nOpsi admin:\n1) Lihat transaksi\n2) Refill produk\n0) Kembali");
            String line = scanner.nextLine();
            if(line.equals("0")) break;
            else if(line.equals("1")) {
                log.print();
            } else if(line.equals("2")) {
                System.out.print("\nMasukkan ID produk untuk refill: ");
                String sid = scanner.nextLine();
                int id = -1;
                try { id = Integer.parseInt(sid); } catch(Exception e) { System.out.println("ID tidak valid."); continue; }
                System.out.print("Masukkan jumlah refill: ");
                String sqty = scanner.nextLine();
                int qty = 0;
                try { qty = Integer.parseInt(sqty); } catch(Exception e) { System.out.println("Jumlah tidak valid."); continue; }
                inventory.refillProduct(id, qty);
            } else {
                System.out.println("\nOpsi tidak diketahui.");
            }
        }
    }

    public void run() {
        System.out.println("Vending Machine memulai ...\n\n================ Menu Utama ================");
        while(true) {
            System.out.println();
            System.out.println("Pilih mode:\n1) Beli\n2) Admin\n0) Keluar");
            try {
                int cmd = scanner.nextInt();
                switch (cmd) {
                    case 0:
                        System.out.println("\nMematikan mesin. Sampai jumpa.");
                        return;
                    case 1:
                        purchaseFlow();
                        break;
                    case 2:
                        System.out.print("\nMasukkan password admin: ");
                        scanner.nextLine();
                        String pw = scanner.nextLine();
                        if("admin".equals(pw)) {
                            adminMenu();   
                        } else {
                            System.out.println("Password salah.");

                        }
                        break;
                    default:
                        System.out.println("Opsi tidak diketahui. Silakan coba lagi.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid. Mohon masukkan angka.");
                scanner.next();
            }
            System.out.println("\nEnter untuk kembali ke Menu Utama ...");
            scanner.nextLine();
        }
    }
}