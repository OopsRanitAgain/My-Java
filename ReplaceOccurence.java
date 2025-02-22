import java.util.Scanner;

public class ReplaceOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to replace characters");
        String str = sc.nextLine();
        System.out.println("Enter a the Char to replace");
        char oldChar = sc.next().charAt(0);
        System.out.println("Enter a Char to replace with");
        char newChar = sc.next().charAt(0);

        String modifiedString = str.replace(oldChar, newChar);
        System.out.println("Modified String is :"+modifiedString);
    }
}
