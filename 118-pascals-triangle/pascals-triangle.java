import java.util.ArrayList;
class Solution {
    public List<List<Integer>> generate(int numRows) {   
        List<List<Integer>> result = new ArrayList<>();
        for (int i=0; i<numRows;i++) {
            result.add(getRow(i));
        }
        return result;
    }

    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> ansRow = new ArrayList<>();
        long ans = 1;
        ansRow.add(1);

        for(int col = 1; col<= rowIndex;col++) {
            ans = ans * (rowIndex - col + 1) / col;
            ansRow.add((int)ans);
        }
        return ansRow;
    }
}