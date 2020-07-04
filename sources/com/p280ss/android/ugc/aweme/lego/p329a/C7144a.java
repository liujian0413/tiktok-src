package com.p280ss.android.ugc.aweme.lego.p329a;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import com.p280ss.android.ugc.aweme.lego.C7153e;
import com.p280ss.android.ugc.aweme.lego.LegoInflate;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Ref.ObjectRef;

/* renamed from: com.ss.android.ugc.aweme.lego.a.a */
public final class C7144a {

    /* renamed from: a */
    public final Map<Class<? extends Activity>, WeakReference<Activity>> f20041a = new HashMap();

    /* renamed from: b */
    private Context f20042b;

    /* renamed from: c */
    private final Map<Class<? extends LegoInflate>, LegoInflate> f20043c = new ConcurrentHashMap();

    /* renamed from: d */
    private final Map<Class<? extends LegoInflate>, LegoInflate> f20044d = new ConcurrentHashMap();

    /* renamed from: com.ss.android.ugc.aweme.lego.a.a$a */
    final class C7145a implements ActivityLifecycleCallbacks {
        public final void onActivityPaused(Activity activity) {
        }

        public final void onActivityResumed(Activity activity) {
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public final void onActivityStarted(Activity activity) {
        }

        public final void onActivityStopped(Activity activity) {
        }

        public C7145a() {
        }

        public final void onActivityDestroyed(Activity activity) {
            if (activity != null) {
                C7144a.this.f20041a.remove(activity.getClass());
            }
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity != null) {
                C7144a.this.f20041a.put(activity.getClass(), new WeakReference(activity));
            }
        }
    }

    /* renamed from: b */
    public final boolean mo18576b(Class<? extends LegoInflate> cls) {
        C7573i.m23587b(cls, "name");
        return this.f20043c.containsKey(cls);
    }

    /* renamed from: a */
    public final void mo18573a(Activity activity) {
        C7573i.m23587b(activity, "activity");
        this.f20041a.put(activity.getClass(), new WeakReference(activity));
    }

    /* renamed from: a */
    public final <T> T mo18572a(Class<? extends LegoInflate> cls) {
        C7573i.m23587b(cls, "name");
        ObjectRef objectRef = new ObjectRef();
        synchronized (this.f20043c) {
            objectRef.element = (LegoInflate) this.f20043c.get(cls);
        }
        if (((LegoInflate) objectRef.element) == null) {
            objectRef.element = mo18577c(cls);
        }
        return (Object) ((LegoInflate) objectRef.element);
    }

    /* renamed from: a */
    public final void mo18574a(Context context) {
        C7573i.m23587b(context, "context");
        this.f20042b = context;
        ((Application) context).registerActivityLifecycleCallbacks(new C7145a());
    }

    /* renamed from: c */
    public final LegoInflate mo18577c(Class<? extends LegoInflate> cls) {
        LegoInflate legoInflate;
        C7573i.m23587b(cls, "name");
        Object obj = this.f20044d.get(cls);
        if (obj == null) {
            C7573i.m23580a();
        }
        LegoInflate legoInflate2 = (LegoInflate) obj;
        synchronized (legoInflate2) {
            if (!this.f20043c.containsKey(cls)) {
                Context context = this.f20042b;
                if (context == null) {
                    C7573i.m23583a("context");
                }
                if (legoInflate2.theme() != 0) {
                    Context context2 = this.f20042b;
                    if (context2 == null) {
                        C7573i.m23583a("context");
                    }
                    context = new ContextThemeWrapper(context2, legoInflate2.theme());
                }
                WeakReference weakReference = (WeakReference) this.f20041a.get(legoInflate2.activity());
                Activity activity = null;
                if (weakReference != null) {
                    activity = (Activity) weakReference.get();
                }
                StringBuilder sb = new StringBuilder("inflate_");
                sb.append(legoInflate2.getClass().getSimpleName());
                String sb2 = sb.toString();
                C7153e a = C7121a.m22242a();
                if (a != null) {
                    a.mo16891a(sb2);
                }
                legoInflate2.inflate(context, activity);
                C7153e a2 = C7121a.m22242a();
                if (a2 != null) {
                    a2.mo16892b(sb2);
                }
                synchronized (this.f20043c) {
                    this.f20043c.put(cls, legoInflate2);
                }
            }
            Object obj2 = this.f20043c.get(cls);
            if (obj2 == null) {
                C7573i.m23580a();
            }
            legoInflate = (LegoInflate) obj2;
        }
        return legoInflate;
    }

    /* renamed from: a */
    public final void mo18575a(Class<? extends LegoInflate> cls, LegoInflate legoInflate) {
        C7573i.m23587b(cls, "name");
        C7573i.m23587b(legoInflate, "inflate");
        if (!this.f20044d.containsKey(cls)) {
            this.f20044d.put(cls, legoInflate);
        }
    }
}
