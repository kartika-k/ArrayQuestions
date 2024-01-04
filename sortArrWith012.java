// public class sortArrWith012{

//     public static int sortArrWith012(int nums[]){
//         int start = 0;
//         int end=0;
//         int mid=0;
//         int temp;

//         while(mid <= end){
//             if(nums[mid] == 0){
//                 temp=nums[mid];
//                 nums[mid]=nums[end];
//                 nums[end]=temp;
//                 start++;
//                 mid++;
//             }
//             else if(nums[mid]==1){
//                 mid++;
//             }else if(nums[mid]==2){
//                 temp=nums[end];
//                 nums[end]=nums[mid];
//                 nums[mid]=temp;
//                 end--;
//             }
//         }
//         return;
//     }
//     public static void main(String args[]){
//         int nums[] = {0,2,1,2,0};
//         for(int i=0; i<nums.length; i++){
//             System.out.println(sortArrWith012(nums));
//         }
        
//     }
// }


import java.util.*;

public class Main {
    public static void sortArrWith012(ArrayList<Integer> arr, int n) {
        int low = 0, mid = 0, high = n - 1; // 3 pointers

        while (mid <= high) {
            if (arr.get(mid) == 0) {
                // swapping arr[low] and arr[mid]
                int temp = arr.get(low);
                arr.set(low, arr.get(mid));
                arr.set(mid, temp);

                low++;
                mid++;

            } else if (arr.get(mid) == 1) {
                mid++;

            } else {
                // swapping arr[mid] and arr[high]
                int temp = arr.get(mid);
                arr.set(mid, arr.get(high));
                arr.set(high, temp);

                high--;
            }
        }
    }

    public static void main(String args[]) {
        int n = 6;
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[] {0, 2, 1, 2, 0, 1}));
        sortArray(arr, n);
        System.out.println("After sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();

    }

}
