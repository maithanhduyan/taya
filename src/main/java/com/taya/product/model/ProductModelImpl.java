/**
 * TayaFood 2018
 */
package com.taya.product.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.hibernate.annotations.NamedQuery;
import com.taya.model.BaseModelImpl;

/**
 * @author Mai Thành Duy An
 */
@SuppressWarnings("serial")
@Entity
@NamedQuery(name = "Product.findAll", query = "SELECT p FROM Product p")
public class ProductModelImpl extends BaseModelImpl<Product> implements ProductModel {

	@Override
	public long getPrimaryKey() {
		return this._productid;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		this._productid = primaryKey;
	}

	@Override
	public long getProductCategoryId() {
		return this._productcategoryid;
	}

	@Override
	public void setProductCategoryId(long productCategoryId) {
		this._productcategoryid = productCategoryId;
	}

	@Override
	public String getProductname() {
		return this._productname;
	}

	@Override
	public void setProductname(String productname) {
		this._productname = productname;
	}

	@Override
	public String getProductuuid() {
		return this._productuuid;
	}

	@Override
	public void setProductuuid(String productuuid) {
		this._productuuid = productuuid;
	}

	@Override
	public Integer getStandardcost() {
		return this._standardcost;
	}

	@Override
	public void setStandardcost(Integer standardcost) {
		this._standardcost = standardcost;
	}

	@Override
	public String getColor() {
		return this._color;
	}

	@Override
	public void setColor(String color) {
		this._color = color;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long _productid;

	private String _color;

	private Long _productcategoryid;

	private String _productname;

	private String _productuuid;

	private Integer _standardcost;

}
