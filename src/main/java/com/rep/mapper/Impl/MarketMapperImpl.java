package com.rep.mapper.Impl;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.util.StringUtils;

import java.util.Map;

public class MarketMapperImpl {

    public String selectMaAll(Map<String, Object> params) {
        StringBuilder sb = new StringBuilder();

        sb.append("SELECT " +
                "u.id, " +
                "u.`name`, " +
                "u.sex, " +
                "u.phone, " +
                "u.oid, " +
                "u.`status`, " +
                "u.createtime, " +
                "u.createby, " +
                "u.`Allottime`, " +
                "u.email, " +
                "u.username, " +
                "u.head_picture, " +

                "o.offname, " +
                "a.area, " +
                "a.province, " +
                "a.address address," +
                "d.name customer " +
                "FROM " +
                "`user` AS u " +
                "left join " +
                "office o " +
                "on " +
                "u.oid=o.id " +
                "left join " +
                "area a " +
                "on " +
                "u.area_id=a.id " +
                " left join" +
                " admin d" +
                " on " +
                " u.client=d.id " +
                " where 1=1 ");
        if (params.containsKey("offname") && !StringUtils.isEmpty(params.get("offname"))) {
            sb.append(" and o.offname like CONCAT('%',#{offname},'%') ");
        }
        if (params.containsKey("name") && !StringUtils.isEmpty(params.get("name"))) {
            sb.append(" and u.name like CONCAT('%',#{name},'%') ");
        }
        if (params.containsKey("province") && !StringUtils.isEmpty(params.get("province"))) {
            sb.append(" and a.province like CONCAT('%',#{province},'%') ");
        }
        if (params.containsKey("area") && !StringUtils.isEmpty(params.get("area"))) {
            sb.append(" and a.area like CONCAT('%',#{area},'%') ");
        }
        if (params.containsKey("status") && !StringUtils.isEmpty(params.get("status"))) {
            sb.append(" and u.status=#{status} ");
        }
        if (params.containsKey("client") && !StringUtils.isEmpty(params.get("client"))) {
            if (params.get("client").equals("1")) {
                sb.append(" and u.client !='' ");
            } else {
                sb.append(" and u.client ='' ");
            }
        }

        return sb.toString();
    }
}
