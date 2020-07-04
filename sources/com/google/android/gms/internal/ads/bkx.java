package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

final class bkx implements bks {

    /* renamed from: a */
    private final blj[] f42406a;

    /* renamed from: b */
    private final bqy f42407b;

    /* renamed from: c */
    private final bqx f42408c;

    /* renamed from: d */
    private final Handler f42409d;

    /* renamed from: e */
    private final bla f42410e;

    /* renamed from: f */
    private final CopyOnWriteArraySet<bkt> f42411f;

    /* renamed from: g */
    private final blp f42412g;

    /* renamed from: h */
    private final blo f42413h;

    /* renamed from: i */
    private boolean f42414i;

    /* renamed from: j */
    private boolean f42415j;

    /* renamed from: k */
    private int f42416k;

    /* renamed from: l */
    private int f42417l;

    /* renamed from: m */
    private int f42418m;

    /* renamed from: n */
    private int f42419n;

    /* renamed from: o */
    private boolean f42420o;

    /* renamed from: p */
    private blm f42421p;

    /* renamed from: q */
    private Object f42422q;

    /* renamed from: r */
    private bql f42423r;

    /* renamed from: s */
    private bqx f42424s;

    /* renamed from: t */
    private bli f42425t;

    /* renamed from: u */
    private blc f42426u;

    /* renamed from: v */
    private int f42427v;

    /* renamed from: w */
    private int f42428w;

    /* renamed from: x */
    private long f42429x;

