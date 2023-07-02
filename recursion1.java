
public class recursion1 {

	//Decreasing order
	public static void rec_dec(int n) {
		if(n==1) {
			System.out.print(1);
			return;
		}
		System.out.print(n);
		rec_dec(n-1);
		
	}
	
	//Increasing order
	public static void rec_inc(int n) {
		if(n==1) {
			System.out.print(1);
			return;
		}
		rec_inc(n-1);
		System.out.print(n);
		 
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		rec_inc(n);
	}

}
