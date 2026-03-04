import java.util.*;
public class Test2 {
  /*public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(pythagorean_triplet(a,b,c));

    }
    static boolean pythagorean_triplet(int a,int b,int c){
        int max=Math.max(a,Math.max(b,c));
        if(max==a){
            return (b*b+c*c==a*a);
        }
        else if(max==b){
            return (a*a+c*c==b*b);
        }
        else{
            return (a*a+b*b==c*c);
        }
            */
         /*public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            System.out.println(s_n_NaturalNum(n));
            }
            static int s_n_NaturalNum(int n){
                int sum=0;
                for(int i=1;i<=n;i++){
                    sum+=i;
                }
                return sum;
            }
                */
    //ceiling of a number
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
    
