package com.rubins.minermonitor.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@Valid
public class MinerMonitorController {

    @GetMapping("/helloworld")
    public String helloworld() {
        return "Helloworld";
    }

    @GetMapping("/alert")
    public String alertService(String requesterId) {

        //get minerList

        //evaluateMinerList

        //detmineMinerDownList

        //sendMessage

        return requesterId;
    }
}
