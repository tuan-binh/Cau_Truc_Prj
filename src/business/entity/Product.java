package business.entity;

import java.time.LocalDate;

public class Product
{
	private int id;
	private String name;
	private double price;
	private int stock;
	private LocalDate createdAt;
	private LocalDate updatedAt;
	private int categoryId;
	private Boolean status;
}
