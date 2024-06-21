package net.refactoreverything.headfirstspringboot.controller;

import net.refactoreverything.headfirstspringboot.model.Job;
import net.refactoreverything.headfirstspringboot.model.TechStack;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class JobController {

    @ModelAttribute("job")
    public Job job() {
        return new Job();
    }

    @ModelAttribute("techStacks")
    public List<TechStack> techStacks(){
        List<TechStack> techStacks = new ArrayList<>();
        techStacks.add(new TechStack(1, "Java"));
        techStacks.add(new TechStack(2, "PHP"));
        techStacks.add(new TechStack(3, "Python"));
        techStacks.add(new TechStack(4, "NodeJS"));
        techStacks.add(new TechStack(5, "Golang"));
        techStacks.add(new TechStack(6, "ReactJS"));
        techStacks.add(new TechStack(7, "Vue"));
        techStacks.add(new TechStack(8, "NextJS"));
        return techStacks;
    }

    public JobController(TechStack techStack) {
    }

    @GetMapping("/")
    public String index() {
        return "job/index";
    }

    @GetMapping("/new-job")
    public String newJob(){
        return "job/new_job";
    }

    @PostMapping("/create-job")
    public String createJob(Job job){
        return "job/detail";
    }
}
