package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: com.google.firebase.iid.ad */
final class C18306ad extends BroadcastReceiver {

    /* renamed from: a */
    private C18305ac f49763a;

    public C18306ad(C18305ac acVar) {
        this.f49763a = acVar;
    }

    /* renamed from: a */
    public final void mo47214a() {
        FirebaseInstanceId.m60328g();
        this.f49763a.mo47211a().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public final void onReceive(Context context, Intent intent) {
        if (this.f49763a != null && this.f49763a.mo47212b()) {
            FirebaseInstanceId.m60328g();
            FirebaseInstanceId.m60323a((Runnable) this.f49763a, 0);
            this.f49763a.mo47211a().unregisterReceiver(this);
            this.f49763a = null;
        }
    }
}
