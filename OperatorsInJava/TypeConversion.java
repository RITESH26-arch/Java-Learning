public class TypeConversion {
    public static void main(String[] args){

        /* Chain for the type conversion  for the */
        /* Byte -> Short -> Int -> Long -> Float -> Double */

        /* Implicit Type Conversion from lower to Higher data type in the chain */
        int priceone = 10;
        double pricetwo = priceone;
        System.out.println(pricetwo);

        /* Implicit Type conversion from higher data type to lower data type in the chain */
        double ExactAge = 24.234;
        int StandardAge = (int) ExactAge;
        System.out.println(StandardAge);
    }
    
}
