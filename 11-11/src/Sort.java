import java.util.Arrays;

public class Sort {
    public static void bubbleSort(int[] arr) {
        for (int i = 1;i < arr.length;i++) {
            for (int j = 0;j < arr.length-i-1;j++) {
                if (arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }

    public static void bubbleSort2(int[] arr) {
        int len = arr.length;
        while (len > 0) {
            boolean flag = true;
            for (int i = 0;i < len-1;i++) {
                if (arr[i] > arr[i+1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
            len--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,4,1,9,12,3,7,6};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
