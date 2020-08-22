package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("")
public class EmployeeController {

    @RequestMapping("/employeeregistration")
    public ModelAndView register(){
        ModelAndView model=new ModelAndView("employeeregistration");
        return model;
    }

    @RequestMapping(value="/register",method = RequestMethod.POST)
    public ModelAndView registeringEmployee(@ModelAttribute("employee") Employee employee,
                                            BindingResult result){
       if(result.hasErrors()){
        ModelAndView model=new ModelAndView("employeeregistration");
        return model;
       }
        ModelAndView model=new ModelAndView("EmployeeSuccess");
        return model;
    }
}
