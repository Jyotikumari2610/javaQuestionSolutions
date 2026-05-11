import java.util.*;
 public class Main {
    public static void display(int n,int r,int npr){
        System.out.println(n+"P"+r+"="+npr);
    }
    public static int fact(int x){
        int rv=1;
        for(int i=1;i<=x;i++){
            rv=rv*i;
        }
        return rv;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number:");
        int n=sc.nextInt();
        int r=sc.nextInt();
        int nfact=fact(n);
        int nmrfact=fact(n-r);
        int npr=nfact/nmrfact;
        display(n,r,npr);
    }
}

//HCF and LCM of two number

import java.util.*;
public class Practice{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int num1=a;
        int num2=b;
        for(int i=0;i<=a;i++){
         int temp=a%b;
        a=b;
        b=temp;
        }
        int hcf=a;
        System.out.println("HCF of two number is:"+hcf);
        int lcm=1;
        lcm=(num1*num2)/hcf;
        System.out.println("LCM of number is:"+lcm);
    }
}
//Hcf  and lcm of number using array
import java.util.*;
public class main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter size of an array:");
       int n=sc.nextInt();
       int num[]=new int[n];
       System.out.println("Enter elements of array:");
       for(int i=0;i<n;i++){
           num[i]=sc.nextInt();
       }
       int a=num[0];
       int b=num[0];
       int hcf=num[0];
       for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
               int temp=num[i]*num[j];
               num[i]=num[j];
               num[j]=temp;
           }
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            
        }
    }
    System.out.println("HCF of array is:"+hcf);
    int lcm=num[0];
    for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
               a=num[i];
               b=num[j];
               lcm=(a*b)/hcf;
           }
       }
       System.out.println("LCM of array is:"+lcm);
}
}
//probability question code
import java.util.*;
public class  Probability{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
      /*  System.out.println("Enter total no of outcomes is :");
        int n=sc.nextInt();
        System.out.println("Enter no of favorable outcomes:");
        int m=sc.nextInt();
        double prob=1;
        prob=(double)m/n;
        System.out.println("probability of given question is:"+prob);
    */
    
        System.out.print("Enter total possible outcomes: ");
        int total= sc.nextInt();

        System.out.print("Enter favorable outcomes: ");
        int favorable= sc.nextInt();
        if (total<=0) {
            System.out.println("Total outcomes must be greater than 0!");
        }
        if (favorable<0 || favorable>total) {
            System.out.println("Favorable outcomes must be between 0 and " + total);
        }
        double prob = (double) favorable/total;
        System.out.println("The probability of the event is: " + prob);
        System.out.println("The probability of NOT the event is: " + (1 - prob));
    }
}


import java.util.*;
public class Practice{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int m=in.nextInt();
        int n=in.nextInt();
        while(m!=n){
        if(m>n){
            m=m-n;
        }
        else {
            n=n-m;
        }}
        System.out.println("GCD is: "+n);
    }
}
import java.util.*;


public class Solutions {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
      
       int a = 0, b = 1;
          
       System.out.print(a+" ");
      
       if(n > 1) {
           //find nth term
           for(int i=2; i<=n; i++) {
               System.out.print(b+" ");
               //the concept below is called swapping
               int temp = b;
               b = a + b;
               a = temp;
           }


           System.out.println();
       }
   }   
}
import java.util.*;
public class Arrays {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      int numbers[] = new int[size];


      //input
      for(int i=0; i<size; i++) {
          numbers[i] = sc.nextInt();
      }


      int max = Integer.MIN_VALUE;
      int min = Integer.MAX_VALUE;
     
       for(int i=0; i<numbers.length; i++) {
           if(numbers[i] < min) {
               min = numbers[i];
           }
           if(numbers[i] > max) {
               max = numbers[i];
           }
       }


       System.out.println("Largest number is : " + max);
       System.out.println("Smallest number is : " + min);
      
   }
}
import java.util.*;
public class Main{
    public static void No(int n){
        int sum=0;
        int diff=0;
        int product =1;
        for(int i=1;i<=n;i++){
            sum+=i;
            diff-=i;
        }
        System.out.println("Sum of N no is:"+sum);
        System.out.println("Difference of N no is:"+diff);
    }
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    int n=sc.nextInt();
    No(n);
}
}
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array:");
        int size=sc.nextInt();
        int num[]=new int[size];
        System.out.println("Enter elements of array:");
        for(int i=0;i<size;i++){
            num[i]=sc.nextInt();
        }
         int start=num[0];
        int end=num.length -1;
        while(start<end){
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;
            start++;
            end--;
        }
       System.out.println("Reversed array is: " + Arrays.toString(num));

    }
}
class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        // Code here
        int n=arr.length;
        ArrayList<Integer> res=new AraayList<Integer>();
        for(int i=0;i<n;i++){
            int cnt=0;
            for(int j=i;j<n;j++){
                if(arr[j]==arr[i])
                cnt +=1;
            }
          if(cnt>(n/3)){
              if(res.size()==0 || arr[i]!=res.get(0)){
                  res.add(arr[i]);
              }
          }
          if(res.size()==2){
              if(res.get(0)>res.get(1))
              java.util.Collections.swap(res,0,1);
              break;
          }
        }
        return res;
    }
}
class Solution {
    public static BigInteger factorial(int n) {
        // code here
        int res[]=new int[500];
        res[0]=1;
        int res_size=1;
        for(int x=2;x<=n;x++){
            res_size=multiply(x,res,res_size);
        }
        for(int i=res_size-1;i>=0;i--){
            System.out.print(res[i]);
        }
    }
    static int multiply(int x,int res[],int res_size){
        int carry=0;
        for(int i=0;i<res_size;i++){
            int prod=res[i]*X+carry;
            res[i]=prod%10;
            carry=prod/10;
        }
        while (carry!=0){
            res[res_size]=carry%10;
            carry=carry/10;
            res_size++;
        }
        return res_size;
    }
    public static void main(String args[]){
        factorial(100);
    }
}
