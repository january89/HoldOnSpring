package main.web;

import main.entity.Hello;
import main.domain.HelloDao;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloRestController {

    private HelloDao helloDao;

    @GetMapping("/add")
    public Hello add(Hello hello) {

        Hello helloData = helloDao.save(hello);

        return helloData;
    }

    @GetMapping("/list")
    public List<Hello> list(String model) {

        List<Hello> helloList = helloDao.findByLastName(model);

        return helloList;
    }

}