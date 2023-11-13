
package sub;

import java.util.HashMap;
import java.util.HashSet;

public class c_countUniqueSubstrWithoutRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="abba";
		int len = solution(str);
		System.out.print(len);

	}

	private static int solution(String str) {
	
		int i= -1;
		int j= -1;
		HashMap<Character,Integer> map = new HashMap<>();
		HashSet<String> set  = new HashSet<>();
		StringBuilder substr =new StringBuilder(str);
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
		    		substr.append(ch);
		    		System.out.println(substr);
		    		set.add(substr.toString());
		    	}
		    	
		    }
		    //release
		    while(j<i) {
		    	f2=true;
		    	j++;
		    	char ch= str.charAt(i);
		    	map.put(ch,map.get(ch)-1);
		    	substr.deleteCharAt(j);
		    	if(map.get(ch)==1) {
		    		substr.append(ch);
		    		System.out.println(substr);
		    		set.add(substr.toString());
		    		break;
		    	}
		    	
		    }
		    
		    if(f1==false && f2==false) break;
		    
		    
		    
		}
		System.out.println(set);
		return set.size();
		
	}




}
