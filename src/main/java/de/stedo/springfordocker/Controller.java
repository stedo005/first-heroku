package de.stedo.springfordocker;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class Controller {

    @GetMapping("/{name}")
    public String sayHello(@PathVariable String name) {
        return "Hallo " + name + " ,wie geht es dir?";
    }

}
