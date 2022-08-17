class Solution {
    //bubble sort
    //time complexity - O(n*2)
    public void sortColors(int[] nums) {
        for(int i=0; i<nums.length; i++){
            for(int j=1; j<nums.length-i; j++){
                if(nums[j-1]>nums[j]){
                    swap(nums,j-1 ,j);
                }
            }
        }
    }
    //swapping function
    public void swap(int [] nums, int num1, int num2){
        int temp= nums[num1];
        nums[num1] = nums[num2];
        nums[num2] = temp;
    }
}