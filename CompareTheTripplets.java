import java.util.*;
public class CompareTheTripplets // compare the triplets program( make class as solution )
 {
    public static void main(String args[]) {
        int resulta = 0, resultb = 0, i;
        int arr[] = new int[3];
        int arr2[] = new int[3];
        Scanner in = new Scanner(System.in);
        for (i = 0; i < 3; i++) {
            arr[i] = in.nextInt();
        }
        for (i = 0; i < 3; i++) {
            arr2[i] = in.nextInt();
        }
        for (i = 0; i < 3; i++) {
            if (arr[i] > arr2[i]) {
                resulta = resulta + 1;
            } else if (arr2[i] > arr[i]) {
                resultb = resultb + 1;
            } else {
                continue;
            }
        }
            System.out.println(+resulta + " " + resultb);

    }
}
