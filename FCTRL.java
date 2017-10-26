import java.util.Scanner;
 
class FCTRL {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		
		for(int i=0;i<T;i++){
			int N=sc.nextInt();
			int zeros=0;
			for(int j=5;N/j>=1;j*=5){
				zeros+=N/j;
			}
			System.out.println(zeros);
		}
	}
 
}