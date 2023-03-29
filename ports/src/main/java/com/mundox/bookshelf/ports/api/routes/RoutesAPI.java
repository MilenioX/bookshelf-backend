package com.mundox.bookshelf.ports.api.routes;

import akka.http.javadsl.server.Route;
import akka.http.javadsl.server.directives.RouteDirectives;

public class RoutesAPI extends RouteDirectives {

  private BasicRoute basicRoute = new BasicRoute();
  private BookRoute bookRoute = new BookRoute();

  public Route getRoutes() {
    return concat(
      basicRoute.getRoutes(),
      bookRoute.getRoutes());
  }
}
