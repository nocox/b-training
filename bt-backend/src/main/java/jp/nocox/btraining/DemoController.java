package jp.nocox.btraining;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
    @GetMapping("/sample")
    public String sample(Model model){
        model.addAttribute("message", "ここにメッセージを入れるよ");
        return "template_sample";
    }
}
