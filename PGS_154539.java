import java.util.Stack;
class Solution {
	public int[] solution(int[] numbers) {
		int[] answer = new int[numbers.length];
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(0);

		for(int i = 1; i < numbers.length; i++) {
			while(!stack.empty() && numbers[stack.peek()] < numbers[i]) {
				answer[stack.peek()] = numbers[i];
				stack.pop();
			}
			stack.push(i);
		}

		while(!stack.empty()) {
			answer[stack.peek()] = -1;
			stack.pop();
		}

		return answer;
	}
}