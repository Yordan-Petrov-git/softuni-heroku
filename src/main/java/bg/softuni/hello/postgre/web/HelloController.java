package bg.softuni.hello.postgre.web;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @GetMapping("/hello")
  public String getAllStudents() {
    return "Hello, heroku!";
  }

}
