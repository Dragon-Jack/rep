package com.rep.conteroller;

import com.github.pagehelper.PageInfo;
import com.rep.mapper.AdminMapper;
import com.rep.pojo.Admin;
import com.rep.pojo.User;
import com.rep.result.Result;
import com.rep.service.MarketService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.sound.midi.Soundbank;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/market")
public class MarketConteroller {
    private static final Logger logger = LoggerFactory.getLogger(MarketConteroller.class);
    @Autowired
    private MarketService marketService;
    @Autowired
    private AdminMapper adminMapper;

    /**
     * 查询所有，带条件查询，分页
     *
     * @param params
     * @return
     */
    @RequestMapping("/selectMaAll")
    public PageInfo<User> selectMaAll(@RequestBody Map<String, Object> params) {
        return marketService.selectMaAll(params);
    }

    /**
     * 添加
     *
     * @param user
     * @return
     */
    @RequestMapping("/customerAdd")
    public Result customerAdd(@RequestBody User user) {
        return marketService.marketAdd(user);
    }

    /**
     * 注销
     *
     * @param uid
     * @return
     */
    @RequestMapping("/customerDel")
    public Result customerDel(String uid) {
        return marketService.customerDel(uid);
    }

    /**
     * 查看管理员表
     *
     * @return
     */
    @RequestMapping("/selectAdmin")
    public List<Admin> selectAdmin() {
        return adminMapper.findAll();
    }

    /**
     * 分配客服
     *
     * @param id
     * @param name
     */
    @RequestMapping(value = "/addPosition", method = RequestMethod.GET)
    public void addPosition(@RequestParam String id, @RequestParam String name) {

        Admin byName = marketService.findByName(name);
        byName.getId();

        User user = new User();
        user.setId(id);
        user.setClient(byName.getId());
        marketService.updateByPrimaryKeySelective(user);
    }
}
