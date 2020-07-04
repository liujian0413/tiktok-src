package com.bytedance.ttnet;

import android.content.Context;
import com.bytedance.frameworks.baselib.network.http.C10140d;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C10124b;
import com.bytedance.frameworks.baselib.network.http.p512a.p513a.C10107a;
import com.bytedance.frameworks.baselib.network.http.p512a.p513a.C10114e;
import com.bytedance.frameworks.baselib.network.http.util.C10186f;
import com.bytedance.retrofit2.p637a.C12462c;
import com.bytedance.retrofit2.p637a.C12465e;
import com.bytedance.ttnet.p672d.C12971c;
import com.bytedance.ttnet.utils.C13006h;
import java.io.IOException;

/* renamed from: com.bytedance.ttnet.b */
public final class C12947b {

    /* renamed from: a */
    static final C12951c f34285a = new C12951c();

    /* renamed from: b */
    static final C12949a f34286b = new C12949a();

    /* renamed from: c */
    static boolean f34287c;

    /* renamed from: d */
    static String f34288d;

    /* renamed from: e */
    private static volatile C12950b f34289e;

    /* renamed from: com.bytedance.ttnet.b$a */
    static class C12949a extends C12951c {
        private C12949a() {
            super();
        }

        /* renamed from: a */
        public final C10140d mo31458a() {
            return C12952d.m37747a(C10124b.m30047a(C12961d.m37772a().mo31461a()));
        }
    }

    /* renamed from: com.bytedance.ttnet.b$b */
    public interface C12950b {
        /* renamed from: h */
        boolean mo31415h();
    }

    /* renamed from: com.bytedance.ttnet.b$c */
    static class C12951c {
        private C12951c() {
        }

        /* renamed from: a */
        public C10140d mo31458a() {
            Context a = C12961d.m37772a().mo31461a();
            C10114e a2 = C10114e.m30017a(a);
            if (C10186f.m30256b(a)) {
                C10114e.m30026a((C10107a) C12971c.m37800a());
            }
            return a2;
        }
    }

    /* renamed from: com.bytedance.ttnet.b$d */
    static class C12952d implements C10140d {

        /* renamed from: a */
        private static volatile C12952d f34290a;

        /* renamed from: b */
        private C10124b f34291b;

        private C12952d(C10124b bVar) {
            this.f34291b = bVar;
        }

        /* renamed from: a */
        public static C12952d m37747a(C10124b bVar) {
            if (f34290a == null) {
                synchronized (C12952d.class) {
                    if (f34290a == null) {
                        f34290a = new C12952d(bVar);
                    }
                }
            }
            return f34290a;
        }

        /* renamed from: a */
        public final C12465e mo10452a(C12462c cVar) throws IOException {
            try {
                return this.f34291b.mo10452a(cVar);
            } catch (Throwable th) {
                C12947b.f34287c = true;
                C12947b.f34288d = C13006h.m37953a(th);
                C12961d.m37783b();
                return C12947b.f34285a.mo31458a().mo10452a(cVar);
            }
        }
    }

    /* renamed from: a */
    public static boolean m37743a() {
        if (f34289e == null) {
            C10114e.m30025a(0);
            return false;
        } else if (!f34289e.mo31415h()) {
            return false;
        } else {
            if (!C12961d.m37772a().mo31468b()) {
                C10114e.m30025a(6);
                return false;
            } else if (!f34287c) {
                return true;
            } else {
                C10114e.m30025a(7);
                return false;
            }
        }
    }

    /* renamed from: a */
    public static void m37742a(C12950b bVar) {
        f34289e = bVar;
    }

    /* renamed from: a */
    public static C10140d m37741a(String str) {
        if (m37743a()) {
            return f34286b.mo31458a();
        }
        return f34285a.mo31458a();
    }
}
