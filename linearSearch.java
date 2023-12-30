public class linearSearch{

    public static int lSearch(int nums[],int key){
        for(int i=0; i<nums.length; i++){
            if(nums[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int nums[] = {2,4,6,10,8,12,14};
        int key = 10;

        int index = lSearch(nums,key);
        if(index == -1){
            System.out.println("NOT Found");
        }else{
            System.out.println("Key is at index: "+index);
        }
    }
}