package business.entity;

public class Category
{
	private int id;
	private String categoryName;
	private String description;
	private Boolean status;
	
	public Category()
	{
	}
	
	public Category(int id, String categoryName, String description, Boolean status)
	{
		this.id = id;
		this.categoryName = categoryName;
		this.description = description;
		this.status = status;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getCategoryName()
	{
		return categoryName;
	}
	
	public void setCategoryName(String categoryName)
	{
		this.categoryName = categoryName;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public void setDescription(String description)
	{
		this.description = description;
	}
	
	public Boolean getStatus()
	{
		return status;
	}
	
	public void setStatus(Boolean status)
	{
		this.status = status;
	}
}
