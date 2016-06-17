package main.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Park Tae Hwan on 2016-06-17.
 */
@Controller
public class MainController{
    @RequestMapping("/welcome")
    public ModelAndView helloWorld() {

        String message = "Hello World";
        return new ModelAndView("welcome", "message", message);
    }
}
