public class InstaPay implements paymentMethod{
    private int phonenumber;

    public InstaPay(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("InstaPay pay amount: " + amount);
    }
}
