package com.xr.base.dao;

import java.util.List;
import java.util.Map;

/**
 * 实体数据访问公用接口
 * @author sw
 */
public interface ICommonDAO
{
    /**
     * 执行查询，并按照传入实体类{@code<T>}构造实体列表{@code List<T>}
     * @param <T>         实体类模板
     * @param strSql        查询SQL语句
     * @param entityName    实体类
     * @return              返回实体列表{@code List<T>}
     */
    <T> List<T> getEntityList(String strSql, Class<T> entityName);

    /**
     * 使用List参数<code>paras</code>执行查询，并按照传入实体类{@code<T>}构造实体列表{@code List<T>}
     * @param <T>         实体类模板
     * @param strSql        查询SQL语句
     * @param paras         查询参数
     * @param entityName    实体类
     * @return              返回实体列表{@code List<T>}
     */
    <T> List<T> getEntityList(String strSql, List<Object> paras, Class<T> entityName);

    /**
     * 使用字符串数组参数<code>paras</code>执行查询，并按照传入实体类{@code<T>}构造实体列表{@code List<T>}
     * @param <T>         实体类模板
     * @param strSql        查询SQL语句
     * @param paras         查询参数
     * @param entityName    实体类
     * @return              返回实体列表{@code List<T>}
     */
    <T> List<T> getEntityList(String strSql, Object[] paras, Class<T> entityName);

    /**
     * 使用List参数<code>paras</code>执行查询，并按照传入实体类{@code<T>}构造实体列表{@code List<T>}
     * @param <T>         实体类模板
     * @param strSql        查询SQL语句
     * @param paras         查询参数
     * @param entityName    实体类
     * @return              返回实体列表{@code List<T>}
     */
//  <T> List<T> getEntityList(String strSql, Map<String, Object> paras, Class<T> entityName);

    /**
     * 查询总行数
     * @param strSql        查询SQL语句
     * @return              总行数
     */
    int getTotal(String strSql);
    /**
     * 使用参数<code>paras</code>执行查询总行数
     * @param strSql        查询SQL语句
     * @param paras         查询参数
     * @return              总行数
     */
    int getTotal(String strSql, List<Object> paras);

    /**
     * 使用参数<code>paras</code>执行查询总行数
     * @param strSql        查询SQL语句
     * @param paras         查询参数
     * @return              总行数
     */
    int getTotal(String strSql, Object[] paras);

    /**
     * 使用参数<code>paras</code>执行查询总行数
     * @param strSql        查询SQL语句
     * @param paras         查询参数
     * @return              总行数
     */
    int getTotal(String strSql, Map<String, Object> paras);

    /**
     * 执行分页查询，构造实体列表{@code List<T>}
     * @param <T>         实体类模板
     * @param strSql        查询SQL语句
     * @param entityName    实体类
     * @param start         开始行
     * @param limit         页面行数
     * @return              返回实体列表{@code List<T>}
     */

    /**
     * 获取单个实体
     * @param <T>         实体类模板
     * @param strSql        查询SQL语句
     * @param entityName    实体类
     * @return              返回实体类{@code<T>}
     */
    <T> T getEntity(String strSql, Class<T> entityName);
    /**
     * 获取单个实体
     * @param <T>         实体类模板
     * @param strSql        查询SQL语句
     * @param paras         查询参数
     * @param entityName    实体类
     * @return              返回实体类{@code<T>}
     */
    <T> T getEntity(String strSql, List<Object> paras, Class<T> entityName);
    /**
     * 获取单个实体
     * @param <T>         实体类模板
     * @param strSql        查询SQL语句
     * @param paras         查询参数
     * @param entityName    实体类
     * @return              返回实体类{@code<T>}
     */
    <T> T getEntity(String strSql, Object[] paras, Class<T> entityName);

    /**
     * 执行查询，并把结果构造为通用实体包装类
     * 字段根据<code>paras</code>参数按顺序替换
     * @param strSql    查询SQL语句
     * @param fieldList 替换字段列表
     * @return          返回的通用实体包装类
     */
    List<EntityMap> getList(String strSql, String[] fieldList);
    /**
     * 使用List参数<code>paras</code>执行查询，并把结果构造为通用实体包装类
     * 字段根据<code>paras</code>参数按顺序替换
     * @param strSql    查询SQL语句
     * @param fieldList 替换字段列表
     * @param paras     查询参数
     * @return          返回的通用实体包装类
     */
    List<EntityMap> getList(String strSql, String[] fieldList, List<Object> paras);
    /**
     * 使用字符串数组参数<code>paras</code>执行查询，并把结果构造为通用实体包装类
     * 字段根据<code>paras</code>参数按顺序替换
     * @param strSql    查询SQL语句
     * @param fieldList 替换字段列表
     * @param paras     查询参数
     * @return          返回的通用实体包装类
     */
    List<EntityMap> getList(String strSql, String[] fieldList, Object[] paras);
    /**
     * 使用List参数<code>paras</code>执行查询，并把结果构造为通用实体包装类
     * 字段根据<code>paras</code>参数按字段名替换
     * @param strSql    查询SQL语句
     * @param fieldList 替换字段列表
     * @param paras     查询参数
     * @return          返回的通用实体包装类
     */
    List<EntityMap> getList(String strSql, String[] fieldList, Map<String, Object> paras);

