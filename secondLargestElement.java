public class secondLargestElement {
    public static void main(String[] args) {
        int A[]={1,2,3,4,5,6,9,4,8};
        int max1=A[0];
        int max2=A[0];
        for (int i=0;i<A.length;i++){
            if(A[i]>max1){
                max2=max1;
                max1=A[i];
            }
            else if(A[i]>max2){
                max2=A[i];
            }
        }
        System.out.println("The Largest element is "+max1);
        System.out.println("The Second Largest Element is "+max2);
    }
}
