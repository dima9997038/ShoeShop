package com.example.shoeshop.transformers;

public interface Transform<T,E> {
   public  T transform (E objectFrom);
}
