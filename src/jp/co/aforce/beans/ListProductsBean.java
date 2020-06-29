package jp.co.aforce.beans;

public class ListProductsBean {
	private String id;
	private String name;
	private String image;
	private String category;
	private int price;
	private String detail;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}

	public void ListProductBean(String name,String image,String category,int price,String detail) {
		this.name = name;
		this.image = image;
		this.category = category;
		this.price = price;
		this.detail = detail;
	}

}