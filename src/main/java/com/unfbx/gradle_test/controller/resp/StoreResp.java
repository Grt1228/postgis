package com.unfbx.gradle_test.controller.resp;

import lombok.Data;

/**
 * 描述：
 *
 * @author grt
 * @date 2022-04-03
 */
@Data
public class StoreResp {
    private Integer id;
    /**
     * 名称
     */
    private String name;
    /**
     * 距离
     */
    private Double distance;
}
