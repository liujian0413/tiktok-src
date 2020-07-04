package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.stats.C15307a;
import com.google.android.gms.internal.measurement.C16563gr;

/* renamed from: com.google.android.gms.measurement.internal.an */
final class C16814an implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C16563gr f46958a;

    /* renamed from: b */
    private final /* synthetic */ ServiceConnection f46959b;

    /* renamed from: c */
    private final /* synthetic */ C16813am f46960c;

    C16814an(C16813am amVar, C16563gr grVar, ServiceConnection serviceConnection) {
        this.f46960c = amVar;
        this.f46958a = grVar;
        this.f46959b = serviceConnection;
    }

    public final void run() {
        C16812al alVar = this.f46960c.f46956a;
        String a = this.f46960c.f46957b;
        C16563gr grVar = this.f46958a;
        ServiceConnection serviceConnection = this.f46959b;
        Bundle a2 = alVar.mo43620a(a, grVar);
        alVar.f46955a.mo43584p().mo43571c();
        if (a2 != null) {
            long j = a2.getLong("install_begin_timestamp_seconds", 0) * 1000;
            if (j == 0) {
                alVar.f46955a.mo43585q().f47487a.mo44160a("Service response is missing Install Referrer install timestamp");
            } else {
                String string = a2.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    alVar.f46955a.mo43585q().f47487a.mo44160a("No referrer defined in install referrer response");
                } else {
                    alVar.f46955a.mo43585q().f47495i.mo44161a("InstallReferrer API result", string);
                    C16922em f = alVar.f46955a.mo43662f();
                    String str = "?";
                    String valueOf = String.valueOf(string);
                    Bundle a3 = f.mo43896a(Uri.parse(valueOf.length() != 0 ? str.concat(valueOf) : new String(str)));
                    if (a3 == null) {
                        alVar.f46955a.mo43585q().f47487a.mo44160a("No campaign params defined in install referrer result");
                    } else {
                        String string2 = a3.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j2 = a2.getLong("referrer_click_timestamp_seconds", 0) * 1000;
                            if (j2 == 0) {
                                alVar.f46955a.mo43585q().f47487a.mo44160a("Install Referrer is missing click timestamp for ad campaign");
                            } else {
                                a3.putLong("click_timestamp", j2);
                            }
                        }
                        if (j == alVar.f46955a.mo43658b().f46923i.mo43614a()) {
                            alVar.f46955a.mo43585q().f47495i.mo44160a("Campaign has already been logged");
                        } else {
                            alVar.f46955a.mo43658b().f46923i.mo43615a(j);
                            alVar.f46955a.mo43585q().f47495i.mo44161a("Logging Install Referrer campaign from sdk with ", "referrer API");
                            a3.putString("_cis", "referrer API");
                            alVar.f46955a.mo43661e().mo43731a("auto", "_cmp", a3);
                        }
                    }
                }
            }
        }
        if (serviceConnection != null) {
            C15307a.m44540a();
            C15307a.m44541a(alVar.f46955a.mo43581m(), serviceConnection);
        }
    }
}
