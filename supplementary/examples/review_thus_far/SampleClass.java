class SampleClass
{
	public static int publicStaticIntValue = 0;
	public int publicIntValue;
	private int privateIntValue;
	
	SampleClass()
	{
		publicStaticIntValue = publicStaticIntValue+1;
		publicIntValue = 0;
		privateIntValue = 0;
	}
	
	public void setPrivateIntValue(int v)
	{
		privateIntValue = v;
	}
	
	public void setPrivateIntValue(double v)
	{
		privateIntValue = (int) (2.0*v);
	}
	
	public int getPrivateIntValue()
	{
		return privateIntValue;
	}
}