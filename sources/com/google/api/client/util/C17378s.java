package com.google.api.client.util;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.api.client.util.s */
public final class C17378s implements C17346aa {

    /* renamed from: a */
    private final C17346aa f48323a;

    /* renamed from: b */
    private final int f48324b;

    /* renamed from: c */
    private final Level f48325c;

    /* renamed from: d */
    private final Logger f48326d;

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final void mo44591a(OutputStream outputStream) throws IOException {
        C17377r rVar = new C17377r(outputStream, this.f48326d, this.f48325c, this.f48324b);
        try {
            this.f48323a.mo44591a(rVar);
            rVar.f48322a.close();
            outputStream.flush();
        } catch (Throwable th) {
            rVar.f48322a.close();
            throw th;
        }
    }

    public C17378s(C17346aa aaVar, Logger logger, Level level, int i) {
        this.f48323a = aaVar;
        this.f48326d = logger;
        this.f48325c = level;
        this.f48324b = i;
    }
}
