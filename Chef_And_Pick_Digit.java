import java.util.Scanner;
 
class Chef_And_Pick_Digit {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<T;i++){
			String str=sc.nextLine();
			int arr[]=new int[10];
			for(int j=0;j<str.length();j++){
				for(int k=0;k<10;k++){
					if((int)str.charAt(j) - 48==k){
						arr[k]=arr[k]+1;
					}
				}
			}
		
			int num=10;
			int temp;
			char c;
			for(int j=6;j<10;j++){
					if(arr[j]>=1){
					num=j*10;
					for(int k=0;k<10;k++){
						temp=num+k;
						if(temp>=65 && temp<=90){
							if(arr[k]>=1 && j!=k){
								c=(char)temp;
								System.out.print(c);
							}
							if(j==k && arr[k]>=2){
								c=(char)temp;
								System.out.print(c);
							}
						}
					}
				}
			}
			System.out.println();
		}
	}
 
}