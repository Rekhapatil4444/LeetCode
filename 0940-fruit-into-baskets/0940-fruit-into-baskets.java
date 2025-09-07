class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer>hr=new HashMap<>();
        int l=0;
        int ans=0;
        int n=fruits.length;
        for(int r=0;r<n;r++){
            int val=fruits[r];
            hr.put(val,hr.getOrDefault(val,0)+1);
            while(hr.size()>2){
                int v=fruits[l];
                hr.put(v,hr.get(v)-1);
                if(hr.get(v)==0){
                hr.remove(v);
            }
                l++;
            }
            ans=Math.max(ans,r-l+1);
        }
        return ans;
    }
}