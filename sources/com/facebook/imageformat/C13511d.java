package com.facebook.imageformat;

import com.facebook.common.internal.C13299a;
import com.facebook.common.internal.C13307g;
import com.facebook.common.internal.C13315l;
import com.facebook.imageformat.C13509c.C13510a;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* renamed from: com.facebook.imageformat.d */
public final class C13511d {

    /* renamed from: a */
    private static C13511d f35840a;

    /* renamed from: b */
    private int f35841b;

    /* renamed from: c */
    private List<C13510a> f35842c;

    /* renamed from: d */
    private final C13510a f35843d = new C13507a();

    private C13511d() {
        m39760b();
    }

    /* renamed from: a */
    public static synchronized C13511d m39758a() {
        C13511d dVar;
        synchronized (C13511d.class) {
            if (f35840a == null) {
                f35840a = new C13511d();
            }
            dVar = f35840a;
        }
        return dVar;
    }

    /* renamed from: b */
    private void m39760b() {
        this.f35841b = this.f35843d.mo33047a();
        if (this.f35842c != null) {
            for (C13510a a : this.f35842c) {
                this.f35841b = Math.max(this.f35841b, a.mo33047a());
            }
        }
    }

    /* renamed from: a */
    public final void mo33050a(List<C13510a> list) {
        this.f35842c = list;
        m39760b();
    }

    /* renamed from: a */
    public static C13509c m39757a(InputStream inputStream) {
        try {
            return m39761c(inputStream);
        } catch (IOException e) {
            throw C13315l.m38962b(e);
        }
    }

    /* renamed from: c */
    private static C13509c m39761c(InputStream inputStream) throws IOException {
        return m39758a().m39759b(inputStream);
    }

    /* renamed from: b */
    private C13509c m39759b(InputStream inputStream) throws IOException {
        C13307g.m38940a(inputStream);
        byte[] bArr = new byte[this.f35841b];
        int a = m39756a(this.f35841b, inputStream, bArr);
        if (this.f35842c != null) {
            for (C13510a a2 : this.f35842c) {
                C13509c a3 = a2.mo33048a(bArr, a);
                if (a3 != null && a3 != C13509c.f35837a) {
                    return a3;
                }
            }
        }
        C13509c a4 = this.f35843d.mo33048a(bArr, a);
        if (a4 == null || a4 == C13509c.f35837a) {
            return C13509c.f35837a;
        }
        return a4;
    }

    /* renamed from: a */
    private static int m39756a(int i, InputStream inputStream, byte[] bArr) throws IOException {
        boolean z;
        C13307g.m38940a(inputStream);
        C13307g.m38940a(bArr);
        if (bArr.length >= i) {
            z = true;
        } else {
            z = false;
        }
        C13307g.m38943a(z);
        if (!inputStream.markSupported()) {
            return C13299a.m38924a(inputStream, bArr, 0, i);
        }
        try {
            inputStream.mark(i);
            return C13299a.m38924a(inputStream, bArr, 0, i);
        } finally {
            inputStream.reset();
        }
    }
}
