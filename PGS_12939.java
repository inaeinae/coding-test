class Solution {
	public String solution(String s) {
		String[] nums = s.split(" ");
		int min = 0;
		int max = 0;
		
		for(int i = 0; i < nums.length; i++) {
			int num = Integer.parseInt(nums[i]);
			
			if(i == 0) {
				min = num;
				max = num;
				continue;
			}
			
			if(num < min) min = num;
			if(num > max) max = num;
		}
		
		return min + " " + max;
	}
}