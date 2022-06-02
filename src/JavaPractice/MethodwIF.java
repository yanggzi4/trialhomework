package JavaPractice;

public class MethodwIF {
    static void checkAge(int age) {
        if (age < 18) System.out.println("Access denied: Not old enough");
        else {
            System.out.println("Access granted: Old enough");
        }
    }
        public static void main (String[]args){
            checkAge(21);

        }

    }

