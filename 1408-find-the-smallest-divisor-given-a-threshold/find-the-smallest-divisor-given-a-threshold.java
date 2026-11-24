class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int sum=0;int maxSum=0;
        int left=1;int right=0;
        for(int w:nums){
            right=Math.max(right,w);
        }
        while(left<=right){
            int mid=left+(right-left)/2;
            for(int num:nums){
                int result =(num+mid-1)/mid;
                sum+=result;
            }
            if(sum<=threshold){
                maxSum=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
            sum=0;
        }
        return maxSum;
    }
}