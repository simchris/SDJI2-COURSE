package library.domain.model;

public class User {

	private String name;
	private String email;
	private String CPR;
	
	public User(String name,String email,String CPR)
	{
		this.name= name;
		this.email=email;
		this.CPR=CPR;
	}
	
	public String getCPR()
	{
		return CPR;
	}
	


}
