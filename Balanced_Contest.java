import java.util.Scanner;
 
class Balanced_Contest {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		int N,P;
		int cw,hard;
		for(int i=0;i<T;i++){
			N=sc.nextInt();
			P=sc.nextInt();
			cw=0;hard=0;
			int arr[]=new int[N];
			for(int j=0;j<N;j++){
				arr[j]=sc.nextInt();
				if(arr[j]>=P/2)
					cw++;
				else if(arr[j]<=P/10)
					hard++;
			}
			if(hard==2 && cw==1)
				System.out.println("yes");
			else
				System.out.println("no");
		}
	}
 
} 