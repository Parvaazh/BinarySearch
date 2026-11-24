class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int left=1;int right=position[position.length - 1] - position[0];
        int ballsPlaced=0;int ans=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            int lastPosition=position[0];
            ballsPlaced=1;
            for(int i=1;i<position.length;i++){
                if(position[i]-lastPosition>=mid){
                    ballsPlaced++;
                    lastPosition=position[i];
                }
            }
            if(ballsPlaced>=m){
                ans=mid;
                left=mid+1;
            }else{
                right=mid-1;
                ballsPlaced=1;
            }
        }
        return ans;
    }
}