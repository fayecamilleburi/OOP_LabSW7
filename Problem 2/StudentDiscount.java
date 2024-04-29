// Problem 2
public class StudentDiscount implements Discount {
    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.05; // 5% discount
    }
}