package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

final class bgl implements bgh {

    /* renamed from: a */
    private final Handler f41886a;

    /* renamed from: b */
    private final bgn f41887b;

    /* renamed from: c */
    private final CopyOnWriteArraySet<bgk> f41888c = new CopyOnWriteArraySet<>();

    /* renamed from: d */
    private final boolean[] f41889d = new boolean[2];

    /* renamed from: e */
    private boolean f41890e;

    /* renamed from: f */
    private int f41891f = 1;

    /* renamed from: g */
    private int f41892g;

    public bgl(int i, int i2, int i3) {
        for (int i4 = 0; i4 < this.f41889d.length; i4++) {
            this.f41889d[i4] = true;
        }
        this.f41886a = new bgm(this);
        bgn bgn = new bgn(this.f41886a, this.f41890e, this.f41889d, 2500, 5000);
        this.f41887b = bgn;
    }

    /* renamed from: a */
    public final void mo40609a(bgk bgk) {
        this.f41888c.add(bgk);
    }

    /* renamed from: a */
    public final int mo40605a() {
        return this.f41891f;
    }

    /* renamed from: a */
    public final void mo40611a(bhq... bhqArr) {
        this.f41887b.mo40627a(bhqArr);
    }

    /* renamed from: a */
    public final void mo40606a(int i, boolean z) {
        if (this.f41889d[0] != z) {
            this.f41889d[0] = z;
            this.f41887b.mo40623a(0, z);
        }
    }

    /* renamed from: a */
    public final void mo40610a(boolean z) {
        if (this.f41890e != z) {
            this.f41890e = z;
            this.f41892g++;
            this.f41887b.mo40626a(z);
            Iterator it = this.f41888c.iterator();
            while (it.hasNext()) {
                ((bgk) it.next()).mo39507a(z, this.f41891f);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo40613b() {
        return this.f41890e;
    }

    /* renamed from: a */
    public final void mo40607a(long j) {
        this.f41887b.mo40624a(j);
    }

    /* renamed from: c */
    public final void mo40614c() {
        this.f41887b.mo40631d();
    }

    /* renamed from: d */
    public final void mo40615d() {
        this.f41887b.mo40632e();
        this.f41886a.removeCallbacksAndMessages(null);
    }

    /* renamed from: a */
    public final void mo40608a(bgi bgi, int i, Object obj) {
        this.f41887b.mo40625a(bgi, 1, obj);
    }

    /* renamed from: b */
    public final void mo40612b(bgi bgi, int i, Object obj) {
        this.f41887b.mo40629b(bgi, 1, obj);
    }

    /* renamed from: e */
    public final long mo40616e() {
        return this.f41887b.mo40630c();
    }

    /* renamed from: f */
    public final long mo40617f() {
        return this.f41887b.mo40622a();
    }

    /* renamed from: g */
    public final long mo40618g() {
        return this.f41887b.mo40628b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo40620a(Message message) {
        switch (message.what) {
            case 1:
                this.f41891f = message.arg1;
                Iterator it = this.f41888c.iterator();
                while (it.hasNext()) {
                    ((bgk) it.next()).mo39507a(this.f41890e, this.f41891f);
                }
                return;
            case 2:
                this.f41892g--;
                if (this.f41892g == 0) {
                    Iterator it2 = this.f41888c.iterator();
                    while (it2.hasNext()) {
                        ((bgk) it2.next()).mo39504a();
                    }
                    return;
                }
                break;
            case 3:
                zzgc zzgc = (zzgc) message.obj;
                Iterator it3 = this.f41888c.iterator();
                while (it3.hasNext()) {
                    ((bgk) it3.next()).mo39506a(zzgc);
                }
                break;
        }
    }
}
