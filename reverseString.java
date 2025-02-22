import java.util.Scanner;
public class reverseString{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to be reversed");
        String str = sc.nextLine();
        String reversedString = reverseString(str);

        System.out.println(reversedString);
    }

    static String reverseString(String str){
        String reversedString = "";

        for(int i=str.length()-1;i>=0;i--){
            reversedString += str.charAt(i);
        }

        return reversedString;
    }
}