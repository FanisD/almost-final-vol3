package gr.hua.dit.ds.DS_PR.controller;

import gr.hua.dit.ds.DS_PR.dao.RequestDAO;
import gr.hua.dit.ds.DS_PR.entity.Request;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("request")
public class RequestController {

    @Autowired
    private RequestDAO requestDao;

    @GetMapping("")
    public String showRequests(Model model){


        model.addAttribute("requests", requestDao.getRequests());
        return "requests";
    }

    @GetMapping("/new")
    public String addRequest(Model model){
        Request request = new Request();
        model.addAttribute("request", request);

        return "add_request";

    }

    @GetMapping("{request_id}")
    public String editRequest(@PathVariable Integer request_id, Model model){
        Request request = requestDao.getRequest(request_id);
        model.addAttribute("request", request);
        return "add_request";

    }

    @PostMapping("/new")
    public String saveRequest(@ModelAttribute("student") Request request, Model model) {
        requestDao.saveRequest(request);
        model.addAttribute("requests", requestDao.getRequests());
        return "requests";
    }

    @DeleteMapping("{request_id}")
    public String deleteRequest(@PathVariable Integer request_id){
        requestDao.deleteRequest(request_id);
        return "requests";
    }

}
