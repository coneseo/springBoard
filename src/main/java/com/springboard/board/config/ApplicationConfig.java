package com.springboard.board.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan(basePackages = {"com.springboard.board.dao","com.springboard.board.service"})
@Import({DataSourceConfig.class})
public class ApplicationConfig {
}
