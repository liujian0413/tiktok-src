package com.google.common.p784io;

import com.google.common.base.C17439m;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.google.common.io.b */
public abstract class C18102b {
    protected C18102b() {
    }

    /* renamed from: a */
    public abstract InputStream mo46725a() throws IOException;

    /* renamed from: a */
    public final long mo46724a(C18101a aVar) throws IOException {
        C17439m.m57962a(aVar);
        C18106e a = C18106e.m59859a();
        try {
            long a2 = C18103c.m59857a((InputStream) a.mo46730a(mo46725a()), (OutputStream) a.mo46730a(aVar.mo46723a()));
            a.close();
            return a2;
        } catch (Throwable th) {
            a.close();
            throw th;
        }
    }
}
