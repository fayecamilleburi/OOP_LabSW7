import java.io.*;
import java.util.*;

public class PaymentProcessor {
    private final Map<String, PaymentMethod> paymentMethods;

    public PaymentProcessor(Map<String, PaymentMethod> paymentMethods) {
        this.paymentMethods = paymentMethods;
    }

    public void processPayment(Order order) {
        String paymentMethod = order.getPaymentMethod();

        if (paymentMethods.containsKey(paymentMethod)) {
            PaymentMethod method = paymentMethods.get(paymentMethod);
            method.pay(order.getAmount());
        } else {
            throw new IllegalArgumentException("Unsupported payment method: " + paymentMethod);
        }
    }
}