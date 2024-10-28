import java.util.Scanner;

public class ChooseYourAdventure {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int timeToSchool = 0;
        String arrival = " ";

        System.out.print("Welcome to your morning routine before school. "
                + "Please enter the number corresponding to the option you choose. " +
                "Try to make it to school on time. \nYou wake up at 7:15. Option 1: You hit snooze. Option 2: You get out of bed.");
        String choiceOne = userInput.nextLine();

        if (choiceOne.equals("1")) {
            System.out.print("You over slept 30 more minutes. ");
            timeToSchool += 30;

        } else {
            System.out.println("Good choice. School starts in 1 hour and 15 minutes. You have time to eat breakfast.");
            System.out.println("Option 1: Cook yourself a healthy breakfast. Option 2: Eat cereal");
            String choiceTwo = userInput.nextLine();

            if (choiceTwo.equals("1")) {
                System.out.println("You made a delicous healthy breakfast, but it took you 25 minutes");
                timeToSchool += 25;

            } else {
                System.out.println("You quickly ate a bowl of cereal");
                timeToSchool += 15;
            }
            System.out.println("It is time to go to school. Option 1: Walk to school. Option 2: bike to school.");
            String choiceThree = userInput.nextLine();

            if (choiceThree.equals(1)) {
                timeToSchool += 25;

            } else {
                timeToSchool += 10;
            }

            if (timeToSchool > 60) {
                arrival = "late";
            } else {
                arrival = "on time";
            }

        }

        if (timeToSchool > 60) {
            arrival = "late";
        } else {
            arrival = "on time";
        }
        System.out.println("You made it to school " + arrival);

    }
}
