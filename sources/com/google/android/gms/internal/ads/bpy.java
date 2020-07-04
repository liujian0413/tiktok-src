package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

public final class bpy implements bpv {

    /* renamed from: a */
    private final bpv[] f43194a;

    /* renamed from: b */
    private final ArrayList<bpv> f43195b;

    /* renamed from: c */
    private final blp f43196c = new blp();

    /* renamed from: d */
    private bpw f43197d;

    /* renamed from: e */
    private blm f43198e;

    /* renamed from: f */
    private Object f43199f;

    /* renamed from: g */
    private int f43200g = -1;

    /* renamed from: h */
    private zzqp f43201h;

    public bpy(bpv... bpvArr) {
        this.f43194a = bpvArr;
        this.f43195b = new ArrayList<>(Arrays.asList(bpvArr));
    }

    /* renamed from: a */
    public final void mo41116a(bks bks, boolean z, bpw bpw) {
        this.f43197d = bpw;
        for (int i = 0; i < this.f43194a.length; i++) {
            this.f43194a[i].mo41116a(bks, false, new bpz(this, i));
        }
    }

    /* renamed from: a */
    public final bpt mo41114a(int i, brc brc) {
        bpt[] bptArr = new bpt[this.f43194a.length];
        for (int i2 = 0; i2 < bptArr.length; i2++) {
            bptArr[i2] = this.f43194a[i2].mo41114a(i, brc);
        }
        return new bpx(bptArr);
    }

    /* renamed from: a */
    public final void mo41117a(bpt bpt) {
        bpx bpx = (bpx) bpt;
        for (int i = 0; i < this.f43194a.length; i++) {
            this.f43194a[i].mo41117a(bpx.f43187a[i]);
        }
    }

    /* renamed from: a */
    public final void mo41115a() {
        for (bpv a : this.f43194a) {
            a.mo41115a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m49707a(int i, blm blm, Object obj) {
        zzqp zzqp;
        if (this.f43201h == null) {
            int b = blm.mo40908b();
            int i2 = 0;
            while (true) {
                if (i2 >= b) {
                    if (this.f43200g == -1) {
                        this.f43200g = blm.mo40909c();
                    } else if (blm.mo40909c() != this.f43200g) {
                        zzqp = new zzqp(1);
                    }
                    zzqp = null;
                } else if (blm.mo40905a(i2, this.f43196c, false).f42517e) {
                    zzqp = new zzqp(0);
                    break;
                } else {
                    i2++;
                }
            }
            this.f43201h = zzqp;
        }
        if (this.f43201h == null) {
            this.f43195b.remove(this.f43194a[i]);
            if (i == 0) {
                this.f43198e = blm;
                this.f43199f = obj;
            }
            if (this.f43195b.isEmpty()) {
                this.f43197d.mo40874a(this.f43198e, this.f43199f);
            }
        }
    }
}
