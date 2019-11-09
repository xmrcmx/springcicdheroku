package mrcm.sample.SampleService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

    @GetMapping("/sayhello")
    public TestEntity sayHello() {
        return new TestEntity("Hello updated1!");
    }

}