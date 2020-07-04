package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.gms.common.util.C15333p;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.common.api.internal.b */
public final class C15076b implements ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: a */
    private static final C15076b f39008a = new C15076b();

    /* renamed from: b */
    private final AtomicBoolean f39009b = new AtomicBoolean();

    /* renamed from: c */
    private final AtomicBoolean f39010c = new AtomicBoolean();

    /* renamed from: d */
    private final ArrayList<C15077a> f39011d = new ArrayList<>();

    /* renamed from: e */
    private boolean f39012e = false;

    /* renamed from: com.google.android.gms.common.api.internal.b$a */
    public interface C15077a {
        /* renamed from: a */
        void mo38327a(boolean z);
    }

    private C15076b() {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    /* renamed from: a */
    public static C15076b m43753a() {
        return f39008a;
    }

    /* renamed from: a */
    public static void m43754a(Application application) {
        synchronized (f39008a) {
            if (!f39008a.f39012e) {
                application.registerActivityLifecycleCallbacks(f39008a);
                application.registerComponentCallbacks(f39008a);
                f39008a.f39012e = true;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo38329a(boolean z) {
        if (!this.f39010c.get()) {
            if (!C15333p.m44595b()) {
                return true;
            }
            RunningAppProcessInfo runningAppProcessInfo = new RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f39010c.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f39009b.set(true);
            }
        }
        return m43756b();
    }

    /* renamed from: b */
    private boolean m43756b() {
        return this.f39009b.get();
    }

    /* renamed from: a */
    public final void mo38328a(C15077a aVar) {
        synchronized (f39008a) {
            this.f39011d.add(aVar);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f39009b.compareAndSet(true, false);
        this.f39010c.set(true);
        if (compareAndSet) {
            m43755b(false);
        }
    }

    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f39009b.compareAndSet(true, false);
        this.f39010c.set(true);
        if (compareAndSet) {
            m43755b(false);
        }
    }

    public final void onTrimMemory(int i) {
        if (i == 20 && this.f39009b.compareAndSet(false, true)) {
            this.f39010c.set(true);
            m43755b(true);
        }
    }

    /* renamed from: b */
    private final void m43755b(boolean z) {
        synchronized (f39008a) {
            ArrayList arrayList = this.f39011d;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((C15077a) obj).mo38327a(z);
            }
        }
    }
}
