public class ShoppingCart {
    private paymentMethod paymentMethod;

    public void setPaymentMethod(paymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void checkout(double amount){
        paymentMethod.pay(amount);
    }
}
