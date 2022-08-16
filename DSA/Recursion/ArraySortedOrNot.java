public class ArraySortedOrNot {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,6,8,9};
        System.out.println("Array is Sorted or Not ? "+isSorted(arr, 0));
    }

    static boolean isSorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        return arr[index] < arr[index + 1] && isSorted(arr, index + 1);
    }
}
