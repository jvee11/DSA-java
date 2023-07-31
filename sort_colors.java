public class sort_colors {
    public static void main(String[] args) {
        int nums[]={2,1,0,1,0,2};
        sort(nums);
    }

    public static void sort(int nums[]) {


        int i = 0;//0 ka track
        int j = nums.length - 1; //2 ka track
        int k = 0;
        int temp;
        while (k <= j) {
            if (nums[k] == 2) {
                temp = nums[j];
                nums[j] = nums[k];
                nums[k] = temp;
                j--;


            } else if (nums[k] == 0) {
                temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                i++;
                k++;


            } else {
                k++;
            }
        }
    }

}
