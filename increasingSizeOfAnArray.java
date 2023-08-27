import java.sql.SQLOutput;

public class increasingSizeOfAnArray {
    public static void main(String[] args) {
        int A[]={1,2,3,4,5};
        int B[]=new int[2*A.length];
        System.out.println("Length of Array A "+A.length);
        for(int i=0;i<A.length;i++){
            B[i]=A[i];
        }
        for(int x:B){
            System.out.print(x+" ");
        }
        A=B;
        System.out.println(" ");
        System.out.println("New Length of Array A is "+A.length);
        for(int x:A){
            System.out.print(x+" ");
        }
    }
}
