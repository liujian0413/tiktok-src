package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class acu extends BroadcastReceiver {

    /* renamed from: a */
    private final /* synthetic */ acl f40022a;

    private acu(acl acl) {
        this.f40022a = acl;
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            this.f40022a.f40006d = true;
            return;
        }
        if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            this.f40022a.f40006d = false;
        }
    }

    /* synthetic */ acu(acl acl, acq acq) {
        this(acl);
    }
}
