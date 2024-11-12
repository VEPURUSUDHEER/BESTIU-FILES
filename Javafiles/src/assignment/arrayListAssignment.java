package assignment;
import java.util.ArrayList;
import java.util.Scanner;

public class arrayListAssignment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Step 1: Read the size of the array
        System.out.print("Enter the number of scores: ");
        int n = scanner.nextInt();
        
        // Step 2: Initialize the array and read scores
        int[] scores = new int[n];
        System.out.println("Enter the scores:");
        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextInt();
        }
        
        // Step 3: Convert array to ArrayList
        ArrayList<Integer> scoresList = new ArrayList<>();
        for (int score : scores) {
            scoresList.add(score);
        }
        
        // Step 4: Display the scores
        System.out.println("Scores: " + scoresList);
        
        scanner.close();
    }
}