package business.entity;

import business.constants.RoleName;

public class Users
{
	private int id;
	private String username;
	private String fullName;
	private String email;
	private String password;
	private String phone;
	private RoleName roleName;
	/**
	 * ...
	 * */
	public Users()
	{
	}
	
	public Users(int id, String username, String fullName, String email, String password, String phone, RoleName roleName)
	{
		this.id = id;
		this.username = username;
		this.fullName = fullName;
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.roleName = roleName;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getUsername()
	{
		return username;
	}
	
	public void setUsername(String username)
	{
		this.username = username;
	}
	
	public String getFullName()
	{
		return fullName;
	}
	
	public void setFullName(String fullName)
	{
		this.fullName = fullName;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	public String getPhone()
	{
		return phone;
	}
	
	public void setPhone(String phone)
	{
		this.phone = phone;
	}
	
	public RoleName getRoleName()
	{
		return roleName;
	}
	
	public void setRoleName(RoleName roleName)
	{
		this.roleName = roleName;
	}
}
