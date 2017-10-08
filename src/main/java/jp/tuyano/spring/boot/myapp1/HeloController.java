package jp.tuyano.spring.boot.myapp1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HeloController
{
    @RequestMapping("/")
    public String index(Model model)
    {
        model.addAttribute("msg","this is index page!");
        return "index";
    }

    @RequestMapping(value="/post", method=RequestMethod.POST)
    public ModelAndView postFrom(@RequestParam("text1") String text1)
    {
      ModelAndView mv= new ModelAndView("index");
      mv.addObject("msg", "you write '" + text1 + "' !!!");
      return mv;
    }
}
