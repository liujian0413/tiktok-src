package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.C15137e;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.util.C15322e;
import com.google.android.gms.common.util.C15325h;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.DynamiteModule.LoadingException;
import com.google.android.gms.measurement.p765a.C16799a;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.measurement.cr */
public class C16452cr {

    /* renamed from: d */
    private static volatile C16452cr f46016d;

    /* renamed from: a */
    protected final C15322e f46017a;

    /* renamed from: b */
    public final C16799a f46018b;

    /* renamed from: c */
    public String f46019c;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final String f46020e;

    /* renamed from: f */
    private final ExecutorService f46021f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Map<Object, Object> f46022g;

    /* renamed from: h */
    private int f46023h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f46024i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C16440cf f46025j;

    /* renamed from: com.google.android.gms.internal.measurement.cr$a */
    class C16453a extends C16444cj {

        /* renamed from: a */
        private final AtomicReference<Bundle> f46026a = new AtomicReference<>();

        /* renamed from: b */
        private boolean f46027b;

        C16453a() {
        }

        /* renamed from: a */
        public final void mo42616a(Bundle bundle) {
            synchronized (this.f46026a) {
                try {
                    this.f46026a.set(bundle);
                    this.f46027b = true;
                    this.f46026a.notify();
                } catch (Throwable th) {
                    this.f46026a.notify();
                    throw th;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final String mo42638a(long j) {
            return (String) mo42637a(mo42639b(j), String.class);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final Bundle mo42639b(long j) {
            Bundle bundle;
            synchronized (this.f46026a) {
                if (!this.f46027b) {
                    try {
                        this.f46026a.wait(j);
                    } catch (InterruptedException unused) {
                        return null;
                    }
                }
                bundle = (Bundle) this.f46026a.get();
            }
            return bundle;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final <T> T mo42637a(Bundle bundle, Class<T> cls) {
            if (bundle == null) {
                return null;
            }
            Object obj = bundle.get("r");
            if (obj == null) {
                return null;
            }
            try {
                return cls.cast(obj);
            } catch (ClassCastException e) {
                C16452cr.this.mo42624a(5, "Unexpected object type. Expected, Received", (Object) cls.getCanonicalName(), (Object) obj.getClass().getCanonicalName(), (Object) e);
                throw e;
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.cr$b */
    abstract class C16454b implements Runnable {

        /* renamed from: a */
        final long f46029a;

        /* renamed from: b */
        final long f46030b;

        /* renamed from: c */
        private final boolean f46031c;

        C16454b(C16452cr crVar) {
            this(true);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo42640a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public abstract void mo42641b() throws RemoteException;

        C16454b(boolean z) {
            this.f46029a = C16452cr.this.f46017a.mo38684a();
            this.f46030b = C16452cr.this.f46017a.mo38685b();
            this.f46031c = z;
        }

        public void run() {
            if (C16452cr.this.f46024i) {
                mo42640a();
                return;
            }
            try {
                mo42641b();
            } catch (Exception e) {
                C16452cr.this.m53657a(e, false, this.f46031c);
                mo42640a();
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.cr$c */
    class C16455c implements ActivityLifecycleCallbacks {
        C16455c() {
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            C16452cr.this.m53654a((C16454b) new C16475dk(this, activity, bundle));
        }

        public final void onActivityStarted(Activity activity) {
            C16452cr.this.m53654a((C16454b) new C16476dl(this, activity));
        }

        public final void onActivityResumed(Activity activity) {
            C16452cr.this.m53654a((C16454b) new C16477dm(this, activity));
        }

        public final void onActivityPaused(Activity activity) {
            C16452cr.this.m53654a((C16454b) new C16479do(this, activity));
        }

        public final void onActivityStopped(Activity activity) {
            C16452cr.this.m53654a((C16454b) new C16480dp(this, activity));
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            C16453a aVar = new C16453a();
            C16452cr.this.m53654a((C16454b) new C16481dq(this, activity, aVar));
            Bundle b = aVar.mo42639b(50);
            if (b != null) {
                bundle.putAll(b);
            }
        }

        public final void onActivityDestroyed(Activity activity) {
            C16452cr.this.m53654a((C16454b) new C16482dr(this, activity));
        }
    }

    /* renamed from: a */
    public static C16452cr m53652a(Context context, String str, String str2, String str3, Bundle bundle) {
        C15267r.m44384a(context);
        if (f46016d == null) {
            synchronized (C16452cr.class) {
                if (f46016d == null) {
                    C16452cr crVar = new C16452cr(context, str, str2, str3, bundle);
                    f46016d = crVar;
                }
            }
        }
        return f46016d;
    }

    private C16452cr(Context context, String str, String str2, String str3, Bundle bundle) {
        if (str == null || !m53663b(str2, str3)) {
            this.f46020e = "FA";
        } else {
            this.f46020e = str;
        }
        this.f46017a = C15325h.m44574d();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue());
        this.f46021f = threadPoolExecutor;
        Application application = (Application) context.getApplicationContext();
        if (application != null) {
            application.registerActivityLifecycleCallbacks(new C16455c());
        }
        this.f46018b = new C16799a(this);
        boolean z = false;
        if (!(!m53666d(context) || m53669f())) {
            this.f46019c = null;
            this.f46024i = true;
            return;
        }
        if (!m53663b(str2, str3)) {
            this.f46019c = "fa";
            if (str2 == null || str3 == null) {
                boolean z2 = str2 == null;
                if (str3 == null) {
                    z = true;
                }
                boolean z3 = z2 ^ z;
            } else {
                this.f46024i = true;
                return;
            }
        } else {
            this.f46019c = str2;
        }
        C16456cs csVar = new C16456cs(this, context, str2, str3, bundle);
        m53654a((C16454b) csVar);
    }

    /* renamed from: d */
    private static boolean m53666d(Context context) {
        try {
            C15137e.m44035a(context);
            if (C15137e.m44037a() != null) {
                return true;
            }
            return false;
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m53663b(String str, String str2) {
        return (str2 == null || str == null || m53669f()) ? false : true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m53654a(C16454b bVar) {
        this.f46021f.execute(bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C16440cf mo42620a(Context context) {
        try {
            return C16441cg.m53608a(DynamiteModule.m44685a(context, DynamiteModule.f39650d, "com.google.android.gms.measurement.dynamite").mo38718a("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (LoadingException e) {
            m53657a((Exception) e, true, false);
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static int m53667e(Context context) {
        return DynamiteModule.m44690b(context, "com.google.android.gms.measurement.dynamite");
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static int m53668f(Context context) {
        return DynamiteModule.m44682a(context, "com.google.android.gms.measurement.dynamite");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m53657a(Exception exc, boolean z, boolean z2) {
        this.f46024i |= z;
        if (!z) {
            String str = "Error with data collection. Data lost.";
            if (z2) {
                mo42624a(5, str, (Object) exc, (Object) null, (Object) null);
            }
        }
    }

    /* renamed from: f */
    private static boolean m53669f() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final void mo42628a(String str, String str2, Bundle bundle) {
        m53658a(str, str2, bundle, true, true, null);
    }

    /* renamed from: a */
    private final void m53658a(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l) {
        C16472dh dhVar = new C16472dh(this, null, str, str2, bundle, true, true);
        m53654a((C16454b) dhVar);
    }

    /* renamed from: a */
    public final void mo42629a(String str, String str2, Object obj, boolean z) {
        C16473di diVar = new C16473di(this, str, str2, obj, true);
        m53654a((C16454b) diVar);
    }

    /* renamed from: a */
    public final void mo42626a(Bundle bundle) {
        m53654a((C16454b) new C16474dj(this, bundle));
    }

    /* renamed from: b */
    public final void mo42632b(String str, String str2, Bundle bundle) {
        m53654a((C16454b) new C16457ct(this, str, str2, bundle));
    }

    /* renamed from: a */
    public final List<Bundle> mo42622a(String str, String str2) {
        C16453a aVar = new C16453a();
        m53654a((C16454b) new C16458cu(this, str, str2, aVar));
        List<Bundle> list = (List) aVar.mo42637a(aVar.mo42639b(DouPlusShareGuideExperiment.MIN_VALID_DURATION), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: a */
    public final void mo42625a(Activity activity, String str, String str2) {
        m53654a((C16454b) new C16459cv(this, activity, str, str2));
    }

    /* renamed from: a */
    public final void mo42627a(String str) {
        m53654a((C16454b) new C16460cw(this, str));
    }

    /* renamed from: b */
    public final void mo42631b(String str) {
        m53654a((C16454b) new C16461cx(this, str));
    }

    /* renamed from: a */
    public final String mo42621a() {
        C16453a aVar = new C16453a();
        m53654a((C16454b) new C16462cy(this, aVar));
        return aVar.mo42638a(500);
    }

    /* renamed from: b */
    public final String mo42630b() {
        C16453a aVar = new C16453a();
        m53654a((C16454b) new C16463cz(this, aVar));
        return aVar.mo42638a(50);
    }

    /* renamed from: c */
    public final long mo42634c() {
        C16453a aVar = new C16453a();
        m53654a((C16454b) new C16465da(this, aVar));
        Long l = (Long) aVar.mo42637a(aVar.mo42639b(500), Long.class);
        if (l != null) {
            return l.longValue();
        }
        long nextLong = new Random(System.nanoTime() ^ this.f46017a.mo38684a()).nextLong();
        int i = this.f46023h + 1;
        this.f46023h = i;
        return nextLong + ((long) i);
    }

    /* renamed from: d */
    public final String mo42635d() {
        C16453a aVar = new C16453a();
        m53654a((C16454b) new C16466db(this, aVar));
        return aVar.mo42638a(500);
    }

    /* renamed from: e */
    public final String mo42636e() {
        C16453a aVar = new C16453a();
        m53654a((C16454b) new C16467dc(this, aVar));
        return aVar.mo42638a(500);
    }

    /* renamed from: a */
    public final Map<String, Object> mo42623a(String str, String str2, boolean z) {
        C16453a aVar = new C16453a();
        C16468dd ddVar = new C16468dd(this, str, str2, z, aVar);
        m53654a((C16454b) ddVar);
        Bundle b = aVar.mo42639b(DouPlusShareGuideExperiment.MIN_VALID_DURATION);
        if (b == null || b.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(b.size());
        for (String str3 : b.keySet()) {
            Object obj = b.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public final void mo42624a(int i, String str, Object obj, Object obj2, Object obj3) {
        C16469de deVar = new C16469de(this, false, 5, str, obj, obj2, obj3);
        m53654a((C16454b) deVar);
    }

    /* renamed from: a */
    public final Bundle mo42619a(Bundle bundle, boolean z) {
        C16453a aVar = new C16453a();
        m53654a((C16454b) new C16470df(this, bundle, aVar));
        if (z) {
            return aVar.mo42639b(DouPlusShareGuideExperiment.MIN_VALID_DURATION);
        }
        return null;
    }

    /* renamed from: c */
    public final int mo42633c(String str) {
        C16453a aVar = new C16453a();
        m53654a((C16454b) new C16471dg(this, str, aVar));
        Integer num = (Integer) aVar.mo42637a(aVar.mo42639b(10000), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }
}
