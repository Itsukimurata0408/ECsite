/*
 * カート内の項目を表すbean
 *Product.java
 */

package jp.co.aforce.beans;

public class ItemBean implements java.io.Serializable {

	//productBeanのid,name,priceをproductに格納
	private ProductBean product;

	//ユーザによって選択された数量を格納
	private int count;

	public ProductBean getProduct() {
		return product;
	}

	public void setProduct(ProductBean product) {
		this.product = product;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
