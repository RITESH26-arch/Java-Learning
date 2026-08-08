public class Cart {
    Product[] products = new Product[10];
    int count;
    
    void addProduct(Product p){
        products[count] = p;
        count++;
    }

    double calculateGrandTotal(){
        double total = 0;
        for(int i=0;i<count;i++){
            total = total + products[i].getTotalPrice();
        }
        return total;
    }

    void showTotalBill(){
        for(int i=0;i<count;i++){
            products[i].DisplayAllProductDetails();
        }
        double total = calculateGrandTotal();
        System.out.println(total);
    }
}
