import java.util.*;
public class copyingAnArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A[]=new int[6];
        int B[]=new int[6];
        System.out.println("Enter The elements of Array A");
        for (int i=0;i<A.length;i++){
            A[i]=sc.nextInt();
        }
        //Copying Array A to Array B
        for(int i=0;i<A.length;i++){
           B[i]=A[i];
        }
        for(int x:B){
            System.out.print(x+" ");
        }
    }
}
