package com.facebook.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.p022v4.content.C0688e;
import com.facebook.appevents.C13187j;

public class BoltsMeasurementEventListener extends BroadcastReceiver {

    /* renamed from: a */
    private static BoltsMeasurementEventListener f36718a;

    /* renamed from: b */
    private Context f36719b;

    /* renamed from: b */
    private void m40919b() {
        C0688e.m2941a(this.f36719b).mo2837a((BroadcastReceiver) this);
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        try {
            m40919b();
        } finally {
            super.finalize();
        }
    }

    /* renamed from: a */
    private void m40918a() {
        C0688e.m2941a(this.f36719b).mo2838a(this, new IntentFilter("com.parse.bolts.measurement_event"));
    }

    private BoltsMeasurementEventListener(Context context) {
        this.f36719b = context.getApplicationContext();
    }

    /* renamed from: a */
    public static BoltsMeasurementEventListener m40917a(Context context) {
        if (f36718a != null) {
            return f36718a;
        }
        BoltsMeasurementEventListener boltsMeasurementEventListener = new BoltsMeasurementEventListener(context);
        f36718a = boltsMeasurementEventListener;
        boltsMeasurementEventListener.m40918a();
        return f36718a;
    }

    public void onReceive(Context context, Intent intent) {
        C13187j jVar = new C13187j(context);
        StringBuilder sb = new StringBuilder("bf_");
        sb.append(intent.getStringExtra("event_name"));
        String sb2 = sb.toString();
        Bundle bundleExtra = intent.getBundleExtra("event_args");
        Bundle bundle = new Bundle();
        for (String str : bundleExtra.keySet()) {
            bundle.putString(str.replaceAll("[^0-9a-zA-Z _-]", "-").replaceAll("^[ -]*", "").replaceAll("[ -]*$", ""), (String) bundleExtra.get(str));
        }
        jVar.mo32366a(sb2, bundle);
    }
}
