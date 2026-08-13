class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int n = intervals.length;
        int[] result = new int[n];     
        int[][] startWithIndex = new int[n][2];
        for (int i = 0; i < n; i++) {
            startWithIndex[i][0] = intervals[i][0];
            startWithIndex[i][1] = i;
        }
        Arrays.sort(startWithIndex, (a, b) -> Integer.compare(a[0], b[0]));
        for (int i = 0; i < n; i++) {
            int targetEnd = intervals[i][1];
            result[i] = binarySearch(startWithIndex, targetEnd);
        }
        
        return result;
    }
    
    private int binarySearch(int[][] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int answerIndex = -1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid][0] >= target) {
                answerIndex = arr[mid][1]; 
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        
        return answerIndex;
    }
}
