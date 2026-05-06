import java.util.*;
public class Solution{
    public static void main(String args[]){
        int a=87,b=98,c=78;
        Solution obj=new Solution();
        System.out.println(obj.maxNos(a,b,c));
        System.out.println(obj.minNos(a,b,c));   
    }
    static int maxNos(int a,int b,int c){
        int max=0;
        if(a>b && a>c){
            max=a;
        }
        else if(b>a && b>c){
            max=b;
        }
        else {
            max=c;
        }
    return max;
    }
    static int minNos(int a,int b,int c){
        int min=0;
        if(a<b && a<c){
            min=a;
        }
        else if(b<a && b<c){
            min=b;
        }
        else {
            min=c;
        }
    return min;
    }
}

Output:-
  98
  78
=== Code Execution Successful ===

    
import java.util.*;
public class Solution{
    public static void main(String args[]){
        int a=876156;
        evenOddNo(a);
    }
    static void evenOddNo(int a){
        if(a%2==0){
          System.out.println(a+" is even");
        }
        else {
          System.out.println(a+" is odd");
        }
    }
}

Output:-
  876156 is even
=== Code Execution Successful ===

import java.util.*;
public class Solution{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        eligibleToVote(age);
    }
    static void eligibleToVote(int age){
        if(age>=18){
          System.out.println(age+" is eligible to vote.");
        }
        else {
          System.out.println(age+" is not eligible.");
        }
    }
}

Output:-
  65
  65 is eligible to vote.
=== Code Execution Successful ===

import java.util.*;
public class Solution{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        Solution obj=new Solution();
        System.out.println(obj.sum2no(a,b));
    }
    static int sum2no(int a,int b){
        int sum=a+b;
        return sum;
    }
}

Output:-
  87
  90
  177
=== Code Execution Successful ===

import java.util.*;
public class Solution{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        Solution obj=new Solution();
        System.out.println(obj.product2no(a,b));
    }
    static int product2no(int a,int b){
        int product=a*b;
        return product;
    }
}

Output:-
  87
  3
  261
=== Code Execution Successful ===

import java.util.*;
public class Solution{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int radius=sc.nextInt();
        circumArea(radius);
       
    }
    static void circumArea(int radius){
        float circum=2*3.14f*radius;
        float area=3.14f*(radius*radius);
        System.out.println("Circumfrence of circle is: "+circum+"\n"+area+" is area of circle.");
    }
}

Output:-
  5
  Circumfrence of circle is: 31.400002
  78.5 is area of circle.
=== Code Execution Successful ===

import java.util.*;
public class Solution{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        Solution obj=new Solution();
        System.out.println(obj.isPrimeNo(r));
    }
    static boolean isPrimeNo(int r){
        if(r<=1){
            return false;
        }
        for(int i=2;i<r;i++){
            if(r%i==0){
                return false;
            }
        }
        return true;
    }
}

Output:-
  97
  true
=== Code Execution Successful ===

import java.util.*;
public class Solution{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        Solution obj=new Solution();
        System.out.println(obj.results(marks));
       
    }
    static String results(int marks){
        if(marks>=90){
            return "AA";
        }
        else if(marks>=70 && marks<=90){
            return "BB";
        }
       else if(marks>=50 && marks<=70){
            return "CC"; 
        }
        else{
        return "Fail";
        }
    }
}

Output:-
  55
  CC
=== Code Execution Successful ===

import java.util.*;
public class Solution{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Solution obj=new Solution();
        System.out.println(obj.factorial(n));
       
    }
    static int factorial(int n){
       int fact=1;
       for(int i=1;i<=n;i++){
           fact*=i;
       }
       return fact;
    }
}

Output:-
  5
  120
=== Code Execution Successful ===


import java.util.*;
public class Test2 {
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int target=sc.nextInt();
            System.out.println(ceiling(arr,target));
         }
            static int ceiling(int arr[],int target){
                int strt=0;
                int end=arr.length-1;
                if(target>arr[end]){
                    return -1;
                }
                while(strt<=end){
                    int mid=strt+(end-strt)/2;
                    if(arr[mid]==target){
                        return mid;
                    }
                    else if(arr[mid]<target){
                        strt=mid+1;
                    }
                    else{
                        end=mid-1;
                }
            }
                return arr[strt];
    }
}

Output:-
    5
    12
    14
    16
    18
    20
    15
    16
=== Code Execution Successful ===  

//floor of a number
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int strt=0;
        int end=arr.length-1;
        while(strt<=end){
            int mid=strt+(end-strt)/2;
            if(arr[mid]==target){
                System.out.println(mid);
            }
            else if(arr[mid]<target){
                strt=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        System.out.println(arr[end]);
    }
}

Output:-
    5
45
47
49
51
53
48
47

=== Code Execution Successful ===


    import java.util.*;
  public class Function{
public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int positiveCount=0;
    int negativeCount=0;
    int zeroCount=0;
    char choice;
    do{
        System.out.println("Enter a number:");
        int n=sc.nextInt();
       if(n>0){
           positiveCount++;
    }
    else if(n<0){
        negativeCount++;
    }
    else {
        zeroCount++;
    }
    n++;
    System.out.println("Do u wnt to continue?y/n:");
     choice=sc.next().charAt(0);
    }
    while(choice=='y' || choice=='Y');
    
   System.out.println(positiveCount);
   System.out.println(negativeCount);
   System.out.println(zeroCount);
}
}
