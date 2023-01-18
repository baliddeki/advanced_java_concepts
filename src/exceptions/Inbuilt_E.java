package exceptions;

public class Inbuilt_E {
    Inbuilt_E(int a , int b){
        this.a = a;
        this.b =b;
    }
    int a, b;

    public static void main(String[] args) {
        try{
            Inbuilt_E obj = new Inbuilt_E(15, 1);
            int k = obj.a/obj.b;
            System.out.println("the quotient is "+k);

        }catch(ArithmeticException e){
            System.out.println("You can not divide  a number by zero!");
        }
        finally {
            System.out.println("You can proceed to further computation!");
        }
    }
}
