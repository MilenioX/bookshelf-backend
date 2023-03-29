package com.mundox.bookshelf.ports.api.routes;

import akka.http.javadsl.server.Route;

public class BasicRoute extends BaseRoute {
  @Override
  public Route getRoutes() {
    return sayHello();
  }

  public Route sayHello() {
    return path("basic", () ->
      get(() -> complete("Hi from the basic route")));
  }

}
