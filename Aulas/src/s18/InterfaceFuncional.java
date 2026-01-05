package s18;

import java.util.ArrayList;
import java.util.List;
//import java.util.function.Function;
import java.util.stream.Collectors;
import s18.entidades.Product;
//import s18.utils.PriceUpdate;
//import s18.utils.UpperCaseName;

public class InterfaceFuncional {

    public static void iFuncional() {
        List<Product> stock = new ArrayList<>();

        stock.add(new Product("Tv", 900.0));
        stock.add(new Product("Mouse", 50.0));
        stock.add(new Product("HD Case", 80.90));
        stock.add(new Product("Tablet", 350.50));

        ProductService ps = new ProductService();

        double sum = ps.filteredSum(stock, p -> p.getName().charAt(0) == 'T');
        
        System.out.println("Sum = " + String.format("%.2f", sum) + "\n");

        System.out.println("- Predicate\n");
        double min = 100.0;
        stock.removeIf(p -> p.getPrice() >= min);
        //stock.removeIf(new ProductPredicate());

        for (Product p : stock) {
            System.out.println(p);
        }
        System.out.println("");

        System.out.println("- Consumer\n");
        //stock.forEach(new PriceUpdate());
        stock.forEach(p -> p.setPrice(p.getPrice() * 1.1));
        stock.forEach(System.out::println);
        System.out.println("");

        System.out.println("- Funtion\n");
        //Function<Product, String> func = p -> p.getName().toUpperCase();
        //List<String> names = stock.stream().map(new UpperCaseName()).collect(Collectors.toList());
        List<String> names = stock.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
        names.forEach(System.out::println);
        System.out.println("");

    }
}
