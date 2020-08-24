package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class EmployeeController {

    @RequestMapping("/employeeregistration")
    public String register(Model model){
        model.addAttribute("employee",new Employee());
        //ModelAndView model=new ModelAndView("employeeregistration");
        return "employeeregistration";
    }

    @RequestMapping(value="/register",method = RequestMethod.POST)
    public ModelAndView registeringEmployee( @ModelAttribute("employee") @Valid Employee employee,
                                             BindingResult result){

       if(result.hasErrors()){
        ModelAndView model=new ModelAndView("employeeregistration");
        return model;
       }
        ModelAndView model=new ModelAndView("EmployeeSuccess");
        return model;
    }
}
