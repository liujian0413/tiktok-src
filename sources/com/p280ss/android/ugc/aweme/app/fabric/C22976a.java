package com.p280ss.android.ugc.aweme.app.fabric;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.C0608j.C0609a;
import android.support.p022v4.app.FragmentActivity;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;

/* renamed from: com.ss.android.ugc.aweme.app.fabric.a */
public final class C22976a implements ActivityLifecycleCallbacks {
    public final void onActivityDestroyed(Activity activity) {
    }

    /* renamed from: a */
    public static long m75588a(Context context) throws Exception {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        MemoryInfo memoryInfo = new MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    public final void onActivityPaused(Activity activity) {
        StringBuilder sb = new StringBuilder("onActivityPaused() called with: activity = [");
        sb.append(activity.getClass().getName());
        sb.append("]");
        C6921a.m21555a(sb.toString());
    }

    public final void onActivityResumed(Activity activity) {
        StringBuilder sb = new StringBuilder("onActivityResumed() called with: activity = [");
        sb.append(activity.getClass().getName());
        sb.append("]");
        C6921a.m21555a(sb.toString());
    }

    public final void onActivityStarted(Activity activity) {
        StringBuilder sb = new StringBuilder("onActivityStarted() called with: activity = [");
        sb.append(activity.getClass().getName());
        sb.append("]");
        C6921a.m21555a(sb.toString());
    }

    public final void onActivityStopped(Activity activity) {
        StringBuilder sb = new StringBuilder("onActivityStopped() called with: activity = [");
        sb.append(activity.getClass().getName());
        sb.append("]");
        C6921a.m21555a(sb.toString());
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        StringBuilder sb = new StringBuilder("onActivitySaveInstanceState() called with: activity = [");
        sb.append(activity.getClass().getName());
        sb.append("]");
        C6921a.m21555a(sb.toString());
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean z;
        try {
            C6921a.m21564c("current_activity", activity.getClass().getName());
        } catch (Exception unused) {
        }
        StringBuilder sb = new StringBuilder("onActivityCreated() called with: activity = [");
        sb.append(activity.getClass().getName());
        sb.append("], savedInstanceState null = [");
        if (bundle == null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        sb.append("]");
        C6921a.m21555a(sb.toString());
        if (activity instanceof FragmentActivity) {
            ((FragmentActivity) activity).getSupportFragmentManager().mo2649a((C0609a) new FabricFragmentLifecycleCallbacks(), true);
        }
        try {
            long a = m75588a(activity.getApplicationContext());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(activity.getClass().getName());
            sb2.append("   freeMem :");
            sb2.append((a / 1024) / 1024);
            C6921a.m21555a(sb2.toString());
        } catch (Exception unused2) {
        }
    }
}
