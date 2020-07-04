package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.measurement.C14876a;
import com.google.android.gms.common.C15181e;
import java.lang.reflect.Method;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

@C6505uv
public final class aal {

    /* renamed from: a */
    private final AtomicReference<ThreadPoolExecutor> f39808a = new AtomicReference<>(null);

    /* renamed from: b */
    private final Object f39809b = new Object();

    /* renamed from: c */
    private String f39810c = null;

    /* renamed from: d */
    private String f39811d = null;

    /* renamed from: e */
    private final AtomicBoolean f39812e = new AtomicBoolean(false);

    /* renamed from: f */
    private final AtomicInteger f39813f = new AtomicInteger(-1);

    /* renamed from: g */
    private final AtomicReference<Object> f39814g = new AtomicReference<>(null);

    /* renamed from: h */
    private final AtomicReference<Object> f39815h = new AtomicReference<>(null);

    /* renamed from: i */
    private final ConcurrentMap<String, Method> f39816i = new ConcurrentHashMap(9);

    /* renamed from: j */
    private final AtomicReference<C14876a> f39817j = new AtomicReference<>(null);

    /* renamed from: k */
    private final BlockingQueue<FutureTask<?>> f39818k = new ArrayBlockingQueue(50);

    /* renamed from: a */
    public final void mo39041a(C14876a aVar) {
        synchronized (this.f39817j) {
            if (this.f39817j.get() == null) {
                this.f39817j.set(aVar);
                for (FutureTask futureTask : this.f39818k) {
                    if (!futureTask.isCancelled()) {
                        futureTask.run();
                    }
                }
                this.f39818k.clear();
            }
        }
    }

