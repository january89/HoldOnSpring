package main.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.Model;

import java.util.List;

@Slf4j
@Controller
public class MainController{

    @GetMapping({"/","index"})
    public String index(){
        return "index";
    }

//    @GetMapping("/{requestPage}")
//    String getRequestPage(@PathVariable String requestPage){
//        System.out.println("requestPage =!!"+requestPage+"!!= requestPage");
//        return requestPage;
//    }


}