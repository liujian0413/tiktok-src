package com.bytedance.common.p478b;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import android.os.Message;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/* renamed from: com.bytedance.common.b.a */
public final class C9680a extends Observable implements ActivityLifecycleCallbacks, C6310a {

    /* renamed from: b */
    private static C9680a f26415b = null;

    /* renamed from: e */
    private static int f26416e = 0;

    /* renamed from: f */
    private static boolean f26417f = true;

    /* renamed from: a */
    public boolean f26418a;

    /* renamed from: c */
    private WeakReference<Activity> f26419c;

    /* renamed from: d */
    private Runnable f26420d = new Runnable() {
        public final void run() {
            if (C9680a.this.f26418a) {
                C9680a.this.f26418a = false;
            }
        }
    };

    /* renamed from: g */
    private C6309f f26421g = new C6309f(this);

    /* renamed from: h */
    private final List<ActivityLifecycleCallbacks> f26422h = new ArrayList();

    /* renamed from: b */
    public static boolean m28604b() {
        return f26417f;
    }

    private C9680a() {
    }

    /* renamed from: a */
    public static synchronized C9680a m28603a() {
        C9680a aVar;
        synchronized (C9680a.class) {
            if (f26415b == null) {
                f26415b = new C9680a();
            }
            aVar = f26415b;
        }
        return aVar;
    }

    /* renamed from: c */
    private Object[] m28605c() {
        Object[] objArr;
        synchronized (this.f26422h) {
            if (this.f26422h.size() > 0) {
                objArr = this.f26422h.toArray();
            } else {
                objArr = null;
            }
        }
        return objArr;
    }

    public final void handleMsg(Message message) {
        if (message.what == 1 && f26417f) {
            setChanged();
            notifyObservers(Boolean.valueOf(f26417f));
        }
    }

    public final void onActivityDestroyed(Activity activity) {
        Object[] c = m28605c();
        if (c != null) {
            for (Object obj : c) {
                ((ActivityLifecycleCallbacks) obj).onActivityDestroyed(activity);
            }
        }
    }

    public final void onActivityPaused(Activity activity) {
        if (this.f26418a) {
            this.f26421g.postDelayed(this.f26420d, 30000);
        }
        Object[] c = m28605c();
        if (c != null) {
            for (Object obj : c) {
                ((ActivityLifecycleCallbacks) obj).onActivityPaused(activity);
            }
        }
    }

    public final void onActivityResumed(Activity activity) {
        this.f26419c = new WeakReference<>(activity);
        if (!this.f26418a) {
            this.f26418a = true;
        }
        this.f26421g.removeCallbacks(this.f26420d);
        Object[] c = m28605c();
        if (c != null) {
            for (Object obj : c) {
                ((ActivityLifecycleCallbacks) obj).onActivityResumed(activity);
            }
        }
    }

    public final void onActivityStarted(Activity activity) {
        Object[] c = m28605c();
        if (c != null) {
            for (Object obj : c) {
                ((ActivityLifecycleCallbacks) obj).onActivityStarted(activity);
            }
        }
        this.f26421g.removeMessages(1);
        if (f26416e == 0) {
            f26417f = false;
        }
        f26416e++;
    }

    public final void onActivityStopped(Activity activity) {
        Object[] c = m28605c();
        if (c != null) {
            for (Object obj : c) {
                ((ActivityLifecycleCallbacks) obj).onActivityStopped(activity);
            }
        }
        int i = f26416e - 1;
        f26416e = i;
        if (i == 0) {
            f26417f = true;
            this.f26421g.sendEmptyMessageDelayed(1, 30000);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        f26417f = false;
        Object[] c = m28605c();
        if (c != null) {
            for (Object obj : c) {
                ((ActivityLifecycleCallbacks) obj).onActivityCreated(activity, bundle);
            }
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Object[] c = m28605c();
        if (c != null) {
            for (Object obj : c) {
                ((ActivityLifecycleCallbacks) obj).onActivitySaveInstanceState(activity, bundle);
            }
        }
    }
}
