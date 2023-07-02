
public class Recursion_SumofNnums {

	public static int sum(int n) {
		if(n==1) {
			 return 1;
		}
		int fnm1=sum(n-1);
		int sum_num=n+fnm1;
		return sum_num;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		 System.out.println(sum(n));
	}

}
