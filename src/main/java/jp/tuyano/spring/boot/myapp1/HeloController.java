package jp.tuyano.spring.boot.myapp1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HeloController
{
    @RequestMapping("/")
    public String index(Model model)
    {
        model.addAttribute("msg","this is index page!");
        return "index";
    }
}
