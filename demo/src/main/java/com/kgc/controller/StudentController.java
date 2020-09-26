package com.kgc.controller;

import com.kgc.mapper.ClassesMapper;
import com.kgc.pojo.Classes;
import com.kgc.pojo.Student;
import com.kgc.service.ClassesService;
import com.kgc.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author shkstart
 * @create 2020-09-26 15:18
 */
@Controller
public class StudentController {
    @Resource
    StudentService studentService;
    @Resource
    ClassesService classesService;
    @RequestMapping("/")
    public String toIndex(Model model){
        List<Student> students = studentService.selectAll();
        model.addAttribute("students",students);
        return "index";
    }
    @RequestMapping("/toadd")
    public String toAdd(){
        return "add";
    }
    @RequestMapping("/doadd")
    public String doadd(Student student){
        int add = studentService.add(student);

        return "redirect:/";
    }
    @RequestMapping("/toClass")
    @ResponseBody
    public Map<String,Object> toClass(){
        Map<String,Object> map=new HashMap<>();
        List<Classes> classes = classesService.selectAll();
        map.put("data",classes);
        return map;

    }

}
