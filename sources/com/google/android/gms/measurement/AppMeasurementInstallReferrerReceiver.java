package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.C16815ao;
import com.google.android.gms.measurement.internal.C16818ar;

public final class AppMeasurementInstallReferrerReceiver extends BroadcastReceiver implements C16818ar {

    /* renamed from: a */
    private C16815ao f46892a;

    /* renamed from: a */
    public final void mo43530a(Context context, Intent intent) {
    }

    public final void onReceive(Context context, Intent intent) {
        if (this.f46892a == null) {
            this.f46892a = new C16815ao(this);
        }
        this.f46892a.mo43625a(context, intent);
    }

    /* renamed from: a */
    public final PendingResult mo43529a() {
        return goAsync();
    }
}
