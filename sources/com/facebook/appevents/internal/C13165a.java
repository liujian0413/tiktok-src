package com.facebook.appevents.internal;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import com.facebook.C13499h;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.codeless.C13127b;
import com.facebook.internal.C13924n;
import com.facebook.internal.C13926o;
import com.facebook.internal.C13949t;
import com.facebook.internal.C13967z;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FeatureManager.C13860a;
import com.facebook.internal.FeatureManager.Feature;
import java.util.UUID;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.appevents.internal.a */
public class C13165a {

    /* renamed from: a */
    public static final String f34879a = C13165a.class.getCanonicalName();

    /* renamed from: b */
    public static final ScheduledExecutorService f34880b = C13172b.m38491a();

    /* renamed from: c */
    public static volatile ScheduledFuture f34881c;

    /* renamed from: d */
    public static final Object f34882d = new Object();

    /* renamed from: e */
    public static AtomicInteger f34883e = new AtomicInteger(0);

    /* renamed from: f */
    public static volatile C13184h f34884f;

    /* renamed from: g */
    public static String f34885g;

    /* renamed from: h */
    public static long f34886h;

    /* renamed from: i */
    public static int f34887i = 0;

    /* renamed from: j */
    private static AtomicBoolean f34888j = new AtomicBoolean(false);

    /* renamed from: a */
    public static boolean m38483a() {
        if (f34887i == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static UUID m38484b() {
        if (f34884f != null) {
            return f34884f.f34925e;
        }
        return null;
    }

    /* renamed from: c */
    public static int m38486c() {
        C13924n a = C13926o.m41097a(C13499h.m39725k());
        if (a == null) {
            return 60;
        }
        return a.f36840d;
    }

    /* renamed from: d */
    private static void m38488d() {
        synchronized (f34882d) {
            if (f34881c != null) {
                f34881c.cancel(false);
            }
            f34881c = null;
        }
    }

    /* renamed from: d */
    public static void m38489d(Activity activity) {
        C13127b.m38386c(activity);
    }

    /* renamed from: a */
    public static void m38481a(Activity activity) {
        f34880b.execute(new Runnable() {
            public final void run() {
                if (C13165a.f34884f == null) {
                    C13165a.f34884f = C13184h.m38529a();
                }
            }
        });
    }

    /* renamed from: b */
    public static void m38485b(Activity activity) {
        f34883e.incrementAndGet();
        m38488d();
        final long currentTimeMillis = System.currentTimeMillis();
        f34886h = currentTimeMillis;
        final String c = C13967z.m41261c((Context) activity);
        C13127b.m38380a(activity);
        f34880b.execute(new Runnable() {
            public final void run() {
                if (C13165a.f34884f == null) {
                    C13165a.f34884f = new C13184h(Long.valueOf(currentTimeMillis), null);
                    C13185i.m38538a(c, (C13186j) null, C13165a.f34885g);
                } else if (C13165a.f34884f.f34922b != null) {
                    long longValue = currentTimeMillis - C13165a.f34884f.f34922b.longValue();
                    if (longValue > ((long) (C13165a.m38486c() * 1000))) {
                        C13185i.m38537a(c, C13165a.f34884f, C13165a.f34885g);
                        C13185i.m38538a(c, (C13186j) null, C13165a.f34885g);
                        C13165a.f34884f = new C13184h(Long.valueOf(currentTimeMillis), null);
                    } else if (longValue > 1000) {
                        C13165a.f34884f.mo32358c();
                    }
                }
                C13165a.f34884f.f34922b = Long.valueOf(currentTimeMillis);
                C13165a.f34884f.mo32361f();
            }
        });
    }

    /* renamed from: c */
    public static void m38487c(Activity activity) {
        if (f34883e.decrementAndGet() < 0) {
            f34883e.set(0);
        }
        m38488d();
        final long currentTimeMillis = System.currentTimeMillis();
        final String c = C13967z.m41261c((Context) activity);
        C13127b.m38384b(activity);
        f34880b.execute(new Runnable() {
            public final void run() {
                if (C13165a.f34884f == null) {
                    C13165a.f34884f = new C13184h(Long.valueOf(currentTimeMillis), null);
                }
                C13165a.f34884f.f34922b = Long.valueOf(currentTimeMillis);
                if (C13165a.f34883e.get() <= 0) {
                    C131711 r0 = new Runnable() {
                        public final void run() {
                            if (C13165a.f34883e.get() <= 0) {
                                C13185i.m38537a(c, C13165a.f34884f, C13165a.f34885g);
                                C13184h.m38530b();
                                C13165a.f34884f = null;
                            }
                            synchronized (C13165a.f34882d) {
                                C13165a.f34881c = null;
                            }
                        }
                    };
                    synchronized (C13165a.f34882d) {
                        C13165a.f34881c = C13165a.f34880b.schedule(r0, (long) C13165a.m38486c(), TimeUnit.SECONDS);
                    }
                }
                long j = C13165a.f34886h;
                long j2 = 0;
                if (j > 0) {
                    j2 = (currentTimeMillis - j) / 1000;
                }
                C13174d.m38499a(c, j2);
                C13165a.f34884f.mo32361f();
            }
        });
    }

    /* renamed from: a */
    public static void m38482a(Application application, String str) {
        if (f34888j.compareAndSet(false, true)) {
            FeatureManager.m40932a(Feature.CodelessEvents, new C13860a() {
                /* renamed from: a */
                public final void mo31778a(boolean z) {
                    if (z) {
                        C13127b.m38379a();
                    } else {
                        C13127b.m38383b();
                    }
                }
            });
            f34885g = str;
            application.registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {
                public final void onActivityDestroyed(Activity activity) {
                    C13949t.m41130a(LoggingBehavior.APP_EVENTS, C13165a.f34879a, "onActivityDestroyed");
                    C13165a.m38489d(activity);
                }

                public final void onActivityPaused(Activity activity) {
                    C13949t.m41130a(LoggingBehavior.APP_EVENTS, C13165a.f34879a, "onActivityPaused");
                    C13165a.m38487c(activity);
                }

                public final void onActivityResumed(Activity activity) {
                    C13949t.m41130a(LoggingBehavior.APP_EVENTS, C13165a.f34879a, "onActivityResumed");
                    C13165a.m38485b(activity);
                }

                public final void onActivityStarted(Activity activity) {
                    C13165a.f34887i++;
                    C13949t.m41130a(LoggingBehavior.APP_EVENTS, C13165a.f34879a, "onActivityStarted");
                }

                public final void onActivityStopped(Activity activity) {
                    C13949t.m41130a(LoggingBehavior.APP_EVENTS, C13165a.f34879a, "onActivityStopped");
                    AppEventsLogger.m38361c();
                    C13165a.f34887i--;
                }

                public final void onActivityCreated(Activity activity, Bundle bundle) {
                    C13949t.m41130a(LoggingBehavior.APP_EVENTS, C13165a.f34879a, "onActivityCreated");
                    C13165a.m38481a(activity);
                }

                public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    C13949t.m41130a(LoggingBehavior.APP_EVENTS, C13165a.f34879a, "onActivitySaveInstanceState");
                }
            });
        }
    }
}
