package com.p280ss.android.push.daemon;

import android.content.Context;
import com.p280ss.android.push.daemon.C20017f.C20018a;

/* renamed from: com.ss.android.push.daemon.NativeDaemonBase */
public class NativeDaemonBase {
    protected Context mContext;

    /* access modifiers changed from: protected */
    public void onDaemonDead() {
        C20018a.m65949a().mo53591a();
    }

    public NativeDaemonBase(Context context) {
        this.mContext = context;
    }
}
