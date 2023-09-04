package security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {
    @GetMapping("/status")
    public Object health(){
        return "{\"status\":\"Application is running healthy\"}";
    }
}
