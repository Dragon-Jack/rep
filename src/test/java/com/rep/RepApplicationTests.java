package com.rep;

import com.github.pagehelper.PageInfo;
import com.rep.mapper.AdminMapper;
import com.rep.mapper.MarketMapper;
import com.rep.mapper.OfficeMapper;
import com.rep.pojo.Admin;
import com.rep.pojo.Office;
import com.rep.pojo.User;
import com.rep.service.AdminService;
import com.rep.service.MarketService;
import com.rep.utils.IdWorker;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.persistence.EntityManager;
import java.util.HashMap;
import java.util.List;


@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
class RepApplicationTests {
    @Autowired
    private MarketMapper marketMapper;
    @Autowired
    private MarketService marketService;
    @Autowired
    private OfficeMapper officeMapper;
    @Autowired
    private AdminMapper adminMapper;
    @Autowired
    private AdminService adminService;
    @Autowired
    private IdWorker idWorker;

    private static final Logger logger = LoggerFactory.getLogger(RepApplicationTests.class);

    @Test
    void test1() {

        HashMap<String, Object> params = new HashMap<>();
//        params.put("name", "陈");
//        params.put("offname", "国家");
//        params.put("stutas", 0);
        PageInfo<User> users = marketService.selectMaAll(params);
        System.out.println(users);
    }

    @Test
    public void Test1() {
        Office office = new Office();
        office.setOffname("456");
        office.setId(idWorker.nextId() + "");
        Office save = officeMapper.save(office);
        System.out.println(save.getId());

    }

    @Test
    public void test2() {
        System.out.println(idWorker.nextId());
    }

    @Test
    public void test3() {
        marketService.customerDel("1221013920106536960");
    }

    @Test
    public void test4() {


    }
}
