import java.util.ArrayList;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        int[] arrInt = {1,4,2,7,8,10,3,6,18,9,11,14,15};
        // tuyến tính
        // cần tìm kiếm số 13
        for (int i = 0; i < arrInt.length; i++) {
            if(arrInt[i]==13){
                System.out.println("phần tử 13 được tìm thấy tại vị trí "+i);
                return;
            }
        }
        System.err.println("không tìm tháy phần tử số 13 trong mảng");


        // arrayList
        ArrayList<String> arrayList = new ArrayList<>();
        // duyệt cây nhị phân theo đệ qui

        TreeMapClone map = new TreeMapClone();
        map.root= new Node(50);
        map.root.left= new Node(21);
        map.root.right= new Node(76);
        map.root.left.left= new Node(4);
        map.root.left.right= new Node(32);
        map.root.left.left.left= new Node(2);
        map.root.left.left.right= new Node(15);
        map.root.left.left.left.right = new Node(3);
        map.root.left.left.right.left = new Node(14);

        map.root.right.left =new Node(64);
        map.root.right.right =new Node(100);
        map.root.right.left.left =new Node(52);
        map.root.right.left.right =new Node(70);
        map.root.right.right.left =new Node(83);
        map.root.right.right.left.left =new Node(80);
        map.root.right.right.left.right =new Node(87);
        map.printInorder(map.root);
        System.out.println();
        map.printPreorder(map.root);
        System.out.println();
        map.printPostorder(map.root);
    }
    int binarySearch(int arr[], int low, int high, int value) {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == value) {
                return mid;
            }
            if (arr[mid] > value) {
                return binarySearch(arr, low, mid - 1, value);
            }
            return binarySearch(arr, mid+1, high, value);
        }
        return -1;

    }

}