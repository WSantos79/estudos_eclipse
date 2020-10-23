package faculdade;

public class fatorial {
	public static long fat(int n){

		 if (n == 0 || n == 1) {

		  return 1;

		 }

		 return n * fat(n - 1);

		} 
	
	
	public static long fat2(int n){

		 long fatorial = 1;

		 for (int i=1; i <= n; i++) { 

		  fatorial *= i;

		 }

		 return fatorial;

		}
	public static void main(String[] args) {
		
		
		System.out.println(fat(25));
		System.out.println(fat2(21));
		// TODO Auto-generated method stub

	}

}
