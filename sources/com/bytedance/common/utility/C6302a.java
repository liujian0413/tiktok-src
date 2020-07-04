package com.bytedance.common.utility;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.common.utility.NetworkUtils.NetworkType;

/* renamed from: com.bytedance.common.utility.a */
public final class C6302a {

    /* renamed from: a */
    final Context f18538a;

    /* renamed from: b */
    boolean f18539b;

    /* renamed from: c */
    BroadcastReceiver f18540c;

    /* renamed from: d */
    public NetworkType f18541d = NetworkType.MOBILE;

    /* renamed from: a */
    public final void mo15137a() {
        m19558c();
    }

    /* renamed from: c */
    private void m19558c() {
        if (this.f18539b) {
            this.f18539b = false;
            this.f18538a.unregisterReceiver(this.f18540c);
            this.f18540c = null;
        }
    }

    /* renamed from: b */
    private void m19557b() {
        if (!this.f18539b) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            this.f18540c = new BroadcastReceiver() {
                public final void onReceive(Context context, Intent intent) {
                    if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                        try {
                            C6302a.this.f18541d = NetworkUtils.m19550d(C6302a.this.f18538a);
                        } catch (Exception unused) {
                        }
                    }
                }
            };
            this.f18539b = true;
            try {
                this.f18538a.registerReceiver(this.f18540c, intentFilter);
            } catch (Throwable unused) {
            }
        }
        this.f18541d = NetworkUtils.m19550d(this.f18538a);
    }

    public C6302a(Context context) {
        this.f18538a = context;
        m19557b();
    }
}
