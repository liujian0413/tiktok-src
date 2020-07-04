package com.google.android.play.core.p766a;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.play.core.install.C17093a;
import com.google.android.play.core.internal.C6525f;
import com.google.android.play.core.p275b.C6507b;

/* renamed from: com.google.android.play.core.a.d */
public final class C17084d extends C6507b<C17093a> {
    public C17084d(Context context) {
        super(new C6525f("AppUpdateListenerRegistry"), new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), context);
    }

    /* renamed from: a */
    public final void mo15872a(Context context, Intent intent) {
        if (!context.getPackageName().equals(intent.getStringExtra("package.name"))) {
            this.f18817a.mo15891b("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", intent.getStringExtra("package.name"));
            return;
        }
        C17093a aVar = new C17093a(intent.getIntExtra("install.status", 0), intent.getIntExtra("error.code", 0), intent.getStringExtra("package.name"));
        this.f18817a.mo15891b("ListenerRegistryBroadcastReceiver.onReceive: %s", aVar);
        mo15874a(aVar);
    }
}
