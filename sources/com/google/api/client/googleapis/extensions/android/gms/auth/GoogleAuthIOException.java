package com.google.api.client.googleapis.extensions.android.gms.auth;

import com.google.android.gms.auth.GoogleAuthException;
import com.google.api.client.util.C17384w;
import java.io.IOException;

public class GoogleAuthIOException extends IOException {
    private static final long serialVersionUID = 1;

    public GoogleAuthException getCause() {
        return (GoogleAuthException) super.getCause();
    }

    GoogleAuthIOException(GoogleAuthException googleAuthException) {
        initCause((Throwable) C17384w.m57847a(googleAuthException));
    }
}
