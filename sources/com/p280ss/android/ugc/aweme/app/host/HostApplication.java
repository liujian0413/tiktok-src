package com.p280ss.android.ugc.aweme.app.host;

import android.app.Activity;
import android.content.Context;
import com.bytedance.apm.agent.instrumentation.AppInstrumentation;
import com.p280ss.android.ugc.aweme.p309di.C6911b;
import com.p280ss.android.ugc.dagger.android.compat.C7288a;
import com.p280ss.android.ugc.trill.app.TrillApplication;
import dagger.android.C7313b;
import dagger.android.C7316d;
import dagger.android.DispatchingAndroidInjector;

/* renamed from: com.ss.android.ugc.aweme.app.host.HostApplication */
public class HostApplication extends TrillApplication implements C7316d {

    /* renamed from: e */
    DispatchingAndroidInjector<Activity> f19518e;

    /* renamed from: f */
    C7288a f19519f;

    public void attachBaseContext(Context context) {
        AppInstrumentation.attachBaseContextStart();
        super.attachBaseContext(context);
        AppInstrumentation.attachBaseContextEnd();
    }

    /* renamed from: e */
    public final C7313b<Activity> mo16890e() {
        return this.f19518e;
    }

    public void onCreate() {
        AppInstrumentation.onCreateStart();
        super.onCreate();
        AppInstrumentation.onCreateEnd();
    }

    public HostApplication() {
        AppInstrumentation.initStart();
        AppInstrumentation.initEnd();
    }

    /* renamed from: d */
    public final void mo16889d() {
        C6911b.m21536a(this).inject(this);
        Keep.emptyMethod();
    }
}
