class PracticeCode {

    // Prime Number
    static void primeCheck(int n) {

        boolean prime = true;

        if(n <= 1) {
            prime = false;
        }

        for(int i = 2; i <= n / 2; i++) {

            if(n % i == 0) {
                prime = false;
                break;
            }
        }

        if(prime)
            System.out.println(n + " is Prime");
        else
            System.out.println(n + " is Not Prime");
    }

    // Factorial using Recursion
    static int factorial(int n) {

        if(n == 0 || n == 1)
            return 1;

        return n * factorial(n - 1);
    }

    // Fibonacci Series
    static void fibonacci(int n) {

        int a = 0;
        int b = 1;

        System.out.print("Fibonacci: ");

        for(int i = 1; i <= n; i++) {

            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }

        System.out.println();
    }

    // Reverse Number
    static void reverseNumber(int n) {

        int rev = 0;

        while(n > 0) {

            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }

        System.out.println("Reverse Number: " + rev);
    }

    // Sum of Digits
    static void sumDigits(int n) {

        int sum = 0;

        while(n > 0) {

            int digit = n % 10;
            sum = sum + digit;
            n = n / 10;
        }

        System.out.println("Sum of Digits: " + sum);
    }

    // Palindrome String
    static void palindrome(String str) {

        String rev = "";

        for(int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        if(str.equals(rev))
            System.out.println(str + " is Palindrome");
        else
            System.out.println(str + " is Not Palindrome");
    }

    // Largest Element in Array
    static void largestElement(int arr[]) {

        int max = arr[0];

        for(int i = 1; i < arr.length; i++) {

            if(arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Largest Element: " + max);
    }

    // Reverse Array
    static void reverseArray(int arr[]) {

        System.out.print("Reverse Array: ");

        for(int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    // Linear Search
    static void linearSearch(int arr[], int key) {

        boolean found = false;

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] == key) {
                found = true;
                break;
            }
        }

        if(found)
            System.out.println(key + " Found");
        else
            System.out.println(key + " Not Found");
    }

    // Bubble Sort
    static void bubbleSort(int arr[]) {

        for(int i = 0; i < arr.length - 1; i++) {

            for(int j = 0; j < arr.length - i - 1; j++) {

                if(arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.print("Sorted Array: ");

        for(int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();
    }

    // Main Function
    public static void main(String[] args) {

        int arr[] = {5, 2, 8, 1, 3};

        primeCheck(17);

        System.out.println("Factorial: " + factorial(5));

        fibonacci(10);

        reverseNumber(1234);

        sumDigits(1234);

        palindrome("madam");

        largestElement(arr);

        reverseArray(arr);

        linearSearch(arr, 8);

        bubbleSort(arr);
    }
}
