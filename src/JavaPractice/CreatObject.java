package JavaPractice;

public class CreatObject {
    int i=5;
    int p= 10;
    String fname = "John";
    String lname = "Doe";
    int age = 24;
    public static void main (String[]args) {
        CreatObject myObj = new CreatObject();
        CreatObject myObj2= new CreatObject();
        CreatObject myObj3 = new CreatObject();
        System.out.println(myObj.i);
        System.out.println(myObj2.p);
            System.out.println("Name: " + myObj3.fname + " " + myObj3.lname);
            System.out.println("Age: " + myObj3.age);
        }

}
