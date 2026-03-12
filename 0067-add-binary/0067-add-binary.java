import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
        BigInteger v1 = new BigInteger(a, 2);
        BigInteger v2 = new BigInteger(b, 2);
        while(!v2.equals(BigInteger.ZERO)){
            BigInteger sum = v1.xor(v2);
            BigInteger carry = v1.and(v2).shiftLeft(1);
            v1 = sum;
            v2 = carry;
        }
        return v1.toString(2);
    }
}