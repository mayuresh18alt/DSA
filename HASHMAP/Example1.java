package HASHMAP;

import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("enter size of the array ");
        n = sc.nextInt();
        System.out.println("enter elements in the array");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // precompute:
        int[] hash = new int[13];
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;

        }
        System.out.println("put total numbers to find in array ");

        int q;
        q = sc.nextInt();
        System.out.println("put numbers to find how many times they are appear in the array");
        while (q-- != 0) {
            int number;
            number = sc.nextInt();

            // fetching:
            System.out.println(hash[number]);
        }

    }
}
