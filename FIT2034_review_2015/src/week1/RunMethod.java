package week1;

/**
 * Created by Theresa on 2/11/15.
 */
public class RunMethod {


    public static void main(String args[])
    {
        int i = 1111;
        int j = 22;
        char newChar = returnChar(1211, 20, "some string");
        System.out.println("The value of the returned Char is: " + newChar);
        CreateConstructor construct = new CreateConstructor(i, j);
        System.out.println("The area of the Rectangle is: " + construct.getAreaofRectangle());
    }

    private static char returnChar(int num1, int num2, String message){

        System.out.println("Int 1 is " + num1);
        System.out.println("Int 2 is " + num2);
        System.out.println("The message is: " + message);
        char outChar = (char)num1;
        return outChar;
    }
}
