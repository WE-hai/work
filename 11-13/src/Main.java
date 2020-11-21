import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    }

    public static void bubble() {
        int[] arr = {34, 12, 32, 1, 52, 45, 3, 62, 2, 5, 4};
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    arr[j] = arr[j] ^ arr[j + 1];
                    arr[j + 1] = arr[j] ^ arr[j + 1];
                    arr[j] = arr[j] ^ arr[j + 1];
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static int binarySort(int[] arr, int target) {
        int l = 0;
        int r = arr.length - 1;
        int mid;
        while (l <= r) {
            mid = (l + r) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    public static int binarySort(int[] arr, int target, int left, int right) {
        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
        return binarySort(arr, target, left, right);
    }
}
