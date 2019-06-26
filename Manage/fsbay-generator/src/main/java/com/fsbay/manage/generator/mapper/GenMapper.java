package com.fsbay.manage.generator.mapper;

import java.util.List;

import com.fsbay.manage.generator.domain.ColumnInfo;
import com.fsbay.manage.generator.domain.TableInfo;

/**
 * 代码生成 数据层
 * @author dengzhineng
 * @mail zhineng.deng@163.com
 * @date: 2019年6月22日 下午12:56:45
 * @version 1.0
 * @since JDK 1.8
 */
public interface GenMapper
{
    /**
     * 查询ry数据库表信息
     * 
     * @param tableInfo 表信息
     * @return 数据库表列表
     */
    public List<TableInfo> selectTableList(TableInfo tableInfo);

    /**
     * 根据表名称查询信息
     * 
     * @param tableName 表名称
     * @return 表信息
     */
    public TableInfo selectTableByName(String tableName);

    /**
     * 根据表名称查询列信息
     * 
     * @param tableName 表名称
     * @return 列信息
     */
    public List<ColumnInfo> selectTableColumnsByName(String tableName);
}
