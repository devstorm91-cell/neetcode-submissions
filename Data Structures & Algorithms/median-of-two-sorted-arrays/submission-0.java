class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length){
            return findMedianSortedArrays(nums2, nums1);
        }

        int m=nums1.length;
        int n=nums2.length;

        int l=0;
        int h=m;

        while (l<=h){
            int X=(l+h)/2;
            int Y=(m+n+1)/2 - X;

            int maxLX=(X==0)?Integer.MIN_VALUE:nums1[X-1];
            int minRX=(X==m)?Integer.MAX_VALUE:nums1[X];

            int maxLY=(Y==0)?Integer.MIN_VALUE:nums2[Y-1];
            int minRY=(Y==n)?Integer.MAX_VALUE:nums2[Y];

            if(maxLX<=minRY&&maxLY<=minRX){
                if((m+n)%2==0){
                    return (Math.max(maxLX, maxLY)+Math.min(minRX, minRY))/2.0;
                }
                return Math.max(maxLX,maxLY);
            }
            else if (maxLX>minRY){
                h=X-1;
            }
            else{
                l=X+1;
            }
        }
        return 0.0;
    }
}    