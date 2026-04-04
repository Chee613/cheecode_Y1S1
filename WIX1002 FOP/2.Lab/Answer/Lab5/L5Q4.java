public class L5Q4 {
    
    public static void main(String[]args){
        int [][] matrix={{1,5,7},
                        {3,6,9},
                        {5,3,8}};
        
        System.out.println("3x3 Matrix:");
        printMatrix(matrix);

        int [][] reversedmatrix= new int[3][3];

        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                reversedmatrix[i][j]=matrix[2-j][i];
            }
        }
        
        System.out.println("Reversed Matrix:");
        printMatrix(reversedmatrix);

    }
    public static void printMatrix(int [][]matrix){
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
