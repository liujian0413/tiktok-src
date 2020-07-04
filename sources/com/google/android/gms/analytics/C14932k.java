package com.google.android.gms.analytics;

import com.google.android.gms.analytics.C14932k;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.util.C15322e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.analytics.k */
public class C14932k<T extends C14932k> {

    /* renamed from: a */
    private final List<Object> f38613a = new ArrayList();

    /* renamed from: e */
    public final C14933l f38614e;

    /* renamed from: f */
    protected final C14930i f38615f;

    protected C14932k(C14933l lVar, C15322e eVar) {
        C15267r.m44384a(lVar);
        this.f38614e = lVar;
        C14930i iVar = new C14930i(this, eVar);
        iVar.mo37997e();
        this.f38615f = iVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo37983a(C14930i iVar) {
    }

    /* renamed from: d */
    public C14930i mo37985d() {
        C14930i a = this.f38615f.mo37990a();
        mo37999b(a);
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo37999b(C14930i iVar) {
        Iterator it = this.f38613a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}
