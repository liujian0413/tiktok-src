package com.p280ss.android.ugc.aweme.storage.p1640b.p1641a.p1642a;

import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.storage.p1640b.C41902b;
import com.p280ss.android.ugc.aweme.storage.p1640b.C41911c;
import com.p280ss.android.ugc.aweme.storage.p1640b.p1643b.C41903a;
import com.p280ss.android.ugc.aweme.storage.p1640b.p1643b.p1644a.C41906b;
import com.p280ss.android.ugc.aweme.storage.p1640b.p1643b.p1644a.C41908c;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.storage.b.a.a.b */
public abstract class C41898b {

    /* renamed from: a */
    public C27311c f108977a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public long mo102937a() {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public long mo102938b() {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public long mo102939c() {
        return 0;
    }

    /* renamed from: d */
    public final long mo102940d() {
        return m133252e() + 0 + mo102937a() + mo102938b() + mo102939c();
    }

    /* renamed from: e */
    private long m133252e() {
        String a = C41911c.m133282a(this.f108977a);
        boolean z = true;
        C41906b bVar = new C41906b(null, C35574k.m114859a().mo70094i().mo102931b().mo102970b(), 1, null);
        if (a.length() <= 0) {
            z = false;
        }
        if (z) {
            C41903a aVar = new C41903a();
            aVar.mo102941a((C41908c) bVar);
            aVar.mo102943a(a);
        }
        return bVar.f108983a;
    }

    public C41898b(C27311c cVar) {
        C7573i.m23587b(cVar, "draft");
        this.f108977a = cVar;
    }

    /* renamed from: a */
    protected static long m133251a(String str) {
        if (C41902b.m133264a((Object) str)) {
            return C35574k.m114859a().mo70094i().mo102932c().mo102928a(str).length();
        }
        return 0;
    }
}
