public class ClearScreen
{
    public static void main(String args[])
    {
        for(int i = 1 ; i < 4 ; i++)
        {
            System.out.println("This code will get erased after it is printed " + (4-i) + " more time(s)"); 
            try
            {
                Thread.sleep(2000);
            }
            catch(Exception e)
            {    

            }
        }

        // code to clear screen 
        System.out.print("\f");
        
        // printing after erased
        System.out.println("Code was erased!!");
    }
}