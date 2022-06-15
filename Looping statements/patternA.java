/*
ABCD
EFGH
IJKL
MNOP*/



class patternA{

    public static void main(String []args){
    char ch='A';
    for(int i=1;i<=4;i++)
    {
   
      for(int j=1;j<=4;j++)
      {
         System.out.print(ch);
       if(ch<'Z'){
         ch++;
       }
       else{
         ch='A';
       }
      }
      System.out.println("");
    }
    


    }
   }