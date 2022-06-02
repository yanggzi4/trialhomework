package JavaPractice;

public class MethodParameter {
    static void myMethod(String fname, int age){
        System.out.println(fname + " Vergara"+ " is "+ age);
    }
    public static void main(String[]args){
        myMethod("Jenny", 8);
        myMethod("Sofia", 14);
        myMethod("Hillary",11);
    }
}
