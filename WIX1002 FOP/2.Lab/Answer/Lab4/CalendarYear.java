import java.util.Scanner;

public class CalendarYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };

        int[] daysInMonth = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };

        System.out.print("Enter the year: ");
        int year = input.nextInt();

        System.out.print("Enter the first day of the year (0=Sunday, 1=Monday, ..., 6=Saturday): ");
        int firstDay = input.nextInt();

        // Adjust for leap year
        if (isLeapYear(year)) {
            daysInMonth[1] = 29;
        }

        System.out.println();
        for (int month = 0; month < 12; month++) {
            System.out.printf("---------- %s %d ----------%n", months[month], year);
            System.out.println("Sun Mon Tue Wed Thu Fri Sat");

            // Print initial spaces for the first day
            for (int i = 0; i < firstDay; i++) {
                System.out.print("    ");
            }

            // Print all days of the month
            for (int day = 1; day <= daysInMonth[month]; day++) {
                System.out.printf("%3d ", day);

                // Go to next line after Saturday
                if ((day + firstDay) % 7 == 0) {
                    System.out.println();
                }
            }
            System.out.println("\n"); // separate months

            // Update firstDay for next month
            firstDay = (firstDay + daysInMonth[month]) % 7;
        }
    }

    // Helper method for leap year check
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
}
