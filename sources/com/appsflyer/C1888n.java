package com.appsflyer;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: com.appsflyer.n */
final class C1888n implements ActivityLifecycleCallbacks {

    /* renamed from: ॱ */
    private static C1888n f6829;
    /* access modifiers changed from: private */

    /* renamed from: ˊ */
    public C1889a f6830;
    /* access modifiers changed from: private */

    /* renamed from: ˋ */
    public boolean f6831 = true;
    /* access modifiers changed from: private */

    /* renamed from: ˏ */
    public boolean f6832;

    /* renamed from: com.appsflyer.n$a */
    interface C1889a {
        /* renamed from: ˊ */
        void mo7422(WeakReference<Context> weakReference);

        /* renamed from: ॱ */
        void mo7423(Activity activity);
    }

    /* renamed from: com.appsflyer.n$b */
    class C1890b extends AsyncTask<Void, Void, Void> {

        /* renamed from: ˋ */
        private WeakReference<Context> f6833;

        /* renamed from: ˎ */
        private Void m8788() {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                AFLogger.afErrorLog("Sleeping attempt failed (essential for background state verification)\n", e);
            }
            if (C1888n.this.f6832 && C1888n.this.f6831) {
                C1888n.this.f6832 = false;
                try {
                    C1888n.this.f6830.mo7422(this.f6833);
                } catch (Exception e2) {
                    AFLogger.afErrorLog("Listener threw exception! ", e2);
                    cancel(true);
                }
            }
            this.f6833.clear();
            return null;
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            return m8788();
        }

        public C1890b(WeakReference<Context> weakReference) {
            this.f6833 = weakReference;
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    C1888n() {
    }

    /* renamed from: ˊ */
    static C1888n m8779() {
        if (f6829 == null) {
            f6829 = new C1888n();
        }
        return f6829;
    }

    /* renamed from: ˋ */
    public static C1888n m8781() {
        if (f6829 != null) {
            return f6829;
        }
        throw new IllegalStateException("Foreground is not initialised - invoke at least once with parameter init/get");
    }

    public final void onActivityResumed(Activity activity) {
        this.f6831 = false;
        boolean z = !this.f6832;
        this.f6832 = true;
        if (z) {
            try {
                this.f6830.mo7423(activity);
            } catch (Exception e) {
                AFLogger.afErrorLog("Listener threw exception! ", e);
            }
        }
    }

    public final void onActivityPaused(Activity activity) {
        this.f6831 = true;
        try {
            new C1890b(new WeakReference(activity.getApplicationContext())).executeOnExecutor(AFExecutor.getInstance().getThreadPoolExecutor(), new Void[0]);
        } catch (RejectedExecutionException e) {
            AFLogger.afErrorLog("backgroundTask.executeOnExecutor failed with RejectedExecutionException Exception", e);
        } catch (Throwable th) {
            AFLogger.afErrorLog("backgroundTask.executeOnExecutor failed with Exception", th);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AFDeepLinkManager.getInstance().collectIntentsFromActivities(activity.getIntent());
    }

    /* renamed from: ˊ */
    public final void mo7501(Application application, C1889a aVar) {
        this.f6830 = aVar;
        if (VERSION.SDK_INT >= 14) {
            application.registerActivityLifecycleCallbacks(f6829);
        }
    }
}
