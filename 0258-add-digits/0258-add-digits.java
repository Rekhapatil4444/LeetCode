class Solution {
    public static int result(int num)
    {
         int sum=0;
        while(num>0)
        {
            int digits=num%10;
            sum=sum+digits;
            num=num/10;
        }
        return sum;
    }
    public int addDigits(int num) {
        int ans=0;
          if(num<=9)
          {
            return num;
          }
        else{
               ans= result(num);
               return addDigits(ans);
        }
    }
}