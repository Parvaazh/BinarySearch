/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left=0;int right=n;int result=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(isBadVersion(mid)==true){
                result=mid;
                right=mid-1;
            }else if(isBadVersion(mid)!=true){
                left=mid+1;
            }
        }
        return result;
    }
}