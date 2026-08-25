public interface Insurance {
    void showInsurance();

    default void displayInsurance(){
        System.out.println("\nI am your incurance !!!");
    }

    static void renewableInsurance(){
        System.out.println("\nPlease renew your insurance");
    }
}
