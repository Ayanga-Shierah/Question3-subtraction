/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Final_Exam;

/**
 *
 * @author Hp
 */
import java.util.Scanner;
import java.util.Random;
public class subtraction {
 public static void main(String[] args) {
        // Step 2: Generate two single-digit integers
        Random rand = new Random();
        int number1 = rand.nextInt(10); // Generates a number between 0 and 9
        int number2 = rand.nextInt(10); // Generates a number between 0 and 9

        // Step 3: Ensure number1 >= number2
        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        // Step 4: Prompt the student for an answer
        Scanner input = new Scanner(System.in);
        System.out.print("What is " + number1 + " - " + number2 + "? ");
        int answer = input.nextInt();

        // Step 5: Check the student's answer
        int correctAnswer = number1 - number2;

        // Step 6: Display the result
        if (answer == correctAnswer) {
            System.out.println("Correct! Well done.");
        } else {
            System.out.println("Incorrect. The correct answer is " + correctAnswer);
        }

        input.close();
    }   
}
