package com.mundox.bookshelf.ports.application;

import akka.actor.typed.ActorSystem;
import akka.actor.typed.javadsl.Behaviors;
import akka.http.javadsl.Http;
import akka.http.javadsl.ServerBinding;
import com.mundox.bookshelf.ports.api.routes.RoutesAPI;

import java.io.IOException;
import java.util.concurrent.CompletionStage;

public class Environment {

  static ActorSystem<Void> system = ActorSystem.create(Behaviors.empty(), "server");
  static final Http http = Http.get(system);

  public static void createEnv() throws IOException {
    RoutesAPI routes = new RoutesAPI();
    final CompletionStage<ServerBinding> binding = http.newServerAt("127.0.0.1", 8080)
      .bind(routes.getRoutes());

    System.out.println("Server running at http://localhost:8080/\nPRESS ENTER TO STOP...");
    System.in.read();

    binding
      .thenCompose(ServerBinding::unbind)
      .thenAccept(unbound -> system.terminate());
  }

}
