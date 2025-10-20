class Solution {
    public int maximum69Number (int num) {
String s = Integer.toString(num);
int[] digits = new int[s.length()];
for (int i = 0; i < s.length(); i++) {
    digits[i] = s.charAt(i) - '0';
}

// Now digits = {9, 9, 9, 9}

        int ans=0;
        for(int r=0;r<digits.length;r++){
            if(digits[r]==6){
                digits[r]=9;
                break;
            }
            else{
                continue;
            }
        }
StringBuilder sb = new StringBuilder();
for (int d : digits) {
    sb.append(d);
}
int number = Integer.parseInt(sb.toString());
return number;
}
} // prints 9999
