package trialpackage;

public class UseHomework{
    public static void main (String [] args){
        Homework homework = new Homework();
        String str= "Trying out my first java project";

        System.out.println (str);
        System.out.println (str.toUpperCase());
        System.out.println (str.toLowerCase());
        System.out.println ("the index of java is "+str.indexOf("java"));
        System.out.println (str.length());
        System.out.println (str.replace('j','J'));
        System.out.println (str.replace("project","Homework"));
        System.out.println (str.trim());
        homework.subtraction(10,20);
        System.out.println(homework.addition());
        System.out.println(homework.multiplication());



    }

}


