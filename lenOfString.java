import java.util.Scanner;

public class lenOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to be to get The Length");
        String str = sc.nextLine();
        int length = stringLen(str);
        System.out.println("The Length of The String is "+length);
    }

    static int stringLen(String str){
        int length = 0;
        for(char ch : str.toCharArray()){
            length++;
        }
        return length;
    }
}
