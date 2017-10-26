import java.util.Scanner;
import java.lang.*;
 
class Similar_Dishes {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		sc.nextLine();
		for(int j=0;j<T;j++){
			int count=0;
			String str1=sc.nextLine();
			str1.trim();
			String str2=sc.nextLine();
			str2.trim();
			String[] splitStr1 = str1.split("\\s+");
			String[] splitStr2 = str2.split("\\s+");
			for(int i=0;i<4;i++){
				for(int k=0;k<4;k++){
					if(splitStr1[i].equals(splitStr2[k])){
						count++;
					}
				}
			}
			if(count>=2)
				System.out.println("similar");
			else 
				System.out.println("dissimilar");
		}
	}
 
}