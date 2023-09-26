import java.util.*;
public class findGCD {
    static int GCD(int m, int n){
        while(m!=n){
            if(m>n){
                m-=n;
            }
            else if(m<n){
                n-=m;
            }
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number for checking GCD");
        System.out.println("Enter the 1st number");
        int m=sc.nextInt();
        System.out.println("Enter the 2nd number");
        int n=sc.nextInt();
        System.out.println("The GCD is "+GCD(m,n));
    }
}