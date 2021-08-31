package ru.geekbrains.spring.application.root;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan("ru.geekbrains.spring.application.root.controller")
public class WebMvcApplicationConfig  implements WebMvcConfigurer {

}
