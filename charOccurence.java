import java.util.Scanner;

public class charOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to be to check Occurence of a Character");
        String str = sc.nextLine();
        System.out.println("Enter the char to occurence ");
        char ch = sc.next().charAt(0);

        System.out.println("The occurence of "+ch+" is "+countChar(str, ch));
    }

    static int countChar(String str,char c){
        int count = 0;
        for(char ch:str.toCharArray()){
            if(ch == c){
                count++;
            }
        }

        return count;
    }
}
