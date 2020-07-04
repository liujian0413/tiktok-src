package com.bytedance.router.autowire;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class TypeWrapper<T> {
    protected final Type type = ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];

    public Type getType() {
        return this.type;
    }

    protected TypeWrapper() {
    }
}
