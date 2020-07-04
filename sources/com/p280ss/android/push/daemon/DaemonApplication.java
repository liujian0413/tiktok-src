package com.p280ss.android.push.daemon;

import android.app.Application;
import android.content.Context;

/* renamed from: com.ss.android.push.daemon.DaemonApplication */
public abstract class DaemonApplication extends Application {

    /* renamed from: a */
    private C6842e f19466a = new C6838a(mo16700a());

    /* renamed from: b */
    private boolean f19467b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C6839b mo16700a();

    public final void attachBaseContext(Context context) {
        if (!this.f19467b) {
            this.f19467b = true;
            super.attachBaseContext(context);
        }
    }
}
