public class arrayPairs{
    public static void printPairs(int nums[]){
        int total_pairs = 0;
        for(int i=0; i<nums.length; i++){
            int current = nums[i];
            for(int j=i+1; j<nums.length; j++){
                System.out.print("(" + current + " " + nums[j] + ")");
                total_pairs++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs: "+ total_pairs);
    }

    public static void main(String args[]){
        int nums[] = {2,4,6,8,10};
        printPairs(nums);

        //print
       
    }
}