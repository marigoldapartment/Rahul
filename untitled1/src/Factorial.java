public class Factorial {

    public static void main(String... args){
        int number =5;
        int product = 1;
        for(int i=number; i>0;i--){
            product = product *i;
        }
        System.out.println(product);
    }
}



