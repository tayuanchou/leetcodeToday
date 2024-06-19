import java.util.*;

public class Solution {
    public List<List<Integer>> ans = new ArrayList<>();
    public static void main(String[] args) {
        Solution sol = new Solution();
        List<List<Integer>> ans = sol.generate(10);
        for (List<Integer> list : ans) {
            System.out.println(list);
        }
    }
    
    public List<List<Integer>> generate(int numRows) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        ans.add(list);
        if (numRows == 1) {
            return ans;
        }
        list = new ArrayList<>();
        list.add(1);
        list.add(1);
        ans.add(list);
        if (numRows == 2) {
            return ans;
        }
        for (int i = 2; i < numRows; i++) {
            List<Integer> newList = new ArrayList<Integer>();
            newList.add(1);
            for (int j = 0; j < list.size()-1; j++) {
                newList.add(list.get(j) + list.get(j+1));
            }
            newList.add(1);
            ans.add(newList);
            list = newList;
        }
        return ans;
    }
}