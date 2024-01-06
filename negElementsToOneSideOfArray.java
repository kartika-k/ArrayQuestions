import java.util.*;

public class negElementsToOneSideOfArray{

    public static void moveNegativeElements(int nums[]){

        // ****************************** NAIVE APPROACH TC- O(n log n) ***************************************//
        // Arrays.sort(nums);

        //********************************* TWO POINTER APPROACH  TC-O(n)*************************************//
        int left = 0;
        int right = nums.length-1;

        while(left <= right){
            if(nums[left] < 0 && nums[right] < 0){
                left++;
            }
            else if(nums[left] > 0 && nums[right] < 0){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

                left++;
                right--;
            }
            else if(nums[left] > 0 && nums[right] > 0){
                right--;
            }
            else{
                left++;
                right--;
            }
        }
    }
    public static void main(String args[]){
        int nums[] = {-12,11,-13,-5,6,-7,5,-3,-6};

        moveNegativeElements(nums);

        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }

}