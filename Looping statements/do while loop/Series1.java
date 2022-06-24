//

class Series1{
	

	public static void main(String[] args){

	double pow=3.0,num=3.0;
	double result=1.0;
	for(int i=1;i<=3;i++){
      result = result + (double)(pow/i);
        pow = pow*num;
      }

	
	System.out.println("Series = "+result);
	}
}