package main.web;

import main.domain.Hello;
import main.domain.HelloDao;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloRestController {

    private HelloDao helloDao;

    @RequestMapping("/add")
    public Hello add(Hello hello) {

        return helloDao.save(hello);
    }

    @RequestMapping("/list")
    public List<Hello> list(Model model) {

        List<Hello> helloList = helloDao.findAll();

        return helloList;
    }

    @RequestMapping("/")
    public String index() {
        return "helloworld!";
    }
}