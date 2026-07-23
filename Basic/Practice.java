public class Practice {
    public static void main(String args[]){
        int[]  array = {56,83,68,95,69,97,45};
        int temp = array[0];
        

        for(int i=0;i<array.length;i++){
            if(temp<array[i]){
                temp = array[i];
                
            }
            
        }
        System.out.println(temp);
    }
    
}
