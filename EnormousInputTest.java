import java.util.*;
 
class EnormousInputTest{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int total = 0;
		for(int i=0;i<n;i++){
			int temp = sc.nextInt();
			if(temp%k==0)
				total++;
		}
		System.out.println(total);
	}
} 