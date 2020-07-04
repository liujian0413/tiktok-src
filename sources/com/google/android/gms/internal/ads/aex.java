package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;

@C6505uv
public final class aex {

    /* renamed from: a */
    private final BroadcastReceiver f40120a = new aey(this);

    /* renamed from: b */
    private final Map<BroadcastReceiver, IntentFilter> f40121b = new WeakHashMap();

    /* renamed from: c */
    private boolean f40122c;

    /* renamed from: d */
    private boolean f40123d;

    /* renamed from: e */
    private Context f40124e;

    /* renamed from: a */
    public final synchronized void mo39265a(Context context) {
        if (!this.f40122c) {
            this.f40124e = context.getApplicationContext();
            if (this.f40124e == null) {
                this.f40124e = context;
            }
            C15585bw.m50188a(this.f40124e);
            this.f40123d = ((Boolean) bym.m50299d().mo41272a(C15585bw.f43825bS)).booleanValue();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.f40124e.registerReceiver(this.f40120a, intentFilter);
            this.f40122c = true;
        }
    }

    /* renamed from: a */
    public final synchronized void mo39267a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (this.f40123d) {
            this.f40121b.put(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter);
        }
    }

    /* renamed from: a */
    public final synchronized void mo39266a(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.f40123d) {
            this.f40121b.remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final synchronized void m45706a(Context context, Intent intent) {
        for (Entry entry : this.f40121b.entrySet()) {
            if (((IntentFilter) entry.getValue()).hasAction(intent.getAction())) {
                ((BroadcastReceiver) entry.getKey()).onReceive(context, intent);
            }
        }
    }
}
