//

class Series2{
	

	public static void main(String[] args){

	double pow=2.0,num=2.0,fact=1.0;
	double result=1.0;
	for(int i=2;i<=3;i++){
      result = result + (double)(pow/fact);
        pow = pow*num;
        fact=1.0;
        for(int j=i;j>=1;j--){
        	fact = fact * j;
        }

      }

	
	System.out.println("Series = "+result);
	}
}