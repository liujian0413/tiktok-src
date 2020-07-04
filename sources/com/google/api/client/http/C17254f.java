package com.google.api.client.http;

import com.google.api.client.util.C17346aa;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.google.api.client.http.f */
public final class C17254f implements C17258i {
    /* renamed from: a */
    public final String mo44603a() {
        return "gzip";
    }

    /* renamed from: a */
    public final void mo44604a(C17346aa aaVar, OutputStream outputStream) throws IOException {
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(new BufferedOutputStream(outputStream) {
            public final void close() throws IOException {
                try {
                    flush();
                } catch (IOException unused) {
                }
            }
        });
        aaVar.mo44591a(gZIPOutputStream);
        gZIPOutputStream.close();
    }
}
