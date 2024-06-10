import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //As people pass through an entry kiosk at the theater, they are prompted to enter their age.  If they are 21 or older, they get a paper wrist band.  Code a logic program that asks the user to enter their age and then if they are 21 or over displays a  message that they get a wrist band.  (Note that the program does nothing if they are not 21 or over…)
        int age;
        System.out.print("Enter your age: ");

        Scanner in = new Scanner(System.in);

        if (in.hasNextInt()) {
            age = in.nextInt();
            in.nextLine();
            if (age >= 21) {
                System.out.println("You get a wrist band.");
            }
        }
        else {
            System.out.println("Invalid input.");
        }
    }
}