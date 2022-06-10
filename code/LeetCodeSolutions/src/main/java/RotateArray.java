public class RotateArray {
    public static void main(String[] args) {
        int [][] matrix = new int [][] { {1,2,3},
                                         {4,5,6},
                                         {7,8,9} };


        int [][] outputArray = new int [][] {{ 7,4,1},
                                             {8,5,2},
                                             {9,6,3} };


        rotate(matrix);
    }
    private static void print(int[][] matrix){
        for (int i=0;i< matrix.length;i++){
            System.out.print("[");
            for (int j=0;j< matrix[i].length;j++){
                System.out.print( matrix[i][j]+ " ");
            }
            System.out.print("]\n");

        }
    }

    private static void rotate(int[][] matrix) {
        //transpose
         for(int i=0;i< matrix.length;i++){
             for (int j=0;j<i;j++){
                 int temp = matrix[i][j];
                 matrix[i][j] = matrix[j][i];
                 matrix[j][i]= temp;
             }
         }
        System.out.println("transponse");
            print(matrix);

         int lastCol =matrix.length-1;
        int firstCol =0;
        while (firstCol< lastCol) {
            for (int i = 0; i < matrix.length; i++) {
                int temp = matrix[i][firstCol];
                matrix[i][firstCol] = matrix[i][lastCol];
                matrix[i][lastCol] = temp;
            }
        firstCol ++;
            lastCol--;
        }
        System.out.println("rotated");
        print(matrix);

    }
}
