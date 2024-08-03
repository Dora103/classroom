
public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 967;
		int rem,cnt=0,k=0;
		while(n>0)
		{
			
			rem = n%10;
			k = k*10 + rem;
			n = n/10;
			
		}
		System.out.println(k);
		
		//using StringBuffer
		int n1=765;
		System.out.println(new StringBuffer(String.valueOf(n1)).reverse());
	}

}
