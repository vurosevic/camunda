package com.vlada.camundademo.rest.controller;

import org.camunda.bpm.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {

    @Autowired
    private RuntimeService runtimeService;

    @GetMapping("/start")
    public String start() {

        runtimeService.startProcessInstanceByKey("simpleServiceProcess");

        return "START";
    }

}
