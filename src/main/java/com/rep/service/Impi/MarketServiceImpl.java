package com.rep.service.Impi;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.rep.mapper.AdminMapper;
import com.rep.mapper.AreaMapper;
import com.rep.mapper.MarketMapper;
import com.rep.mapper.OfficeMapper;
import com.rep.pojo.Admin;
import com.rep.pojo.Area;
import com.rep.pojo.Office;
import com.rep.pojo.User;
import com.rep.result.Result;
import com.rep.service.MarketService;
import com.rep.utils.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class MarketServiceImpl extends TserviceImpi<User> implements MarketService {
    @Autowired
    private MarketMapper marketMapper;

    @Autowired
    private OfficeMapper officeMapper;

    @Autowired
    private AdminMapper adminMapper;

    @Autowired
    private AreaMapper areaMapper;

    @Autowired
    private IdWorker idWorker;

    @Autowired
    private Result result;

    @Override
    public PageInfo<User> selectMaAll(Map<String, Object> params) {
        if (StringUtils.isEmpty(params.get("pageNum"))) {
            params.put("pageNum", 1);
        }
        if (StringUtils.isEmpty(params.get("pageSize"))) {
            params.put("pageSize", 5);
        }
        PageHelper.startPage((Integer) params.get("pageNum"), (Integer) params.get("pageSize"));
        List<User> users = marketMapper.selectMaAll(params);
        PageInfo<User> userPageInfo = new PageInfo<>(users);

        return userPageInfo;
    }

    @Override
    public Result marketAdd(User user) {
        Office office = new Office();
        office.setOffname(user.getOffname());
        office.setId(idWorker.nextId() + "");
        Office save = officeMapper.save(office);

        user.setOid(save.getId() + "");
        user.setId(idWorker.nextId() + "");
        user.setCreatetime(new Date());
        int i = marketMapper.insertSelective(user);

        Area area = new Area();
        area.setProvince(user.getProvince());
        area.setArea(user.getArea());
        area.setAddress(user.getAddress());
        area.setId(idWorker.nextId() + "");
        Area areaData = areaMapper.save(area);

        if (!save.equals(null) && i != 0 && !areaData.equals(null)) {
            result.setMsg("添加成功");
            return result;
        }
        result.setMsg("添加失败");
        return result;
    }

    @Override
    public Result customerDel(String id) {
        int i = marketMapper.deleteByPrimaryKey(id);
        if (i >= 1) {
            result.setMsg("注销成功");
            return result;
        }
        result.setMsg("注销失败");
        return result;
    }

    @Override
    public Admin findByName(String name) {
        return adminMapper.findByName(name);
    }
}
