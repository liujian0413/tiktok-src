package com.p280ss.android.http.legacy.p296a;

import com.p280ss.android.http.legacy.C6809a;
import com.p280ss.android.http.legacy.p877d.C19574b;

/* renamed from: com.ss.android.http.legacy.a.d */
public final class C19564d {

    /* renamed from: a */
    public static final C19564d f52938a = new C19564d();

    /* renamed from: a */
    private static C19574b m64463a(C19574b bVar) {
        if (bVar == null) {
            return new C19574b(64);
        }
        bVar.mo51736a();
        return bVar;
    }

    /* renamed from: a */
    public final C19574b mo51721a(C19574b bVar, C6809a aVar) {
        C19574b a = m64463a(null);
        m64464b(a, aVar);
        return a;
    }

    /* renamed from: b */
    private static void m64464b(C19574b bVar, C6809a aVar) {
        String a = aVar.mo16635a();
        String b = aVar.mo16636b();
        int length = a.length() + 2;
        if (b != null) {
            length += b.length();
        }
        bVar.mo51741b(length);
        bVar.mo51739a(a);
        bVar.mo51739a(": ");
        if (b != null) {
            bVar.mo51739a(b);
        }
    }
}
