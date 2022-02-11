public class search {

    public static int search_num(int num, int[] arr){



            int mid = 0;
            int low = 0;
            int high = arr.length - 1;
            while(low <= high) {
                mid = low + (high - low) / 2;

                if (arr[mid] == num) {
                    return mid;
                }

                if (arr[mid] < num) {
                    high = mid - 1;
                }

                else{
                    low = mid + 1;
                }

            }

       return -1;

    }


    public static void main(String[] args){
        int [] array = {9,8,7,6,5,4,3,2,1};
        int look = 8;
        int ans = search_num(look, array);
        System.out.println(ans);
    }


}
