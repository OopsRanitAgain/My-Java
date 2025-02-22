import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;


public class NoDuplicateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String to remove duplicate");
        String str = sc.nextLine();

        String noDuplicateString = removeDuplicateChar(str);
        System.out.println("After Removing the Duplicates : "+noDuplicateString);

    }

    public static String removeDuplicateChar(String str){
        StringBuilder result = new StringBuilder();

        Set<Character> set = new HashSet<>();

        for(char c:str.toCharArray()){
            if(set.add(c)){
                result.append(c);
            }
        }

        return result.toString();
    }
}
