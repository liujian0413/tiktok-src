package com.google.android.gms.internal.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.common.internal.C15267r;

/* renamed from: com.google.android.gms.internal.measurement.bj */
class C16417bj extends BroadcastReceiver {

    /* renamed from: a */
    private static final String f45963a = "com.google.android.gms.internal.measurement.bj";

    /* renamed from: b */
    private final C16697t f45964b;

    /* renamed from: c */
    private boolean f45965c;

    /* renamed from: d */
    private boolean f45966d;

    C16417bj(C16697t tVar) {
        C15267r.m44384a(tVar);
        this.f45964b = tVar;
    }

    public void onReceive(Context context, Intent intent) {
        m53489e();
        String action = intent.getAction();
        this.f45964b.mo43216a().mo43187a("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean f = m53490f();
            if (this.f45966d != f) {
                this.f45966d = f;
                C16689l c = this.f45964b.mo43218c();
                c.mo43187a("Network connectivity status changed", Boolean.valueOf(f));
                c.mo43207k().mo38003a((Runnable) new C16690m(c, f));
            }
        } else if ("com.google.analytics.RADIO_POWERED".equals(action)) {
            if (!intent.hasExtra(f45963a)) {
                C16689l c2 = this.f45964b.mo43218c();
                c2.mo43190b("Radio powered up");
                c2.mo43179c();
            }
        } else {
            this.f45964b.mo43216a().mo43198d("NetworkBroadcastReceiver received unknown action", action);
        }
    }

    /* renamed from: a */
    public final void mo42540a() {
        m53489e();
        if (!this.f45965c) {
            Context context = this.f45964b.f46639a;
            context.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            IntentFilter intentFilter = new IntentFilter("com.google.analytics.RADIO_POWERED");
            intentFilter.addCategory(context.getPackageName());
            context.registerReceiver(this, intentFilter);
            this.f45966d = m53490f();
            this.f45964b.mo43216a().mo43187a("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f45966d));
            this.f45965c = true;
        }
    }

    /* renamed from: e */
    private final void m53489e() {
        this.f45964b.mo43216a();
        this.f45964b.mo43218c();
    }

    /* renamed from: b */
    public final void mo42541b() {
        if (this.f45965c) {
            this.f45964b.mo43216a().mo43190b("Unregistering connectivity change receiver");
            this.f45965c = false;
            this.f45966d = false;
            try {
                this.f45964b.f46639a.unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.f45964b.mo43216a().mo43201e("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    /* renamed from: c */
    public final void mo42542c() {
        Context context = this.f45964b.f46639a;
        Intent intent = new Intent("com.google.analytics.RADIO_POWERED");
        intent.addCategory(context.getPackageName());
        intent.putExtra(f45963a, true);
        context.sendOrderedBroadcast(intent, null);
    }

    /* renamed from: d */
    public final boolean mo42543d() {
        if (!this.f45965c) {
            this.f45964b.mo43216a().mo43200e("Connectivity unknown. Receiver not registered");
        }
        return this.f45966d;
    }

    /* renamed from: f */
    private final boolean m53490f() {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f45964b.f46639a.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return false;
            }
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }
}
