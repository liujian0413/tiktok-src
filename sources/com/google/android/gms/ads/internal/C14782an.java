package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.C6505uv;
import com.google.android.gms.internal.ads.acd;
import com.google.android.gms.internal.ads.acl;
import com.google.android.gms.internal.ads.zzyv;
import java.lang.ref.WeakReference;

@C6505uv
/* renamed from: com.google.android.gms.ads.internal.an */
public final class C14782an {

    /* renamed from: a */
    public zzyv f38187a;

    /* renamed from: b */
    public boolean f38188b;

    /* renamed from: c */
    private final C14784ap f38189c;

    /* renamed from: d */
    private final Runnable f38190d;

    /* renamed from: e */
    private boolean f38191e;

    /* renamed from: f */
    private long f38192f;

    public C14782an(C14768a aVar) {
        this(aVar, new C14784ap(acl.f40003a));
    }

    private C14782an(C14768a aVar, C14784ap apVar) {
        this.f38189c = apVar;
        this.f38190d = new C14783ao(this, new WeakReference(aVar));
    }

    /* renamed from: a */
    public final void mo37673a() {
        this.f38188b = false;
        this.f38189c.mo37680a(this.f38190d);
    }

    /* renamed from: b */
    public final void mo37676b() {
        this.f38191e = true;
        if (this.f38188b) {
            this.f38189c.mo37680a(this.f38190d);
        }
    }

    /* renamed from: c */
    public final void mo37677c() {
        this.f38191e = false;
        if (this.f38188b) {
            this.f38188b = false;
            mo37675a(this.f38187a, this.f38192f);
        }
    }

    /* renamed from: d */
    public final void mo37678d() {
        this.f38191e = false;
        this.f38188b = false;
        if (!(this.f38187a == null || this.f38187a.f45779c == null)) {
            this.f38187a.f45779c.remove("_ad");
        }
        mo37675a(this.f38187a, 0);
    }

    /* renamed from: a */
    public final void mo37674a(zzyv zzyv) {
        mo37675a(zzyv, 60000);
    }

    /* renamed from: a */
    public final void mo37675a(zzyv zzyv, long j) {
        if (this.f38188b) {
            acd.m45783e("An ad refresh is already scheduled.");
            return;
        }
        this.f38187a = zzyv;
        this.f38188b = true;
        this.f38192f = j;
        if (!this.f38191e) {
            StringBuilder sb = new StringBuilder(65);
            sb.append("Scheduling ad refresh ");
            sb.append(j);
            sb.append(" milliseconds from now.");
            acd.m45781d(sb.toString());
            this.f38189c.mo37681a(this.f38190d, j);
        }
    }
}
