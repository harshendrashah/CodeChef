import java.util.Scanner;
 
class XENTASK {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=0;i<T;i++){
			int N=sc.nextInt();
			int X[]=new int[N];
			int Y[]=new int[N];
			int m=0,n=0;
			for(int j=0;j<N;j++){
				X[j]=sc.nextInt();	
			}
			for(int j=0;j<N;j++){
				Y[j]=sc.nextInt();
			}
			for(int j=0;j<N;j=j+2){
				m=m+X[j];
			}
			for(int j=1;j<N;j=j+2){
				m=m+Y[j];
			}
			for(int j=0;j<N;j=j+2){
				n=n+Y[j];	
			}
			for(int j=1;j<N;j=j+2){
				n=n+X[j];
			}
			if(m<n)
				System.out.println(m);
			else
				System.out.println(n);
		}
	}
 
}