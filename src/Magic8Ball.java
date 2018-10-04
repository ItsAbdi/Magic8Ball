import java.util.Scanner;

public class Magic8Ball {

    public static void main(String[] args) {
        //declare

//        int firstNumber = 10
//        int secondNumber = 69;
//        if (firstNumber>secondNumber);
//        System.out.println(firstNumber + " is greater than " + secondNumber);
        Scanner keyboard;
        int testing;
        String question;

        //initialization
        keyboard = new Scanner(System.in);
        System.out.println("what is your question? ");
        question = keyboard.nextLine();
        System.out.println(" put in a random number of your choice between 1-100.");
        testing = keyboard.nextInt();
        if ((1 <= testing) && (testing <= 10)) {
            System.out.println("your outcome looks good!");
        }
        if ((11 <= testing) && (testing <= 20)) {
            System.out.println(" There are dark days ahead...");
        }
        if ((21 <= testing) && (testing<=30)) {
            System.out.println(" Its a No from me dawg.");
        }
        if ((31 <= testing) && (testing<= 40)){
            System.out.println("Yes!");
        }
        if ((41 <= testing) && (testing<= 50)) {
            System.out.println("No!");
        }
        if ((51 <= testing) && (testing<= 60)){
            System.out.println("Awesome!");
        }
        if ((61 <=testing) && (testing<= 70)) {
            System.out.println("Hip-Hip Hooray");
        }
        if ((71 <=testing) && (testing<= 80)) {
            System.out.println("Take a hike");
        }
        if ((81 <=testing) && (testing<= 90)) {
            System.out.println("You've got luck on your side");
        }
        if ((91 <=testing) && (testing<= 100)) {
            System.out.println("ghobe' , that's no in Klingon");
        }













    }
}