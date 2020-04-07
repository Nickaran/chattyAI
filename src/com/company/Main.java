package com.company;
import java.util.Scanner;

public class Main {

        final static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            welcomeMessage("Dom", "1993");
            nameReminder();
            guessAge();
            countingUpwards();
            userQuiz();
            programComplete();
        }

        static void welcomeMessage(String userName, String birthYear){
            System.out.println("Hi there and welcome to my program, I'm " + userName + ".");
            System.out.println("I was born in the year " + birthYear + ".");
            System.out.println("There seems to be a malfunction with my memory. Would you mind telling me your name? ");
        }

        static void nameReminder(){
            String name = scanner.nextLine();
            System.out.println("Hi " + name + ", I hope you're having a nice day.");
        }

        static void guessAge(){
            System.out.println("Hmm, let me guess your age.. ");
            System.out.println("Type in remainders of dividing your age by 3, 5 and 7.");
            int remainder3 = scanner.nextInt();
            int remainder5 = scanner.nextInt();
            int remainder7 = scanner.nextInt();
            int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;

            System.out.println("Neato, your age is " + age);
        }

        static void countingUpwards(){
            System.out.println("The program will now count upwards. Enter a number ");
            int num = scanner.nextInt();
            for (int i = 0; i <= num; i++) {
                System.out.printf("%d!\n", i);
            }
        }

        static void userQuiz(){
            System.out.println("Why do we use methods?");
            System.out.println("1. To repeat a statement multiple times.");
            System.out.println("2. To decompose a program into several small subroutines.");
            System.out.println("3. To determine the execution time of a program.");
            System.out.println("4. To interrupt the execution of a program.");
            int num = scanner.nextInt();
            if (num == 2){
                System.out.println("You've answered correctly, you genius.");
            } else {
                userQuiz();
            }
        }

        static void programComplete(){
            System.out.println("Congratulations, have a wonderful day.");
        }
}
