package partB.ex01;
import java.util.Scanner;
public class IfLight {
    public static String ifLight(){
        String response = "";

        /* Put your code in between these comments : Top */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a color code: ");
        int currentColor = input.nextInt();
        if (currentColor == 1)
        {
            response += "Next Traffic Light is green";
        }
        else if (currentColor == 2)
        {
            response += "Next Traffic Light is yellow";
        }
        else if (currentColor == 3){
            response += "Next Traffic Light is red";

        }
        else {
            response += "Invalid color";
        }




        /* Put your code in between these comments : Bottom */



        return response;
    }
    public static void main(String args[]) {
        String switchOutput = ifLight();
        System.out.println(switchOutput);
    }
}
