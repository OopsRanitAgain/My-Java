import java.util.*;
public class insertionOfElementInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A[]={5,9,6,10,12,7,0,0,0,0};
        for(int i=A.length-1;i>2;i--){
            A[i]=A[i-1];
        }
        for(int x:A){
            System.out.print(x+" ");
        }
        System.out.println("");
        A[2]=15;
        for(int x:A){
            System.out.print(x+" ");
        }
    }
}
