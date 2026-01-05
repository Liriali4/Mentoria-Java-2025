package s18;

import java.util.List;
import java.util.function.Predicate;
import s18.entidades.Product;

public class ProductService {
    public double filteredSum(List<Product> list, Predicate<Product> criteria){
        double sum = 0.0;
        for(Product p: list){
            if(criteria.test(p)){
                sum += p.getPrice();
            }
        }
        
        return sum;
    }
}
