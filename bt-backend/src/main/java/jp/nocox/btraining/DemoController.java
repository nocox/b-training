package jp.nocox.btraining;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/")
    public String home(Model model){
        return "home";
    }

    @GetMapping("/sample")
    public String sample(Model model){
        model.addAttribute("message", "ここにメッセージを入れるよ");
        return "template_sample";
    }
}
