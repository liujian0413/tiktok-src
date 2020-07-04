package com.google.api.client.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.google.api.client.util.l */
public final class C17372l {
    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static long m57833a(C17346aa aaVar) throws IOException {
        C17358d dVar = new C17358d();
        try {
            aaVar.mo44591a(dVar);
            dVar.close();
            return dVar.f48272a;
        } catch (Throwable th) {
            dVar.close();
            throw th;
        }
    }

    /* renamed from: a */
    public static void m57834a(InputStream inputStream, OutputStream outputStream) throws IOException {
        m57835a(inputStream, outputStream, true);
    }

    /* renamed from: a */
    public static void m57835a(InputStream inputStream, OutputStream outputStream, boolean z) throws IOException {
        try {
            C17359e.m57796a(inputStream, outputStream);
        } finally {
            if (z) {
                inputStream.close();
            }
        }
    }
}
