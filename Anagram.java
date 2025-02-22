import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st String to check Anagram");
        String str1 = sc.nextLine();
        System.out.println("Enter the 2nd String to check Anagram");
        String str2 = sc.nextLine();

        System.out.println(str1+" and "+str2+" are Anagran...? "+checkAnagram(str1, str2));
    }

    public static boolean checkAnagram(String str1,String str2){
        if(str1.length() != str2.length()){
            return false;
        }

        char charArray1[] = str1.toCharArray();
        char charArray2[] = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1,charArray2);
    }
}
