package viva2;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[]strA;
        String[]strB;
        
        do {
            System.out.print("Array A: ");
            strA = sc.nextLine().split(",");
        } while (!checkValid(strA));

        do {
            System.out.print("Array B: ");
            strB = sc.nextLine().split(",");
        } while (!checkValid(strB));

        int[] a = new int[strA.length];
        int[] b = new int[strB.length];


        for (int i = 0; i < a.length; i++)
            a[i] = Integer.parseInt(strA[i].trim());


        for (int i = 0; i < b.length; i++)
            b[i] = Integer.parseInt(strB[i].trim());
  
        System.out.println("Mirror pattern: " + isMirror(a, b));
        
        if(a.length!=b.length)
            System.out.println("Invalid because the array length is different");
            System.out.printf("The array length for a is %d and the array length for b is %d",a.length,b.length);
          

        sc.close();
    }
    
    public static boolean isMirror(int[] a, int[] b) {

        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }

    public static int[] readArray(String input) {

        String[] parts = input.split(",");
        int[] arr = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i].trim());
        }

        return arr;
    }
    // Checks if array length is between 1 and 50
    static boolean checkValid(String[] arr) {
        if (arr.length < 1 || arr.length > 50) {
            System.out.println("Invalid input. Array length must be between 1 and 50.");
            return false;
        }
        for (String s : arr) {
        if (s.trim().isEmpty()) {
            System.out.println("Invalid input. Empty value detected.");
            return false;
        }
        try {
            Integer.parseInt(s.trim());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Must be integers only.");
            return false;
        }
    }
        return true;
    }



}

