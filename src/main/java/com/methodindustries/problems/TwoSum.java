package com.methodindustries.problems;

public class TwoSum {

	public static void main(String[] args ) {
		int[] nums= new int[]{2, 7, 11, 15};
		int target = 18;
		
		int[] ans = twoSum(nums, target); // int[]{2,7}
		
		
		System.out.println(nums[ans[0]]) ;
		System.out.println(nums[ans[1]]) ;

		System.out.println(target);
	}
	
	
	
	public static int[] twoSum(int[] nums, int target) {
		for(int i = 0; i<nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target){
			
				return new int[] {i, j};
				
				}
			}
		}
		return new int []{};
	}
}