    public bkx(blj[] bljArr, bqy bqy, blh blh) {
        brr.m49873b(bljArr.length > 0);
        this.f42406a = (blj[]) brr.m49869a(bljArr);
        this.f42407b = (bqy) brr.m49869a(bqy);
        this.f42415j = false;
        this.f42416k = 0;
        this.f42417l = 1;
        this.f42411f = new CopyOnWriteArraySet<>();
        this.f42408c = new bqx(new bqv[bljArr.length]);
        this.f42421p = blm.f42506a;
        this.f42412g = new blp();
        this.f42413h = new blo();
        this.f42423r = bql.f43266a;
        this.f42424s = this.f42408c;
        this.f42425t = bli.f42500a;
        this.f42409d = new bkz(this, Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.f42426u = new blc(0, 0);
        bla bla = new bla(bljArr, bqy, blh, this.f42415j, 0, this.f42409d, this.f42426u, this);
        this.f42410e = bla;
    }

    /* renamed from: a */
    public final void mo40850a(bkt bkt) {
        this.f42411f.add(bkt);
    }

    /* renamed from: b */
    public final void mo40854b(bkt bkt) {
        this.f42411f.remove(bkt);
    }

    /* renamed from: a */
    public final int mo40848a() {
        return this.f42417l;
    }

    /* renamed from: a */
    public final void mo40851a(bpv bpv) {
        if (!this.f42421p.mo40907a() || this.f42422q != null) {
            this.f42421p = blm.f42506a;
            this.f42422q = null;
            Iterator it = this.f42411f.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        if (this.f42414i) {
            this.f42414i = false;
            this.f42423r = bql.f43266a;
            this.f42424s = this.f42408c;
            this.f42407b.mo41175a(null);
            Iterator it2 = this.f42411f.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        this.f42419n++;
        this.f42410e.mo40876a(bpv, true);
    }

    /* renamed from: a */
    public final void mo40852a(boolean z) {
        if (this.f42415j != z) {
            this.f42415j = z;
            this.f42410e.mo40878a(z);
            Iterator it = this.f42411f.iterator();
            while (it.hasNext()) {
                ((bkt) it.next()).mo39623a(z, this.f42417l);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo40856b() {
        return this.f42415j;
    }

    /* renamed from: a */
    public final void mo40849a(long j) {
        int i = m49139i();
        if (i < 0 || (!this.f42421p.mo40907a() && i >= this.f42421p.mo40908b())) {
            throw new zzlj(this.f42421p, i, j);
        }
        this.f42418m++;
        this.f42427v = i;
        if (this.f42421p.mo40907a()) {
            this.f42428w = 0;
        } else {
            this.f42421p.mo40905a(i, this.f42412g, false);
            this.f42421p.mo40904a(0, this.f42413h, false);
            this.f42428w = 0;
        }
        if (j == -9223372036854775807L) {
            this.f42429x = 0;
            this.f42410e.mo40873a(this.f42421p, i, -9223372036854775807L);
            return;
        }
        this.f42429x = j;
        this.f42410e.mo40873a(this.f42421p, i, bkr.m49119b(j));
        Iterator it = this.f42411f.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: c */
    public final void mo40857c() {
        this.f42410e.mo40872a();
    }

    /* renamed from: d */
    public final void mo40858d() {
        this.f42410e.mo40880b();
        this.f42409d.removeCallbacksAndMessages(null);
    }

    /* renamed from: a */
    public final void mo40853a(bkv... bkvArr) {
        this.f42410e.mo40879a(bkvArr);
    }

    /* renamed from: b */
    public final void mo40855b(bkv... bkvArr) {
        this.f42410e.mo40881b(bkvArr);
    }

    /* renamed from: i */
    private final int m49139i() {
        if (this.f42421p.mo40907a() || this.f42418m > 0) {
            return this.f42427v;
        }
        this.f42421p.mo40904a(this.f42426u.f42488a, this.f42413h, false);
        return 0;
    }

    /* renamed from: f */
    public final long mo40860f() {
        if (this.f42421p.mo40907a()) {
            return -9223372036854775807L;
        }
        return bkr.m49118a(this.f42421p.mo40905a(m49139i(), this.f42412g, false).f42521i);
    }

    /* renamed from: g */
    public final long mo40861g() {
        if (this.f42421p.mo40907a() || this.f42418m > 0) {
            return this.f42429x;
        }
        this.f42421p.mo40904a(this.f42426u.f42488a, this.f42413h, false);
        return this.f42413h.mo40910a() + bkr.m49118a(this.f42426u.f42490c);
    }

    /* renamed from: h */
    public final long mo40862h() {
        if (this.f42421p.mo40907a() || this.f42418m > 0) {
            return this.f42429x;
        }
        this.f42421p.mo40904a(this.f42426u.f42488a, this.f42413h, false);
        return this.f42413h.mo40910a() + bkr.m49118a(this.f42426u.f42491d);
    }

    /* renamed from: e */
    public final int mo40859e() {
        return this.f42406a.length;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo40863a(Message message) {
        boolean z = true;
        switch (message.what) {
            case 0:
                this.f42419n--;
                return;
            case 1:
                this.f42417l = message.arg1;
                Iterator it = this.f42411f.iterator();
                while (it.hasNext()) {
                    ((bkt) it.next()).mo39623a(this.f42415j, this.f42417l);
                }
                return;
            case 2:
                if (message.arg1 == 0) {
                    z = false;
                }
                this.f42420o = z;
                Iterator it2 = this.f42411f.iterator();
                while (it2.hasNext()) {
                    it2.next();
                }
                return;
            case 3:
                if (this.f42419n == 0) {
                    bra bra = (bra) message.obj;
                    this.f42414i = true;
                    this.f42423r = bra.f43304a;
                    this.f42424s = bra.f43305b;
                    this.f42407b.mo41175a(bra.f43306c);
                    Iterator it3 = this.f42411f.iterator();
                    while (it3.hasNext()) {
                        it3.next();
                    }
                    return;
                }
                break;
            case 4:
                int i = this.f42418m - 1;
                this.f42418m = i;
                if (i == 0) {
                    this.f42426u = (blc) message.obj;
                    if (message.arg1 != 0) {
                        Iterator it4 = this.f42411f.iterator();
                        while (it4.hasNext()) {
                            it4.next();
                        }
                        return;
                    }
                }
                break;
            case 5:
                if (this.f42418m == 0) {
                    this.f42426u = (blc) message.obj;
                    Iterator it5 = this.f42411f.iterator();
                    while (it5.hasNext()) {
                        it5.next();
                    }
                    return;
                }
                break;
            case 6:
                ble ble = (ble) message.obj;
                this.f42418m -= ble.f42498d;
                if (this.f42419n == 0) {
                    this.f42421p = ble.f42495a;
                    this.f42422q = ble.f42496b;
                    this.f42426u = ble.f42497c;
                    Iterator it6 = this.f42411f.iterator();
                    while (it6.hasNext()) {
                        it6.next();
                    }
                    return;
                }
                break;
            case 7:
                bli bli = (bli) message.obj;
                if (!this.f42425t.equals(bli)) {
                    this.f42425t = bli;
                    Iterator it7 = this.f42411f.iterator();
                    while (it7.hasNext()) {
                        it7.next();
                    }
                    return;
                }
                break;
            case 8:
                zzkt zzkt = (zzkt) message.obj;
                Iterator it8 = this.f42411f.iterator();
                while (it8.hasNext()) {
                    ((bkt) it8.next()).mo39618a(zzkt);
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }
}
