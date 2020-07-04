package com.kakao.network.response;

public interface CustomErrorConverter<T> {
    T convert(int i, String str);
}
