package com.bytedance.crash.p501j.p502a;

import android.content.Context;
import com.bytedance.crash.C9918j;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.p497f.C9896a;
import com.bytedance.crash.p497f.C9898c;
import com.bytedance.crash.p501j.C9949e;
import com.bytedance.crash.p504l.C9981f;
import com.bytedance.crash.p504l.C9996p;
import org.json.JSONArray;

/* renamed from: com.bytedance.crash.j.a.l */
final class C9937l extends C9924c {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo24532a() {
        return false;
    }

    /* renamed from: b */
    public final int mo24547b() {
        return 6;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo24550d() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo24548c(C9896a aVar) {
        JSONArray a = C9949e.m29445a(aVar.f26986c);
        if (a == null || a.length() <= 0) {
            super.mo24548c(aVar);
        } else {
            aVar.mo24492a("logcat", (Object) a);
        }
    }

    /* renamed from: a */
    public final C9896a mo24545a(int i, C9896a aVar) {
        C9896a a = super.mo24545a(i, aVar);
        switch (i) {
            case 0:
                C9898c a2 = C9898c.m29248a(this.f27098b);
                a2.mo24509a(C9918j.m29332a().mo24525a());
                a.mo24484a(a2);
                C9996p.m29626a(a, a2, this.f27097a);
                break;
            case 1:
                C9898c g = a.mo24506g();
                g.mo24508a(C9918j.m29338c().mo24593a());
                g.mo24507a(C9918j.m29332a().mo24530f());
                break;
            case 2:
                C9898c.m29250a(a.mo24506g());
                StringBuilder sb = new StringBuilder("fd:");
                sb.append(C9981f.m29534b());
                a.mo24488a(sb.toString(), C9981f.m29532a());
                C9981f.m29535c();
                break;
        }
        return a;
    }

    C9937l(Context context, C9921b bVar, C9926d dVar) {
        super(CrashType.NATIVE, context, bVar, dVar);
    }
}
