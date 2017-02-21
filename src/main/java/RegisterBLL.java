package main.java;

public class RegisterBLL {

	public String Validate(String userName, String userEmail) {
		// TODO Auto-generated method stub
		if(userEmail.equals("naveenhome@gmail.com"))
		{
			return "Email already exist";
		}
		else
		{
			return "Registration Successful";
		}
		
	}

	public boolean SendMail() {
		// TODO Auto-generated method stub
		return true;
	}

}
