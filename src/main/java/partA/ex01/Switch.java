package partA.ex01;
import java.util.Scanner;
public class Switch {

    public static String switchStatement(){
        String response = "";

        /* Put your code in between these comments : Top */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the month as a number: ");
        int month = input.nextInt();
        switch (month)
        {
            case 1:
                response+= "January";
                break;
            case 2:
                response+= "February";
                break;
            case 3:
                response+= "March";
                break;
            case 4:
                response+= "April";
                break;
            case 5:
                response+= "May";
                break;
            case 6:
                response+= "June";
                break;
            case 7:
                response+= "July";
                break;
            case 8:
                response+= "August";
                break;
            case 9:
                response+= "September";
                break;
            case 10:
                response+= "October";
                break;
            case 11:
                response+= "November";
                break;
            case 12:
                response+= "December";
                break;
        }


        /* Put your code in between these comments : Bottom */



        return response;
    }
    public static void main(String args[]) {
        String switchOutput = switchStatement();
        System.out.println(switchOutput);
    }
}
