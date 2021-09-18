package io.jpress.model.base;

import com.jfinal.plugin.activerecord.IBean;
import io.jpress.base.BaseOptionsModel;

/**
 * Generated by JPress, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseUserOrderDelivery<M extends BaseUserOrderDelivery<M>> extends BaseOptionsModel<M> implements IBean {

    private static final long serialVersionUID = 1L;

	public void setId(java.lang.Long id) {
		set("id", id);
	}

	public java.lang.Long getId() {
		return getLong("id");
	}

    /**
     * 快递公司
     */
	public void setCompany(java.lang.String company) {
		set("company", company);
	}

    /**
     * 快递公司
     */
	public java.lang.String getCompany() {
		return getStr("company");
	}

    /**
     * 快递单号
     */
	public void setNumber(java.lang.String number) {
		set("number", number);
	}

    /**
     * 快递单号
     */
	public java.lang.String getNumber() {
		return getStr("number");
	}

    /**
     * 快递发货时间
     */
	public void setStartTime(java.util.Date startTime) {
		set("start_time", startTime);
	}

    /**
     * 快递发货时间
     */
	public java.util.Date getStartTime() {
		return getDate("start_time");
	}

    /**
     * 快递送达时间
     */
	public void setFinishTime(java.util.Date finishTime) {
		set("finish_time", finishTime);
	}

    /**
     * 快递送达时间
     */
	public java.util.Date getFinishTime() {
		return getDate("finish_time");
	}

    /**
     * 收货人地址
     */
	public void setAddrUsername(java.lang.String addrUsername) {
		set("addr_username", addrUsername);
	}

    /**
     * 收货人地址
     */
	public java.lang.String getAddrUsername() {
		return getStr("addr_username");
	}

    /**
     * 收货人手机号（电话）
     */
	public void setAddrMobile(java.lang.String addrMobile) {
		set("addr_mobile", addrMobile);
	}

    /**
     * 收货人手机号（电话）
     */
	public java.lang.String getAddrMobile() {
		return getStr("addr_mobile");
	}

    /**
     * 收件人省
     */
	public void setAddrProvince(java.lang.String addrProvince) {
		set("addr_province", addrProvince);
	}

    /**
     * 收件人省
     */
	public java.lang.String getAddrProvince() {
		return getStr("addr_province");
	}

    /**
     * 收件人的城市
     */
	public void setAddrCity(java.lang.String addrCity) {
		set("addr_city", addrCity);
	}

    /**
     * 收件人的城市
     */
	public java.lang.String getAddrCity() {
		return getStr("addr_city");
	}

    /**
     * 收件人的区（县）
     */
	public void setAddrDistrict(java.lang.String addrDistrict) {
		set("addr_district", addrDistrict);
	}

    /**
     * 收件人的区（县）
     */
	public java.lang.String getAddrDistrict() {
		return getStr("addr_district");
	}

    /**
     * 收件人的详细地址
     */
	public void setAddrDetail(java.lang.String addrDetail) {
		set("addr_detail", addrDetail);
	}

    /**
     * 收件人的详细地址
     */
	public java.lang.String getAddrDetail() {
		return getStr("addr_detail");
	}

    /**
     * 收件人地址邮政编码
     */
	public void setAddrZipcode(java.lang.String addrZipcode) {
		set("addr_zipcode", addrZipcode);
	}

    /**
     * 收件人地址邮政编码
     */
	public java.lang.String getAddrZipcode() {
		return getStr("addr_zipcode");
	}

    /**
     * 发货状态
     */
	public void setStatus(java.lang.Integer status) {
		set("status", status);
	}

    /**
     * 发货状态
     */
	public java.lang.Integer getStatus() {
		return getInt("status");
	}

    /**
     * json字段扩展
     */
	public void setOptions(java.lang.String options) {
		set("options", options);
	}

    /**
     * json字段扩展
     */
	public java.lang.String getOptions() {
		return getStr("options");
	}

    /**
     * 修改时间
     */
	public void setModified(java.util.Date modified) {
		set("modified", modified);
	}

    /**
     * 修改时间
     */
	public java.util.Date getModified() {
		return getDate("modified");
	}

    /**
     * 创建时间
     */
	public void setCreated(java.util.Date created) {
		set("created", created);
	}

    /**
     * 创建时间
     */
	public java.util.Date getCreated() {
		return getDate("created");
	}

}

