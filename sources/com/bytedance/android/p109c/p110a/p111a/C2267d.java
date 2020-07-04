package com.bytedance.android.p109c.p110a.p111a;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bytedance.android.c.a.a.d */
public final class C2267d {

    /* renamed from: com.bytedance.android.c.a.a.d$a */
    static abstract class C2268a implements C2269b {
        C2268a() {
        }

        /* renamed from: d */
        public final long mo8055d() throws IOException {
            long j = 0;
            for (int i = 0; i < 8; i++) {
                j |= (255 & ((long) mo8050b())) << (i * 8);
            }
            return j;
        }

        /* renamed from: c */
        public final int mo8054c() throws IOException {
            return (mo8050b() & 255) | ((mo8050b() & 255) << 8) | ((mo8050b() & 255) << 16) | ((mo8050b() & 255) << 24);
        }
    }

    /* renamed from: com.bytedance.android.c.a.a.d$b */
    public interface C2269b {
        /* renamed from: a */
        void mo8048a(long j) throws IOException;

        /* renamed from: a */
        boolean mo8049a() throws IOException;

        /* renamed from: b */
        byte mo8050b() throws IOException;

        /* renamed from: b */
        byte[] mo8051b(long j) throws IOException;

        /* renamed from: c */
        int mo8054c() throws IOException;

        /* renamed from: c */
        String mo8052c(long j) throws IOException;

        /* renamed from: d */
        long mo8055d() throws IOException;
    }

    /* renamed from: a */
    public static C2269b m9755a(InputStream inputStream) {
        return new C2266c(inputStream);
    }

    /* renamed from: a */
    public static C2269b m9756a(byte[] bArr) {
        return new C2264a(bArr);
    }
}
