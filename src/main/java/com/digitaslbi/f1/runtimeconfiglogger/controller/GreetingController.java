package com.digitaslbi.f1.runtimeconfiglogger.controller;

import com.digitaslbi.f1.runtimeconfiglogger.beans.Greeting;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class GreetingController {

    private static Logger LOG = LoggerFactory.getLogger(GreetingController.class);

    @PostMapping("/greeting/{name}")
    public Greeting greeting(@PathVariable(name = "name") String name){
        LOG.info("Sneding greetings to %s", name);
        LOG.warn("Sneding greetings to %s", name);
        LOG.error("Sneding greetings to %s", name);
        LOG.debug("Sneding greetings to %s", name);
        LOG.trace("Sneding greetings to %s", name);
        return new Greeting("Hello, " + name);
    }
}
