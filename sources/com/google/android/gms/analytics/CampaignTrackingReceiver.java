package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.internal.measurement.C16398ar;
import com.google.android.gms.internal.measurement.C16416bi;
import com.google.android.gms.internal.measurement.C16432by;
import com.google.android.gms.internal.measurement.C16697t;

public class CampaignTrackingReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static Boolean f38584a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo37971a(Context context, String str) {
    }

    /* renamed from: a */
    public static boolean m43331a(Context context) {
        C15267r.m44384a(context);
        if (f38584a != null) {
            return f38584a.booleanValue();
        }
        boolean a = C16432by.m53552a(context, "com.google.android.gms.analytics.CampaignTrackingReceiver", true);
        f38584a = Boolean.valueOf(a);
        return a;
    }

    public void onReceive(Context context, Intent intent) {
        C16697t a = C16697t.m54864a(context);
        C16416bi a2 = a.mo43216a();
        if (intent == null) {
            a2.mo43200e("CampaignTrackingReceiver received null intent");
            return;
        }
        String stringExtra = intent.getStringExtra("referrer");
        String action = intent.getAction();
        a2.mo43187a("CampaignTrackingReceiver received", action);
        if (!"com.android.vending.INSTALL_REFERRER".equals(action) || TextUtils.isEmpty(stringExtra)) {
            a2.mo43200e("CampaignTrackingReceiver received unexpected intent without referrer extra");
            return;
        }
        mo37971a(context, stringExtra);
        int c = C16398ar.m53431c();
        if (stringExtra.length() > c) {
            a2.mo43196c("Campaign data exceed the maximum supported size and will be clipped. size, limit", Integer.valueOf(stringExtra.length()), Integer.valueOf(c));
            stringExtra = stringExtra.substring(0, c);
        }
        a.mo43218c().mo43177a(stringExtra, new C14926e(this, goAsync()));
    }
}
