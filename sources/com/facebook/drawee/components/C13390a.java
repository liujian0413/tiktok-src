package com.facebook.drawee.components;

import android.os.Handler;
import android.os.Looper;
import com.facebook.common.internal.C13307g;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.facebook.drawee.components.a */
public final class C13390a {

    /* renamed from: b */
    private static C13390a f35428b;

    /* renamed from: a */
    public final Set<C13392a> f35429a = new HashSet();

    /* renamed from: c */
    private final Handler f35430c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    private final Runnable f35431d = new Runnable() {
        public final void run() {
            C13390a.m39234b();
            for (C13392a d : C13390a.this.f35429a) {
                d.mo32736d();
            }
            C13390a.this.f35429a.clear();
        }
    };

    /* renamed from: com.facebook.drawee.components.a$a */
    public interface C13392a {
        /* renamed from: d */
        void mo32736d();
    }

    /* renamed from: a */
    public static synchronized C13390a m39233a() {
        C13390a aVar;
        synchronized (C13390a.class) {
            if (f35428b == null) {
                f35428b = new C13390a();
            }
            aVar = f35428b;
        }
        return aVar;
    }

    /* renamed from: b */
    public static void m39234b() {
        boolean z;
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            z = true;
        } else {
            z = false;
        }
        C13307g.m38947b(z);
    }

    /* renamed from: b */
    public final void mo32734b(C13392a aVar) {
        m39234b();
        this.f35429a.remove(aVar);
    }

    /* renamed from: a */
    public final void mo32733a(C13392a aVar) {
        m39234b();
        if (this.f35429a.add(aVar) && this.f35429a.size() == 1) {
            this.f35430c.post(this.f35431d);
        }
    }
}
