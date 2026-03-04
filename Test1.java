import java.util.*;
public class Test1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int digits[]=new int[n];
        for(int i=0;i<n;i++){
            digits[i]=sc.nextInt();
        }
        for(int i=n-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                System.out.println(Arrays.toString(digits));
                break;
            }
            digits[i]=0;
        
            int newArr[]=new int[n+1];
            newArr[0]=1;
            System.out.println(Arrays.toString(newArr));
    }
}
}