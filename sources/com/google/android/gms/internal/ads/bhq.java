package com.google.android.gms.internal.ads;

public abstract class bhq implements bgi {

    /* renamed from: d */
    public int f42035d;

    /* renamed from: a */
    public void mo40619a(int i, Object obj) throws zzgc {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo40649a(long j) throws zzgc;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo40664a(long j, long j2) throws zzgc;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo40650a(long j, boolean z) throws zzgc {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo40653a() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo40667b(long j) throws zzgc;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo40656b() throws zzgc {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo40657c() throws zzgc {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract boolean mo40658d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract boolean mo40659e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract long mo40660f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo40661g() throws zzgc {
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo40672l() throws zzgc {
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract long mo40673m();

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract long mo40674n();

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final int mo40698c(long j) throws zzgc {
        boolean z = false;
        bke.m49060b(this.f42035d == 0);
        this.f42035d = mo40667b(j);
        if (this.f42035d == 0 || this.f42035d == 1 || this.f42035d == -1) {
            z = true;
        }
        bke.m49060b(z);
        return this.f42035d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo40697b(long j, boolean z) throws zzgc {
        boolean z2 = true;
        if (this.f42035d != 1) {
            z2 = false;
        }
        bke.m49060b(z2);
        this.f42035d = 2;
        mo40650a(j, z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public final void mo40699o() throws zzgc {
        bke.m49060b(this.f42035d == 2);
        this.f42035d = 3;
        mo40656b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public final void mo40700p() throws zzgc {
        bke.m49060b(this.f42035d == 3);
        this.f42035d = 2;
        mo40657c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public final void mo40701q() throws zzgc {
        bke.m49060b(this.f42035d == 2);
        this.f42035d = 1;
        mo40661g();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public final void mo40702r() throws zzgc {
        bke.m49060b((this.f42035d == 2 || this.f42035d == 3 || this.f42035d == -2) ? false : true);
        this.f42035d = -2;
        mo40672l();
    }
}
