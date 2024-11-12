package com.SocialSite.Signup;

public class SignupTest {

	public static void main(String []args) {
		Signup t=new Signup();
		String name=t.SurName("silveru");
		String DOB=t.DOB("18-09-2001");
		long mobileno=t.Mobileno(998076543);


		System.out.println(name);
		System.out.println(DOB);
		System.out.println(mobileno);

		
		
		
	}
	
	
}
