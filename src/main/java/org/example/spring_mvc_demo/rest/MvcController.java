package org.example.spring_mvc_demo.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class MvcController {

    @GetMapping("/process")
    public String processRequest() throws InterruptedException {

        log.info("Received request in MvcController");
        // Имитируем задержку обработки, например, 500 мс
        Thread.sleep(500);
        log.info("Completed processing request in MvcController");

        return "Processed by MVC";
    }
}
