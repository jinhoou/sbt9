package jp.tuyano.spring.boot.myapp1;

// import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HeloController
{
    @RequestMapping("/")
    public String index()
    {
        return "index";
    }
}
