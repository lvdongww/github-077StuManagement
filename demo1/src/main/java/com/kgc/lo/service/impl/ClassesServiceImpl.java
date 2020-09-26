package com.kgc.lo.service.impl;

import com.kgc.lo.mapper.ClassesMapper;
import com.kgc.lo.pojo.Classes;
import com.kgc.lo.pojo.ClassesExample;
import com.kgc.lo.service.ClassesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("classesService")
public class ClassesServiceImpl implements ClassesService {
    @Resource
    ClassesMapper classesMapper;
    @Override
    public Classes selectByClassId(Long classId) {
        Classes classes = classesMapper.selectByPrimaryKey((long) classId);
        return classes;
    }

    @Override
    public List<Classes> selectAll() {
        List<Classes> classes = classesMapper.selectByExample(null);
        return classes;
    }
}
