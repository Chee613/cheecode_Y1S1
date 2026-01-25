//gemini coded
import java.util.Scanner;
import java.util.Random;

public class Q3b {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of random integer: ");
        int n = s.nextInt();
        int[] arr = new int[n];
        Random r = new Random();

        for (int i = 0; i < n; i++) arr[i] = r.nextInt(1001);

        display(arr);
        displayMax(arr);
        displayRound(arr);
        displayReverse(arr);
    }

    public static void display(int[] a) {
        System.out.print("The random integer: ");
        for (int i : a) System.out.print(i + " ");
        System.out.println();
    }

    public static void displayMax(int[] a) {
        int max = a[0];
        for (int i : a) if (i > max) max = i;
        System.out.println("Maximum Number: " + max);
    }

    public static void displayRound(int[] a) {
        System.out.print("The approximation to the nearest tenth: ");
        for (int i : a) System.out.print(((i + 5) / 10 * 10) + " ");
        System.out.println();
    }

    public static void displayReverse(int[] a) {
        System.out.print("The random integer in reverse order: ");
        for (int i = a.length - 1; i >= 0; i--) {
            String str = String.valueOf(a[i]);
            System.out.print(new StringBuilder(str).reverse() + " ");
        }
        System.out.println();
    }
}
