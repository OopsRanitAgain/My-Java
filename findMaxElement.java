import java.util.Scanner;
public class findMaxElement {
    static int maxElement(int A[]){
        int max=A[0];
        for(int i=0;i<A.length;i++){
            if(max<A[i]){
                max=A[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int A[]={1,2,9,4,5,6,2,5,6,8,3};
        System.out.println("Max element of the Array is "+maxElement(A));
    }
}
