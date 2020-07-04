package com.bytedance.android.livesdk.floatwindow;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;

public class FloatWindowLifecycle extends BroadcastReceiver implements ActivityLifecycleCallbacks {

    /* renamed from: a */
    public final C7839c f21154a;

    /* renamed from: b */
    public int f21155b;

    /* renamed from: c */
    public boolean f21156c;

    /* renamed from: d */
    private final boolean f21157d;

    /* renamed from: e */
    private final Class[] f21158e;

    /* renamed from: f */
    private final Handler f21159f = new Handler();

    /* renamed from: g */
    private int f21160g;

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
        this.f21160g++;
    }

    public void onActivityStopped(Activity activity) {
        this.f21160g--;
        if (this.f21160g == 0) {
            this.f21154a.mo20557a();
        }
    }

    public void onActivityPaused(Activity activity) {
        this.f21155b--;
        this.f21159f.postDelayed(new Runnable() {
            public final void run() {
                if (FloatWindowLifecycle.this.f21155b == 0) {
                    FloatWindowLifecycle.this.f21156c = true;
                    FloatWindowLifecycle.this.f21154a.mo20557a();
                }
            }
        }, 300);
    }

    public void onActivityResumed(Activity activity) {
        this.f21155b++;
        m24021a(activity);
        if (this.f21156c) {
            this.f21156c = false;
        }
    }

    /* renamed from: a */
    private boolean m24021a(Activity activity) {
        if (this.f21158e == null) {
            return true;
        }
        for (Class isInstance : this.f21158e) {
            if (isInstance.isInstance(activity)) {
                return this.f21157d;
            }
        }
        if (!this.f21157d) {
            return true;
        }
        return false;
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action != null && action.equals("android.intent.action.CLOSE_SYSTEM_DIALOGS")) {
            if ("homekey".equals(intent.getStringExtra("reason"))) {
                this.f21154a.mo20557a();
            }
        }
    }

    public FloatWindowLifecycle(Context context, boolean z, Class[] clsArr, C7839c cVar) {
        this.f21157d = z;
        this.f21158e = clsArr;
        this.f21154a = cVar;
        ((Application) context).registerActivityLifecycleCallbacks(this);
        context.registerReceiver(this, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
    }
}
