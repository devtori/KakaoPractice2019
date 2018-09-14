import java.util.Scanner;

public class practice1_2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		byte map1[][] = new byte[num][num];
		byte map2[][] = new byte[num][num];
		
		
		for (int i = 0; i<num; i++) {
			int temp = scanner.nextInt();
			for (int j = num-1; j>=0; j--) {
				map1[i][j] = (byte) (temp%2);
				temp=temp/2;
			}
		}
		for (int i = 0; i<num; i++) {
			int temp = scanner.nextInt();
			for (int j = num-1; j>=0; j--) {
				map2[i][j] = (byte) (temp%2);
				temp=temp/2;
			}
		}
		
		byte resultMap[][] = new byte[num][num];
		String[] ans = new String[num];
		
		for (int i = 0; i<num; i++) {
			ans[i]="";
		}
		
		for (int i = 0; i<num; i++) {			
			for (int j = 0; j<num; j++) {
				resultMap[i][j] = (byte) (map1[i][j] | map2[i][j]);
			}
			
			for (int j = 0; j<num; j++) {
				if (resultMap[i][j]==1) {
					ans[i] = ans[i]+"#";
				}else {
					ans[i] = ans[i]+" ";
				}
			}
		}
		
//		for (int i = 0; i<num; i++) {			
//			for (int j = 0; j<num; j++) {
//				System.out.print(result[i][j]);
//			}
//			System.out.println();
//		}
		
		for (int i = 0; i<num; i++) {
			System.out.println(ans[i]);
		}
		
		
		}
		
	}
