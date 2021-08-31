package ru.geekbrains.spring.application.root;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import ru.geekbrains.spring.application.core.ConsoleAppConfiguration;

@Configuration
@Import(ConsoleAppConfiguration.class)
public class RootWebApplicationConfig{


}
