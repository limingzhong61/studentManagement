package pers.lmz.sms.service;

import pers.lmz.sms.bean.Clazz;

import java.util.List;

/**
 * @description: 业务层-操控班级信息
 */
public interface ClazzService {

    // 根据年级与班级名查询指定/全部班级信息列表
    List<Clazz> selectList(Clazz clazz);

    // 查询所有班级信息列表(用于在学生管理页面中获取班级信息)
    List<Clazz> selectAll();

    //  添加班级信息
    int insert(Clazz clazz);

    //  根据id删除指定班级信息
    int deleteById(Integer[] ids);

    // 根据班级名获取指定班级信息
    Clazz findByName(String name);

    //根据id修改指定班级信息
    int update(Clazz clazz);

}
