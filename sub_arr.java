public class sub_arr {
    public static void main(String[] args) {
        int arr[]={2,-4,8,-3,1};
        System.out.println(Subarraysum(arr));
    }

    public static int Subarraysum(int[] arr) {
        int ans = Integer.MIN_VALUE;
        int sum = 0;
        for (int j = 0; j < arr.length; j++) {
            sum = sum + arr[j];
            ans = Math.max(sum, ans);
            if (sum < 0) {
                sum = 0;

            }


        }


        return ans;
    }
}