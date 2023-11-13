package sub;

import java.util.HashMap;


//length of longest substring without repeating characters
public class a_lenghtOfLongestSubstrWithoutRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="abbacbcdbaeb";
		int len = solution(str);
		System.out.print(len);

	}

	private static int solution(String str) {
	
		int i= -1;
		int j= -1;
		HashMap<Character,Integer> map = new HashMap<>();
		int ans=0;
		while(true){
			boolean f1= false;
			boolean f2= false;
			
			//acquire
		    while(i< str.length()-1) {
		    	f1= true;
		    	i++;
		    	char ch = str.charAt(i);
		    	map.put(ch,map.getOrDefault(ch,0)+1);
		    	if(map.get(ch)==2) {
		    		break;
		    	}else {
		    		int len=i-j;
		    		if(len>ans) {
		    			ans =len;
		    		}
		    	}
		    	
		    }
		    //release
		    while(j<i) {
		    	f2=true;
		    	j++;
		    	char ch= str.charAt(i);
		    	map.put(ch,map.get(ch)-1);
		    	if(map.get(ch)==1) break;
		    	
		    }
		    
		    
		    if(f1==false && f2==false) break;
		    
		    
		    
		}
		
		return ans;
		
	}

	

}
