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
import java.util.*;
public class Practice{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //int n=sc.nextInt();
        int arr[]={4,8,9,15,7,6};
        //System.out.println(ReverseNo(n));
        //System.out.println(factorial(n));
        //System.out.println(PrimeNo(n));
       // System.out.println(palindrome(n));
       /*int result[]=largeSclargeEle(arr);
       for(int i=0; i<result.length; i++){
           System.out.println(result[i]);
       }*/
       System.out.println(revArrayWithout2ndArray(arr));
    }
    static int ReverseNo(int n){
        int rev=0;
        while(n>0){
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
      return rev;
    }
    static int factorial(int n){
        int fact=1;
        for(int i=1;i<n;i++){
            fact*=i;
        }
        return fact;
    }
    static boolean PrimeNo(int n){
        if(n<=1){
            return true;
        }
        for (int i=2;i<n;i++){
        if(n%i==0 && n%n==0){
            return false;
        }
        return true;
        }
        return true;
    }
    static boolean palindrome(int n){
        int original=n;
        return ReverseNo(n)==original;
    }
    static int[] largeSclargeEle(int arr[]){
       int largest=Integer.MIN_VALUE;
       int sclarge=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                sclarge=largest;
                largest=arr[i];
            }
            else if(arr[i]>sclarge && arr[i]!=largest){
                sclarge= arr[i];
            }
        }
        return new int[]{sclarge, largest};
    }
    static int revArrayWithout2ndArray(int arr[]){
        int n=arr.length;
        int rev=0;
         for(int i=0;i<n;i++){
             int original=arr[i];
             rev=ReverseNo(n);
         }
        return arr;
   }
}
public class RadhaHeart {

    public static void main(String[] args) {

        String text = "राधा";

        for (double y = 1.5; y > -1.5; y -= 0.1) {

            for (double x = -1.5; x < 1.5; x += 0.05) {

                double formula =
                        Math.pow(x * x + y * y - 1, 3)
                                - x * x * Math.pow(y, 3);

                if (formula <= 0) {
                    System.out.print(text);
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
import java .util.*;
public class Solution{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //int n=sc.nextInt();
        //System.out.println(reverseNo(n));
        //System.out.println(palindrome(n));
        int arr[]={2,5,7,9,2,1,8};
        //largeSclarge(arr);
        //countEOno(arr);
        int target=sc.nextInt();
       // System.out.println(lSearch(arr));
        //System.out.println(removeDuplicat(arr));
        //String s1=sc.nextLine();
        //String s2=sc.nextLine();
        //System.out.println(Anagram(s1,s2));
        System.out.println(bSearch(arr));
        
    }
    static int reverseNo(int n){
        int rev=0;
        while(n>0){
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        return rev;
    }
    static boolean palindrome(int n){
        int original=n;
        return original==reverseNo(n);
    }
    static void largeSclarge(int arr[]){
        int large=Integer.MIN_VALUE;
        int sclarge=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>large){
                sclarge=large;
                large=arr[i];
            }
            else if(arr[i]!=large && arr[i]>sclarge){
                sclarge=arr[i];
            }
        }
       System.out.println(large);
       System.out.println(sclarge);
    }
    static void countEOno(int arr[]){
        int Ecount=0;
        int Ocount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0)
            Ecount++;
            else 
            Ocount++;
        }
        System.out.println(Ecount);
        System.out.println(Ocount);
    }
    static int lSearch(int arr[]){
        int target=0;
        for(int i=0;i>arr.length;i++){
            if(arr[i]==target)
            return i;
        }
     return -1;
    }
    static int removeDuplicat(int arr[]){
        int duplicate=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j])
                duplicate++;
            }
        }
     return duplicate;
    }
    static boolean Anagram(String s1, String s2){
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        
        if(s1.length()!=s2.length()){
            return false;
        }
        char A1[]=s1.toCharArray();
        char A2[]=s2.toCharArray();
        Arrays.sort(A1);
        Arrays.sort(A2);
        return Arrays.equals(A1,A2);
    }
    static int bSearch(int arr[]){
        int target=0;
        int start=arr[0];
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
     return -1;
    }
    
}
