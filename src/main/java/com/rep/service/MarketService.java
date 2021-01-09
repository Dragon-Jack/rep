package com.rep.service;

import com.github.pagehelper.PageInfo;
import com.rep.pojo.Admin;
import com.rep.pojo.User;
import com.rep.result.Result;

import java.util.Map;


public interface MarketService extends Tservice<User> {
    PageInfo<User> selectMaAll(Map<String, Object> params);

    Result marketAdd(User user);

    Result customerDel(String id);

    Admin findByName(String name);
}
