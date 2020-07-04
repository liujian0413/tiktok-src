package com.bytedance.common.wschannel;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;

/* renamed from: com.bytedance.common.wschannel.b */
final class C9753b implements ActivityLifecycleCallbacks {

    /* renamed from: a */
    public static boolean f26530a;

    /* renamed from: c */
    private static C6309f f26531c = new C6309f(Looper.getMainLooper(), new C6310a() {
        public final void handleMsg(Message message) {
        }
    });

    /* renamed from: b */
    public C9756a f26532b;

    /* renamed from: d */
    private Runnable f26533d = new Runnable() {
        public final void run() {
            if (C9753b.f26530a) {
                C9753b.f26530a = false;
                if (C9753b.this.f26532b != null) {
                    C9753b.this.f26532b.mo24167b();
                }
            }
        }
    };

    /* renamed from: com.bytedance.common.wschannel.b$a */
    public interface C9756a {
        /* renamed from: a */
        void mo24166a();

        /* renamed from: b */
        void mo24167b();
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    C9753b() {
    }

    public final void onActivityPaused(Activity activity) {
        if (f26530a) {
            f26531c.postDelayed(this.f26533d, 3000);
        }
    }

    public final void onActivityResumed(Activity activity) {
        if (!f26530a) {
            f26530a = true;
            if (this.f26532b != null) {
                this.f26532b.mo24166a();
            }
        }
        f26531c.removeCallbacks(this.f26533d);
    }
}
