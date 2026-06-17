public class FirstLastSame {
    public static void main(String[] args) {
        int[] array = {50, -20, 0, 30, 40, 60, 10};

        boolean result = false;

        if (array.length >= 2) {
            result = (array[0] == array[array.length - 1]);
        }

        System.out.println(result);
    }
}
