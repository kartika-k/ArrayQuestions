public class maxSubarrSum{
    public static void maxSubarraySum(int nums[]){
        int curr_sum = 0;
        int max_sum = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            int start = 0;
            for(int j=i; j<nums.length; j++){
                int end = j;
                curr_sum = 0;
                for(int k=start; k<=end; k++){
                    //max subarray sum
                    curr_sum += nums[k];
                }
                System.out.println(curr_sum);
                if(max_sum < curr_sum){
                    max_sum = curr_sum;
                }
            }
        }
        System.out.println("MAx sum: "+ max_sum);
    }
    public static void main(String args[]){
        int nums[] = {2,4,6,8,10};
        maxSubarraySum(nums);
    }
}