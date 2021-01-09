package com.rep.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.Date;

@Table(name = "user")
public class User implements Serializable {
    /**
     * 序号
     */
    @Id
    private String id;

    /**
     * 客户名
     */
    private String name;

    /**
     * 性别：0，女，1男
     */
    private String sex;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 所属公司
     */
    private String oid;

    /**
     * 状态：0，可用，1，不可用
     */
    private String status;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date createtime;

    /**
     * 创建人
     */
    private String createby;

    /**
     * 分配时间
     */
    @Column(name = "`Allottime`")
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date allottime;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 用户名
     */
    private String username;

    /**
     * 用户头像
     */
    @Column(name = "head_picture")
    private String headPicture;

    /**
     * 归属地区
     */
    @Column(name = "area_id")
    private Integer areaId;

    /**
     * 客户id
     */
    private Long client;

    @Transient
    private String area;

    @Transient
    private String province;

    @Transient
    private String offname;

    @Transient
    private String customer;

    @Transient
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getOffname() {
        return offname;
    }

    public void setOffname(String offname) {
        this.offname = offname;
    }

    public Date getAllottime() {
        return allottime;
    }

    public void setAllottime(Date allottime) {
        this.allottime = allottime;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    /**
     * 获取序号
     *
     * @return id - 序号
     */
    public String getId() {
        return id;
    }

    /**
     * 设置序号
     *
     * @param id 序号
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取客户名
     *
     * @return name - 客户名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置客户名
     *
     * @param name 客户名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取性别：0，女，1男
     *
     * @return sex - 性别：0，女，1男
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置性别：0，女，1男
     *
     * @param sex 性别：0，女，1男
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获取联系电话
     *
     * @return phone - 联系电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置联系电话
     *
     * @param phone 联系电话
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 获取所属公司
     *
     * @return oid - 所属公司
     */
    public String getOid() {
        return oid;
    }

    /**
     * 设置所属公司
     *
     * @param oid 所属公司
     */
    public void setOid(String oid) {
        this.oid = oid;
    }

    /**
     * 获取状态：0，可用，1，不可用
     *
     * @return status - 状态：0，可用，1，不可用
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态：0，可用，1，不可用
     *
     * @param status 状态：0，可用，1，不可用
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取创建时间
     *
     * @return createtime - 创建时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置创建时间
     *
     * @param createtime 创建时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 获取创建人
     *
     * @return createby - 创建人
     */
    public String getCreateby() {
        return createby;
    }

    /**
     * 设置创建人
     *
     * @param createby 创建人
     */
    public void setCreateby(String createby) {
        this.createby = createby == null ? null : createby.trim();
    }

    /**
     * 获取分配时间
     *
     * @return Allot time - 分配时间
     */
    public Date getAllotTime() {
        return allottime;
    }

    /**
     * 设置分配时间
     *
     * @param allotTime 分配时间
     */
    public void setAllotTime(Date allotTime) {
        this.allottime = allotTime;
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 获取用户名
     *
     * @return username - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * 获取用户头像
     *
     * @return head_picture - 用户头像
     */
    public String getHeadPicture() {
        return headPicture;
    }

    /**
     * 设置用户头像
     *
     * @param headPicture 用户头像
     */
    public void setHeadPicture(String headPicture) {
        this.headPicture = headPicture == null ? null : headPicture.trim();
    }

    /**
     * 获取归属地区
     *
     * @return area_id - 归属地区
     */
    public Integer getAreaId() {
        return areaId;
    }

    /**
     * 设置归属地区
     *
     * @param areaId 归属地区
     */
    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    /**
     * 获取客户id
     *
     * @return client - 客户id
     */
    public Long getClient() {
        return client;
    }

    /**
     * 设置客户id
     *
     * @param client 客户id
     */
    public void setClient(Long client) {
        this.client = client;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", phone='" + phone + '\'' +
                ", oid=" + oid +
                ", status=" + status +
                ", createtime=" + createtime +
                ", createby='" + createby + '\'' +
                ", allottime=" + allottime +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", headPicture='" + headPicture + '\'' +
                ", areaId=" + areaId +
                ", client=" + client +
                ", area='" + area + '\'' +
                ", province='" + province + '\'' +
                ", offname='" + offname + '\'' +
                ", customer='" + customer + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}