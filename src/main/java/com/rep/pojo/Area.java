package com.rep.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "area")
@Entity
public class Area implements Serializable {
    @Id
    private String id;

    /**
     * 归属省份
     */
    private String province;

    /**
     * 归属地区
     */
    private String area;

    /**
     * 地址
     */
    private String address;


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

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
     * 获取归属省份
     *
     * @return province - 归属省份
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置归属省份
     *
     * @param province 归属省份
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * 获取归属地区
     *
     * @return area - 归属地区
     */
    public String getArea() {
        return area;
    }

    /**
     * 设置归属地区
     *
     * @param area 归属地区
     */
    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }
}