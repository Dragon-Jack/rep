package com.rep.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.rep.pojo.Admin;

import java.util.List;

/**
 * @Description admin 数据访问接口
 * @date 2020-01-22 21:24:20
 */
public interface AdminMapper extends JpaRepository<Admin, String>, JpaSpecificationExecutor<Admin> {

    Admin findByName(String name);

}

