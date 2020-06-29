/*
 * カート内の項目を表すbean
 *Product.java
 */

package jp.co.aforce.beans;

public class ItemBean implements java.io.Serializable {

	//productBeanのid,name,priceをproductに格納
	private ListProductsBean product;

	//ユーザによって選択された数量を格納
	private int count;

	public ListProductsBean getProduct() {
		return product;
	}

	public void setProduct(ListProductsBean p) {
		this.product = p;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
