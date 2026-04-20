class Solution {
    public boolean isThree(int n) {
          int p=(int)Math.sqrt(n);
           if(p * p != n) return false;
             for(int i = 2; i * i <= p; i++) {
            if(p % i == 0) return false;
        }

        return p > 1;
    }
}