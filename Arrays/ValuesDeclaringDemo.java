public class ValuesDeclaringDemo {
    public static void main(String[] args){
        int[] marks = new int[10];

        /* First type of assigning values into array */
        marks[0] = 90;
        marks[1] = 80;
        marks[3] = 40;
        marks[4] = 70;
        marks[5] = 60;
        marks[6] = 48;
        marks[7] = 78;
        marks[8] = 45;
        marks[9] = 98;

        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }


        System.out.println();

        int[] marksOfStudent = {90,30,50,60,70,77};
        for(int j=0;j<marksOfStudent.length;j++){
            System.out.println(marksOfStudent[j]);
        }
    }
    
}
