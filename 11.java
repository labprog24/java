public class BinarySearch {

    public static int search(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static int search(double[] arr, double key) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; 
    }
    
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.0};
        int intKey = 8;
        double doubleKey = 7.7;
        int intResult = search(intArray, intKey);
        int doubleResult = search(doubleArray, doubleKey);
        if (intResult != -1) {
            System.out.println("Integer Key " + intKey + " found at index " + intResult);
        } else {
            System.out.println("Integer Key " + intKey + " not found.");
        }
        if (doubleResult != -1) {
            System.out.println("Double Key " + doubleKey + " found at index " + doubleResult);
        } else {
            System.out.println("Double Key " + doubleKey + " not found.");
        }
    }
}
