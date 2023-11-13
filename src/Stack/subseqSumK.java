package Stack;

import java.util.ArrayList;
import java.util.List;

public class subseqSumK {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int[] nums1= {1,2,3};
	
		int k =5;
		List<List<Integer>> res1 = new ArrayList<>();
		
		subsequence(0,nums1,new ArrayList<>(),res1,k);
	
		System.out.println(res1);
		System.out.println(res2);
		
		if(res1.size() > res2.size()) {
			for(int a:nums1) {
				System.out.print(a);
			}
		}else {
			for(int a:nums2) {
				System.out.print(a);
			}
		}
		
	
	}

	private static void subsequence(int index, int[] nums, List<Integer> cur, List<List<Integer>> res,int k) {
		// TODO Auto-generated method stub
		res.add(new ArrayList(cur));
		for(int i=index;i<nums.length;i++) {
			cur.add(nums[i]);
			subsequence(i+1,nums,cur+nums[i],res,k);
			cur.remove(cur.size()-1);
		}
		
	}

}
