package com.kgc.service.impl;

import com.kgc.mapper.StudentMapper;
import com.kgc.pojo.Student;
import com.kgc.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-09-26 15:16
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    StudentMapper studentMapper;
    @Override
    public List<Student> selectAll() {
        return studentMapper.selectByExample2();
    }

    @Override
    public int add(Student student) {
        return studentMapper.insertSelective(student);
    }

}
