//Method local inner class inside for loop

class Outer4
{
	void show() throws Exception
	{
		for(int i=0;i<10;i++)
		{
			class Inner //Method local inner class
			{
				public void innerMethod() throws Exception{
					System.out.println("Method local inner class");
					Thread.sleep(100);
				}
			}
			new Inner().innerMethod();
		}
	}
	public static void main(String[] args)throws Exception {
		new Outer4().show();
	}
}