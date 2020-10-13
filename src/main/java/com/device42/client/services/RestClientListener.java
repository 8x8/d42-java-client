package com.device42.client.services;

public interface RestClientListener<T> {
  void listen(T event);
}
