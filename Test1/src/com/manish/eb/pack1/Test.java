package com.manish.eb.pack1;

public class Test
{
	private static int count;
	public static Test t1;

	public static void main(String[] args)
	{
		for (int i = 0; i < 100000000; i++)
		{
			t1 = new Test();// this object by default eligible for GC.
		}
	}

	@Override
	protected void finalize() throws Throwable
	{
		System.out.println("finalize() method called: " + count++);
	}
}