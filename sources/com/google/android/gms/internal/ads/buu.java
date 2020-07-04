package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.ads.internal.C14793ay;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class buu implements ActivityLifecycleCallbacks {

    /* renamed from: a */
    public Activity f43653a;

    /* renamed from: b */
    public Context f43654b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Object f43655c = new Object();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f43656d = true;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f43657e = false;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final List<buw> f43658f = new ArrayList();

    /* renamed from: g */
    private final List<bvj> f43659g = new ArrayList();

    /* renamed from: h */
    private Runnable f43660h;

    /* renamed from: i */
    private boolean f43661i = false;

    /* renamed from: j */
    private long f43662j;

    buu() {
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    /* renamed from: a */
    public final void mo41364a(Application application, Context context) {
        if (!this.f43661i) {
            application.registerActivityLifecycleCallbacks(this);
            if (context instanceof Activity) {
                m50133a((Activity) context);
            }
            this.f43654b = application;
            this.f43662j = ((Long) bym.m50299d().mo41272a(C15585bw.f43756aC)).longValue();
            this.f43661i = true;
        }
    }

    /* renamed from: a */
    public final void mo41365a(buw buw) {
        synchronized (this.f43655c) {
            this.f43658f.add(buw);
        }
    }

    public final void onActivityStarted(Activity activity) {
        m50133a(activity);
    }

    public final void onActivityResumed(Activity activity) {
        m50133a(activity);
        this.f43657e = false;
        boolean z = !this.f43656d;
        this.f43656d = true;
        if (this.f43660h != null) {
            acl.f40003a.removeCallbacks(this.f43660h);
        }
        synchronized (this.f43655c) {
            Iterator it = this.f43659g.iterator();
            while (it.hasNext()) {
                it.next();
            }
            if (z) {
                for (buw a : this.f43658f) {
                    try {
                        a.mo39125a(true);
                    } catch (Exception e) {
                        afm.m45778b("", e);
                    }
                }
            } else {
                acd.m45777b("App is still foreground.");
            }
        }
    }

    public final void onActivityPaused(Activity activity) {
        m50133a(activity);
        synchronized (this.f43655c) {
            Iterator it = this.f43659g.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        this.f43657e = true;
        if (this.f43660h != null) {
            acl.f40003a.removeCallbacks(this.f43660h);
        }
        Handler handler = acl.f40003a;
        buv buv = new buv(this);
        this.f43660h = buv;
        handler.postDelayed(buv, this.f43662j);
    }

    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.f43655c) {
            if (this.f43653a != null) {
                if (this.f43653a.equals(activity)) {
                    this.f43653a = null;
                }
                Iterator it = this.f43659g.iterator();
                while (it.hasNext()) {
                    try {
                        if (((bvj) it.next()).mo41390a(activity)) {
                            it.remove();
                        }
                    } catch (Exception e) {
                        C14793ay.m42898d().mo39089a((Throwable) e, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                        afm.m45778b("", e);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private final void m50133a(Activity activity) {
        synchronized (this.f43655c) {
            if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                this.f43653a = activity;
            }
        }
    }
}
