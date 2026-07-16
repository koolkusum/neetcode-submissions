class Solution {
    public int trap(int[] height) {
        int area = 0;
        int left = 0;
        int right = height.length-1;
        int maxL = height[left];
        int maxR = height[right];
        while(left<right)
        {
            if(maxL<maxR)
            {
                left++;
                maxL = Math.max(height[left], maxL);
                area += maxL - height[left];
            } 
            else
            {
                right--;
                maxR= Math.max(height[right],maxR);
                area+= maxR - height[right];
            }

        }

        return area;
        

    }
}
