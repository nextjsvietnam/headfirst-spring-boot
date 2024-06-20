package net.refactoreverything.headfirstspringboot.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
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

    @RequestMapping("/subcribe")
    public ModelAndView subcribe(@RequestParam() String email, @RequestParam() String description, ModelAndView mv){
        if(!email.isEmpty() && !description.isEmpty()){
            mv.addObject("email", email);
            mv.addObject("description", description);
            mv.addObject("subcribed", true);
        }

        mv.setViewName("index");

        return mv;
    }
}
