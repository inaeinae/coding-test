class Solution {
    public int[] solution(String s) {
		int[] answer = {0,0}; // {이진변환횟수, 0제거횟수}
    	
		while(!s.equals("1")) {
	        long cnt = s.chars().filter(c -> c == '0').count();
	        s = Long.toBinaryString(s.length() - cnt);
	        
	        answer[0]++;
	        answer[1] += Long.valueOf(cnt).intValue();
		}
		
        return answer;
    }
}