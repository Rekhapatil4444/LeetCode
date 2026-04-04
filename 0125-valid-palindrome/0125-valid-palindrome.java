class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
    System.out.println(s);
          s=s.replaceAll("[^a-z0-9]","");
          String temp=s;
          String reversed = new StringBuilder(s).reverse().toString();
           System.out.println(s);
          return reversed.equals(temp);

    }
}