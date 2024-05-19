package com.springjpaexample.frameworkexample;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FrameworkexampleApplicationTests {

    private static final Logger log = LoggerFactory.getLogger(FrameworkexampleApplicationTests.class);

    @Test
    void contextLoads() {
        log.info("hello");
    }
}
