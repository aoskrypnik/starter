package org.skrypnik;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnBean(Bird.class)
public class BeanIfBirdPresent implements InitializingBean {

  @Override
  public void afterPropertiesSet() {
    System.out.println("BeanIfBirdPresent is created because bird is present");
  }
}
