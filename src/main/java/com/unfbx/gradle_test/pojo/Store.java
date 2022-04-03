package com.unfbx.gradle_test.pojo;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unfbx.gradle_test.config.typehandler.PointTypeHandler;
import lombok.Data;
import org.postgis.Point;

/**
 * t_store
 *
 * @author
 */
@Data
@TableName(value = "t_store", autoResultMap = true)
public class Store implements Serializable {
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 名称
     */
    private String name;

    /**
     * 经度
     */
    private String longitude;

    /**
     * 纬度
     */
    private String latitude;

    /**
     * 地理位置信息
     */
    @JsonIgnore
    @TableField(typeHandler = PointTypeHandler.class)
    private Point geom;

    private Date createTime;

    private Date updateTime;

}