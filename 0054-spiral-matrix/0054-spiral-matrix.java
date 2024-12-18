class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
     

 int minrow=0;
        int maxrow=arr.length-1;
        int mincol=0;
        int maxcol=arr[0].length-1;
        List<Integer>arr1=new ArrayList<>();
       while (minrow <= maxrow && mincol <= maxcol) {
            // Traverse from left to right
            for (int r = mincol; r <= maxcol; r++) {
                arr1.add(arr[minrow][r]);
            }
            minrow++;  // Move down to the next row

            // Traverse from top to bottom
            for (int c = minrow; c <= maxrow; c++) {
                arr1.add(arr[c][maxcol]);
            }
            maxcol--;  // Move left to the next column

            // Ensure we still have a bottom row to fill
            if (minrow <= maxrow) {
                // Traverse from right to left
                for (int r = maxcol; r >= mincol; r--) {
                    arr1.add(arr[maxrow][r]);
                }
                maxrow--;  // Move up to the next row
            }

            // Ensure we still have a left column to fill
            if (mincol <= maxcol) {
                // Traverse from bottom to top
                for (int c = maxrow; c >= minrow; c--) {
                    arr1.add(arr[c][mincol]);
                }
                mincol++;  // Move right to the next column
            }
        }

        return arr1;

    }
}