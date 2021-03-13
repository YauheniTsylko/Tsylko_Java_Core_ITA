package Home_Work_1;



public class Task_5 {
    public static void main(String args[]){
        int[][] matrix ={{4, 0, 0, 0, 0},
                         {1, 0, 0, 0, 0},
                         {9, 3, 1, 0, 0},
                         {1, 0, 8, 0, 0},
                         {1, 6, 1, 0, 6}};
        int p = 0;
        for(int i=0; i < matrix.length; i++){
            for(int j=i+1; j < matrix[i].length; j++) {
                if(matrix[i][j]!=0) {
                    p = 1;
                    break;
                }
            }
        }
        if(p==0){
             System.out.println("Матрица является нижней треугольной");
        } else{
            System.out.println("Матрица не является нижней треугольной");
    }
  }
}