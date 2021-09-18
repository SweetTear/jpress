package io.jpress.model.base;

import com.jfinal.plugin.activerecord.IBean;
import io.jpress.base.BaseOptionsModel;

/**
 * Generated by JPress, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseMemberJoinedRecord<M extends BaseMemberJoinedRecord<M>> extends BaseOptionsModel<M> implements IBean {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
	public void setId(java.lang.Long id) {
		set("id", id);
	}

    /**
     * 主键
     */
	public java.lang.Long getId() {
		return getLong("id");
	}

    /**
     * 用户
     */
	public void setUserId(java.lang.Long userId) {
		set("user_id", userId);
	}

    /**
     * 用户
     */
	public java.lang.Long getUserId() {
		return getLong("user_id");
	}

    /**
     * 加入的会员组
     */
	public void setGroupId(java.lang.Long groupId) {
		set("group_id", groupId);
	}

    /**
     * 加入的会员组
     */
	public java.lang.Long getGroupId() {
		return getLong("group_id");
	}

    /**
     * 会员组名称
     */
	public void setGroupName(java.lang.String groupName) {
		set("group_name", groupName);
	}

    /**
     * 会员组名称
     */
	public java.lang.String getGroupName() {
		return getStr("group_name");
	}

    /**
     * 加入的价格
     */
	public void setJoinPrice(java.math.BigDecimal joinPrice) {
		set("join_price", joinPrice);
	}

    /**
     * 加入的价格
     */
	public java.math.BigDecimal getJoinPrice() {
		return get("join_price");
	}

    /**
     * 加入份数，可能会一次购买多份（多年）会员。
     */
	public void setJoinCount(java.lang.Integer joinCount) {
		set("join_count", joinCount);
	}

    /**
     * 加入份数，可能会一次购买多份（多年）会员。
     */
	public java.lang.Integer getJoinCount() {
		return getInt("join_count");
	}

    /**
     * 加入的类型：付费加入、免费赠送等
     */
	public void setJoinType(java.lang.String joinType) {
		set("join_type", joinType);
	}

    /**
     * 加入的类型：付费加入、免费赠送等
     */
	public java.lang.String getJoinType() {
		return getStr("join_type");
	}

    /**
     * 加入来源：后台手动添加，用户自己购买
     */
	public void setJoinFrom(java.lang.Integer joinFrom) {
		set("join_from", joinFrom);
	}

    /**
     * 加入来源：后台手动添加，用户自己购买
     */
	public java.lang.Integer getJoinFrom() {
		return getInt("join_from");
	}

    /**
     * 加入的有效时间
     */
	public void setValidTerm(java.lang.Integer validTerm) {
		set("valid_term", validTerm);
	}

    /**
     * 加入的有效时间
     */
	public java.lang.Integer getValidTerm() {
		return getInt("valid_term");
	}

	public void setOptions(java.lang.String options) {
		set("options", options);
	}

	public java.lang.String getOptions() {
		return getStr("options");
	}

    /**
     * 加入的时间
     */
	public void setCreated(java.util.Date created) {
		set("created", created);
	}

    /**
     * 加入的时间
     */
	public java.util.Date getCreated() {
		return getDate("created");
	}

}