    /* renamed from: a */
    public final boolean mo39043a(Context context) {
        if (!((Boolean) bym.m50299d().mo41272a(C15585bw.f43785af)).booleanValue() || this.f39812e.get()) {
            return false;
        }
        if (((Boolean) bym.m50299d().mo41272a(C15585bw.f43795ap)).booleanValue()) {
            return true;
        }
        if (this.f39813f.get() == -1) {
            if (afb.m45738c(context, C15181e.f39276b) || !afb.m45737c(context)) {
                this.f39813f.set(1);
            } else {
                acd.m45783e("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                this.f39813f.set(0);
            }
        }
        if (this.f39813f.get() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    private static boolean m45313h(Context context) {
        if (!((Boolean) bym.m50299d().mo41272a(C15585bw.f43792am)).booleanValue()) {
            if (!((Boolean) bym.m50299d().mo41272a(C15585bw.f43793an)).booleanValue()) {
                return false;
            }
        }
        if (!((Boolean) bym.m50299d().mo41272a(C15585bw.f43794ao)).booleanValue()) {
            return true;
        }
        try {
            context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        }
    }

    /* renamed from: a */
    public final void mo39039a(Context context, String str) {
        if (mo39043a(context)) {
            if (m45313h(context)) {
                m45309a("beginAdUnitExposure", (abc) new aam(str));
            } else {
                m45306a(context, str, "beginAdUnitExposure");
            }
        }
    }

    /* renamed from: b */
    public final void mo39045b(Context context, String str) {
        if (mo39043a(context)) {
            if (m45313h(context)) {
                m45309a("endAdUnitExposure", (abc) new aao(str));
            } else {
                m45306a(context, str, "endAdUnitExposure");
            }
        }
    }

    /* renamed from: b */
    public final String mo39044b(Context context) {
        if (!mo39043a(context)) {
            return "";
        }
        if (m45313h(context)) {
            return (String) m45305a("getCurrentScreenNameOrScreenClass", (T) "", aas.f39827a);
        }
        if (!m45310a(context, "com.google.android.gms.measurement.AppMeasurement", this.f39814g, true)) {
            return "";
        }
        try {
            String str = (String) m45315i(context, "getCurrentScreenName").invoke(this.f39814g.get(), new Object[0]);
            if (str == null) {
                str = (String) m45315i(context, "getCurrentScreenClass").invoke(this.f39814g.get(), new Object[0]);
            }
            return str != null ? str : "";
        } catch (Exception e) {
            m45308a(e, "getCurrentScreenName", false);
            return "";
        }
    }

    /* renamed from: c */
    public final void mo39047c(Context context, String str) {
        if (!mo39043a(context) || !(context instanceof Activity)) {
            return;
        }
        if (m45313h(context)) {
            m45309a("setScreenName", (abc) new aat(context, str));
        } else if (m45310a(context, "com.google.firebase.analytics.FirebaseAnalytics", this.f39815h, false)) {
            Method j = m45316j(context, "setCurrentScreen");
            try {
                Activity activity = (Activity) context;
                j.invoke(this.f39815h.get(), new Object[]{activity, str, context.getPackageName()});
            } catch (Exception e) {
                m45308a(e, "setCurrentScreen", false);
            }
        }
    }

    /* renamed from: c */
    public final String mo39046c(Context context) {
        if (!mo39043a(context)) {
            return null;
        }
        synchronized (this.f39809b) {
            if (this.f39810c != null) {
                String str = this.f39810c;
                return str;
            }
            if (m45313h(context)) {
                this.f39810c = (String) m45305a("getGmpAppId", (T) this.f39810c, aau.f39830a);
            } else {
                this.f39810c = (String) m45304a("getGmpAppId", context);
            }
            String str2 = this.f39810c;
            return str2;
        }
    }

    /* renamed from: d */
    public final String mo39048d(Context context) {
        if (!mo39043a(context)) {
            return null;
        }
        long longValue = ((Long) bym.m50299d().mo41272a(C15585bw.f43790ak)).longValue();
        if (m45313h(context)) {
            if (longValue >= 0) {
                return (String) m45311b().submit(new aaw(this)).get(longValue, TimeUnit.MILLISECONDS);
            }
            try {
                return (String) m45305a("getAppInstanceId", (T) null, aav.f39831a);
            } catch (TimeoutException unused) {
                return "TIME_OUT";
            } catch (Exception unused2) {
                return null;
            }
        } else if (longValue < 0) {
            return (String) m45304a("getAppInstanceId", context);
        } else {
            try {
                return (String) m45311b().submit(new aax(this, context)).get(longValue, TimeUnit.MILLISECONDS);
            } catch (TimeoutException unused3) {
                return "TIME_OUT";
            } catch (Exception unused4) {
                return null;
            }
        }
    }

    /* renamed from: e */
    public final String mo39050e(Context context) {
        if (!mo39043a(context)) {
            return null;
        }
        if (m45313h(context)) {
            Long l = (Long) m45305a("getAdEventId", (T) null, aay.f39835a);
            if (l != null) {
                return Long.toString(l.longValue());
            }
            return null;
        }
        Object a = m45304a("generateEventId", context);
        if (a != null) {
            return a.toString();
        }
        return null;
    }

    /* renamed from: f */
    public final String mo39052f(Context context) {
        if (!mo39043a(context)) {
            return null;
        }
        synchronized (this.f39809b) {
            if (this.f39811d != null) {
                String str = this.f39811d;
                return str;
            }
            if (m45313h(context)) {
                this.f39811d = (String) m45305a("getAppIdOrigin", (T) this.f39811d, aaz.f39836a);
            } else {
                this.f39811d = "fa";
            }
            String str2 = this.f39811d;
            return str2;
        }
    }

    /* renamed from: d */
    public final void mo39049d(Context context, String str) {
        m45307a(context, "_ac", str, (Bundle) null);
    }

    /* renamed from: e */
    public final void mo39051e(Context context, String str) {
        m45307a(context, "_ai", str, (Bundle) null);
    }

    /* renamed from: f */
    public final void mo39053f(Context context, String str) {
        m45307a(context, "_aq", str, (Bundle) null);
    }

    /* renamed from: g */
    public final void mo39055g(Context context, String str) {
        m45307a(context, "_aa", str, (Bundle) null);
    }

    /* renamed from: a */
    public final void mo39040a(Context context, String str, String str2, String str3, int i) {
        if (mo39043a(context)) {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str2);
            bundle.putString("type", str3);
            bundle.putInt("value", i);
            m45307a(context, "_ar", str, bundle);
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 75);
            sb.append("Log a Firebase reward video event, reward type: ");
            sb.append(str3);
            sb.append(", reward value: ");
            sb.append(i);
            acd.m45438a(sb.toString());
        }
    }

    /* renamed from: a */
    private final void m45307a(Context context, String str, String str2, Bundle bundle) {
        if (mo39043a(context)) {
            Bundle a = m45303a(str2, str);
            if (bundle != null) {
                a.putAll(bundle);
            }
            if (m45313h(context)) {
                m45309a("logEventInternal", (abc) new aap(str, a));
            } else if (m45310a(context, "com.google.android.gms.measurement.AppMeasurement", this.f39814g, true)) {
                Method i = m45314i(context);
                try {
                    i.invoke(this.f39814g.get(), new Object[]{"am", str, a});
                } catch (Exception e) {
                    m45308a(e, "logEventInternal", true);
                }
            }
        }
    }

    /* renamed from: a */
    private static Bundle m45303a(String str, String str2) {
        Bundle bundle = new Bundle();
        try {
            bundle.putLong("_aeid", Long.parseLong(str));
        } catch (NullPointerException | NumberFormatException e) {
            String str3 = "Invalid event ID: ";
            String valueOf = String.valueOf(str);
            acd.m45778b(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), e);
        }
        if ("_ac".equals(str2)) {
            bundle.putInt("_r", 1);
        }
        return bundle;
    }

