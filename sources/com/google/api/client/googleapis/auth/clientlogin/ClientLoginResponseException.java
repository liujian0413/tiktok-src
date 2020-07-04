package com.google.api.client.googleapis.auth.clientlogin;

import com.google.api.client.googleapis.auth.clientlogin.C17220a.C17221a;
import com.google.api.client.http.HttpResponseException;
import com.google.api.client.http.HttpResponseException.C17230a;

public class ClientLoginResponseException extends HttpResponseException {
    private static final long serialVersionUID = 4974317674023010928L;
    private final transient C17221a details;

    public final C17221a getDetails() {
        return this.details;
    }

    ClientLoginResponseException(C17230a aVar, C17221a aVar2) {
        super(aVar);
        this.details = aVar2;
    }
}
