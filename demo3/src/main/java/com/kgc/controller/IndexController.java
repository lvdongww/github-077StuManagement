package com.kgc.controller;

import com.kgc.mapper.StudentinfoMapper;
import com.kgc.pojo.Studentinfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shkstart
 */
@Controller
public class IndexController {
    @Resource
    StudentinfoMapper studentinfoMapper;

    @RequestMapping("/")
    public String index(Model model) {
        List<Studentinfo> studentinfos = studentinfoMapper.selectByExample(null);
        model.addAttribute("list", studentinfos);
        return "index";
    }

    @RequestMapping("/add")
    public String add(Studentinfo studentinfo) {
        studentinfoMapper.insert(studentinfo);
        return "redirect:/";
    }
}
