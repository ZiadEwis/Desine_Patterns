
void main() {
    ShoppingCart Cart = new ShoppingCart();

    Cart.setPaymentMethod(new CreditCard("123456789"));
    Cart.checkout(500);

    Cart.setPaymentMethod(new PayPal(1234));
    Cart.checkout(300);

    Cart.setPaymentMethod(new InstaPay(123456789));
    Cart.checkout(400);
}
