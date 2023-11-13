package Stack;
import java.util.*;

public class subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int[] nums1= {1,2,3};
		int[] nums2= {1,2};
		List<List<Integer>> res1 = new ArrayList<>();
		List<List<Integer>> res2 = new ArrayList<>();
		subsequence(0,nums1,new ArrayList<>(),res1);
		subsequence(0,nums2,new ArrayList<>(),res2);
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

	private static void subsequence(int index, int[] nums, List<Integer> cur, List<List<Integer>> res) {
		// TODO Auto-generated method stub
		res.add(new ArrayList(cur));
		for(int i=index;i<nums.length;i++) {
			cur.add(nums[i]);
			subsequence(i+1,nums,cur,res);
			cur.remove(cur.size()-1);
		}
		
	}

}
