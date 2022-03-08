package com.example.testapsoft;

import com.example.testapsoft.storage.StorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class TestApSoftApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestApSoftApplication.class, args);
    }
}
