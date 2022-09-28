class testSampleClass
{
	public static void main(String[] args)
	{
		System.out.println("SampleClass.publicStaticIntValue = " + SampleClass.publicStaticIntValue);
		SampleClass.publicStaticIntValue = -1;
		System.out.println("SampleClass.publicStaticIntValue = " + SampleClass.publicStaticIntValue);
		
		SampleClass sampleClass = new SampleClass();
		System.out.println("SampleClass.publicStaticIntValue = " + SampleClass.publicStaticIntValue);
		
		sampleClass.publicIntValue = 10;
		System.out.println("sampleClass.publicIntValue = " + sampleClass.publicIntValue);
		
		sampleClass.setPrivateIntValue(10);
		System.out.println("sampleClass.getPrivateIntValue() = " + sampleClass.getPrivateIntValue());
		
		sampleClass.setPrivateIntValue(10.0);
		System.out.println("sampleClass.getPrivateIntValue() = " + sampleClass.getPrivateIntValue());
	}
}