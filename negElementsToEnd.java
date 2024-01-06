public class negElementsToEnd{

    public static void negToEnd(int nums[]){
        int left = 0;
        int right = nums.length-1;

        while(nums[right] < 0 && right > left){
            right--;
        }
        while(left < right){
            if(nums[left] < 0){
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;

                right--;
            }
            left++;
        }
    }
    public static void main(String args[]){
        int nums[] = {-12,11,-13,-5,6,-7,5,-3,-6};

        negToEnd(nums);

        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
}