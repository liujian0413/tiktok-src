package com.p280ss.android.ugc.aweme.port.p1479in;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.common.base.C17440n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.ss.android.ugc.aweme.port.in.j */
final class C35572j {

    /* renamed from: a */
    public boolean f93274a;

    /* renamed from: b */
    public final Set<Activity> f93275b = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: c */
    public int f93276c = 2;

    /* renamed from: d */
    public int f93277d = 0;

    /* renamed from: e */
    public int f93278e = 0;

    /* renamed from: f */
    private final List<Object> f93279f = new ArrayList();

    /* renamed from: g */
    private final List<Object> f93280g = new ArrayList();

    /* renamed from: a */
    public final void mo90383a(int i) {
        this.f93276c = i;
        Iterator it = this.f93279f.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public C35572j(Application application) {
        application.registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {
            public final void onActivityPaused(Activity activity) {
            }

            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            public final void onActivityResumed(Activity activity) {
                C35572j.this.mo90384a(C35571i.m114853c(activity));
            }

            public final void onActivityStarted(Activity activity) {
                C35572j.this.f93278e++;
                if (C35572j.this.f93278e == 1) {
                    C35572j.this.mo90383a(1);
                }
                C35572j.this.mo90384a(C35571i.m114852b(activity));
            }

            public final void onActivityStopped(Activity activity) {
                C35572j.this.f93278e--;
                if (C35572j.this.f93278e == 0) {
                    C35572j.this.mo90383a(2);
                }
            }

            public final void onActivityDestroyed(Activity activity) {
                C35572j.this.f93277d--;
                C35572j.this.mo90384a(C35571i.m114854d(activity));
                C35572j.this.f93275b.remove(activity);
                if (TextUtils.equals(activity.getClass().getSimpleName(), "LivePlayActivity")) {
                    C35572j.this.f93274a = false;
                }
            }

            public final void onActivityCreated(Activity activity, Bundle bundle) {
                C35572j.this.f93277d++;
                C35572j.this.mo90384a(C35571i.m114851a(activity));
                C35572j.this.f93275b.add(activity);
                if (TextUtils.equals(activity.getClass().getSimpleName(), "LivePlayActivity")) {
                    C35572j.this.f93274a = true;
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo90384a(C35571i iVar) {
        Iterator it = this.f93280g.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: a */
    public final void mo90385a(Class<?> cls) {
        for (Activity activity : this.f93275b) {
            if (cls.isInstance(activity)) {
                activity.finish();
            }
        }
    }

    /* renamed from: a */
    public final boolean mo90386a(C17440n<Activity> nVar) {
        for (Activity apply : this.f93275b) {
            if (nVar.apply(apply)) {
                return true;
            }
        }
        return false;
    }
}
