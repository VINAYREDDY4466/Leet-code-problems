class Solution {
    public boolean canPlaceFlowers(int[] arr, int n) {
         int k = 0;
        while (k < arr.length) {
            if (arr[k] == 0) {
                // Check the left and right neighbors (consider boundary cases)
                boolean leftEmpty = (k == 0) || (arr[k - 1] == 0);
                boolean rightEmpty = (k == arr.length - 1) || (arr[k + 1] == 0);

                // If both neighbors are empty, place a flower
                if (leftEmpty && rightEmpty) {
                    arr[k] = 1;
                    n--;
                }
            }
            // Stop early if we've placed enough flowers
            if (n == 0) {
                return true;
            }
            k++;
        }
        return n <= 0;
    }
}