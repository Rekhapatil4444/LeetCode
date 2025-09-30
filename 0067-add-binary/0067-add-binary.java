// import java.math.BigInteger;
import java.math.*;
class Solution {
    public String addBinary(String a, String b) {
       BigInteger A=new BigInteger(a,2);
       BigInteger B=new BigInteger(b,2);
       BigInteger sum=A.add(B);
       return sum.toString(2);
    }
}