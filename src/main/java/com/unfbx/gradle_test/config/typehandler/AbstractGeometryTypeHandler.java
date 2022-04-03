package com.unfbx.gradle_test.config.typehandler;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.postgis.Geometry;
import org.postgis.PGgeometry;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 描述：
 *
 * @author
 * @date 2022-04-03
 */
public class AbstractGeometryTypeHandler<T extends Geometry> extends BaseTypeHandler<T> {


    /**
     * 表示向PreparedStatement里面设置值
     *
     * @param ps
     * @param i
     * @param parameter
     * @param jdbcType
     * @throws SQLException
     */
    public void setNonNullParameter(PreparedStatement ps, int i, T parameter, JdbcType jdbcType) throws SQLException {
        PGgeometry geometry = new PGgeometry();
        geometry.setGeometry(parameter);
        ps.setObject(i, geometry);

    }

    /**
     * 根据列名获取值
     *
     * @param rs
     * @param columnName
     * @return
     * @throws SQLException
     */
    public T getNullableResult(ResultSet rs, String columnName) throws SQLException {
        PGgeometry pGgeometry = (PGgeometry) rs.getObject(columnName);
        if (pGgeometry == null) {
            return null;
        }
        return (T) pGgeometry.getGeometry();
    }

    /**
     * 根据列索引位置获取值
     *
     * @param rs
     * @param columnIndex
     * @return
     * @throws SQLException
     */
    public T getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        PGgeometry pGgeometry = (PGgeometry) rs.getObject(columnIndex);
        if (pGgeometry == null) {
            return null;
        }
        return (T) pGgeometry.getGeometry();
    }

    /**
     * 获取值  通过列索引
     *
     * @param cs
     * @param columnIndex
     * @return
     * @throws SQLException
     */
    public T getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        PGgeometry pGgeometry = (PGgeometry) cs.getObject(columnIndex);
        if (pGgeometry == null) {
            return null;
        }
        return (T) pGgeometry.getGeometry();
    }
}
