public class CountEvenNumbers {
    public static void main(String[] args) {
        int[] arr = {5, 8, 12, 3, 7, 6, 10};

        int evenCount = countEven(arr);

        System.out.println("Number of even elements: " + evenCount);
    }

    // Function to count even numbers
    static int countEven(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
