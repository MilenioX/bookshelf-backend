package com.mundox.bookshelf.ports.api.routes;

import akka.http.javadsl.server.AllDirectives;
import akka.http.javadsl.server.Route;

public abstract class BaseRoute extends AllDirectives{

  public abstract Route getRoutes();
}
