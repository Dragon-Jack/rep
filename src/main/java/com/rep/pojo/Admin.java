package com.rep.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author admin
 * @Description admin实体类
 * @date 2020-01-22 21:24:20
 */
@Entity
@Table(name = "admin")
public class Admin implements Serializable {

    @Id
    private Long id;//主键ID

    private String position; //职位
    private String name; //姓名

    public Long getId() {
        return this.id;
    }

    public void setId(Long aValue) {
        this.id = aValue;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return this.position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", position='" + position + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}



