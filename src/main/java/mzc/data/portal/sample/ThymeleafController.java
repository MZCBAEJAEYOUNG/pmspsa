package mzc.data.portal.sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeleafController {

    @RequestMapping("/thymeleaf")
    public String hello() {
        return "thymeleaf";
    }

}
