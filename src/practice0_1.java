import java.util.Scanner;

public class practice0_1 {

	public static void main(String[] args) {
		
	}
	
	public boolean solution(int[] arr) {
		
		boolean answer = true;
		boolean[] check = new boolean[arr.length+1];
		
		for (int i = 0; i<arr.length; i++) {
			if(arr[i]<=arr.length&&!check[arr[i]]) {
				check[arr[i]] = true;
			} else {
			answer = false;
			}
		}
		return answer;
	}
}
