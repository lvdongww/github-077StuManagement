package com.kgc.service;

import com.kgc.pojo.Student;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-09-26 15:16
 */
public interface StudentService {
    List<Student> selectAll();

    int add(Student student);
}
