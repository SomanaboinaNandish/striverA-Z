package math;

public class CountOddNumbers {
    public static void main(String[] args) {
        int[] arr = {5, 8, 12, 3, 7, 6, 10};

        int oddCount = countOdd(arr);

        System.out.println("Number of odd elements: " + oddCount);
    }

    // Function to count odd numbers
    static int countOdd(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                count++;
            }
        }
        return count;
    }
}
