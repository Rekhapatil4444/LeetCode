class Solution {
    public int lengthOfLastWord(String s) {
       int count=0;
       boolean wordfound=false;
       for(int i=s.length()-1;i>=0;i--){
        char ch=s.charAt(i);
        if(ch==' '){
           if(wordfound){
            break;
           }
           else{
            continue;
           }
        }
        else{
            wordfound=true;
            count++;
        }
       }
       return count;
    }

       }