    /**
     * 执行分页查询，并把结果构造为通用实体包装类
     * 字段根据<code>paras</code>参数按顺序替换
     * @param strSql    查询SQL语句
     * @param fieldList 替换字段列表
     * @param start     开始行
     * @param limit     页面行数
     * @return          返回的通用实体包装类
     */

    /**
     * 查询单个数值，返回字符串<code>java.lang.String</code>
     * @param strSql    查询SQL
     * @return          返回结果<code>java.lang.String</code>
     */
    String querySingleString(String strSql);
    /**
     * 查询单个数值，返回字符串<code>java.lang.String</code>
     * @param strSql    查询SQL
     * @param paras     参数<code>paras extend List</code>
     * @return          返回结果<code>java.lang.String</code>
     */
    String querySingleString(String strSql, List<Object> paras);
    /**
     * 查询单个数值，返回字符串<code>java.lang.String</code>
     * @param strSql    查询SQL
     * @param paras     参数<code>paras extend List</code>
     * @return          返回结果<code>java.lang.String</code>
     */
    String querySingleString(String strSql, Object[] paras);
    /**
     * 查询单个数值，返回字符串<code>java.lang.String</code>
     * @param strSql    查询SQL
     * @param paras     参数<code>paras extend Map</code>
     * @return          返回结果<code>java.lang.String</code>
     */
    String querySingleString(String strSql, Map<String, Object> paras);

    /**
     * 查询单个数值，返回整数<code>int</code>
     * @param strSql    查询SQL
     * @return          返回结果<code>int</code>
     */
    int querySingleInteger(String strSql);
    /**
     * 查询单个数值，返回整数<code>int</code>
     * @param strSql    查询SQL
     * @param paras     参数<code>paras extend List</code>
     * @return          返回结果<code>int</code>
     */
    int querySingleInteger(String strSql, List<Object> paras);
    /**
     * 查询单个数值，返回整数<code>int</code>
     * @param strSql    查询SQL
     * @param paras     参数<code>paras extend List</code>
     * @return          返回结果<code>int</code>
     */
    int querySingleInteger(String strSql, Object[] paras);
    /**
     * 查询单个数值，返回整数<code>int</code>
     * @param strSql    查询SQL
     * @param paras     参数<code>paras extend Map</code>
     * @return          返回结果<code>int</code>
     */
    int querySingleInteger(String strSql, Map<String, Object> paras);

    /**
     * 查询单个数值，返回浮点数<code>double</code>
     * @param strSql    查询SQL
     * @return          返回结果<code>double</code>
     */
    double querySingleDouble(String strSql);
    /**
     * 查询单个数值，返回浮点数<code>double</code>
     * @param strSql    查询SQL
     * @param paras     参数<code>paras extend List</code>
     * @return          返回结果<code>double</code>
     */
    double querySingleDouble(String strSql, List<Object> paras);
    /**
     * 查询单个数值，返回浮点数<code>double</code>
     * @param strSql    查询SQL
     * @param paras     参数<code>paras extend List</code>
     * @return          返回结果<code>double</code>
     */
    double querySingleDouble(String strSql, Object[] paras);
    /**
     * 查询单个数值，返回浮点数<code>double</code>
     * @param strSql    查询SQL
     * @param paras     参数<code>paras extend Map</code>
     * @return          返回结果<code>double</code>
     */
    double querySingleDouble(String strSql, Map<String, Object> paras);

    /**
     * 查询单个数值，返回对象<code>java.lang.Object</code>
     * @param strSql    查询SQL
     * @return          返回结果<code>java.lang.Object</code>
     */
    Object querySingleObject(String strSql);
    /**
     * 查询单个数值，返回对象<code>java.lang.Object</code>
     * @param strSql    查询SQL
     * @param paras     参数<code>paras extend List</code>
     * @return          返回结果<code>java.lang.Object</code>
     */
    Object querySingleObject(String strSql, List<Object> paras);
    /**
     * 查询单个数值，返回对象<code>java.lang.Object</code>
     * @param strSql    查询SQL
     * @param paras     参数<code>paras extend Map</code>
     * @return          返回结果<code>java.lang.Object</code>
     */
    Object querySingleObject(String strSql, Object[] paras);
    /**
     * 查询单个数值，返回对象<code>java.lang.Object</code>
     * @param strSql    查询SQL
     * @param paras     参数<code>paras extend Map</code>
     * @return          返回结果<code>java.lang.Object</code>
     */
    Object querySingleObject(String strSql, Map<String, Object> paras);

    /**
     * 执行更新语句
     * @param strSql
     * @return
     */
    int execute(String strSql);

    int execute(String strSql, List<Object> paras);

    int execute(String strSql, Object[] paras);

    int execute(String strSql, Map<String, Object> paras);
}
