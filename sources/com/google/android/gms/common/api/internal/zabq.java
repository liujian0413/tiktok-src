package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public final class zabq extends BroadcastReceiver {

    /* renamed from: a */
    public Context f39234a;

    /* renamed from: b */
    private final C15085bh f39235b;

    public zabq(C15085bh bhVar) {
        this.f39235b = bhVar;
    }

    /* renamed from: a */
    public final synchronized void mo38443a() {
        if (this.f39234a != null) {
            this.f39234a.unregisterReceiver(this);
        }
        this.f39234a = null;
    }

    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f39235b.mo38309a();
            mo38443a();
        }
    }
}
