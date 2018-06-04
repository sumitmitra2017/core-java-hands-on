
public class twoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[] {1,3,5,7,6,8};
		int target = 9;
		for(int i=0;i<arr.length-2;i++) {
			for(int j=1;j<arr.length-1;j++) {
				
				if (arr[i]+arr[j]==target){
					System.out.println(arr[i]+"&" + arr[j]);
				}
			}
		}

	}

}
