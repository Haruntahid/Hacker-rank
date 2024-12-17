import java.io.IOException;
import java.util.Scanner;

public class Java1DArray {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        int count = input.nextInt();

        int[] arr = new int[count];

        for (int i = 0; i < arr.length; i++) {
            int n = input.nextInt();
            arr[i] = n;
        }

        for (int num : arr) {
            System.out.println(num);
        }

    }
}
