package com.gid.initialSpring.initialSpring.controller;


import org.junit.platform.commons.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/greet")
public class GreetingController {

    @RequestMapping({"", "/{person}"})
    public String greetPerson(@PathVariable(name="person", required=false) Optional<String> maybePerson) {
        String person = maybePerson.filter(StringUtils::isNotBlank).orElse("unknown person");
        return String.format("Hello" + " " +  person +"!"); }
}
