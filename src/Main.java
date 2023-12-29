//1. Sum of Array Elements: Write a program to find the sum of all elements in an array.
//2. Largest Element in Array: Find and print the largest element in an array.
//3. Even or Odd Numbers: Check if a given number is even or odd using if-else. (also count in an array)
//4. Reverse an Array: Reverse the elements of an array.
//5. Factorial Calculation: Write a program to calculate the factorial of a given number.********* + recursive solution.
//6. Palindrome Check: Check if a given string is a palindrome. (use char string)
//7. Prime Number Check: Determine whether a given number is prime.
//8. Fibonacci Series: Generate and print the first N elements of the Fibonacci series.******** + recursive solution.
//9. Linear Search: Implement a linear search algorithm to find an element in an array. (true or false return type)
//10. Binary Search: Implement binary search for a sorted array.
//11. Duplicate Elements: Find and print duplicate elements in an array. (true or false return type)
//12. Count Vowels and Consonants: Count the number of vowels and consonants in a given string. (a, e, i, o, u)
//13. Multiplication Table: Print the multiplication table for a given number. (2 x 1 = 1, 2 x 2 = 4)
//14. Matrix Addition: Add two matrices and print the result. 5x5 5x5 (return 2d array)
//15. Calculate Average: Calculate the average of elements in an array.
//16. Leap Year Check: Determine whether a given year is a leap year.
//17. Pattern Printing: Print a pattern (e.g., a pyramid) using loops. (google patterns of loop)
//18. String Reversal: Reverse a given string without using built-in functions. apple, elppa
//19. Armstrong Number: Check if a number is an Armstrong number.
//20. Find Minimum and Maximum: Write a program to find the minimum and maximum values in an array.

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int problemCount = 1;
        int[] arr = {10, 50, 35, 75, 25, 30, 99, 72, 67, 45};

        System.out.println("Problem #" + problemCount++);
        printSum(arr);
        System.out.println();

        System.out.println("Problem #" + problemCount++);
        printLargest(arr);
        System.out.println();

        System.out.println("Problem #" + problemCount++);
        printEvenOdd(arr);
        System.out.println();

        System.out.println("Problem #" + problemCount++);
        displayReverseArr(arr);
        System.out.println();

        System.out.println("Problem #" + problemCount++);
        int n = 5;
        System.out.println("Without Recursion --> Factorial of " + n + " is " + getFactorial(n));
        System.out.println("With Recursion --> Factorial of " + n + " is " + factRecursion(n));
        System.out.println();

        System.out.println("Problem #" + problemCount++);
        char[] str = {'m', 'a', 'd', 'a', 'm'};
        palindrome(str);
        System.out.println();

        System.out.println("Problem #" + problemCount++);
        prime(n);
        System.out.println();

        System.out.println("Problem #" + problemCount++);
        fibonacci(n);
        fibonacciByRecursion(n);
        System.out.println();

        System.out.println("Problem #" + problemCount++);
        linearSearch(arr, 50);
        System.out.println();
        linearSearch(arr, 33);
        System.out.println();

        System.out.println("Problem #" + problemCount++);
        binarySearch(arr, 50);
        System.out.println();
        binarySearch(arr, 33);
        System.out.println();

        System.out.println("Problem #" + problemCount++);
        int[] duplicateArr = {1, 2, 3, 3, 3, 4, 5, 1, 1, 2, 3, 6, 7, 4};
        duplicates(duplicateArr);
        System.out.println();

        System.out.println("Problem #" + problemCount++);
        countVowelAndConsonant("Hello");
        System.out.println();

        System.out.println("Problem #" + problemCount++);
        multiplicationTable(n);
        System.out.println();

        System.out.println("Problem #" + problemCount++);
        int[][] matrix1 = {{1, 2, 3, 1, 5}, {2, 5, 9, 3, 5}, {8, 6, 4, 6, 9}, {4, 6, 2, 1, 2}, {2, 8, 1, 4, 2},};
        int[][] matrix2 = {{4, 6, 2, 1, 2}, {2, 8, 1, 4, 2}, {9, 4, 4, 1, 9}, {2, 5, 9, 3, 5}, {8, 6, 4, 6, 9},};
        int row = 5, col = 5;
        matrixAdd(matrix1, matrix2, row, col);
        System.out.println();

        System.out.println("Problem #" + problemCount++);
        average(arr);
        System.out.println();

        System.out.println("Problem #" + problemCount++);
        int year = 2024;
        leapYear(year);
        System.out.println();

        System.out.println("Problem #" + problemCount++);
        displayPyramid(n);
        System.out.println();

        System.out.println("Problem #" + problemCount++);
        reverseString("apple");
        System.out.println();

        System.out.println("Problem #" + problemCount++);
        armstrongNumber(153);
        System.out.println();

        System.out.println("Problem #" + problemCount++);
        displayMinMax(arr);
        System.out.println();
    }

    public static void printSum(int[] arr) {
        int sum = getSum(arr);

        System.out.print("Elements are: ");
        printArr(arr);

        System.out.println("Sum = " + sum);
    }

    private static int getSum(int[] arr) {
        int sum = 0;

        for (int item : arr) {
            sum += item;
        }

        return sum;
    }

    public static void printLargest(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Array length is 0. No maximum value is present here!");
        }

        int max = Integer.MIN_VALUE;
        for (int item : arr) {
            max = Math.max(max, item);
        }

        System.out.print("Elements are: ");
        printArr(arr);

        System.out.println("Max = " + max);
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static boolean isOdd(int n) {
        return n % 2 == 1;
    }

    public static void printEvenOdd(int[] arr) {
        System.out.print("Elements are: ");
        printArr(arr);

        for (int item : arr) {
            if (isEven(item)) {
                System.out.println(item + " is an even number.");
            }
            if (isOdd(item)) {
                System.out.println(item + " is a odd number.");
            }
        }
    }

    public static int[] getReverseArr(int[] arr) {
        int len = arr.length;
        int[] reverse = new int[len + 1];

        for (int item = 0; item < len / 2; item++) {
            reverse[item] = arr[len - 1 - item];
            reverse[len - item] = arr[item];
        }

        return reverse;
    }

    public static void displayReverseArr(int[] arr) {
        int[] reverse = getReverseArr(arr);

        System.out.print("Main array: ");
        printArr(arr);

        System.out.print("Reverse array: ");
        printArr(reverse);
    }

    public static int getFactorial(int n) {
        int factorial = 1;

        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public static int factRecursion(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factRecursion(n - 1);
    }

    public static void palindrome(char[] str) {
        boolean isPalindrome = true;
        int len = str.length;

        for (int i = 0; i < len / 2; i++) {
            if (str[i] != str[len - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }

        for (char ch : str) {
            System.out.print(ch);
        }

        if (isPalindrome) {
            System.out.println(" is palindrome");
        } else {
            System.out.println(" is not palindrome");
        }
    }

    public static void prime(int n) {
        boolean isPrime = n >= 2;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }

    public static void fibonacci(int n) {
        int[] fibo = new int[n + 1];
        fibo[0] = 0;
        fibo[1] = 1;

        for (int i = 2; i <= n; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }

        System.out.print("Without recursion --> Fibonacci series of " + n + " is: ");
        printArr(fibo);
    }

    public static int fibonacciRecursion(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
    }

    public static void fibonacciByRecursion(int n) {
        int[] fibo = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            fibo[i] = fibonacciRecursion(i);
        }

        System.out.print("With Recursion --> Fibonacci series of " + n + " is: ");
        printArr(fibo);
    }

    public static void linearSearch(int[] arr, int target) {
        System.out.println("Applied linear search.");
        System.out.print("Main Array: ");
        printArr(arr);

        boolean found = false;

        for (int item : arr) {
            if (item == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(target + " is found!");
        } else {
            System.out.println(target + " is not found!");
        }
    }

    public static void binarySearch(int[] arr, int target) {
        System.out.println("Applied binary search.");
        System.out.print("Main Array: ");
        printArr(arr);

        int l = 0, r = arr.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == target) {
                System.out.println(target + " is found!");
                return;
            }

            if (arr[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        System.out.println(target + " is not found!");
    }

    public static void duplicates(int[] arr) {
        HashMap<Integer, Integer> vis = new HashMap<Integer, Integer>();

        for (int i : arr) {
            int cnt = 0;
            if (vis.containsKey(i)) {
                cnt = vis.get(i);
            }
            vis.put(i, cnt + 1);
        }

        System.out.print("Main Array: ");
        printArr(arr);

        System.out.print("Duplicate items are: ");
        for (int i : vis.keySet()) {
            if (vis.get(i) > 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void countVowelAndConsonant(String str) {
        System.out.println("Given string is " + str);

        ArrayList<Character> vowels = new ArrayList<Character>();
        ArrayList<Character> consonants = new ArrayList<Character>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowels.add(ch);
            } else {
                consonants.add(ch);
            }
        }

        System.out.print("Total " + vowels.size() + " vowels are present. That are: ");
        for (Character ch : vowels) {
            System.out.print(ch);
        }
        System.out.println();

        System.out.print("Total " + consonants.size() + " consonants are present. That are: ");
        for (Character ch : consonants) {
            System.out.print(ch);
        }
        System.out.println();
    }

    public static void multiplicationTable(int n) {
        System.out.println("Multiplication table for " + n);
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }

    public static void matrixAdd(int[][] matrix1, int[][] matrix2, int n, int m) {
        int[][] sumMatrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Matrix 1");
        printMatrix(matrix1, n, m);

        System.out.println("Matrix 2");
        printMatrix(matrix2, n, m);

        System.out.println("Sum Matrix");
        printMatrix(sumMatrix, n, m);
    }

    public static void printMatrix(int[][] matrix, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void average(int[] arr) {
        int sum = getSum(arr);
        double avg = (double) sum / arr.length;

        System.out.print("Main Array: ");
        printArr(arr);
        System.out.println("Average value is " + avg);

    }

    public static void leapYear(int year) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("Year " + year + " is a leap year.");
            return;
        }

        System.out.println("Year " + year + " is not a leap year.");
    }

    public static void displayPyramid(int n) {
        System.out.println("Display pyramid of length " + n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("x");
            }
            System.out.println();
        }
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }

    public static void reverseString(String str) {
        StringBuilder rev = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            rev.append(str.charAt(i));
        }

        System.out.println("Main string: " + str);
        System.out.println("Reverse string: " + rev);
    }

    public static void armstrongNumber(int n) {
        int result = 0;
        int temp = n;
        int digit = 0;

        while (temp > 0) {
            temp /= 10;
            digit++;
        }
        temp = n;

        while (temp > 0) {
            result += (int) Math.pow(temp % 10, digit);
            temp /= 10;
        }

        if (result == n) {
            System.out.println(n + " is an armstrong number.");
        } else {
            System.out.println(n + " is not an armstrong number.");
        }
    }

    public static void displayMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i : arr) {
            min = Math.min(i, min);
            max = Math.max(i, max);
        }

        System.out.print("Main Array: ");
        printArr(arr);

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }

    public static void printArr(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }

        System.out.println();
    }
}