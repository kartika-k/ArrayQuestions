//find largest number in a given array
public class largestNum{
    public static int getLargest(int nums[]){
        int largest = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            if(largest < nums[i]){
                largest = nums[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        int nums[] = {1,4,7,2,9,5};
        System.out.println("Largest Element is: "+ getLargest(nums));
    }
} 