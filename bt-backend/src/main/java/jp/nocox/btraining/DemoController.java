package jp.nocox.btraining;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
public class DemoController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @GetMapping("/")
    public String home(Model model){
        return "home";
    }

    @GetMapping("/sample")
    public String sample(Model model){
        model.addAttribute("message", "やってやるぜ！");
        return "template_sample";
    }

    @GetMapping("/db-connect")
    public String dbConnect(Model model){
        String sql = "SELECT * FROM sample_data";
        List<Sample> samples = jdbcTemplate.queryForList(sql).stream().map(Sample::new).collect(Collectors.toList());

        model.addAttribute("list", samples);
        return "db_connect_sample";
    }
}


class Sample{
    private Long sample_id;
    private String sample_name;
    private String sample_text;

    public Sample(Map<String, Object> maps) {
        sample_id = ((Long) maps.get("sample_id"));
        sample_name = ((String) maps.get("sample_name"));
        sample_text = ((String) maps.get("sample_text"));
    }

    public Long getSample_id() {
        return sample_id;
    }

    public void setSample_id(Long sample_id) {
        this.sample_id = sample_id;
    }

    public String getSample_name() {
        return sample_name;
    }

    public void setSample_name(String sample_name) {
        this.sample_name = sample_name;
    }

    public String getSample_text() {
        return sample_text;
    }

    public void setSample_text(String sample_text) {
        this.sample_text = sample_text;
    }
}