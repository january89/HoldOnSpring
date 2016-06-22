package main.web;

import main.domain.PostDao;
import main.entity.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/post")
public class PostController{

    private PostDao postDao;

    @GetMapping("/write")
    public String write(Post post) {
        post.setRegDate(new Date());
        return "redirect:/post/" + postDao.save(post).getId();
    }

    @GetMapping("/list")
    public String list(Model model) {
        List<Post> postList = postDao.findAll();
        model.addAttribute("postList", postList);
        return "blog";
    }

    @GetMapping("/{id}")
    public String view(Model model, @PathVariable int id) {
        Post post = postDao.findOne(id);
        model.addAttribute("post", post);
        return "post";
    }
}