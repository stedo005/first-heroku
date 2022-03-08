package de.stedo.springfordocker;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class Controller {

    @GetMapping
    public String sayHello() {
        return "Hallo Steve, wie geht es dir?";
    }

}
