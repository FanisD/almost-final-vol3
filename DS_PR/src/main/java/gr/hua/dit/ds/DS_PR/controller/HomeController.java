package gr.hua.dit.ds.DS_PR.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/")
public class HomeController {


    @GetMapping("")
    public String home(){

        return "home";
    }

}
