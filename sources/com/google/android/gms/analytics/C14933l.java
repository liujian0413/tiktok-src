package com.google.android.gms.analytics;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.internal.measurement.C16432by;
import com.google.android.gms.internal.measurement.C16434c;
import com.google.android.gms.internal.measurement.C16648jp;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.analytics.l */
public final class C14933l {

    /* renamed from: c */
    private static volatile C14933l f38616c;

    /* renamed from: a */
    public final Context f38617a;

    /* renamed from: b */
    public UncaughtExceptionHandler f38618b;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final List<Object> f38619d = new CopyOnWriteArrayList();

    /* renamed from: e */
    private final C14928g f38620e = new C14928g();

    /* renamed from: f */
    private final C14934a f38621f = new C14934a();

    /* renamed from: g */
    private volatile C16648jp f38622g;

    /* renamed from: com.google.android.gms.analytics.l$a */
    class C14934a extends ThreadPoolExecutor {
        public C14934a() {
            super(1, 1, 1, TimeUnit.MINUTES, new LinkedBlockingQueue());
            setThreadFactory(new C14935b(null));
            allowCoreThreadTimeOut(true);
        }

        /* access modifiers changed from: protected */
        public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
            return new C14938n(this, runnable, t);
        }
    }

    /* renamed from: com.google.android.gms.analytics.l$b */
    static class C14935b implements ThreadFactory {

        /* renamed from: a */
        private static final AtomicInteger f38624a = new AtomicInteger();

        private C14935b() {
        }

        public final Thread newThread(Runnable runnable) {
            int incrementAndGet = f38624a.incrementAndGet();
            StringBuilder sb = new StringBuilder(23);
            sb.append("measurement-");
            sb.append(incrementAndGet);
            return new C14936c(runnable, sb.toString());
        }

        /* synthetic */ C14935b(C14937m mVar) {
            this();
        }
    }

    /* renamed from: com.google.android.gms.analytics.l$c */
    static class C14936c extends Thread {
        C14936c(Runnable runnable, String str) {
            super(runnable, str);
        }

        public final void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    private C14933l(Context context) {
        Context applicationContext = context.getApplicationContext();
        C15267r.m44384a(applicationContext);
        this.f38617a = applicationContext;
    }

    /* renamed from: a */
    public static C14933l m43377a(Context context) {
        C15267r.m44384a(context);
        if (f38616c == null) {
            synchronized (C14933l.class) {
                if (f38616c == null) {
                    f38616c = new C14933l(context);
                }
            }
        }
        return f38616c;
    }

    /* renamed from: a */
    public final C16648jp mo38000a() {
        if (this.f38622g == null) {
            synchronized (this) {
                if (this.f38622g == null) {
                    C16648jp jpVar = new C16648jp();
                    PackageManager packageManager = this.f38617a.getPackageManager();
                    String packageName = this.f38617a.getPackageName();
                    jpVar.f46521c = packageName;
                    jpVar.f46522d = packageManager.getInstallerPackageName(packageName);
                    String str = null;
                    try {
                        PackageInfo packageInfo = packageManager.getPackageInfo(this.f38617a.getPackageName(), 0);
                        if (packageInfo != null) {
                            CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                            if (!TextUtils.isEmpty(applicationLabel)) {
                                packageName = applicationLabel.toString();
                            }
                            str = packageInfo.versionName;
                        }
                    } catch (NameNotFoundException unused) {
                        String str2 = "Error retrieving package info: appName set to ";
                        String valueOf = String.valueOf(packageName);
                        if (valueOf.length() != 0) {
                            str2.concat(valueOf);
                        } else {
                            new String(str2);
                        }
                    }
                    jpVar.f46519a = packageName;
                    jpVar.f46520b = str;
                    this.f38622g = jpVar;
                }
            }
        }
        return this.f38622g;
    }

    /* renamed from: b */
    public final C16434c mo38004b() {
        DisplayMetrics displayMetrics = this.f38617a.getResources().getDisplayMetrics();
        C16434c cVar = new C16434c();
        cVar.f46005a = C16432by.m53548a(Locale.getDefault());
        cVar.f46007c = displayMetrics.widthPixels;
        cVar.f46008d = displayMetrics.heightPixels;
        return cVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo38002a(C14930i iVar) {
        if (iVar.f38606e) {
            throw new IllegalStateException("Measurement prototype can't be submitted");
        } else if (!iVar.f38603b) {
            C14930i a = iVar.mo37990a();
            a.mo37996d();
            this.f38621f.execute(new C14937m(this, a));
        } else {
            throw new IllegalStateException("Measurement can only be submitted once");
        }
    }

    /* renamed from: c */
    public static void m43382c() {
        if (!(Thread.currentThread() instanceof C14936c)) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    /* renamed from: a */
    public final <V> Future<V> mo38001a(Callable<V> callable) {
        C15267r.m44384a(callable);
        if (!(Thread.currentThread() instanceof C14936c)) {
            return this.f38621f.submit(callable);
        }
        FutureTask futureTask = new FutureTask(callable);
        futureTask.run();
        return futureTask;
    }

    /* renamed from: a */
    public final void mo38003a(Runnable runnable) {
        C15267r.m44384a(runnable);
        this.f38621f.submit(runnable);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m43381b(C14930i iVar) {
        C15267r.m44397c("deliver should be called from worker thread");
        C15267r.m44395b(iVar.f38603b, "Measurement must be submitted");
        List<C14939o> list = iVar.f38607f;
        if (!list.isEmpty()) {
            HashSet hashSet = new HashSet();
            for (C14939o oVar : list) {
                Uri a = oVar.mo37986a();
                if (!hashSet.contains(a)) {
                    hashSet.add(a);
                    oVar.mo37987a(iVar);
                }
            }
        }
    }
}
