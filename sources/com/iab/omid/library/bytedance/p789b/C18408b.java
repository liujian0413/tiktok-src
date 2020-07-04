package com.iab.omid.library.bytedance.p789b;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.iab.omid.library.bytedance.adsession.C18403g;

/* renamed from: com.iab.omid.library.bytedance.b.b */
public final class C18408b {

    /* renamed from: b */
    private static C18408b f49941b = new C18408b();

    /* renamed from: a */
    public C18410a f49942a;

    /* renamed from: c */
    private Context f49943c;

    /* renamed from: d */
    private BroadcastReceiver f49944d;

    /* renamed from: e */
    private boolean f49945e;

    /* renamed from: f */
    private boolean f49946f;

    /* renamed from: com.iab.omid.library.bytedance.b.b$a */
    public interface C18410a {
        /* renamed from: a */
        void mo47842a(boolean z);
    }

    private C18408b() {
    }

    /* renamed from: a */
    public static C18408b m60600a() {
        return f49941b;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m60602a(boolean z) {
        if (this.f49946f != z) {
            this.f49946f = z;
            if (this.f49945e) {
                m60605g();
                if (this.f49942a != null) {
                    this.f49942a.mo47842a(mo47840d());
                }
            }
        }
    }

    /* renamed from: e */
    private void m60603e() {
        this.f49944d = new BroadcastReceiver() {
            public final void onReceive(Context context, Intent intent) {
                if (intent != null) {
                    if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                        C18408b.this.m60602a(true);
                    } else if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                        C18408b.this.m60602a(false);
                    } else {
                        if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
                            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
                            if (keyguardManager != null && !keyguardManager.inKeyguardRestrictedInputMode()) {
                                C18408b.this.m60602a(false);
                            }
                        }
                    }
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        this.f49943c.registerReceiver(this.f49944d, intentFilter);
    }

    /* renamed from: f */
    private void m60604f() {
        if (this.f49943c != null && this.f49944d != null) {
            this.f49943c.unregisterReceiver(this.f49944d);
            this.f49944d = null;
        }
    }

    /* renamed from: g */
    private void m60605g() {
        boolean z = !this.f49946f;
        for (C18403g d : C18407a.m60593a().mo47833b()) {
            d.mo47811d().mo47868a(z);
        }
    }

    /* renamed from: a */
    public final void mo47837a(Context context) {
        this.f49943c = context.getApplicationContext();
    }

    /* renamed from: b */
    public final void mo47838b() {
        m60603e();
        this.f49945e = true;
        m60605g();
    }

    /* renamed from: c */
    public final void mo47839c() {
        m60604f();
        this.f49945e = false;
        this.f49946f = false;
        this.f49942a = null;
    }

    /* renamed from: d */
    public final boolean mo47840d() {
        return !this.f49946f;
    }
}
