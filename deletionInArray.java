public class deletionInArray {
    public static void main(String[] args) {
        int A[]={5,9,6,10,12,7};
        for(int i=3;i<A.length;i++){
            A[i-1]=A[i];
        }
        for(int i=0;i<A.length-1;i++){
            System.out.print(A[i]+" ");
        }
    }
}
