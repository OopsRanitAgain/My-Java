import java.util.*;
public class reverseInt {
    static int reverse(int n){
        int m;
        int rem=0,rev=0;
        while(n!=0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to reverse it");
        int num=sc.nextInt();
        System.out.println("the reverse of the given number is "+reverse(num));
    }
}
