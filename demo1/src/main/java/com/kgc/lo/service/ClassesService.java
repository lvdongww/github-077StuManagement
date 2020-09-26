package com.kgc.lo.service;

import com.kgc.lo.pojo.Classes;

import java.util.List;

public interface ClassesService {
    Classes selectByClassId(Long classId);
    List<Classes> selectAll();
}
