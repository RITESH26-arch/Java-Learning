public class Product {
    String nameOfProduct;
    int quantityOfProduct;
    double priceOfProduct;

    Product(String nameOfProduct, int quantityOfProduct, double priceOfProduct){
        this.nameOfProduct = nameOfProduct;
        this.quantityOfProduct = quantityOfProduct;
        this.priceOfProduct = priceOfProduct;
    }

    Product(String nameOfProduct, int quantityOfProduct){
        this(nameOfProduct,quantityOfProduct,0.0);
    }

    Product(String nameOfProduct){
        this(nameOfProduct,0,0.0);
    }

    double getTotalPrice(){
        double  total;
        total = this.priceOfProduct * this.quantityOfProduct;
        return total;
    }

    void DisplayAllProductDetails(){
        System.out.println("Name => " + nameOfProduct + "\nQuantity => " + quantityOfProduct + "\nPrice => "+ priceOfProduct);
    }
}
