// // QUES-1 Given an integer array nums, return true if any value appears at least twice in the
// //array, and return false if every element is distinct.

import java.util.* ;
public class Assg1{
    //***********************************Sorting Approach - TC-o(n log n)**************************************//

    public static boolean duplicate(int nums[]){
        Arrays.sort(nums);

        for(int i=0; i<nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }

    //***************************brute force approach - TC-o(n^2)****************************************

    // public static boolean duplicate(int[] nums) {
    //     for(int i=0; i<nums.length-1 ; i++) {
    //         for(int j=i+1; j<nums.length ; j++ ) {
    //             if( nums[i] == nums[j] ) {
    //                  return true ;
    //             }
    //         }
    //     }
    //     return false;
    // }

    //*********************************Approach-3 USING HASHSET - TC- o(n)************************************//
    // public boolean Duplicate(int[] nums) {
    //     HashSet<Integer> set = new HashSet<>();
    //         for(int i=0; i<nums.length; i++) {
    //             if(set.contains(nums[i])) {
    //                 return true;
    //         } else {
    //             set.add(nums[i]);
    //         }
    //     }
    //     return false;
    // }

    public static void main(String args[]){
        int nums[] = {1,2,3,1};
      
        if(duplicate(nums)){
            System.out.println("true");
        }
        else{
             System.out.println("false");
        }
    }
}

