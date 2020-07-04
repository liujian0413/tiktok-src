package com.google.api.client.json;

import com.google.api.client.util.C17361f;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

/* renamed from: com.google.api.client.json.c */
public abstract class C17291c {
    /* renamed from: a */
    public abstract C17292d mo44671a(OutputStream outputStream, Charset charset) throws IOException;

    /* renamed from: a */
    public abstract C17295f mo44672a(InputStream inputStream) throws IOException;

    /* renamed from: a */
    public abstract C17295f mo44673a(InputStream inputStream, Charset charset) throws IOException;

    /* renamed from: a */
    public abstract C17295f mo44674a(String str) throws IOException;

    /* renamed from: b */
    public final String mo44721b(Object obj) throws IOException {
        return m57571a(obj, true);
    }

    /* renamed from: c */
    public final byte[] mo44722c(Object obj) throws IOException {
        return m57572b(obj, false).toByteArray();
    }

    /* renamed from: a */
    public final String mo44720a(Object obj) throws IOException {
        return m57571a(obj, false);
    }

    /* renamed from: a */
    private String m57571a(Object obj, boolean z) throws IOException {
        return m57572b(obj, z).toString("UTF-8");
    }

    /* renamed from: b */
    private ByteArrayOutputStream m57572b(Object obj, boolean z) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C17292d a = mo44671a((OutputStream) byteArrayOutputStream, C17361f.f48275a);
        if (z) {
            a.mo44690g();
        }
        a.mo44723a(obj);
        a.mo44675a();
        return byteArrayOutputStream;
    }
}
