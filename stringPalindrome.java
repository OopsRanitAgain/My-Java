import java.util.Scanner;

public class stringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to be to check Palindrome");
        String str = sc.nextLine();
        String reversedString = reverseString(str);

        if(str.equals(reversedString)){
            System.out.println(str+"It is Palindrome");
        }else{
            System.out.println(str+" is not a Palindrome");
        }
    }

    static String reverseString(String str){
        String reversedString = "";

        for(int i=str.length()-1;i>=0;i--){
            reversedString += str.charAt(i);
        }

        return reversedString;
    }

}
