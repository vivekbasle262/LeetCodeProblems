class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
         List<Integer> list = new ArrayList<>();

        // Optimized single-pass loop
        for (int num : nums) {
            if (num < pivot) list.add(num);
        }
        for (int num : nums) {
            if (num == pivot) list.add(num);
        }
        for (int num : nums) {
            if (num > pivot) list.add(num);
        }

        // Convert List<Integer> to int[]
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i); // Convert Integer to int
        }

        return result;
    }
    }
