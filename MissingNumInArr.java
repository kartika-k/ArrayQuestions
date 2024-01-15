class Solution {
    int missingNumber(int array[], int n) {
        Arrays.sort(array);
        int x = 1;
        
        for(int i=0; i<array.length; i++){
            if(array[i] != x){
                return x;
            }
            x++;
        }
        return x;
    }
}
