import java.sql.SQLOutput;

public class searchingAnElement {
    public static void main(String[] args) {
        int A[]={1,2,3,4,5,6,9,4,8};
        int element=4;
        for(int i=0;i<A.length;i++){
            if(element==A[i]) {
                System.out.println("Element " + element + " found in the index " + i);
                System.exit(0);
            }
        }
        System.out.println("Not Found");
    }
}
