package com.unfbx.gradle_test.config.typehandler;

import org.apache.ibatis.type.MappedTypes;
import org.postgis.Point;

/**
 * 描述：
 *
 * @author
 * @date 2022-04-03
 */
@MappedTypes(Point.class)
public class PointTypeHandler extends AbstractGeometryTypeHandler<Point> {
}
