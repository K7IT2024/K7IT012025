public class SmallestNumber {
    public static void main(String[] args) {
        int[] arr = {9,4,8,3,6,20,12,56,7,38,20};
        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (arr[i] < smallest) smallest = arr[i];
        System.out.println("Smallest number is: " + smallest);
    }
}