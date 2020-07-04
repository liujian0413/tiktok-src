package com.bytedance.crash.p501j.p502a;

import android.content.Context;
import com.bytedance.crash.C9875d;
import com.bytedance.crash.C9918j;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.p497f.C9896a;
import com.bytedance.crash.p497f.C9898c;
import com.bytedance.crash.p501j.p502a.C9924c.C9925a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* renamed from: com.bytedance.crash.j.a.f */
public final class C9930f {

    /* renamed from: a */
    private static volatile C9930f f27106a;

    /* renamed from: b */
    private Context f27107b;

    /* renamed from: c */
    private Map<CrashType, C9924c> f27108c = new HashMap();

    /* renamed from: d */
    private C9921b f27109d;

    /* renamed from: e */
    private C9926d f27110e;

    /* renamed from: a */
    public static C9930f m29397a() {
        if (f27106a == null) {
            Context g = C9918j.m29342g();
            if (g != null) {
                f27106a = new C9930f(g);
            } else {
                throw new IllegalArgumentException("NpthBus not init");
            }
        }
        return f27106a;
    }

    private C9930f(Context context) {
        this.f27107b = context;
        try {
            this.f27109d = C9921b.m29364a();
            this.f27110e = new C9926d(this.f27107b);
        } catch (Throwable th) {
            C9875d.m29130a().mo24453a("NPTH_CATCH", th);
        }
    }

    /* renamed from: a */
    private C9924c m29396a(CrashType crashType) {
        C9924c cVar = (C9924c) this.f27108c.get(crashType);
        if (cVar != null) {
            return cVar;
        }
        switch (crashType) {
            case JAVA:
                cVar = new C9935j(this.f27107b, this.f27109d, this.f27110e);
                break;
            case LAUNCH:
                cVar = new C9936k(this.f27107b, this.f27109d, this.f27110e);
                break;
            case NATIVE:
                cVar = new C9937l(this.f27107b, this.f27109d, this.f27110e);
                break;
            case ANR:
                cVar = new C9920a(this.f27107b, this.f27109d, this.f27110e);
                break;
            case DART:
                cVar = new C9933h(this.f27107b, this.f27109d, this.f27110e);
                break;
            case CUSTOM_JAVA:
                cVar = new C9932g(this.f27107b, this.f27109d, this.f27110e);
                break;
            case BLOCK:
                cVar = new C9929e(this.f27107b, this.f27109d, this.f27110e);
                break;
            case ENSURE:
                cVar = new C9934i(this.f27107b, this.f27109d, this.f27110e);
                break;
        }
        if (cVar != null) {
            this.f27108c.put(crashType, cVar);
        }
        return cVar;
    }

    /* renamed from: a */
    public final C9896a mo24556a(List<C9896a> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        C9896a aVar = new C9896a();
        JSONArray jSONArray = new JSONArray();
        for (C9896a aVar2 : list) {
            jSONArray.put(aVar2.f26984a);
        }
        aVar.mo24492a("data", (Object) jSONArray);
        C9898c a = C9898c.m29248a(this.f27107b);
        C9898c.m29250a(a);
        C9898c.m29253b(a);
        a.mo24509a(C9918j.m29332a().mo24525a());
        a.mo24508a(C9918j.m29338c().mo24593a());
        a.mo24507a(C9918j.m29332a().mo24530f());
        aVar.mo24484a(a);
        return aVar;
    }

    /* renamed from: a */
    public final C9896a mo24554a(CrashType crashType, C9896a aVar) {
        if (crashType == null) {
            return aVar;
        }
        C9924c a = m29396a(crashType);
        if (a != null) {
            return a.mo24546a(aVar, null, false);
        }
        return aVar;
    }

    /* renamed from: a */
    public final C9896a mo24555a(CrashType crashType, C9896a aVar, C9925a aVar2, boolean z) {
        if (crashType == null) {
            return null;
        }
        C9924c a = m29396a(crashType);
        if (a != null) {
            return a.mo24546a(null, aVar2, true);
        }
        return null;
    }
}
