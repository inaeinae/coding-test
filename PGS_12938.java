import java.util.*;

class Solution {
    public int[] solution(int n, int s) {
        ArrayList<Integer> group = new ArrayList<Integer>();
        if (n > s) return new int[]{-1};

        for (int i = n; i > 0; i--) {
            int num = s / i;
            if (s % i > 0) num++;
            group.add(num);
            s = s - num;
        }

        return group.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}