package Stack;
import java.util.*;

public class SubsequenceString {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
	        String xyz ="abc";
	        String xyz1="ab";
			char[] nums1= xyz.toCharArray();
			char[] nums2= xyz.toCharArray();
			List<List<Character>> res1 = new ArrayList<>();
			List<List<Character>> res2 = new ArrayList<>();
			subsequence(0,nums1,new ArrayList<>(),res1);
			subsequence(0,nums2,new ArrayList<>(),res2);
			System.out.println(res1);
			System.out.println(res2);
			
			if(res1.size() > res2.size()) {
				for(char a:nums1) {
					System.out.print(a);
				}
			}else {
				for(char a:nums2) {
					System.out.print(a);
				}
			}
			
		
		}

		private static void subsequence(int index, char
				[] nums, List<Character> cur, List<List<Character>> res) {
			// TODO Auto-generated method stub
			res.add(new ArrayList(cur));
			for(int i=index;i<nums.length;i++) {
				cur.add(nums[i]);
				subsequence(i+1,nums,cur,res);
				cur.remove(cur.size()-1);
			}
			
		}

	

}
