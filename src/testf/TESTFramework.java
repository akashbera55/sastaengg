package testf;

import java.io.IOException;

import org.testng.annotations.Test;

import basepack.BaseTest;
import pomf.POMFramework;

public class TESTFramework extends BaseTest
{
	@Test
	public void fb() throws IOException
	{
		POMFramework p=new POMFramework(driver);
		p.newacc();
	}

}
