import java.util.Scanner;
 
class Little_Chef_and_Sum {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=0;i<T;i++){
			int n=sc.nextInt();
			int arr[]=new int[n];
			int min=0;
			for(int j=0;j<n;j++){
				arr[j]=sc.nextInt();
				if(arr[j]<arr[min]){
					min=j;
				}	
			}
			
			System.out.println(min+1);
		}
	}
 
}
 