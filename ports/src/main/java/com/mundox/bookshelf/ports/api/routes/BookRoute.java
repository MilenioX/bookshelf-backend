package com.mundox.bookshelf.ports.api.routes;

import akka.http.javadsl.marshallers.jackson.Jackson;
import akka.http.javadsl.model.StatusCodes;
import akka.http.javadsl.server.Route;
import com.mundox.bookshelf.ports.api.dtos.BookDTO;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

public class BookRoute extends BaseRoute {

  private List<BookDTO> books = List.of(
    new BookDTO("The power of habits", "Tim"),
    new BookDTO("The alchemist", "Michael"));

  @Override
  public Route getRoutes() {
    return concat(sayHello(), getBooks());
  }

  public Route sayHello() {
    return path("hello", () ->
      get(() ->
        complete("Hello from book routes")));
  }

  public Route getBooks() {
    return path("books", () ->
      get(() -> {
        final CompletionStage<Optional<List<BookDTO>>> futureBooks = CompletableFuture.completedFuture(Optional.of(books));
        return onSuccess(
          futureBooks,
          booksList ->
            booksList.map(book -> completeOK(book, Jackson.marshaller()))
              .orElseGet(() -> complete(StatusCodes.NOT_FOUND, "Not Found")));
      }));
  }
}
