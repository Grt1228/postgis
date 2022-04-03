package com.unfbx.gradle_test.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.unfbx.gradle_test.controller.req.StoreReq;
import com.unfbx.gradle_test.controller.resp.StoreResp;
import com.unfbx.gradle_test.pojo.Store;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StoreMapper extends BaseMapper<Store> {
    List<StoreResp> queryList(@Param("req") StoreReq req);
}