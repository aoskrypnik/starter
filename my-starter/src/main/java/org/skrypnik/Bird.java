package org.skrypnik;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(value = "my.property", havingValue = "bird")
public class Bird implements Animal, InitializingBean {

  @Override
  public void afterPropertiesSet() {
    System.out.println("bird created");
  }
}
