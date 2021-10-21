package foobar;

import io.micronaut.context.annotation.Context;

@Context
public class Lorem {

  private final Ipsum ipsum;

  public Lorem(Ipsum ipsum) {
    this.ipsum = ipsum;
  }
}
