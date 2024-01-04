import java.util.*;

public class maxMinInArray{
   
     static void getMinMax(int arr[]) {
        if(arr == null || arr.length == 0){
            return;
        }
        int min = arr[0];
        int max = arr[0];
        // for(int i=1; i<arr.length; i++){
        //     if(arr[i] < min){
        //         min = arr[i];
        //     }
        //     if(arr[i] > min){
        //         max = arr[i];
        //     }
        // }
        for(int i=1; i<arr.length; i++){
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }
        System.out.println(min+ " Minimum");
        System.out.println(max+ " Maximum");
    }
    public static void main(String args[]){
        int nums[] = {6,2,3,4,1,9};
        getMinMax(nums);
    }
}