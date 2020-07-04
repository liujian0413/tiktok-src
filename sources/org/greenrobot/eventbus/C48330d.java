package org.greenrobot.eventbus;

import android.os.Looper;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.greenrobot.eventbus.C48332f.C48333a;
import org.greenrobot.eventbus.C48332f.C48334b;
import org.greenrobot.eventbus.C48335g.C48336a;
import org.greenrobot.eventbus.p1894a.C48327d;

/* renamed from: org.greenrobot.eventbus.d */
public final class C48330d {

    /* renamed from: m */
    private static final ExecutorService f123391m = Executors.newCachedThreadPool();

    /* renamed from: a */
    boolean f123392a = true;

    /* renamed from: b */
    boolean f123393b = true;

    /* renamed from: c */
    boolean f123394c = true;

    /* renamed from: d */
    boolean f123395d = true;

    /* renamed from: e */
    boolean f123396e;

    /* renamed from: f */
    boolean f123397f = true;

    /* renamed from: g */
    boolean f123398g;

    /* renamed from: h */
    boolean f123399h;

    /* renamed from: i */
    ExecutorService f123400i = f123391m;

    /* renamed from: j */
    List<C48327d> f123401j;

    /* renamed from: k */
    C48332f f123402k;

    /* renamed from: l */
    C48335g f123403l;

    /* renamed from: d */
    private static Object m149901d() {
        try {
            return Looper.getMainLooper();
        } catch (RuntimeException unused) {
            return null;
        }
    }

    /* renamed from: e */
    private C7705c m149902e() {
        return new C7705c(this);
    }

    C48330d() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C48335g mo121770b() {
        if (this.f123403l != null) {
            return this.f123403l;
        }
        if (!C48333a.m149911a()) {
            return null;
        }
        Object d = m149901d();
        if (d == null) {
            return null;
        }
        return new C48336a((Looper) d);
    }

    /* renamed from: c */
    public final C7705c mo121771c() {
        C7705c e;
        synchronized (C7705c.class) {
            if (C7705c.f20939b == null) {
                e = m149902e();
                C7705c.f20939b = e;
            } else {
                throw new EventBusException("Default instance already exists. It may be only set once before it's used the first time to ensure consistent behavior.");
            }
        }
        return e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C48332f mo121769a() {
        if (this.f123402k != null) {
            return this.f123402k;
        }
        if (!C48333a.m149911a() || m149901d() == null) {
            return new C48334b();
        }
        return new C48333a("EventBus");
    }

    /* renamed from: a */
    public final C48330d mo121767a(ExecutorService executorService) {
        this.f123400i = executorService;
        return this;
    }

    /* renamed from: a */
    public final C48330d mo121768a(C48327d dVar) {
        if (this.f123401j == null) {
            this.f123401j = new ArrayList();
        }
        this.f123401j.add(dVar);
        return this;
    }
}
