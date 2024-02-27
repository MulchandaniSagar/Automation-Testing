package java_Projects;

class ExcelSheet
{
	void excel1()
	{
		System.out.println("Excel1");
	}
	void excel2()
	{
		System.out.println("Excel2");
	}
	
}


public class TestCase extends ExcelSheet
{
	void testCase()
	{
		System.out.println("Test case Method");
	}

	public static void main(String[] args) 
	{
		ExcelSheet e1 =new TestCase(); //Upcast
		e1.excel1();
		e1.excel2();
		TestCase t1	=(TestCase)e1;
		t1.testCase();
		t1.excel1();
		t1.excel2();
		

	}

}
