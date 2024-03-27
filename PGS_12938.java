import java.util.*;

class Solution {
    public int[] solution(int n, int s) {
        int[] group = new int[n];
        if (n > s) return new int[]{-1};

        for (int i = n; i > 0; i--) {
            int num = s / i;
            group[n - i] = num;
            s = s - num;
        }

        return group;
    }
}