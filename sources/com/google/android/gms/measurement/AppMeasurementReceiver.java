package com.google.android.gms.measurement;

import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.content.Intent;
import android.support.p022v4.content.WakefulBroadcastReceiver;
import com.google.android.gms.measurement.internal.C16815ao;
import com.google.android.gms.measurement.internal.C16818ar;

public final class AppMeasurementReceiver extends WakefulBroadcastReceiver implements C16818ar {

    /* renamed from: a */
    private C16815ao f46894a;

    public final void onReceive(Context context, Intent intent) {
        if (this.f46894a == null) {
            this.f46894a = new C16815ao(this);
        }
        this.f46894a.mo43625a(context, intent);
    }

    /* renamed from: a */
    public final void mo43530a(Context context, Intent intent) {
        m2901a_(context, intent);
    }

    /* renamed from: a */
    public final PendingResult mo43529a() {
        return goAsync();
    }
}
