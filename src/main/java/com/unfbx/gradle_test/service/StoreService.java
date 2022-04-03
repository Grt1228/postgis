package com.unfbx.gradle_test.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.unfbx.gradle_test.controller.req.StoreReq;
import com.unfbx.gradle_test.controller.resp.StoreResp;
import com.unfbx.gradle_test.pojo.Store;

import java.util.List;

/**
 * 描述：
 *
 * @author
 * @date 2022-04-03
 */
public interface StoreService extends IService<Store> {

    List<StoreResp> queryList(StoreReq req);
}
