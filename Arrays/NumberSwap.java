public class NumberSwap {
    public static void  main(String[] args){
        int[] numbers = {10, 20, 30, 40, 50};
        int[] ReversedArray = new int[5];

        int index = 0;

        System.out.println(numbers.length);
        System.out.println(ReversedArray.length);

        for(int i=numbers.length-1;i>=0;i--){
                ReversedArray[index]= numbers[i];
                index++;     
        }
        for(int i = 0; i < ReversedArray.length; i ++){
            System.out.println(ReversedArray[i]);
        }
        
    }    
}
