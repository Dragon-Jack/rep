package com.rep.mapper;

import com.rep.pojo.Office;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @Description office 数据访问接口
 * @date 2020-01-23 20:35:28
 */
public interface OfficeMapper extends JpaRepository<Office, String>, JpaSpecificationExecutor<Office> {

}

