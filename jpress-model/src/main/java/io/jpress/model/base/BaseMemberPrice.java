package io.jpress.model.base;

import io.jboot.db.model.JbootModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JPress, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseMemberPrice<M extends BaseMemberPrice<M>> extends JbootModel<M> implements IBean {

    private static final long serialVersionUID = 1L;

	public void setId(java.lang.Long id) {
		set("id", id);
	}

	public java.lang.Long getId() {
		return getLong("id");
	}

	public void setProductType(java.lang.String productType) {
		set("product_type", productType);
	}

	public java.lang.String getProductType() {
		return getStr("product_type");
	}

	public void setProductId(java.lang.Long productId) {
		set("product_id", productId);
	}

	public java.lang.Long getProductId() {
		return getLong("product_id");
	}

	public void setGroupId(java.lang.Long groupId) {
		set("group_id", groupId);
	}

	public java.lang.Long getGroupId() {
		return getLong("group_id");
	}

    /**
     * 会员价
     */
	public void setPrice(java.math.BigDecimal price) {
		set("price", price);
	}

    /**
     * 会员价
     */
	public java.math.BigDecimal getPrice() {
		return get("price");
	}

	public void setCreated(java.util.Date created) {
		set("created", created);
	}

	public java.util.Date getCreated() {
		return getDate("created");
	}

}

