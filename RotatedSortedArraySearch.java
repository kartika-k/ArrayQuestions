public class RotatedSortedArraySearch {

    public static int search(int arr[], int target, int si, int ei){
        //base case
        if(si > ei){
            return -1;
        }
        //Kaam
        int mid = si + (ei - si)/2;
        if(arr[mid] == target){
            return mid;
        }
        //Case-1 
        //If mid on line-1
        if(arr[si] <= arr[mid]){
            //Case-a
            //Line-1 left
            if(arr[si] <= target && target < arr[mid]){
                return search(arr, target, si, mid-1);
            }else{
                //Right
                return search(arr, target, mid+1, ei);
            }
        }
        else{
            //Case - 2
            //Mid on line-2

            //Case-c - Right
            if(arr[mid] <= target && target <= ei){
                return search(arr, target, mid+1, ei);
            }else{
                //Left
                return search(arr, target, si, mid-1);
            }
        }
    }
    public static void main(String args[]){
        int arr[] = {4,5,6,7,0,1,2};
        int target = 0;
        int target_index = search(arr,target,0,arr.length-1);
        System.out.println(target_index);
    }
}
