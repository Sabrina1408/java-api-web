package com.example.dio.handler;

public class BusinessException extends RuntimeException {

  public BusinessException(String message) {
    super(message);
  }
  public BusinessException(String mensssage, Object ... params) {
    super(String.format(mensssage, params));
  }
}
