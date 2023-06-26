import java.util.Arrays;
import java.util.Scanner;

public class Baitap3 {
    private static int[][] getArr(){
        int arr[][] = new int[10][10];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }

        }
        return arr;
        /** Copyright belong to Rekkei Academy*/
    }

    public static void main(String[] args) {
        int [][] arr = getArr();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("Hãy nhập vào giá trị cân tim kiem");
        int so = new Scanner(System.in).nextInt();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(so==arr[i][j]){
                    System.out.printf("Phần tử %d có tồn tại trong mảng tại vị tri i=%d và j=%d",so,i,j);
                    return;
                }
            }
        }
        System.err.printf("không tồn tại phần tử %d trong mảng",so);
    }
}
