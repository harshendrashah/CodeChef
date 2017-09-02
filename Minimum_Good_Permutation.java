package Sept_Challenge;

import java.util.Scanner;

public class Minimum_Good_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=0;i<T;i++){
			int n=sc.nextInt();
			int arr[]=new int[n];
			int temp;
			if(n%2==0){
				for(int j=0;j<n;j=j+2){
					arr[j]=j+1+1;
					arr[j+1]=j+1;
				}
			}
			else{
				for(int j=0;j<n-3;j=j+2){
					arr[j]=j+1+1;
					arr[j+1]=j+1;
				}
				arr[n-1]=n-1+1;
				arr[n-2]=n-2+1;
				arr[n-3]=n-3+1;
				temp=arr[n-1];
				arr[n-1]=arr[n-3];
				arr[n-3]=arr[n-2];
				arr[n-2]=temp;
			}
			for(int j=0;j<n;j++){
				System.out.print(arr[j]+" ");
			}
			System.out.println();
		}
	}

}
