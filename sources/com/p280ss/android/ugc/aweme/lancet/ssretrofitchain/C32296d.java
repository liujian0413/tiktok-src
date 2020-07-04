package com.p280ss.android.ugc.aweme.lancet.ssretrofitchain;

import com.bytedance.retrofit2.C12534t;
import com.bytedance.retrofit2.p637a.C12462c;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.lancet.ssretrofitchain.d */
public abstract class C32296d {

    /* renamed from: b */
    C32296d f84368b;

    /* renamed from: com.ss.android.ugc.aweme.lancet.ssretrofitchain.d$a */
    public static class C32297a {

        /* renamed from: a */
        public final boolean f84369a;

        /* renamed from: b */
        public final boolean f84370b;

        /* renamed from: c */
        final Map<String, String> f84371c;

        public C32297a() {
            this(false, false);
        }

        public C32297a(boolean z, boolean z2) {
            this.f84369a = z2;
            this.f84370b = z;
        }

        public C32297a(boolean z, boolean z2, Map<String, String> map) {
            this.f84369a = true;
            this.f84370b = true;
            this.f84371c = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract C32297a mo83494a(C32303g gVar, C12462c cVar, C12534t tVar);

    public C32296d(C32296d dVar) {
        this.f84368b = dVar;
    }

    /* renamed from: b */
    public final C32297a mo83501b(C32303g gVar, C12462c cVar, C12534t tVar) {
        C32297a a;
        C32296d dVar = this;
        while (true) {
            a = dVar.mo83494a(gVar, cVar, tVar);
            if (a.f84370b || dVar.f84368b == null) {
                return a;
            }
            dVar = dVar.f84368b;
        }
        return a;
    }
}
