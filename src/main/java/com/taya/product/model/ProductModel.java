/**
 * TayaFood 2018
 */
package com.taya.product.model;

import com.taya.model.BaseModel;

/**
 * @author Mai Thành Duy An
 */
public interface ProductModel extends BaseModel<Product> {

	public long getPrimaryKey();

	public void setPrimaryKey(long primaryKey);

	public long getProductCategoryId();

	public void setProductCategoryId(long productCategoryId);

	public String getProductname();

	public void setProductname(String productname);

	public String getProductuuid();

	public void setProductuuid(String productuuid);

	public Integer getStandardcost();

	public void setStandardcost(Integer standardcost);

	public String getColor();

	public void setColor(String color);

	public String toString();

}
