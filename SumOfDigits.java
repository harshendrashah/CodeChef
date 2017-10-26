import java.util.Scanner;
 
class SumOfDigits {
 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int q=sc.nextInt();
		for(int i=0;i<q;i++){
			int n=sc.nextInt();
			int s=0;
			while(n>9){
				int m=n%10;
				n=n/10;
				s=s+m;
			}
			s=s+n;
			System.out.println(s);
		}
	}
 } 