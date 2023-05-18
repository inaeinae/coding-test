class Solution
{
	public int solution(String s) {
		while(true) {
			String repStr = s.replaceFirst("(\\w)\\1", "");
			
			if(s.equals(repStr)) return 0;
			if(repStr.length() == 0) return 1;
			
			s = repStr;
		}
	}
}