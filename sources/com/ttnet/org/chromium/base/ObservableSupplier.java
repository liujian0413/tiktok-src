package com.ttnet.org.chromium.base;

public interface ObservableSupplier<E> extends Supplier<E> {
    E addObserver(Callback<E> callback);

    void removeObserver(Callback<E> callback);
}
