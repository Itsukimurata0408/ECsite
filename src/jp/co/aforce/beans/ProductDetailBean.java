package jp.co.aforce.beans;

public class ProductDetailBean {
	private String id ;
	private String name ;
	private String image;
	private String category;
	private String price;
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

	public String getImg() {
		return image;
	}

	public void setImg(String image) {
		this.image = image;
	}

	public String getCate() {
		return category;
	}

	public void setCate(String category) {
		this.category = category;
	}


	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.name = price;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

}
