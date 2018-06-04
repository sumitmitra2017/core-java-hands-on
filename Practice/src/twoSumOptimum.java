import java.util.*;


public class twoSumOptimum {
	
	public static void main(String[] args) {
		
		int[] arr=new int[] {1,2,3,4,5,6};
		int target = 7;
		
		Map<Integer,Integer> hm= new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			
			int complement=target - arr[i];
			if(hm.containsKey(complement)) {
				System.out.println(arr[i]+ ",&"+complement);
								
			}else {
				hm.put(arr[i], i);
				
			}
		}
		
		
	}

}
