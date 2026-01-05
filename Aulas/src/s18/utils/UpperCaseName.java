package s18.utils;

import java.util.function.Function;
import s18.entidades.Product;

public class UpperCaseName implements Function<Product, String>{

    @Override
    public String apply(Product p) {
        return p.getName().toUpperCase();
    }
    
}
