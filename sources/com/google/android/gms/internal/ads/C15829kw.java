package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.C15267r;
import java.util.Iterator;
import java.util.LinkedList;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.kw */
final class C15829kw {

    /* renamed from: a */
    public zzyv f44561a;

    /* renamed from: b */
    public final String f44562b;

    /* renamed from: c */
    public final int f44563c;

    /* renamed from: d */
    public boolean f44564d;

    /* renamed from: e */
    private final LinkedList<C15830kx> f44565e = new LinkedList<>();

    C15829kw(zzyv zzyv, String str, int i) {
        C15267r.m44384a(zzyv);
        C15267r.m44384a(str);
        this.f44561a = zzyv;
        this.f44562b = str;
        this.f44563c = i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C15830kx mo41704a(zzyv zzyv) {
        if (zzyv != null) {
            this.f44561a = zzyv;
        }
        return (C15830kx) this.f44565e.remove();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo41703a() {
        return this.f44565e.size();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo41707b() {
        Iterator it = this.f44565e.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((C15830kx) it.next()).f44570e) {
                i++;
            }
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo41706a(C15795jp jpVar) {
        C15830kx kxVar = new C15830kx(this, jpVar);
        this.f44565e.add(kxVar);
        return kxVar.mo41710a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final int mo41708c() {
        Iterator it = this.f44565e.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((C15830kx) it.next()).mo41710a()) {
                i++;
            }
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo41705a(C15795jp jpVar, zzyv zzyv) {
        this.f44565e.add(new C15830kx(this, jpVar, zzyv));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo41709d() {
        this.f44564d = true;
    }
}
