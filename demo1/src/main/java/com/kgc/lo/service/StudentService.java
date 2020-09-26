package com.kgc.lo.service;

import com.kgc.lo.pojo.Student;

import java.util.List;

public interface StudentService {
    List<Student> selectAll();
    int insert(Student student);
}
