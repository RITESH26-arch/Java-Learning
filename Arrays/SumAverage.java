public class SumAverage {
    public static void main(String[] args){
        int sum = 0;
    

        int[] numberofStudents = {10,20,30,40,50};

        for(int i=0;i<numberofStudents.length;i++){
            sum = sum + numberofStudents[i];
        }

        double avg = (double) sum / numberofStudents.length;

        System.out.println("Sum => "+sum+"\nAverage => "+avg);
    }
    
}
