package com.p280ss.android.ugc.aweme.lancet.ssretrofitchain;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.retrofit2.C12534t;
import com.bytedance.retrofit2.p637a.C12462c;
import com.p280ss.android.ugc.aweme.lancet.ssretrofitchain.C32296d.C32297a;

/* renamed from: com.ss.android.ugc.aweme.lancet.ssretrofitchain.c */
public class C32295c extends C32296d {

    /* renamed from: a */
    public static final C32297a f84366a = new C32297a();

    /* renamed from: c */
    private static volatile C32295c f84367c;

    /* renamed from: a */
    public static C32295c m104834a() {
        if (f84367c == null) {
            synchronized (C32295c.class) {
                if (f84367c == null) {
                    f84367c = new C32295c(m104835b());
                }
            }
        }
        return f84367c;
    }

    /* renamed from: b */
    private static C32296d m104835b() {
        C32296d dVar;
        C32296d dVar2;
        C32296d bVar = new C32287b(new C32307j(null));
        if (C6399b.m19945u()) {
            dVar = new C32286a(bVar);
        } else {
            dVar = bVar;
        }
        C32302f fVar = new C32302f(dVar);
        if (C6399b.m19944t()) {
            dVar2 = new C32306i(fVar);
        } else {
            dVar2 = C32298e.m104839a((C32296d) fVar);
        }
        return new C32305h(dVar2);
    }

    private C32295c(C32296d dVar) {
        super(dVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C32297a mo83494a(C32303g gVar, C12462c cVar, C12534t tVar) {
        return f84366a;
    }
}
