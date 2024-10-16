package CodSoft;

import LinkedList.RAM_LL1;

import javax.sound.midi.Soundbank;
import java.util.Random;
import java.util.Random.*;
import java.util.Scanner;

public class NumberGame {
    public static int randomGenerator() {
        Random random = new Random();
        int num = random.nextInt(100 - 1) + 1;
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();
        int random = randomGenerator();
        int userInput = 0;
        char choice = 'Y';
        int numberOfInputs = 0;
        System.out.println("Hey! " + name + " give me a guess between 1...100");
        while (userInput != random) {
            userInput = sc.nextInt();
            numberOfInputs++;
            if (userInput != random) {
                if (random > userInput) {
                    System.out.println("Hint: Think For a Larger one");
                } else {
                    System.out.println("Hint: Think For a Smaller one");
                }
            }
            else{
                System.out.println("Congratulations " + name + ",You Won the game in " + numberOfInputs + " attempts");
                System.out.println("Type Y for more fun");
                choice = sc.next().charAt(0);
                if (choice == 'Y' || choice == 'y') {
                    userInput = 0;
                    System.out.println("Hey! " + name + " give me a guess between 1...100");
                    continue;
                }
            }
        }
    }
}
