package com.google.api.client.json.p779a;

import com.google.api.client.json.C17291c;
import com.google.api.client.json.C17292d;
import com.google.api.client.json.C17295f;
import com.google.api.client.util.C17361f;
import com.google.gson.stream.C6718a;
import com.google.gson.stream.C6720b;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.nio.charset.Charset;

/* renamed from: com.google.api.client.json.a.a */
public final class C17280a extends C17291c {

    /* renamed from: com.google.api.client.json.a.a$a */
    static class C17281a {

        /* renamed from: a */
        static final C17280a f48146a = new C17280a();
    }

    /* renamed from: a */
    public static C17280a m57496a() {
        return C17281a.f48146a;
    }

    /* renamed from: a */
    private C17292d m57497a(Writer writer) {
        return new C17282b(this, new C6720b(writer));
    }

    /* renamed from: a */
    private C17295f m57498a(Reader reader) {
        return new C17283c(this, new C6718a(reader));
    }

    /* renamed from: a */
    public final C17295f mo44672a(InputStream inputStream) {
        return m57498a((Reader) new InputStreamReader(inputStream, C17361f.f48275a));
    }

    /* renamed from: a */
    public final C17295f mo44674a(String str) {
        return m57498a((Reader) new StringReader(str));
    }

    /* renamed from: a */
    public final C17292d mo44671a(OutputStream outputStream, Charset charset) {
        return m57497a((Writer) new OutputStreamWriter(outputStream, charset));
    }

    /* renamed from: a */
    public final C17295f mo44673a(InputStream inputStream, Charset charset) {
        if (charset == null) {
            return mo44672a(inputStream);
        }
        return m57498a((Reader) new InputStreamReader(inputStream, charset));
    }
}
