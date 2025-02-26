import java.util.Scanner;
public class SecondOccurrence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int target = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        scanner.close();
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) count++;
            if (count == 2) {
                System.out.println("Second occurrence at index: " + i);
                return;
            }
        }
        System.out.println("Second occurrence not found");
    }
}
