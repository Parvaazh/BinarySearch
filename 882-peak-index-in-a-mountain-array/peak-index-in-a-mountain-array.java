class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left=0;int right=arr.length-1;int mod=0;
        while(left<right){
            int mid=left+(right-left)/2;
            if(arr[mid]<arr[mid+1]){
                left++;mid++;
            }else{
                right--;mid--;
            }
            if(arr[mid]>arr[mid+1]&&arr[mid]>arr[mid-1]){
                return mid;
            }
            mod=mid;
        }
        return mod;
    }
}