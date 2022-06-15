/*   ****
      ***
       **
        *    */

 // class pattern4 {

 //    public static void main(String []args){

 //    for(int i=1;i<=4;i++)
 //    {
 //      for(int j=1;j<=4;j++)
 //      {
 //        if(i<=j)
 //        System.out.print("*");
 //      else
 //        System.out.print(" ");
 //      }
 //      System.out.println("");
 //    }
    


 //    }
 //   }

 class pattern4 {

    public static void main(String []args){

    for(int i=1;i<=4;i++)
    {
       for(int k=1;k<i;k++)
        {
           System.out.print(" ");
        }
      for(int j=i;j<=4;j++)
      {
         System.out.print("* ");
       
      }
      System.out.println("");
    }
    


    }
   }