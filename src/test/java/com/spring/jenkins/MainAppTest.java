package com.spring.jenkins;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = MainApp.class)

public class MainAppTest {
    Logger logger = LoggerFactory.getLogger(MainAppTest.class);
    @Test
    public void contextLoads() {
        logger.info("Application in Test Executing");
        assertEquals(true, true);
    }
}
