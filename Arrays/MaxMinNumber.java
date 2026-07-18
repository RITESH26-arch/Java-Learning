public class MaxMinNumber {
    
    public static void main(String[] args){
        int[]  MaxMin = {45, 12, 78, 23, 56, 89, 34};
        int Max = MaxMin[0],Min = MaxMin[0];
        for(int i = 0;i<MaxMin.length;i++){
            if(Max<=MaxMin[i]){
                Max = MaxMin[i];
            }
        }

        for(int i = 0;i<MaxMin.length;i++){
             if(Min>=MaxMin[i]){
                Min = MaxMin[i];
            }
        }

        System.out.println("Maximum Number in Array is => "+Max+"\nMinimum Number in Array is => "+Min);
    }
}
