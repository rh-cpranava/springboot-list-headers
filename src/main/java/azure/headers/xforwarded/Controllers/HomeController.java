package azure.headers.xforwarded.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    static String message = "X-Forwaded-Application";

    @GetMapping("/")
    public static String index() {
        return message;
    }
}
