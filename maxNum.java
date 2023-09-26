public class maxNum {
    static int max(int...A){
        if(A.length==0)
            return Integer.MIN_VALUE;
        int max=A[0];
        for(int i=0;i<A.length;i++){
            if(max<A[i])
                max=A[i];
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(max());
    }
}
