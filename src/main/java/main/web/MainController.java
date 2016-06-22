package main.web;

import lombok.extern.slf4j.Slf4j;
import main.domain.Hello;
import main.repository.HelloDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;

import java.util.List;

@Slf4j
@Controller
public class MainController{

    @Autowired
    private HelloDao helloDao;

    @GetMapping("/add")
    public Hello add(Hello hello) {

        Hello helloData = helloDao.save(hello);

        return helloData;
    }

    @GetMapping("/list")
    public List<Hello> list(Model model) {

        List<Hello> helloList = helloDao.findAll();

        return helloList;
    }

    @GetMapping({"/","index"})
    public String index(){
        return "index";
    }

}