// Problem 2
public class SeniorDiscount implements Discount {
    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.10; // 10% discount
    }
}