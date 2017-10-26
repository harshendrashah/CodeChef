import java.util.Arrays;
import java.util.Scanner;
 
class Dish_Of_Life {
 
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=0;i<T;i++){
			int count=0;
			boolean d=false;
			int N=sc.nextInt();
			int K=sc.nextInt();
			int arr[]=new int[K+1];
			for(int j=1;j<=K;j++){
				arr[j]=0;
			}
			for(int j=0;j<N;j++){
				int P=sc.nextInt();
				while(P-->0){
					int c=sc.nextInt();
					if(arr[c]==0){
						arr[c]=c;
						count++;
					}
				}
				if(count==K && j<N-1){
					d=true;
				}
			}
			if(d)
				System.out.println("some");
			else if(count<K)
				System.out.println("sad");
			else
				System.out.println("all");
		}
	}
}