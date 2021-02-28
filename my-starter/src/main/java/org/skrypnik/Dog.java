package org.skrypnik;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(value = "my.property", havingValue = "dog", matchIfMissing = true)
public class Dog implements Animal, InitializingBean {

  @Override
  public void afterPropertiesSet() {
    System.out.println("dog created");
  }
}
