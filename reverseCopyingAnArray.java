public class reverseCopyingAnArray {
    public static void main(String[] args) {
        int A[]={1,2,3,4,5,6};
        int B[]=new int[6];
        for(int i=0,j=5;i<A.length;i++,j--) {
            B[j] = A[i];
        }
        for(int x:B){
            System.out.print(x+" ");
        }
    }
}
