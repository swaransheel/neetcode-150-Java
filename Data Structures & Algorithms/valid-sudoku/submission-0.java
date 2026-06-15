class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer,Set<Character>> rows=new HashMap<>();
        Map<Integer,Set<Character>> cols=new HashMap<>();
        Map<Integer,Set<Character>> boxs=new HashMap<>();
        for(int i=0;i<9;i++){
         rows.put(i,new HashSet<>());
         cols.put(i,new HashSet<>());
         boxs.put(i,new HashSet<>());
        }
        for(int i=0;i<9;i++){
         for(int j=0;j<9;j++){
            char ele=board[i][j];
            if(ele=='.') continue;
            int box=(i/3)*3+(j/3);
            if(rows.get(i).contains(ele)|
            cols.get(j).contains(ele)|
            boxs.get(box).contains(ele)
            ){
               return false;
            }
            rows.get(i).add(ele);
            cols.get(j).add(ele);
            boxs.get(box).add(ele);
         }
        }
        return true;
    }
}
