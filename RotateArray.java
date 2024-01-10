import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        // Write your code here.
        int n = arr.size();
        ArrayList<Integer> temp = new ArrayList<>();

        for (int i=k; i < n; i++) {
            temp.add(arr.get(i));
        }

        for (int j=0; j < k; j++) {
            temp.add(arr.get(j));
        }

        return temp;
        
    }
}
