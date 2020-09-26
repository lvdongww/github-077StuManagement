package com.kgc.lo.controller;

import com.kgc.lo.mapper.ClassesMapper;
import com.kgc.lo.pojo.Classes;
import com.kgc.lo.pojo.Student;
import com.kgc.lo.service.ClassesService;
import com.kgc.lo.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class IndexController {
    @Resource
    StudentService studentService;
    @Resource
    ClassesService classesService;

    @RequestMapping("/")
    public String chu() {
        return "index";
    }

    @RequestMapping("/chushi")
    @ResponseBody
    public Map<String, Object> chushi() {
        Map<String, Object> map = new HashMap<>();
        List<Student> students = studentService.selectAll();
        for (int i = 0; i < students.size(); i++) {
            Classes classes = classesService.selectByClassId(students.get(i).getClassid());
            students.get(i).setClasses(classes);
        }
        map.put("data",students);
        return map;
    }
    @RequestMapping("/zhong")
    public String zhong(Model model){
        List<Classes> classes = classesService.selectAll();
        System.out.println(classes.toString());
        model.addAttribute("classes",classes);
        return "add";
    }
    @RequestMapping("/dozhong")
    @ResponseBody
    public Map<String,Object> dozhong(Model model){
        Map<String, Object> map = new HashMap<>();
        List<Classes> classes = classesService.selectAll();
        System.out.println(classes.toString());
        model.addAttribute("classes",classes);
        map.put("data",classes);
        return map;
    }
    @RequestMapping("/doadd")
    public String doadd(Student student){
        int insert = studentService.insert(student);
        System.out.println("插入:"+insert);
        return "index";
    }



}
