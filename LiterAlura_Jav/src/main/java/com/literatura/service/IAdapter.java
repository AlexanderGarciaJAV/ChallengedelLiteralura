package com.literatura.service;

public interface IAdapter {
    <T> T getDataFromJson(String json, Class<T> clase);

}
