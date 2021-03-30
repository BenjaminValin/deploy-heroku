package be.technifutur.deploy.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/hello")
@CrossOrigin
public class HelloController {

    @GetMapping
    public String hello() {
        return "Bonjour, je fonctionne !";
    }
}
