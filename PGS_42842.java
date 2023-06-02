class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {0,0};
        
        for(int yellowRow = 1; yellowRow <= yellow; yellowRow++) {
            int top = yellowRow + 2;
            int side = yellow / yellowRow;
            
        	if((top*2) + (side*2) == brown && top >= side+2) {
                return new int[] {top, side + 2};
        	}
        }
        
        return answer;
    }
}