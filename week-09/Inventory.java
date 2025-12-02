
/**
 * Collection manager for Product objects. Maintains an ArrayList 
 * of products and provides lookup by id, listing, addition, 
 * removal, refill operations, and a query for low-stock products 
 * to trigger admin actions.
 *
 * @author (Bara S. Rohmani)
 * @version (v1.0 — 2025-10-14)
 */

import java.util.ArrayList;

public class Inventory {
    private ArrayList<Product> products;
    
    public Inventory() {
        products = new ArrayList<Product>();
    }
    
    public void addProduct(Product p) {
        products.add(p);
    }
    
    public Product getProductById(int id) {
        for(Product p : products) {
            if(p.getId() == id) return p;
        }
        return null;
    }
    
    public void listProducts() {
        System.out.println("Produk tersedia:");
        for(Product p : products) {
            System.out.println(" " + p.toString());
        }
    }
    
    public void refillProduct(int id, int qty) {
        Product p = getProductById(id);
        if(p != null) {
            p.setStock(p.getStock() + qty);
            System.out.println("Me-refill " + p.getName() + 
            " sebanyak " + qty + ". Stok terbaru: " + p.getStock());
        } else {
            System.out.println("ID produk tidak ditemukan!");
        }
    }
    
    public ArrayList<Product> getLowStockProducts() {
        ArrayList<Product> low = new ArrayList<Product>();
        for(Product p : products) {
            if(p.needsRefill()) low.add(p);
        }
        return low;
    }
}