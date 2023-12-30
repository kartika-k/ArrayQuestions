public class prefixSum{
    public static void maxSubarraySum(int nums[]){
        int curr_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        int prefix[] = new int[nums.length];

        //calculate prefix sum
        prefix[0] = nums[0];
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + nums[i];
        }

        for(int i=0; i<nums.length; i++){
            int start = 0;
            for(int j=i; j<nums.length; j++){
                int end = j;

                curr_sum = start == 0 ? nums[end] : prefix[end] - prefix[start-1];

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