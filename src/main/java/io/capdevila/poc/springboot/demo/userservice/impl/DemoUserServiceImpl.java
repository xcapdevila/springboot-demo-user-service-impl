package io.capdevila.poc.springboot.demo.userservice.impl;

import io.capdevila.poc.springboot.rest.as.dependency.service.DemoUserService;
import org.springframework.stereotype.Service;

/**
 * @author Xavier Capdevila Estevez on 2019-09-14.
 */
@Service
public class DemoUserServiceImpl implements DemoUserService {

  @Override
  public String sayHi(String name) {
    return String.format("Hi %s", name);
  }

  @Override
  public String sayBye(String name) {
    return String.format("Bye %s", name);
  }
}
