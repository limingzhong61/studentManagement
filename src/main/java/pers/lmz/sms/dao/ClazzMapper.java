package pers.lmz.sms.dao;

import pers.lmz.sms.bean.Clazz;

import java.util.List;

/**
 * @description: 数据访问层-操控班级信息
 */
public interface ClazzMapper {

    // 根据班级名称获取指定/全部班级信息列表
    List<Clazz> selectList(Clazz clazz);

    // 查询所有班级列表信息(用于在学生管理页面中获取班级信息)
    List<Clazz> selectAll();

    // 获取指定名称的班级信息
    Clazz findByName(String name);

    //  添加班级信息
    int insert(Clazz clazz);

    // 根据id删除指定班级信息
    int deleteById(Integer[] ids);

    // 根据id修改指定班级信息
    int update(Clazz clazz);

}
