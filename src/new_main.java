public class new_main {
    public static void main(String[] args) {
        int n = 10;
        int m = 20;
        int x = 30;
        int z = 40;
        long start_time1 = System.nanoTime();
        int sum = 0;
         for (int i = 0; i < n; i++) {
             for (int j = 0; j < i*i; j++) {
                 sum = sum + i;
                }
             }
        long end_time1 = System.nanoTime();
        System.out.println(start_time1);
        System.out.println(end_time1);

        System.out.println(end_time1 - start_time1);

        long start_time2 = System.nanoTime();
        sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i*i; j++) {
                sum = sum + i;
            }
        }
        long end_time2 = System.nanoTime();
        System.out.println(start_time2);
        System.out.println(end_time2);

        System.out.println(end_time2 - start_time2);

        long start_time3 = System.nanoTime();
        sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i*i; j++) {
                sum = sum + i;
            }
        }
        long end_time3 = System.nanoTime();
        System.out.println(start_time3);
        System.out.println(end_time3);

        System.out.println(end_time3 - start_time3);

        long start_time4 = System.nanoTime();
        sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i*i; j++) {
                sum = sum + i;
            }
        }
        long end_time4 = System.nanoTime();
        System.out.println(start_time4);
        System.out.println(end_time4);

        System.out.println(end_time4 - start_time4);


    }
}