package my.com.prasarana.SpringBootWalkTru.controller;

import my.com.prasarana.SpringBootWalkTru.dao.Product;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MainController {

    @GetMapping("/hello/{name}")
    public String helloWorld(@PathVariable String name) {
        return "Hello " + name;
    }

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World";
    }

    @PostMapping( "/hello")
    public Person postHelloWorld(@RequestBody Person person) {
        return person;
    }

    record Person(String name, String address) {}
}

