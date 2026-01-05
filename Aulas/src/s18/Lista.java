package s18;

import java.util.ArrayList;
import java.util.List;
import s18.entidades.Product;


public class Lista {

    public static void lista() {
        List<Product> stock = new ArrayList<>();

        stock.add(new Product("Tv", 900.0));
        stock.add(new Product("Notebook", 1200.0));
        stock.add(new Product("Tablet", 400.0));

        stock.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        for (Product p : stock) {
            System.out.println(p);
        }
    }
}
