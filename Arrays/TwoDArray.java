public class TwoDArray {
    public static void main(String[] args){
        int[][] Matrix = {{1,2,3},{4,5,6},{7,8,9}};

        for(int i = 0;i<Matrix.length;i++){
            for(int j=0;j<Matrix[i].length;j++){
                System.out.print(Matrix[i][j]+" ");
            }
        System.out.println();
        }

        System.out.println();
        
        for(int i=0;i<Matrix.length;i++){
            int RowSum = 0;
            for(int j=0;j<Matrix[i].length;j++){
                
                RowSum = RowSum + Matrix[i][j];
            }
            System.out.println("Sum Of Row "+(i+1)+" => "+RowSum);
        }
        
    }
    
}
