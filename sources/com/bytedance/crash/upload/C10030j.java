package com.bytedance.crash.upload;

import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.bytedance.crash.upload.j */
public final class C10030j extends GZIPOutputStream {
    /* renamed from: a */
    public final void mo24659a() throws IOException {
        super.close();
    }

    /* renamed from: b */
    public final void mo24660b() throws IOException {
        super.finish();
    }

    public final void close() throws IOException {
    }

    public final void finish() throws IOException {
    }

    public C10030j(OutputStream outputStream) throws IOException {
        super(outputStream);
    }
}
