public class Main {
    public static void main(String[] args){
        Cart cart = new Cart();
    cart.addProduct(new Product("Triumph Speed 400",1,350000));
    cart.addProduct(new Product("BMW GS 1300",2,3000000));
    cart.addProduct(new Product("Triumph Speed 400"));
    cart.showTotalBill();
    }
}
