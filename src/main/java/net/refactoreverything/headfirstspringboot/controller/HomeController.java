package net.refactoreverything.headfirstspringboot.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import net.refactoreverything.headfirstspringboot.model.Subcriber;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @ModelAttribute("courseName")
    public String courseName(){
        return "JavaCore";
    }

    @RequestMapping("/")
    public String home(){
//        String email = request.getParameter("email");
//        String description = request.getParameter("description");
//        if(request.getMethod().equals("POST")) {
//            session.setAttribute("email", email);
//            session.setAttribute("description", description);
//            session.setAttribute("subcribed", true);
//        }
        return "index";
    }

//    @RequestMapping("/subcribe")
//    public String subcribe(@RequestParam() String email, @RequestParam() String description, Model model){
//        if(!email.isEmpty() && !description.isEmpty()){
//            model.addAttribute("email", email);
//            model.addAttribute("description", description);
//            model.addAttribute("subcribed", true);
//        }
//        return "index";
//    }

//    @RequestMapping("/subcribe")
//    public ModelAndView subcribe(@RequestParam("email") String email, @RequestParam("name") String name, ModelAndView mv){
//        if(!email.isEmpty() && !name.isEmpty()){
//            Subcriber subcriber = new Subcriber();
//            subcriber.setSubcriberId(1);
//            subcriber.setSubcriberEmail(email);
//            subcriber.setSubcriberName(name);
//            mv.addObject("subcriber", subcriber);
//        }
//
//        mv.setViewName("index");
//
//        return mv;
//    }

    @RequestMapping("/subcribe")
    public String subcribe(@ModelAttribute() Subcriber subcriber){

        return "index";
    }

}
