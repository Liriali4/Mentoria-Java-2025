package s16.services;

public class TaxService implements TaxInterface {

    @Override
    public double tax(double amount) {
        if(amount <= 100.0){
            return amount * 0.2;
        }else{
            return amount * 0.15;
        }
    }
}
