public class Solution {
    public static void main(String args[]){
        int n=6;
        //int r=3;
        /*Solution obj=new Solution();
        int res=obj.NcR(n,r);
        System.out.println(res);
        */
        
        Solution obj=new Solution();
        obj.nthRow(6);
        //System.out.println(res);
    }
    //Given row and column tell me the element at that place
    //we use ncr formula for this exact element in pascal traingle
    public int NcR(int n,int r){
        int result=1;
        for(int i=0;i<r;i++){
            result=(result*(n-i))/(i+1);
        }
      return result;
    }
    //if question asked is print the nth row(complete row) of traingle and n given is 6
   public void nthRow(int n){
    int ans = 1;

    System.out.print(ans + " ");

    for(int i = 1; i < n; i++){
        ans = ans * (n - i);
        ans = ans / i;
        System.out.print(ans + " ");
    }
    //to print entire pascal traingle we use list
}
}
