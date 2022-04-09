package com.unfbx.gradle_test.controller;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.unfbx.gradle_test.CoordinatesUtil;
import com.unfbx.gradle_test.controller.req.StoreReq;
import com.unfbx.gradle_test.controller.resp.StoreResp;
import com.unfbx.gradle_test.mapper.StoreMapper;
import com.unfbx.gradle_test.pojo.Store;
import com.unfbx.gradle_test.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 描述：
 *
 * @author
 * @date 2022-04-03
 */
@RestController()
@RequestMapping("/api")
public class StoreController {

    @Autowired
    private StoreService storeService;
    @Resource
    private StoreMapper storeMapper;
    @Value("${spring.datasource.password}")
    private String dbPassword;

    @GetMapping("/db_password")
    public String dbVersion(){
        return dbPassword;
    }

    @PostMapping("/store")
    public String add(@RequestBody Store store) throws Exception {
        store.setGeom(CoordinatesUtil.buildPoint(store.getLongitude(), store.getLatitude()));
        storeService.save(store);
        return "添加成功，id：" + store.getId();

    }
    @PostMapping("/stores")
    public List<StoreResp> queryList(@RequestBody StoreReq req){
        return storeService.queryList(req);
    }

}
