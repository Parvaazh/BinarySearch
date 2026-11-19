class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int maxWeight=0;int totalWeight=0;
        for(int w:weights){
            maxWeight=Math.max(w,maxWeight);
            totalWeight+=w;
        }
        int left=Math.max(maxWeight,totalWeight/days);
        int right=totalWeight;
        
        while(left<=right){
            int currentLoad=0;
            int usedDays=1;
            int mid=left+(right-left)/2;
            for(int w:weights){
                if(currentLoad+w>mid){
                    usedDays++;
                    currentLoad=w;
                }else{
                    currentLoad+=w;
                }
            }
            if(usedDays<=days){
                right=mid-1;
            }else{
              left=mid+1;
            }

        }
        return left;
    }
}