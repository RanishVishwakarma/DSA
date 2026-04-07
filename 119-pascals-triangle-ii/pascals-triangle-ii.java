import java.util.ArrayList;
class Solution {
    public List<Integer> getRow(int rowIndex) {
        long ans = 1;
        ArrayList<Integer> ansRow = new ArrayList<>();
        ansRow.add(1);
        for(int col = 1;col<=rowIndex;col++) {
            ans = ans * (rowIndex - col + 1) / col;
            ansRow.add((int) ans);
        }
        return ansRow;        
    }
}