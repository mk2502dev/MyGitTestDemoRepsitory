package com.manish.eb.pack1;

public class MainClass
{
	Student s1 = new Student();
	Student s2 = new Student();
	Student s3 = new Student();

	public static void main(String[] args)
	{
		for (int i = 0; i < 100000000; i++)
		{
			String s = new String("Manish");
		}
		System.out.println("main completed");

	}

}

class Student
{

}
