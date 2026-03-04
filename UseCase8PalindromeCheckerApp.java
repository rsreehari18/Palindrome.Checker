import java.util.LinkedList;
import java.util.Scanner;

public class UseCase8PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read input string
        System.out.print("Input: ");
        String input = sc.nextLine();

        // Create LinkedList to store characters
        LinkedList<Character> list = new LinkedList<>();

        // Add each character to the list
        for (char c : input.toCharArray()) {
            list.add(c);
        }

        boolean isPalindrome = true;

        // Compare characters from both ends
        while (list.size() > 1) {
            char first = list.removeFirst();
            char last = list.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        // Output result
        System.out.println("Is Palindrome?: " + isPalindrome);

        sc.close();
    }
}