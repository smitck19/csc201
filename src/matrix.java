public class matrix {

    public static boolean matrixFind(int k, int[][] matrix1){
        boolean found = false;
        int row = 0;
        int column = matrix1[0].length-1;

        while(row <= matrix1.length-1 && column >= 0){

            if(k < matrix1[row][column]){
                row+=1;
            }
            else if(k > matrix1[row][column]){
                column -= 1;
            }
            else if(k == matrix1[row][column]){
                found = true;
                break;
            }

        }
        return found;
    }

    // this code will be O(n) because it does not require multiple loops.
    // in the worst case scenario, it will have to traverse one entire row and one entire column
    // but it does not require more than O(n)



    public static void main(String [] args){
        int[][] mat = {{9,8,7},{6,5,4},{3,2,1}};
        int look = 1;
        System.out.println(matrixFind(look, mat));
    }
}
