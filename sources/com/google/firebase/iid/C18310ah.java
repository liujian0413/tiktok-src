package com.google.firebase.iid;

import android.content.BroadcastReceiver.PendingResult;
import android.content.Intent;
import com.p280ss.android.ugc.aweme.main.C32994dp;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.iid.ah */
final class C18310ah {

    /* renamed from: a */
    final Intent f49770a;

    /* renamed from: b */
    private final PendingResult f49771b;

    /* renamed from: c */
    private boolean f49772c;

    /* renamed from: d */
    private final ScheduledFuture<?> f49773d;

    C18310ah(Intent intent, PendingResult pendingResult, ScheduledExecutorService scheduledExecutorService) {
        this.f49770a = intent;
        this.f49771b = pendingResult;
        this.f49773d = scheduledExecutorService.schedule(new C18311ai(this, intent), C32994dp.m106644a() ? 4000 : 9000, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo47220a() {
        if (!this.f49772c) {
            this.f49771b.finish();
            this.f49773d.cancel(false);
            this.f49772c = true;
        }
    }
}
