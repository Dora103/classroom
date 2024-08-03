class DiffWrapper
{
	void show(Object obj)
	{
		System.out.println("value="+obj);
	}
	public static void main(String[] args) {
		DiffWrapper dw = new DiffWrapper();
		dw.show(new Integer(100));
		dw.show(new Float(3.14));
		dw.show(new Character('a'));
	}
}