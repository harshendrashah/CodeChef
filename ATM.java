import java.util.Scanner;
 
class ATM{
 
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		double y=sc.nextDouble();
		double ans=0;
		if((x>0 && x<=2000) && (y>=0&& y<=2000)){
			if((double)x+0.50<=y && x%5==0){
				ans=y-(double)x-0.50;
			}
			else
				ans=y;
			System.out.printf("%.2f",ans);
		}
	}
} 