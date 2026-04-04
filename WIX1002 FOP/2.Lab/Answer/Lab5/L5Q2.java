import java.util.Random;

public class L5Q2 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] random = new int[10];

        for (int i = 0; i < 10; i++) {

            int num = rd.nextInt(21);
            boolean duplicate;

            do {
                duplicate = false;

                // Check against all previously stored numbers
                for (int j = 0; j < i; j++) {
                    if (random[j] == num) {
                        duplicate = true;
                        num = rd.nextInt(21);  // generate again
                        break;
                    }
                }

            } while (duplicate);

            random[i] = num;
        }

        for (int x : random)
            System.out.print(x + " ");
    }
}
