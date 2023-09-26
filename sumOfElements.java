public class sumOfElements {
    static int sum(int...A){
        if(A.length==0)
            return Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<A.length;i++){
            sum+=A[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum());
        System.out.println(sum(10,20,30));
        System.out.println(sum(1060,100,100));
    }
}
