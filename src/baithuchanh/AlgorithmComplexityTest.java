package baithuchanh;

import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();
        inputString = inputString.replace(" ","");
        /*codes below here */
        int[] frequentChar = new int[255];      //O(1)                   //{1}
        for (int i = 0; i < inputString.length(); i++) {            //{2}
            /* Tìm ví trí tương ứng của ký tự trong bảng ASCII */
            int ascii = (int) inputString.charAt(i);               //{3}
            /* Tăng giá trị tần suất */
            frequentChar[ascii] += 1;                              //{4}
        } // O(n)
        int max = 0; // O(1)                                           //{5}
        char character = (char) 255; /* empty character */ // O(1)   //{6}
        for (int j = 0; j < 255; j++) {                         //{7}
            if (frequentChar[j] > max) {                        //{8}
                max = frequentChar[j];                          //{9}
                character = (char) j;                           //{10}
            }
        }
        // O(255)* O(1) = O(255*1) = O(255)
        System.out.println("The most appearing letter is '" + character + "' with a frequency of " + max + " times");

        // độ phức tạp của thuật toán = max(O(n),O(255))
        // TH1: n<=255 => độ phức tạp  =O(255)
        // TH2: n>255 => độ phức tạp  =O(n)
    }
}
