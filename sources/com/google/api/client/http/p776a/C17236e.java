package com.google.api.client.http.p776a;

import com.google.api.client.util.C17384w;
import java.net.URI;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;

/* renamed from: com.google.api.client.http.a.e */
final class C17236e extends HttpEntityEnclosingRequestBase {

    /* renamed from: a */
    private final String f48033a;

    public final String getMethod() {
        return this.f48033a;
    }

    public C17236e(String str, String str2) {
        this.f48033a = (String) C17384w.m57847a(str);
        setURI(URI.create(str2));
    }
}
