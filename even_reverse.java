import java.util.Scanner;

class even_reverse {
	
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
	int m=sc.nextInt();
        int n=sc.nextInt();
	int i = m;
	while(i>=n) {
			
	  if(i%2==0)
         System.out.print(i+" ");
	 i--;

       }
       
}
}
