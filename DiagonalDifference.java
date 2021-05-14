import java.util.*;
public class DiagonalDifference  // change class to array 
 {
    public static void main(String args[]) {
        int i, j,result;
        int c = 0, d = 0;

        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int[][] arr = new int[m][m];
        for (i = 0; i < m; i++) {
            for (j = 0; j < m; j++) {
                arr[i][j] = in.nextInt();

            }

        }
        for (i = 0; i < m; i++) {
            for (j = 0; j < m; j++) {

                if ((i + j) == m - 1) {
                    c = c + arr[i][j];
                }
            }
        }
        for (i = 0; i < m; i++) {
            for (j = 0; j < m; j++) {
                if (i == j) {
                    d = d + arr[i][j];
                }
            }
        }
        if(c>=d)
        {
            result= c-d;
        }
        else
        {
            result= d-c;
        }
        System.out.println( + result);
    }
}
