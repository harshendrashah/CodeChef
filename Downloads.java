import java.util.*;
import java.lang.*;
import java.io.*;
class Downloads {
 
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
			int n=sc.nextInt();
			int k=sc.nextInt();
			int mins[]=new int[n];
			int speed[]=new int[n];
			int totalmins=0;
			for(int j=0;j<n;j++){
				mins[j]=sc.nextInt();
				totalmins=totalmins + mins[j];
				speed[j]=sc.nextInt();
			}
			int x=0,temp=0,y=0,count=0;
			for(int j=0;j<n;j++){
				x=x+mins[j];
				if(x>k){
					y=x-k;
					temp=j;
					break;
				}
			}
			count=y*speed[temp];
			for(int j=temp+1;j<n;j++)
			{
				count=count + mins[j]*speed[j];
			}
			if(totalmins==k)
				System.out.println("0");
			else
				System.out.println(count);
		}
	}
}
	