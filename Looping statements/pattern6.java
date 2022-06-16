/*   *
    ***
   *****
  ******* */

class pattern6 {

    public static void main(String []args){
     int n=0;
    for(int i=1;i<=4;i++)
    {
       for(int k=1;k<=4-i;k++)
        {
           System.out.print(" ");
        }
      for(int j=1;j<=i+n;j++)
      {
         System.out.print("*");
      
      }
      System.out.println("");
       n++;
    }
    


    }
   }