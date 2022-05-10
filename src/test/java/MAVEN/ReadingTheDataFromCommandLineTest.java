package MAVEN;

import org.testng.annotations.Test;

public class ReadingTheDataFromCommandLineTest {
	@Test(groups ="smoke")
	public void readingDataFromTest()
	{
		String URL = System.getProperty("url");
		String UN = System.getProperty("username");
		String PWD = System.getProperty("password");
		System.out.println(URL);
		System.out.println(UN);
		System.out.println(PWD);
		System.out.println("hi this is jyothi basai");
	}
	
	@Test(groups ="regression")
	
	public void regression()
	{
		System.out.println("regression test");	
	}

}
