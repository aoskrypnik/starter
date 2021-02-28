package org.skrypnik;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {Bird.class, Dog.class})
public class MyConfiguration {

}
