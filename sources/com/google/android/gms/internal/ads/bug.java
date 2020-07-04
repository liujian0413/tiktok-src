package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public final class bug {

    /* renamed from: a */
    private final AtomicInteger f43609a;

    /* renamed from: b */
    private final Set<bqk<?>> f43610b;

    /* renamed from: c */
    private final PriorityBlockingQueue<bqk<?>> f43611c;

    /* renamed from: d */
    private final PriorityBlockingQueue<bqk<?>> f43612d;

    /* renamed from: e */
    private final C16197yn f43613e;

    /* renamed from: f */
    private final blv f43614f;

    /* renamed from: g */
    private final C15465a f43615g;

    /* renamed from: h */
    private final bmt[] f43616h;

    /* renamed from: i */
    private bdn f43617i;

    /* renamed from: j */
    private final List<Object> f43618j;

    private bug(C16197yn ynVar, blv blv, int i, C15465a aVar) {
        this.f43609a = new AtomicInteger();
        this.f43610b = new HashSet();
        this.f43611c = new PriorityBlockingQueue<>();
        this.f43612d = new PriorityBlockingQueue<>();
        this.f43618j = new ArrayList();
        this.f43613e = ynVar;
        this.f43614f = blv;
        this.f43616h = new bmt[4];
        this.f43615g = aVar;
    }

    private bug(C16197yn ynVar, blv blv, int i) {
        this(ynVar, blv, 4, new bia(new Handler(Looper.getMainLooper())));
    }

    public bug(C16197yn ynVar, blv blv) {
        this(ynVar, blv, 4);
    }

    /* renamed from: a */
    public final void mo41336a() {
        bmt[] bmtArr;
        if (this.f43617i != null) {
            this.f43617i.mo40524a();
        }
        for (bmt bmt : this.f43616h) {
            if (bmt != null) {
                bmt.mo40989a();
            }
        }
        this.f43617i = new bdn(this.f43611c, this.f43612d, this.f43613e, this.f43615g);
        this.f43617i.start();
        for (int i = 0; i < this.f43616h.length; i++) {
            bmt bmt2 = new bmt(this.f43612d, this.f43614f, this.f43613e, this.f43615g);
            this.f43616h[i] = bmt2;
            bmt2.start();
        }
    }

    /* renamed from: a */
    public final <T> bqk<T> mo41335a(bqk<T> bqk) {
        bqk.mo41146a(this);
        synchronized (this.f43610b) {
            this.f43610b.add(bqk);
        }
        bqk.mo41144a(this.f43609a.incrementAndGet());
        bqk.mo41150b("add-to-queue");
        if (!bqk.f43254d) {
            this.f43612d.add(bqk);
            return bqk;
        }
        this.f43611c.add(bqk);
        return bqk;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final <T> void mo41337b(bqk<T> bqk) {
        synchronized (this.f43610b) {
            this.f43610b.remove(bqk);
        }
        synchronized (this.f43618j) {
            Iterator it = this.f43618j.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }
}
