package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
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
    @RequestMapping("/form")
        public String login(){
            return "form";
        }

    @RequestMapping(value="/login",method = RequestMethod.POST)
      public ModelAndView checkUser(@ModelAttribute("login1") LoginCredentials login1){
        ModelAndView model1=new ModelAndView("success");

        return model1;
      }
// By using model attribute the code repetion can be avoided. It can be used where same model
// attribute is used in multiple methods.
    @ModelAttribute
    public void addingCommonAttribute(Model model1){
        model1.addAttribute("headerMessage","Logged In");
    }

    /*
    This is another way instead of using modelattribute

    @RequestMapping("/login")
    public ModelAndView checkUser(HttpServletRequest request, HttpServletResponse response){
        ModelAndView mv= new ModelAndView();
        String uname=request.getParameter("uname");
        String pass=request.getParameter("pass");

        if(uname.equals("abc")&&pass.equals("123")){
            mv.setViewName("success");
        }
        else{
            mv.setViewName("form");
        }
        return mv;
    }

         */


}
