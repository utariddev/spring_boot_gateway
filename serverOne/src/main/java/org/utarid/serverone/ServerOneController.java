package org.utarid.serverone;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/one")
public class ServerOneController {

    @GetMapping("/test")
    public String test() {
        return "server one";
    }
}
