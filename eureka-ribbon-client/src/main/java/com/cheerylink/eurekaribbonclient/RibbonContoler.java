package com.cheerylink.eurekaribbonclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonContoler {
    @Autowired
    RibbonService ribbonService;

    @GetMapping("hi")
    public String hi(@RequestParam(required = false, defaultValue = "vincent") String name) {
        return ribbonService.hi(name);
    }
}
