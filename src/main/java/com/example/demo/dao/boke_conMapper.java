package com.example.demo.dao;

import com.example.demo.pojo.boke_con;

public interface boke_conMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(boke_con record);

    int insertSelective(boke_con record);

    boke_con selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(boke_con record);

    int updateByPrimaryKeyWithBLOBs(boke_con record);

    int updateByPrimaryKey(boke_con record);
}