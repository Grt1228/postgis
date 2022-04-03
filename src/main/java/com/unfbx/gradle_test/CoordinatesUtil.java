package com.unfbx.gradle_test;


import org.postgis.Point;
import org.springframework.util.StringUtils;

/**
 * 描述：坐标工具
 *
 * @author
 * @date 2022-04-03
 */
public class CoordinatesUtil {


    public static Point buildPoint(String longitude, String latitude) throws Exception {
        if (StringUtils.isEmpty(longitude) || StringUtils.isEmpty(latitude)) {
            throw new Exception("坐标数据异常");
        }
        try {
            Point point = new Point(Double.parseDouble(longitude),Double.parseDouble(latitude));
            return point;
        } catch (Exception e) {
            throw e;
        }
    }
}
