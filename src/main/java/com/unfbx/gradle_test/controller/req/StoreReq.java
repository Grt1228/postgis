package com.unfbx.gradle_test.controller.req;

import lombok.Data;

/**
 * 描述：
 *
 * @author grt
 * @date 2022-04-03
 */
@Data
public class StoreReq {
    /**
     * 经度
     */
    private String longitude;

    /**
     * 纬度
     */
    private String latitude;
    /**
     * 多少米范围内
     */
    private Integer distance;
}
