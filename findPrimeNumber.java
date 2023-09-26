import java.util.Scanner;
public class findPrimeNumber {
    static void isPrime(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0)
               count++;
        }
        if(count==2){
            System.out.println(n+" is a Prime Number");
        }
        else
            System.out.println(n+" is not a Prime Number");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number You want to check Prime or not?");
        int num=sc.nextInt();
        isPrime(num);
    }
}
