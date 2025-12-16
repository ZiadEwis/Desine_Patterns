public class CreditCard implements paymentMethod {
    private String cardNumber;
    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    @Override
    public void pay(double amount) {
        System.out.println("CreditCard Pay Amount is " + amount);
    }
}
