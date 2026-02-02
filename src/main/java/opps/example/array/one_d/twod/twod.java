package opps.example.array.one_d.twod;
import java.util.Arrays;

public class twod {
    public static void main(String[] args){
        int matrix[][] = new int [3] [5];

        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix.length;j++){
                System.out.println(matrix[i][j]+"");
            }
            System.out.println();
        }
        System.out.println(Arrays.toString(matrix));

        for(int[] arr : matrix) {
            System.out.println(Arrays.toString(arr));
        }
    }
}