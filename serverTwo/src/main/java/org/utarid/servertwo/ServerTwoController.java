package org.utarid.servertwo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/two")
public class ServerTwoController {

    @GetMapping("/test")
    public String test() {
        return "server two";
    }
}
