class Solution {
    public static int happy(int num){
        int sum=0;
        while(num>0)
        {
            int digit=num%10;
            int sq=digit*digit;
            sum=sum+sq;
            num=num/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        while(n!=1 && n!=4 )
        {
            n=happy(n);
        }
        return n==1;
    }
}