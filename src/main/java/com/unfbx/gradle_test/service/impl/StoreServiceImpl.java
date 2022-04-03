package com.unfbx.gradle_test.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.unfbx.gradle_test.controller.req.StoreReq;
import com.unfbx.gradle_test.controller.resp.StoreResp;
import com.unfbx.gradle_test.mapper.StoreMapper;
import com.unfbx.gradle_test.pojo.Store;
import com.unfbx.gradle_test.service.StoreService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 描述：
 *
 * @author
 * @date 2022-04-03
 */
@Service
public class StoreServiceImpl extends ServiceImpl<StoreMapper, Store> implements StoreService {
    @Resource
    private StoreMapper storeMapper;

    @Override
    public List<StoreResp> queryList(StoreReq req) {
        return storeMapper.queryList(req);
    }
}
