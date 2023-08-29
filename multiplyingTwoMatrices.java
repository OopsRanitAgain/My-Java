public class multiplyingTwoMatrices {
    public static void main(String[] args) {
        int A[][]={{1,2,3},{4,5,6}};
        int B[][]={{1,2,3},{4,5,6},{7,8,9}};
        int C[][]=new int[2][3];
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    C[i][j]+=(A[i][k]*B[k][j]);
                }
                System.out.print(C[i][j]+"\t");
            }
            System.out.println(" ");
        }
    }
}
