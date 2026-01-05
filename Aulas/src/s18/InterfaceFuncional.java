package s18;

import java.util.ArrayList;
import java.util.List;
import s18.entidades.Product;
import s18.utils.ProductPredicate;

public class InterfaceFuncional {
    
    public static void iFuncional() {
        List<Product> stock = new ArrayList<>();
        
        stock.add(new Product("Tv", 900.0));
        stock.add(new Product("Mouse", 50.0));
        stock.add(new Product("HD Case", 80.90));
        stock.add(new Product("Tablet", 350.50));
        
        System.out.println("- Predicate\n");
        double min = 100.0;
        stock.removeIf(p -> p.getPrice() >= min);
        //stock.removeIf(new ProductPredicate());
                
        for (Product p : stock) {
            System.out.println(p);
        }
    }
}