    /* renamed from: i */
    private final Method m45314i(Context context) {
        Method method = (Method) this.f39816i.get("logEventInternal");
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", new Class[]{String.class, String.class, Bundle.class});
            this.f39816i.put("logEventInternal", declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            m45308a(e, "logEventInternal", true);
            return null;
        }
    }

    /* renamed from: h */
    private final Method m45312h(Context context, String str) {
        Method method = (Method) this.f39816i.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[]{String.class});
            this.f39816i.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            m45308a(e, str, false);
            return null;
        }
    }

    /* renamed from: i */
    private final Method m45315i(Context context, String str) {
        Method method = (Method) this.f39816i.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[0]);
            this.f39816i.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            m45308a(e, str, false);
            return null;
        }
    }

    /* renamed from: j */
    private final Method m45316j(Context context, String str) {
        Method method = (Method) this.f39816i.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod(str, new Class[]{Activity.class, String.class, String.class});
            this.f39816i.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            m45308a(e, str, false);
            return null;
        }
    }

    /* renamed from: a */
    private final void m45306a(Context context, String str, String str2) {
        if (m45310a(context, "com.google.android.gms.measurement.AppMeasurement", this.f39814g, true)) {
            Method h = m45312h(context, str2);
            try {
                h.invoke(this.f39814g.get(), new Object[]{str});
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 37 + String.valueOf(str).length());
                sb.append("Invoke Firebase method ");
                sb.append(str2);
                sb.append(", Ad Unit Id: ");
                sb.append(str);
                acd.m45438a(sb.toString());
            } catch (Exception e) {
                m45308a(e, str2, false);
            }
        }
    }

    /* renamed from: a */
    private final Object m45304a(String str, Context context) {
        if (!m45310a(context, "com.google.android.gms.measurement.AppMeasurement", this.f39814g, true)) {
            return null;
        }
        try {
            return m45315i(context, str).invoke(this.f39814g.get(), new Object[0]);
        } catch (Exception e) {
            m45308a(e, str, true);
            return null;
        }
    }

    /* renamed from: a */
    private final void m45308a(Exception exc, String str, boolean z) {
        if (!this.f39812e.get()) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 30);
            sb.append("Invoke Firebase method ");
            sb.append(str);
            sb.append(" error.");
            acd.m45783e(sb.toString());
            if (z) {
                acd.m45783e("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
                this.f39812e.set(true);
            }
        }
    }

    /* renamed from: b */
    private final ThreadPoolExecutor m45311b() {
        if (this.f39808a.get() == null) {
            AtomicReference<ThreadPoolExecutor> atomicReference = this.f39808a;
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(((Integer) bym.m50299d().mo41272a(C15585bw.f43791al)).intValue(), ((Integer) bym.m50299d().mo41272a(C15585bw.f43791al)).intValue(), 1, TimeUnit.MINUTES, new LinkedBlockingQueue(), new aba(this));
            atomicReference.compareAndSet(null, threadPoolExecutor);
        }
        return (ThreadPoolExecutor) this.f39808a.get();
    }

    /* renamed from: a */
    private final boolean m45310a(Context context, String str, AtomicReference<Object> atomicReference, boolean z) {
        if (atomicReference.get() == null) {
            try {
                atomicReference.compareAndSet(null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke(null, new Object[]{context}));
            } catch (Exception e) {
                m45308a(e, "getInstance", z);
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private final void m45309a(String str, abc abc) {
        synchronized (this.f39817j) {
            FutureTask futureTask = new FutureTask(new aaq(this, abc, str), null);
            if (this.f39817j.get() != null) {
                futureTask.run();
            } else {
                this.f39818k.offer(futureTask);
            }
        }
    }

    /* renamed from: a */
    private final <T> T m45305a(String str, T t, abb<T> abb) {
        synchronized (this.f39817j) {
            if (((C14876a) this.f39817j.get()) != null) {
                try {
                    T a = abb.mo39061a((C14876a) this.f39817j.get());
                    return a;
                } catch (Exception e) {
                    m45308a(e, str, false);
                    return t;
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo39042a(abc abc, String str) {
        if (((C14876a) this.f39817j.get()) != null) {
            try {
                abc.mo39056a((C14876a) this.f39817j.get());
            } catch (Exception e) {
                m45308a(e, str, false);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final /* synthetic */ String mo39054g(Context context) throws Exception {
        return (String) m45304a("getAppInstanceId", context);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ String mo39038a() throws Exception {
        return (String) m45305a("getAppInstanceId", (T) null, aar.f39826a);
    }
}
