package CaseStudy_MetroSuperStore;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InventorySystem {
    private Product[] products = new Product[100];
    int productCount;

    public void addProduct(Product product) {
        products[productCount++] = product;

    }

    public void removeProduct(int uniqueIdentifier) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && products[i].getUniqueIdentifier() == (uniqueIdentifier))
                products[i] = null;
            productCount--;
            break;
        }
    }

    public void displayAvailableProducts() {
        for (Product product : products) {
            if (product != null && product.getStockQuantity() > 0) {
                System.out.println(product);
            }
        }
        System.out.println("No product available for display");
    }
    public void generateProductDetails(int uniqueIdentifier){
        for(int i = 0; i < productCount; i++){
            if(products[i] != null && products[i].getUniqueIdentifier() == (uniqueIdentifier)) {
                System.out.println("Product Details");
                System.out.println(products[i]);
            }
        }
        System.out.println("Product not found");
    }

    public Product searchProduct(int uniqueIdentifier) {
            for (int i = 0; i < productCount; i++) {
                if (products[i] != null && products[i].getUniqueIdentifier() == (uniqueIdentifier)) {
                    System.out.println("Product found " + products[i].getName());
                    return products[i];
                }
            }
        System.out.println("product not found");
        return null;
    }
    public void updatePrice(int uniqueIdentifier, double newPrice){
        Product product = searchProduct(uniqueIdentifier);
        if (product != null){
            product.setPrice(newPrice);
            System.out.println("Price updated" + product.getName());
        }
    }
    public void updateStockQuantity(int uniqueIdentifier, int newStockQuantity){
        Product product = searchProduct(uniqueIdentifier);
        if(product != null){
            product.setStockQuantity(newStockQuantity);
            System.out.println("Quantity updated: " + product.getName() +": "+ product.getStockQuantity());
        }
    }
}

