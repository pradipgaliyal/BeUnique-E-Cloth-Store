package com.clothstore.dto;

import java.math.BigDecimal; 
import org.springframework.beans.BeanUtils;
import org.springframework.web.multipart.MultipartFile;

import com.clothstore.model.Product;

public class ProductAddRequest {

	private int id;
	private String title;
	private String description;
	private int quantity;
	private BigDecimal price;
	private int categoryId;
	private MultipartFile image;
	// A representation of an uploaded file received in a multipart request.

//The file contents are either stored in memory or temporarily on disk.In either case, 
	//the user is responsible for copying file contents to asession-level or persistent store as and if desired.
	//The temporary storagewill be cleared at the end of request processing.

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public MultipartFile getImage() {
		return image;
	}

	public void setImage(MultipartFile image) {
		this.image = image;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public static Product toEntity(ProductAddRequest dto) {
		Product entity = new Product();
		BeanUtils.copyProperties(dto, entity, "image", "categoryId");
		return entity;
	}

	@Override
	public String toString() {
		return "ProductAddRequest [id=" + id + ", title=" + title + ", description=" + description + ", quantity="
				+ quantity + ", price=" + price + ", categoryId=" + categoryId + "]";
	}

}
