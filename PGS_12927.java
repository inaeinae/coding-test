import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());
        for (int work : works) queue.add(work);

        while (n > 0) {
            int max = queue.poll();
            if (max == 0) break;
            queue.add(max - 1);
            n--;
        }

        for (int work : queue) answer += Math.pow(work, 2);
        return answer;
    }
}