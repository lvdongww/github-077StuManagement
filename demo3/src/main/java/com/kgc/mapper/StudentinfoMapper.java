package com.kgc.mapper;

import com.kgc.pojo.Studentinfo;
import com.kgc.pojo.StudentinfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentinfoMapper {
    int countByExample(StudentinfoExample example);

    int deleteByExample(StudentinfoExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(Studentinfo record);

    int insertSelective(Studentinfo record);

    List<Studentinfo> selectByExample(StudentinfoExample example);

    Studentinfo selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") Studentinfo record, @Param("example") StudentinfoExample example);

    int updateByExample(@Param("record") Studentinfo record, @Param("example") StudentinfoExample example);

    int updateByPrimaryKeySelective(Studentinfo record);

    int updateByPrimaryKey(Studentinfo record);
}