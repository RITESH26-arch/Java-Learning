public class MethodDemo {
    static void ding(){
        System.out.println("Hii BKL !!!");
    }


    static  void greetName(String name){
        System.out.println(name);
    }


    static int  add(int a, int b){
        int sum = a+b;
        return sum;
    }


    public static void main(String[] args){
        ding();
        ding();
        greetName("Ritesh");
        int jung = add(3,7);
        System.out.println(jung);
    }
    
}
