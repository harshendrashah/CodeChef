import java.util.Scanner;
 
class Chef_and_Cookoff {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		int i,N,j;
		int c1,c2,c3,c4,c5;
		for(i=0;i<T;i++){
			N=sc.nextInt();
			String arr[]=new String[N];
			c1=0;c2=0;c3=0;c4=0;c5=0;
			for(j=0;j<N;j++){
				arr[j]=sc.next();
				if(arr[j].compareToIgnoreCase("cakewalk")==0){
					c1++;
				}
				else if(arr[j].compareToIgnoreCase("simple")==0){
					c2++;
				}
				else if(arr[j].compareToIgnoreCase("easy")==0){
					c3++;
				}
				else if(arr[j].compareToIgnoreCase("medium")==0 ||
						arr[j].compareToIgnoreCase("easy-medium")==0){
					c4++;
				}
				else if(arr[j].compareToIgnoreCase("medium-hard")==0 || 
						arr[j].compareToIgnoreCase("hard")==0){
					c5++;
				}
			}
			if(c1>=1 && c2>=1 && c3>=1 && c4>=1 && c5>=1){
				System.out.println("Yes");
			}
			else
				System.out.println("No");
		}
	}
 
} 