package programmer.zaman.now.application;

import programmer.zaman.now.data.Product;

public class App {
    public static void main(String[] args) {
        Product product = new Product("Handphone",3_500_000);
        Product product1 = new Product("Console Game",1_500_000);
        Product product2 = new Product("Handphone",3_500_000);
//        System.out.println();
//        System.out.println(product);
//        System.out.println(product1);
//        System.out.println(product2);
//        System.out.println();
//        System.out.println("Apakah objek 1 dan 2 sama ? "+product.equals(product1));
//        System.out.println("Apakah objek 1 dan 3 sama ? "+product.equals(product2));
        System.out.println(product.hashCode()==product2.hashCode());

    }
}
