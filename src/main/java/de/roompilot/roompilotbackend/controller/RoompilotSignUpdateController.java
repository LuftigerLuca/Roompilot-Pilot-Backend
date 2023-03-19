package de.roompilot.roompilotbackend.controller;

import de.roompilot.roompilotbackend.model.RoompilotSign;
import de.roompilot.roompilotbackend.service.RoompilotSignCacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/signs")
public class RoompilotSignUpdateController {

    @Autowired
    RoompilotSignCacheService roompilotSignCacheService;

    @PostMapping("/register")
    public String updateSign(@RequestBody RoompilotSign sign) {
        roompilotSignCacheService.updateSign(sign);
        return "Sign updated";
    }
}
