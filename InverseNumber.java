public class InverseNumber {
    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 5, 3};
        int n = arr.length;
        int[] inverse = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[j] == i + 1) { // find position of i+1
                    inverse[i] = j + 1;
                    break;
                }
            }
        }
        System.out.print("Inverse Array: ");
        for (int num : inverse) {
            System.out.print(num + " ");
        }
    }
}
