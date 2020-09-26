package com.kgc.lo.service.impl;

import com.kgc.lo.mapper.StudentMapper;
import com.kgc.lo.pojo.Student;
import com.kgc.lo.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Resource
    StudentMapper studentMapper;

    @Override
    public List<Student> selectAll() {
        List<Student> students = studentMapper.selectByExample(null);
        return students;
    }

    @Override
    public int insert(Student student) {
        int i = studentMapper.insertSelective(student);
        return i;
    }
}
