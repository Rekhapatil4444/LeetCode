class Solution {
    public int[] sumZero(int n) {
        ArrayList<Integer>hr=new ArrayList<>();
        int ans=0;
        for(int i=1;i<=n/2;i++) 
    {
          hr.add(-i);
          hr.add(+i);
    }
        if(n%2==1){
          hr.add(+0);
       }
        int[] res = new int[hr.size()];
        for (int i = 0; i < hr.size(); i++) {
            res[i] = hr.get(i);
        }

        return res;
    }
}
    