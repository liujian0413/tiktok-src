package com.facebook.bidding.p674a.p681h.p682a;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.bidding.a.h.a.h */
public final class C13228h {

    /* renamed from: a */
    public int f35052a;

    /* renamed from: b */
    public String f35053b;

    /* renamed from: c */
    public Map<String, List<String>> f35054c;

    /* renamed from: d */
    private byte[] f35055d;

    public C13228h(HttpURLConnection httpURLConnection, byte[] bArr) {
        try {
            this.f35052a = httpURLConnection.getResponseCode();
            this.f35053b = httpURLConnection.getURL().toString();
        } catch (IOException unused) {
        }
        this.f35054c = httpURLConnection.getHeaderFields();
        this.f35055d = bArr;
    }

    /* renamed from: a */
    public final String mo32418a() {
        return this.f35055d != null ? new String(this.f35055d) : "";
    }
}
