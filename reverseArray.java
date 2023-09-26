public class reverseArray {
    static int[] reverse(int[] A){
        int[] B=new int[A.length];
        for(int i=0,j=B.length-1;i<A.length;i++,j--){
            B[j]=A[i];
        }
        for(int x:B){
            System.out.print(x+" ");
        }
        return B;
    }

    public static void main(String[] args) {
        int[] A={1,2,3,4};
        System.out.println("Reverse of the Array is ");
        reverse(A);
    }
}
