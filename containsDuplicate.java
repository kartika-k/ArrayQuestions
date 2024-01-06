public class containsDuplicate{
    public static boolean containsDuplicate(int nums[]){
        //*********************************BRUTE FORCE APPROACH TC-O(n^2)******************************///
        int n = nums.length;

        for(int i=0; i<n-1; i++){
            for(int j=i+1; i<n; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;

        //***********************************Sorting Approach - TC-o(n log n)**************************************//

        // public static boolean duplicate(int nums[]){
        //     Arrays.sort(nums);

        //     for(int i=0; i<nums.length-1; i++){
        //         if(nums[i] == nums[i+1]){
        //             return true;
        //         }
        //     }
        //     return false;
        // }
    }
    public static void main(String args[]){
        int nums[] = {1,2,3,1};

        if(containsDuplicate(nums)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

        
    }
}