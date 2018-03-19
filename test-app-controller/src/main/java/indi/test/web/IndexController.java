package indi.test.web;

import indi.test.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {
    @Autowired
    private IndexService indexService;

    @GetMapping("index3")
    public String index(Model model){
        model.addAttribute("users",indexService.findAll());
        return "index";
    }

    @GetMapping("index1")
    public String index1(Model model){
        model.addAttribute("users",indexService.findAll());
        return "index";
    }
    @GetMapping("index2")
    public String index2(Model model){
        model.addAttribute("users",indexService.findAll());
        return "index";
    }
}
