package JavaPractice;

public class Continue {
    public static void main(String[]args) {
        for (int i = 0; i < 15; i++) {
            if (i > 3 && i < 12) {
                continue;
            }
            System.out.println(i);
        }
    }

}
