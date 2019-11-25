
/**
 * This program declares several variables of different types, then displays
 * their values on the screen.
 * 
 * @author Jessica Triana
 * @version 1
 */
public class SeveralVariables {
    public static void main(String[] args) {
        int j = 8;
        System.out.println(j);

        var p = true;
        System.out.println(p);

        var s = ("This is a string");
        System.out.println(s);

        System.out.print("The value in my int variable is ");
        System.out.println(j);
        System.out.print("The value in my boolean variable is ");
        System.out.println(p);
        System.out.print("The value in my string variable is ");
        System.out.println(s);

        int myInteger = 0;
        double myDouble1, myDouble2;
        String myString;

        myDouble1 = 1.2345;
        myDouble2 = 9.8765432;
        myString = "This is the string stored in myString";

        System.out.print("The value in my other int variable is ");
        System.out.println(myInteger);
        System.out.print("The values of my double variables are ");
        System.out.print(myDouble1);
        System.out.print(" and ");
        System.out.println(myDouble2);
        System.out.print("The value in my other string variable is ");
        System.out.print(myString);
        System.out.println("\".");
    }
}