
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please enter a string you would like reversed: ");
        String user = scnr.nextLine();
        int count = user.length(); //An int variable to keep count in the loop
        int place = 1; //An in variable to subtract from the string length to get the correct index
        String userReverse = ""; //String variable that will contain the reversed input

        while (count != 0) {
            userReverse += user.charAt(user.length() - place);  //Gets the necessary character and concatenates it to the final string
            count -= 1; //Subtracts from the countdown
            place += 1; //Adds to the amount necessary to subtract from the length to get the correct index
        }

        System.out.println(userReverse); //Prints the final string
    }
}
