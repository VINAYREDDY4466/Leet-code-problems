class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int coloum=matrix[0].length;
        int start=0;
        int end=coloum-1;
         
        while(start<row && end>=0){
            if(matrix[start][end]>target){
                end--;
            }
            else if(matrix[start][end]<target){
                start++;
            }
            else{
                return true;
            }
        }
        return false;
    }
}