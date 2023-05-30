import java.util.ArrayList;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};
    	ArrayList<String> chkArr = new ArrayList<String>();
		chkArr.add(words[0]);
    	
    	for(int i = 1; i < words.length; i++) {
    		String word = words[i];
    		String before = words[i-1];
    		
    		if(chkArr.contains(word) || before.charAt(before.length()-1) != word.charAt(0)) {
    			int num = (i+1) % n;
    			int count = ((i+1) / n) + 1;
    			
    			if(num == 0) {
    				num = n;
    				count--;
    			}
    			
    			answer[0] = num;
    			answer[1] = count;
    			break;
    		}
    		
    		chkArr.add(word);
    	}
        
        return answer;
    }
}