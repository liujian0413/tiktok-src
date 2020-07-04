package com.bytedance.ies.ugc.appcontext;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;
import p346io.reactivex.p354j.C7486b;

/* renamed from: com.bytedance.ies.ugc.appcontext.d */
public final class C6405d {

    /* renamed from: a */
    public static final C6405d f18733a = new C6405d();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final C7486b<C6406a> f18734b = C7486b.m23223a();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final C7486b<Activity> f18735c = C7486b.m23223a();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final C7486b<Activity> f18736d = C7486b.m23223a();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final C7486b<Activity> f18737e = C7486b.m23223a();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C7486b<Activity> f18738f = C7486b.m23223a();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C7486b<Activity> f18739g = C7486b.m23223a();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C7486b<C6406a> f18740h = C7486b.m23223a();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final C7486b<Boolean> f18741i = C7486b.m23223a();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final C7486b<Application> f18742j = C7486b.m23223a();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static volatile boolean f18743k = true;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static volatile boolean f18744l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static int f18745m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public static volatile long f18746n;

    /* renamed from: o */
    private static C6408c f18747o;

    /* renamed from: p */
    private static WeakReference<Activity> f18748p;

    /* renamed from: com.bytedance.ies.ugc.appcontext.d$a */
    public static final class C6406a {

        /* renamed from: a */
        public final Activity f18749a;

        /* renamed from: b */
        public final Bundle f18750b;

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
            if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f18750b, (java.lang.Object) r3.f18750b) != false) goto L_0x001f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x001f
                boolean r0 = r3 instanceof com.bytedance.ies.ugc.appcontext.C6405d.C6406a
                if (r0 == 0) goto L_0x001d
                com.bytedance.ies.ugc.appcontext.d$a r3 = (com.bytedance.ies.ugc.appcontext.C6405d.C6406a) r3
                android.app.Activity r0 = r2.f18749a
                android.app.Activity r1 = r3.f18749a
                boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
                if (r0 == 0) goto L_0x001d
                android.os.Bundle r0 = r2.f18750b
                android.os.Bundle r3 = r3.f18750b
                boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
                if (r3 == 0) goto L_0x001d
                goto L_0x001f
            L_0x001d:
                r3 = 0
                return r3
            L_0x001f:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.appcontext.C6405d.C6406a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            Activity activity = this.f18749a;
            int i = 0;
            int hashCode = (activity != null ? activity.hashCode() : 0) * 31;
            Bundle bundle = this.f18750b;
            if (bundle != null) {
                i = bundle.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ActivityEvent(activity=");
            sb.append(this.f18749a);
            sb.append(", bundle=");
            sb.append(this.f18750b);
            sb.append(")");
            return sb.toString();
        }

        public C6406a(Activity activity, Bundle bundle) {
            this.f18749a = activity;
            this.f18750b = bundle;
        }
    }

    /* renamed from: com.bytedance.ies.ugc.appcontext.d$b */
    public interface C6407b {
    }

    /* renamed from: com.bytedance.ies.ugc.appcontext.d$c */
    public interface C6408c {
        /* renamed from: a */
        boolean mo15349a(Activity activity);
    }

    /* renamed from: com.bytedance.ies.ugc.appcontext.d$d */
    public static final class C6409d implements ActivityLifecycleCallbacks {

        /* renamed from: a */
        final /* synthetic */ Application f18751a;

        C6409d(Application application) {
            this.f18751a = application;
        }

        public final void onActivityDestroyed(Activity activity) {
            if (activity instanceof C6407b) {
                C6405d.f18744l = false;
            }
            C6405d.f18739g.onNext(activity);
            if (C6405d.f18745m == 0) {
                C6405d.f18742j.onNext(this.f18751a);
            }
        }

        public final void onActivityPaused(Activity activity) {
            if (C6405d.m19965a() != null) {
                C6408c a = C6405d.m19965a();
                if (a == null) {
                    C7573i.m23580a();
                }
                if (a.mo15349a(activity)) {
                    C6405d.m19967a((Activity) null);
                }
            }
            C6405d.f18737e.onNext(activity);
        }

        public final void onActivityResumed(Activity activity) {
            if (C6405d.m19965a() != null) {
                C6408c a = C6405d.m19965a();
                if (a == null) {
                    C7573i.m23580a();
                }
                if (a.mo15349a(activity)) {
                    C6405d.m19967a(activity);
                }
            }
            C6405d.f18736d.onNext(activity);
        }

        public final void onActivityStarted(Activity activity) {
            C6405d dVar = C6405d.f18733a;
            C6405d.f18745m = C6405d.f18745m + 1;
            if (C6405d.f18745m == 1) {
                C6405d.f18743k = false;
                C6405d.f18741i.onNext(Boolean.valueOf(C6405d.f18743k));
            }
            C6405d.f18735c.onNext(activity);
        }

        public final void onActivityStopped(Activity activity) {
            C6405d dVar = C6405d.f18733a;
            C6405d.f18745m = C6405d.f18745m - 1;
            if (C6405d.f18745m == 0) {
                C6405d.f18743k = true;
                C6405d.f18746n = System.currentTimeMillis();
                C6405d.f18741i.onNext(Boolean.valueOf(C6405d.f18743k));
            }
            C6405d.f18738f.onNext(activity);
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            C6405d.f18740h.onNext(new C6406a(activity, bundle));
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof C6407b) {
                C6405d.f18744l = true;
            }
            C6405d.f18734b.onNext(new C6406a(activity, bundle));
        }
    }

    private C6405d() {
    }

    /* renamed from: a */
    public static C6408c m19965a() {
        return f18747o;
    }

    /* renamed from: h */
    public static boolean m19987h() {
        return f18743k;
    }

    /* renamed from: b */
    public static C7492s<Activity> m19974b() {
        C7492s<Activity> i = f18736d.mo19330i();
        C7573i.m23582a((Object) i, "activityResumedSubject.share()");
        return i;
    }

    /* renamed from: c */
    public static C7492s<Activity> m19976c() {
        C7492s<Activity> i = f18737e.mo19330i();
        C7573i.m23582a((Object) i, "activityPausedSubject.share()");
        return i;
    }

    /* renamed from: d */
    public static C7492s<Activity> m19979d() {
        C7492s<Activity> i = f18738f.mo19330i();
        C7573i.m23582a((Object) i, "activityStoppedSubject.share()");
        return i;
    }

    /* renamed from: e */
    public static C7492s<Boolean> m19981e() {
        C7492s<Boolean> i = f18741i.mo19330i();
        C7573i.m23582a((Object) i, "appEnterBackgroundSubject.share()");
        return i;
    }

    /* renamed from: f */
    public static C7492s<Application> m19983f() {
        C7492s<Application> i = f18742j.mo19330i();
        C7573i.m23582a((Object) i, "appQuitSubject.share()");
        return i;
    }

    /* renamed from: g */
    public static Activity m19984g() {
        WeakReference<Activity> weakReference = f18748p;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    /* renamed from: a */
    public static void m19967a(Activity activity) {
        if (activity == null) {
            f18748p = null;
        } else {
            f18748p = new WeakReference<>(activity);
        }
    }

    /* renamed from: a */
    public static void m19968a(Application application) {
        C7573i.m23587b(application, "app");
        application.registerActivityLifecycleCallbacks(new C6409d(application));
    }

    /* renamed from: a */
    public static void m19969a(C6408c cVar) {
        f18747o = cVar;
    }
}
