package com.google.api.client.http.p776a;

import com.google.api.client.util.C17346aa;
import com.google.api.client.util.C17384w;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.entity.AbstractHttpEntity;

/* renamed from: com.google.api.client.http.a.d */
final class C17235d extends AbstractHttpEntity {

    /* renamed from: a */
    private final long f48031a;

    /* renamed from: b */
    private final C17346aa f48032b;

    public final long getContentLength() {
        return this.f48031a;
    }

    public final boolean isRepeatable() {
        return false;
    }

    public final boolean isStreaming() {
        return true;
    }

    public final InputStream getContent() {
        throw new UnsupportedOperationException();
    }

    public final void writeTo(OutputStream outputStream) throws IOException {
        if (this.f48031a != 0) {
            this.f48032b.mo44591a(outputStream);
        }
    }

    C17235d(long j, C17346aa aaVar) {
        this.f48031a = j;
        this.f48032b = (C17346aa) C17384w.m57847a(aaVar);
    }
}
