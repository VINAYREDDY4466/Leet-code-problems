class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> answer = new ArrayList<>();
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;
        int startRow = 0;
        int startCol = 0;
        while(startRow <= endRow && startCol <= endCol){
            for(int i=startCol;i<=endCol;i++){
                answer.add(matrix[startRow][i]);
            }
            for(int j=startRow+1;j<=endRow;j++){
                answer.add(matrix[j][endCol]);
            }
            for(int i=endCol-1;i>=startCol;i--){
                if(startRow == endRow){
                    break;
                }
                answer.add(matrix[endRow][i]);
            }
            for(int i=endRow-1;i>=startRow+1;i--){
                if(startCol == endCol){
                    break;
                }
                answer.add(matrix[i][startCol]);
            }
            startRow ++;
            startCol++;
            endRow --;
            endCol --;
        }
        return answer;
    }
}