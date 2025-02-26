import java.util.Scanner;
public class SumOfEvens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        scanner.close();
        for (int num : arr) {
            if (num % 2 != 0) continue;
            sum += num;
        }
        System.out.println("Sum of even numbers: " + sum);
    }
}
