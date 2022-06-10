public class RotateArray {
    public static void main(String[] args) {
        int [][] matrix = new int [][] { {1,2,3},
                                         {4,5,6},
                                         {7,8,9} };


        int [][] outputArray = new int [][] {{ 7,4,1},
                                             {8,5,2},
                                             {9,6,3} };


        rotate(matrix);
        System.out.println(findRotation(matrix,outputArray));
    }
    private static boolean isSame(int[][] matrix, int[][] outputArray) {
        for (int i=0;i< matrix.length-1;i++){
            for (int j=0;j< matrix[0].length-1;j++){
                   if (matrix[i][j] != outputArray[i][j]){
                       return false;
                   }
            }
        }

      return true;
    }
    private static boolean  findRotation(int[][] matrix, int[][] outputArray) {
        if(isSame(matrix,outputArray)) return true;
        for (int i=0;i <4 ;i++){
            if(isSame(matrix,outputArray)) return true;
            else rotate(matrix);
        }
        return false;
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

    private static int[][] rotate(int[][] matrix) {
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
        return matrix;

    }
}
