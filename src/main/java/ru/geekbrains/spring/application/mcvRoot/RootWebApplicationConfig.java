package ru.geekbrains.spring.application.mcvRoot;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import ru.geekbrains.spring.application.core.ConsoleAppConfiguration;

@Configuration
@Import(ConsoleAppConfiguration.class)
public class RootWebApplicationConfig{


}
