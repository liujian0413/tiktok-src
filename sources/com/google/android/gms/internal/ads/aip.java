package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.C15267r;

@C6505uv
public final class aip {

    /* renamed from: d */
    private static int f40346d;

    /* renamed from: e */
    private static int f40347e;

    /* renamed from: a */
    public bgh f40348a;

    /* renamed from: b */
    public bhf f40349b;

    /* renamed from: c */
    public bgq f40350c;

    /* renamed from: f */
    private aiu f40351f;

    /* renamed from: g */
    private final ais f40352g = new ais(this);

    /* renamed from: h */
    private final aiv f40353h = new aiv(this);

    /* renamed from: i */
    private final air f40354i = new air(this);

    public aip() {
        C15267r.m44393b("ExoPlayer must be created on the main UI thread.");
        if (acd.m45439a()) {
            String valueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
            sb.append("AdExoPlayerHelper initialize ");
            sb.append(valueOf);
            acd.m45438a(sb.toString());
        }
        f40346d++;
        this.f40348a = bgj.m48654a(2);
        this.f40348a.mo40609a((bgk) this.f40352g);
    }

    /* renamed from: a */
    public static int m46024a() {
        return f40346d;
    }

    /* renamed from: b */
    public static int m46027b() {
        return f40347e;
    }

    /* renamed from: a */
    public final boolean mo39494a(bho bho) {
        if (this.f40348a == null) {
            return false;
        }
        bhf bhf = new bhf(bho, 1, 0, acl.f40003a, this.f40353h, -1);
        this.f40349b = bhf;
        this.f40350c = new bgq(bho, acl.f40003a, this.f40354i);
        this.f40348a.mo40611a(this.f40349b, this.f40350c);
        f40347e++;
        return true;
    }

    /* renamed from: c */
    public final void mo39495c() {
        if (this.f40348a != null) {
            this.f40348a.mo40615d();
            this.f40348a = null;
            f40347e--;
        }
    }

    /* renamed from: a */
    public final synchronized void mo39492a(aiu aiu) {
        this.f40351f = aiu;
    }

    /* renamed from: d */
    public final synchronized void mo39496d() {
        this.f40351f = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final synchronized void m46026a(String str, String str2) {
        if (this.f40351f != null) {
            this.f40351f.mo39508a(str, str2);
        }
    }

    /* renamed from: a */
    public final void mo39493a(bgk bgk, bhj bhj, bgt bgt) {
        this.f40352g.mo39505a(bgk);
        this.f40353h.mo39512a(bhj);
        this.f40354i.mo39499a(bgt);
    }

    public final void finalize() throws Throwable {
        f40346d--;
        if (acd.m45439a()) {
            String valueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("AdExoPlayerHelper finalize ");
            sb.append(valueOf);
            acd.m45438a(sb.toString());
        }
    }
}
