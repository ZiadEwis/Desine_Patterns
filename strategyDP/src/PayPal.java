public class PayPal implements paymentMethod{
    private int userId;
    public PayPal(int userId){
        this.userId = userId;
    }

    @Override
    public void pay(double amount) {
        System.out.println("PayPal Pay Amount is " + amount);
    }
}
