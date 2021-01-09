package com.rep.mapper;

import com.rep.mapper.Impl.MarketMapperImpl;
import com.rep.pojo.User;
import org.apache.ibatis.annotations.SelectProvider;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

@org.apache.ibatis.annotations.Mapper
public interface MarketMapper extends Mapper<User> {

    @SelectProvider(type = MarketMapperImpl.class, method = "selectMaAll")
    List<User> selectMaAll(Map<String, Object> params);

}
