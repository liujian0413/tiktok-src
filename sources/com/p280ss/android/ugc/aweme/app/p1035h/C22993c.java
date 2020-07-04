package com.p280ss.android.ugc.aweme.app.p1035h;

import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.app.h.c */
public final class C22993c {

    /* renamed from: b */
    private static C22993c f60768b;

    /* renamed from: a */
    private C22992b f60769a;

    /* renamed from: c */
    private ArrayList<String> f60770c;

    /* renamed from: d */
    private C22991a f60771d;

    /* renamed from: a */
    public static boolean m75630a() {
        if (f60768b != null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo59986c() {
        this.f60769a.mo59982a();
    }

    /* renamed from: b */
    public static C22993c m75631b() {
        if (f60768b != null) {
            return f60768b;
        }
        throw new RuntimeException("UserActionPredict not init");
    }

    /* renamed from: a */
    private void m75629a(C22991a aVar) {
        if (!m75632b(aVar)) {
            this.f60771d = aVar;
            this.f60769a.mo59983a(aVar);
        }
    }

    /* renamed from: b */
    private boolean m75632b(C22991a aVar) {
        if (aVar != null && !this.f60770c.contains(aVar.f60764a)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo59985a(String str) {
        if (!TextUtils.isEmpty(str)) {
            m75629a(new C22991a(str, System.currentTimeMillis()));
        }
    }
}
