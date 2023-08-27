public class rotationOfAnArray {
    public static void main(String[] args) {
        int A[]={1,2,3,4,5,6,9,4,8};
        /*Left Rotation
        int temp=A[0];
        for (int i=1;i<A.length;i++){
            A[i-1]=A[i];
        }
        A[A.length-1]=temp;
        for(int x:A){
            System.out.print(x+",");
        }*/
        //Right Rotation

        int temp=A[A.length-1];
        for(int i=A.length-1;i>0;i--) {
            A[i] = A[i - 1];
        }
        A[0]=temp;
        for(int x:A){
            System.out.print(x+",");
        }
    }
}
