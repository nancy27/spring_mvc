package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("")
public class HelloController {
    @Autowired
    AddService addService;

    @RequestMapping("/hello")
    public String printHello(ModelMap model) {
        model.addAttribute("message", "Hello Spring MVC Framework!");
        return "hello";
    }

    @RequestMapping("/add")
    public ModelAndView printADD(HttpServletRequest request, HttpServletResponse response) {
      int t1= Integer.parseInt(request.getParameter("t1"));
      int t2= Integer.parseInt(request.getParameter("t2"));

      int k=addService.add(t1,t2);
        ModelAndView mv= new ModelAndView();
        mv.setViewName("add");
        mv.addObject("result" , k);
        return mv;
    }


}
