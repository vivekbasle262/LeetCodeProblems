class Solution {
    public int findPeak(int low, int high, MountainArray mountainArr) {
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    public int binarySearch(int low, int high, int target, MountainArray mountainArr, boolean reverse) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int midValue = mountainArr.get(mid);
            if ((reverse && midValue > target) || (!reverse && midValue < target)) {
                low = mid + 1;
            } else if ((reverse && midValue < target) || (!reverse && midValue > target)) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        int peakIdx = findPeak(0, n - 1, mountainArr);
        int incIdx = binarySearch(0, peakIdx, target, mountainArr, false);
        if (incIdx != -1) {
            return incIdx;
        }
        return binarySearch(peakIdx + 1, n - 1, target, mountainArr, true);
    }
}