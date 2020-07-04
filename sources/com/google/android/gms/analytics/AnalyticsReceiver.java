package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.C16424bq;

public final class AnalyticsReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private C16424bq f38582a;

    public final void onReceive(Context context, Intent intent) {
        if (this.f38582a == null) {
            this.f38582a = new C16424bq();
        }
        C16424bq.m53529a(context, intent);
    }
}
