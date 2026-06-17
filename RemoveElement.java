import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 7, 6, 2};
        int valueToRemove = 6;

        int newLength = 0;
        for (int num : arr) {
            if (num != valueToRemove) {
                arr[newLength++] = num;
            }
        }

        System.out.println("Original array: [1, 4, 6, 7, 6, 2]");
        System.out.println("The length of the new array is: " + newLength);

        System.out.print("Updated array: [");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i]);
            if (i < newLength - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
