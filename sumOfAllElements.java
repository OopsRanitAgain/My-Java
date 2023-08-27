import java.util.Scanner;
public class sumOfAllElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A[]=new int[5];
        int sum=0;
        System.out.println("Enter Array Elements");
        for(int i=0;i<A.length;i++){
            A[i]=sc.nextInt();
            sum+=A[i];
        }
        System.out.println("The Sum of the Element is "+sum);

    }
}
