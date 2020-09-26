package com.kgc.service.impl;

import com.kgc.mapper.ClassesMapper;
import com.kgc.pojo.Classes;
import com.kgc.service.ClassesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-09-26 15:45
 */
@Service
public class ClassesServiceImpl implements ClassesService {
    @Resource
    ClassesMapper classesMapper;
    @Override
    public List<Classes> selectAll() {
        List<Classes> classes = classesMapper.selectByExample(null);
        return classes;
    }
}
