class Solution {
	public int solution(int n) {
		int answer = 1;
		
		for(int j = 1; j <= n/2; j++) {
			int sum = 0;
			
			for(int i = j; (sum+i) <= n; i++) { sum += i; }
			if(sum == n) { answer++; }
		}
		
		return answer;
	}
}