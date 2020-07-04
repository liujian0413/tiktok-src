package com.facebook.common.internal;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.facebook.common.internal.b */
public final class C13300b {

    /* renamed from: a */
    static final Logger f35204a = Logger.getLogger(C13300b.class.getName());

    private C13300b() {
    }

    /* renamed from: a */
    public static void m38927a(InputStream inputStream) {
        try {
            m38926a(inputStream, true);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public static void m38926a(Closeable closeable, boolean z) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                f35204a.log(Level.WARNING, "IOException thrown while closing Closeable.", e);
            }
        }
    }
}
