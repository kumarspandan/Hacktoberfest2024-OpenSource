//Accenture ASE Move Hyphen optimised
import java.util.Scanner;

public class Accenture_MoveHyphen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(hyphenMove(str));
        sc.close();
    }

    static String hyphenMove(String str) {
        StringBuilder res = new StringBuilder(); // Use StringBuilder for efficiency
        // First pass to count hyphens
        int hyphenCount = 0;
        
        // Loop through the string
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '-') {
                hyphenCount++; // Count hyphens
            } else {
                res.append(str.charAt(i)); // Append non-hyphen characters
            }
        }

        // Append hyphens at the front
        for (int i = 0; i < hyphenCount; i++) {
            res.insert(0, '-'); // Insert hyphens at the start
        }

        return res.toString(); // Convert StringBuilder back to String
    }
}
