package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver.PendingResult;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.internal.C15267r;

/* renamed from: com.google.android.gms.measurement.internal.ao */
public final class C16815ao {

    /* renamed from: a */
    private final C16818ar f46961a;

    public C16815ao(C16818ar arVar) {
        C15267r.m44384a(arVar);
        this.f46961a = arVar;
    }

    /* renamed from: a */
    public static boolean m55432a(Context context) {
        C15267r.m44384a(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            ActivityInfo receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0);
            if (receiverInfo != null && receiverInfo.enabled) {
                return true;
            }
            return false;
        } catch (NameNotFoundException unused) {
        }
    }

    /* renamed from: a */
    public final void mo43625a(Context context, Intent intent) {
        C16825ay a = C16825ay.m55497a(context, (C16948m) null);
        C16953r q = a.mo43585q();
        if (intent == null) {
            q.f47490d.mo44160a("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        q.f47495i.mo44161a("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            q.f47495i.mo44160a("Starting wakeful intent.");
            this.f46961a.mo43530a(context, className);
            return;
        }
        if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            try {
                a.mo43584p().mo43645a((Runnable) new C16816ap(this, a, q));
            } catch (Exception e) {
                q.f47490d.mo44161a("Install Referrer Reporter encountered a problem", e);
            }
            PendingResult a2 = this.f46961a.mo43529a();
            String stringExtra = intent.getStringExtra("referrer");
            if (stringExtra == null) {
                q.f47495i.mo44160a("Install referrer extras are null");
                if (a2 != null) {
                    a2.finish();
                }
                return;
            }
            q.f47493g.mo44161a("Install referrer extras are", stringExtra);
            if (!stringExtra.contains("?")) {
                String str = "?";
                String valueOf = String.valueOf(stringExtra);
                stringExtra = valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
            }
            Bundle a3 = a.mo43662f().mo43896a(Uri.parse(stringExtra));
            if (a3 == null) {
                q.f47495i.mo44160a("No campaign defined in install referrer broadcast");
                if (a2 != null) {
                    a2.finish();
                }
            } else {
                long longExtra = intent.getLongExtra("referrer_timestamp_seconds", 0) * 1000;
                if (longExtra == 0) {
                    q.f47490d.mo44160a("Install referrer is missing timestamp");
                }
                C16820at p = a.mo43584p();
                C16817aq aqVar = new C16817aq(this, a, longExtra, a3, context, q, a2);
                p.mo43645a((Runnable) aqVar);
            }
        }
    }
}
