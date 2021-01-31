package com.onlinebookstore.onlinebookstore.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="tbl_name")

public class Book
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String sku;
	private String name;
	private String Description;
	@Column(name="unit_price")
	private BigDecimal unitPrice;
	@Column(name="image_url")
	private String imageUrl;
	private boolean active;
	@Column(name = "units_in_stock")
	private int unitsInStock;
	@Column(name="date_created")
	private Date createdOn;
	@Column(name="last_updated")
	private Date updatedOn;
	@ManyToOne
	@JoinColumn(name = "catagory_id",nullable=false)
	private BookCatagory catagory;
	
	public Book(Long id, String sku, String name, String description, BigDecimal unitPrice, String imageUrl,
			boolean active, int unitsInStock, Date createdOn, Date updatedOn, BookCatagory catagory) {
		super();
		this.id = id;
		this.sku = sku;
		this.name = name;
		Description = description;
		this.unitPrice = unitPrice;
		this.imageUrl = imageUrl;
		this.active = active;
		this.unitsInStock = unitsInStock;
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
		this.catagory = catagory;
	}
	public BookCatagory getCatagory() {
		return catagory;
	}
	public void setCatagory(BookCatagory catagory) {
		this.catagory = catagory;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public BigDecimal getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public int getUnitsInStock() {
		return unitsInStock;
	}
	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	public Date getUpdatedOn() {
		return updatedOn;
	}
	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", sku=" + sku + ", name=" + name + ", Description=" + Description + ", unitPrice="
				+ unitPrice + ", imageUrl=" + imageUrl + ", active=" + active + ", unitsInStock=" + unitsInStock
				+ ", createdOn=" + createdOn + ", updatedOn=" + updatedOn + ", catagory=" + catagory + "]";
	}
	public Book(long id, String sku, String name, String description, BigDecimal unitPrice, String imageUrl,
			boolean active, int unitsInStock, Date createdOn, Date updatedOn) {
		super();
		this.id = id;
		this.sku = sku;
		this.name = name;
		Description = description;
		this.unitPrice = unitPrice;
		this.imageUrl = imageUrl;
		this.active = active;
		this.unitsInStock = unitsInStock;
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
}
