import java.util.*;
public class big2small {

    public static void main(String[] args){

        int x[] = {0,1,2,2,3,4,5,6};
        int n = x.length;
        int temp;
       if (x != null) {
           for (int i = 0; i < n; i++) {
               for (int j = i+1; j < n; j++) {
                   if(x[i] <= x[j]){
                       temp = x[i];
                       x[i] = x[j];
                       x[j] = temp;
                   }
               }
           }
       }
        for(int i = 0; i < n; i++){
            System.out.print(x[i] + " ");
        }
    }
}
