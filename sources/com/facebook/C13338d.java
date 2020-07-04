package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.p022v4.content.C0688e;
import com.facebook.internal.C13876aa;

/* renamed from: com.facebook.d */
public abstract class C13338d {

    /* renamed from: a */
    public static final String f35253a = "d";

    /* renamed from: b */
    public boolean f35254b;

    /* renamed from: c */
    private final BroadcastReceiver f35255c = new C13340a();

    /* renamed from: d */
    private final C0688e f35256d = C0688e.m2941a(C13499h.m39721g());

    /* renamed from: com.facebook.d$a */
    class C13340a extends BroadcastReceiver {
        private C13340a() {
        }

        public final void onReceive(Context context, Intent intent) {
            if ("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED".equals(intent.getAction())) {
                C13338d.this.mo32630a((AccessToken) intent.getParcelableExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN"), (AccessToken) intent.getParcelableExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN"));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo32630a(AccessToken accessToken, AccessToken accessToken2);

    /* renamed from: a */
    public final void mo32629a() {
        if (!this.f35254b) {
            m39044c();
            this.f35254b = true;
        }
    }

    /* renamed from: b */
    public final void mo32631b() {
        if (this.f35254b) {
            this.f35256d.mo2837a(this.f35255c);
            this.f35254b = false;
        }
    }

    public C13338d() {
        C13876aa.m40975a();
        mo32629a();
    }

    /* renamed from: c */
    private void m39044c() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        this.f35256d.mo2838a(this.f35255c, intentFilter);
    }
}
