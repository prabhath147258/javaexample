

public class PrimeFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=2;i<=100;i++) {
			int check=prime(i);
			if (check==1)
				System.out.print(i+" ");
		}
	}
	public static int prime(int a) {
		for(int i=2;i<=a/2;i++) {
			if(a%i==0)
				return 0;
		}
		return 1;
	}

}
