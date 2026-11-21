class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int minCap=0;int maxCap=0;
        for(int w:weights){
            minCap=Math.max(minCap,w);
            maxCap+=w;
        }
        while(minCap<maxCap){
            int day=1;int sum=0;
            int mid=minCap+(maxCap-minCap)/2;
            for(int weight:weights){
                if(sum+weight>mid){
                    day++;
                    sum=weight;
                }else{
                    sum+=weight;
                }
            }
            if(day>days){
                minCap=mid+1;
            }else
            maxCap=mid;
        }
        return minCap;
    }
}