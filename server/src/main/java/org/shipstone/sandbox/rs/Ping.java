package org.shipstone.sandbox.rs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author François Robert
 */
@RestController("ping")
public class Ping {

  @GetMapping
  public String ping() {
    return "pong";
  }

}
