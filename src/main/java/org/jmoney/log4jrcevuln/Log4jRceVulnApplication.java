package org.jmoney.log4jrcevuln;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Log4jRceVulnApplication {

    private static final Logger LOG = LogManager.getLogger(Log4jRceVulnApplication.class);

    @GetMapping("/")
    public String get(@RequestHeader("User-Agent") String userAgent) {

        LOG.info("User-Agent is " + userAgent);

        return userAgent;
    }

    public static void main(String[] args) {
        SpringApplication.run(Log4jRceVulnApplication.class, args);
    }
}
