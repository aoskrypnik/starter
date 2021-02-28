package org.skrypnik;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnMissingBean(name = "bird")
public class BeanIfBirdMissing implements InitializingBean {

  @Override
  public void afterPropertiesSet() {
    System.out.println("BeanIfBirdMissing is created because we miss bird");
  }
}
