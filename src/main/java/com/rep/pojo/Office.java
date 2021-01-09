package com.rep.pojo;

import javax.persistence.*;

@Entity
@Table(name = "office")
public class Office {
    @Id
    private String id;

    /**
     * 公司名字
     */
    private String offname;

    /**
     * 公司地址
     */
    private String address;

    /**
     * 公司联系电话
     */
    private String phone;

    /**
     * 负责人
     */
    private String master;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 公司官网
     */
    private String website;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取公司名字
     *
     * @return offname - 公司名字
     */
    public String getOffname() {
        return offname;
    }

    /**
     * 设置公司名字
     *
     * @param offname 公司名字
     */
    public void setOffname(String offname) {
        this.offname = offname == null ? null : offname.trim();
    }

    /**
     * 获取公司地址
     *
     * @return address - 公司地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置公司地址
     *
     * @param address 公司地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 获取公司联系电话
     *
     * @return phone - 公司联系电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置公司联系电话
     *
     * @param phone 公司联系电话
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 获取负责人
     *
     * @return master - 负责人
     */
    public String getMaster() {
        return master;
    }

    /**
     * 设置负责人
     *
     * @param master 负责人
     */
    public void setMaster(String master) {
        this.master = master == null ? null : master.trim();
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
     * 获取公司官网
     *
     * @return website - 公司官网
     */
    public String getWebsite() {
        return website;
    }

    /**
     * 设置公司官网
     *
     * @param website 公司官网
     */
    public void setWebsite(String website) {
        this.website = website == null ? null : website.trim();
    }
}