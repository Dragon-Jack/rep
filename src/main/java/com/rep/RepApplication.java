package com.rep;

import com.rep.result.Result;
import com.rep.utils.IdWorker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;

@ServletComponentScan
@SpringBootApplication
public class RepApplication {

    public static void main(String[] args) {
        SpringApplication.run(RepApplication.class, args);
    }

    @Bean
    public IdWorker idWorker() {
        return new IdWorker();
    }

    @Bean
    public Result result() {
        return new Result();
    }
}
