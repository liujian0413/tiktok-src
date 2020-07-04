package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.C15585bw;
import com.google.android.gms.internal.ads.C6505uv;
import com.google.android.gms.internal.ads.acd;
import com.google.android.gms.internal.ads.acj;
import com.google.android.gms.internal.ads.afb;
import com.google.android.gms.internal.ads.bdp;
import com.google.android.gms.internal.ads.bds;
import com.google.android.gms.internal.ads.bym;
import com.google.android.gms.internal.ads.zzbgz;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@C6505uv
/* renamed from: com.google.android.gms.ads.internal.i */
public final class C14827i implements bdp, Runnable {

    /* renamed from: a */
    private final List<Object[]> f38348a;

    /* renamed from: b */
    private final AtomicReference<bdp> f38349b;

    /* renamed from: c */
    private Context f38350c;

    /* renamed from: d */
    private zzbgz f38351d;

    /* renamed from: e */
    private CountDownLatch f38352e;

    public C14827i(C14794az azVar) {
        this(azVar.f38268c, azVar.f38270e);
    }

    private C14827i(Context context, zzbgz zzbgz) {
        this.f38348a = new Vector();
        this.f38349b = new AtomicReference<>();
        this.f38352e = new CountDownLatch(1);
        this.f38350c = context;
        this.f38351d = zzbgz;
        if (afb.m45734b()) {
            acj.m45508a((Runnable) this);
        } else {
            run();
        }
    }

    /* renamed from: a */
    private final boolean m43038a() {
        try {
            this.f38352e.await();
            return true;
        } catch (InterruptedException e) {
            acd.m45780c("Interrupted during GADSignals creation.", e);
            return false;
        }
    }

    /* renamed from: b */
    private final void m43040b() {
        if (!this.f38348a.isEmpty()) {
            for (Object[] objArr : this.f38348a) {
                if (objArr.length == 1) {
                    ((bdp) this.f38349b.get()).mo37777a((MotionEvent) objArr[0]);
                } else if (objArr.length == 3) {
                    ((bdp) this.f38349b.get()).mo37776a(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
                }
            }
            this.f38348a.clear();
        }
    }

    /* renamed from: b */
    private static Context m43039b(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    /* renamed from: a */
    public final String mo37773a(Context context) {
        if (m43038a()) {
            bdp bdp = (bdp) this.f38349b.get();
            if (bdp != null) {
                m43040b();
                return bdp.mo37773a(m43039b(context));
            }
        }
        return "";
    }

    /* renamed from: a */
    public final String mo37774a(Context context, String str, View view) {
        return mo37775a(context, str, view, null);
    }

    /* renamed from: a */
    public final String mo37775a(Context context, String str, View view, Activity activity) {
        if (m43038a()) {
            bdp bdp = (bdp) this.f38349b.get();
            if (bdp != null) {
                m43040b();
                return bdp.mo37775a(m43039b(context), str, view, activity);
            }
        }
        return "";
    }

    /* renamed from: a */
    public final void mo37778a(View view) {
        bdp bdp = (bdp) this.f38349b.get();
        if (bdp != null) {
            bdp.mo37778a(view);
        }
    }

    /* renamed from: a */
    public final void mo37777a(MotionEvent motionEvent) {
        bdp bdp = (bdp) this.f38349b.get();
        if (bdp != null) {
            m43040b();
            bdp.mo37777a(motionEvent);
            return;
        }
        this.f38348a.add(new Object[]{motionEvent});
    }

    /* renamed from: a */
    public final void mo37776a(int i, int i2, int i3) {
        bdp bdp = (bdp) this.f38349b.get();
        if (bdp != null) {
            m43040b();
            bdp.mo37776a(i, i2, i3);
            return;
        }
        this.f38348a.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
    }

    public final void run() {
        boolean z = false;
        try {
            boolean z2 = this.f38351d.f45680d;
            if (!((Boolean) bym.m50299d().mo41272a(C15585bw.f43760aG)).booleanValue() && z2) {
                z = true;
            }
            this.f38349b.set(bds.m48500a(this.f38351d.f45677a, m43039b(this.f38350c), z));
        } finally {
            this.f38352e.countDown();
            this.f38350c = null;
            this.f38351d = null;
        }
    }
}
