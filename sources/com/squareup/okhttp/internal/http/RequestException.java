package com.squareup.okhttp.internal.http;

import java.io.IOException;

public final class RequestException extends Exception {
    public final IOException getCause() {
        return (IOException) super.getCause();
    }

    public RequestException(IOException iOException) {
        super(iOException);
    }
}
