import java.util.Arrays;
import java.util.Scanner;

public class ArrayMethod {
    public static int[] getArr(){
        int[] arr =new int[20];
        int index = 0;
        int max = 0;
        while (index!=20){
            int random = (int) (Math.random() * (index+1)*5+1);
            if(random>max){
                arr[index] = random;
                index++;
                max=random;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] array = getArr();
        System.out.println(Arrays.toString(array));
        System.out.println("Nhập vào 1 số");
        int value = new Scanner(System.in).nextInt();
//        int index = indexOfArray(array,value);
//        System.out.println(index);
        System.out.println(indexOfArrayUseRecursive(array,0,array.length-1,value));
    }
    public static int indexOfArray(int[] array, int value){
        int low = 0;
        int high = array.length-1;
        while(high>=low){
            int mid = (low+high)/2;
            if(array[mid]==value){
                return mid;
            }else if(array[mid]>value){
                high= mid-1;
            }else {
                low =mid+1;
            }
        }
        return -1;
    }
    public static int indexOfArrayUseRecursive(int[] arr,int low, int high,int value){
        if(high>=low){
           int mid = (low+high)/2;
           if(arr[mid]==value) return mid;
           if(arr[mid]>value) return indexOfArrayUseRecursive(arr,low,mid-1,value);
           return indexOfArrayUseRecursive(arr,mid+1,high,value);
        }
        return -1;
    }
}
