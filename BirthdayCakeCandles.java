import java.util.*;
public class BirthdayCakeCandles {
    public static void main(String[] args) {
        int i, c = 0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        int max = arr[0];
        for (i = 0; i< n; i++) {
            arr[i] = in.nextInt();
        }
        for (i = 0; i < n; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (i = 0; i < n; i++) {
            if (max == arr[i]) {
                c = c + 1;
            }
        }
System.out.println(""+c);
    }
}
