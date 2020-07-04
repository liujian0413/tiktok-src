package com.twitter.sdk.android.core.internal.scribe;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.twitter.sdk.android.core.internal.scribe.d */
final class C46907d extends C46906c<C46931v> {

    /* renamed from: f */
    private final C46922q f120279f;

    /* renamed from: d */
    public final C46922q mo118029d() {
        return this.f120279f;
    }

    C46907d(Context context, ScheduledExecutorService scheduledExecutorService, C46934x xVar, C46930u uVar, ScribeFilesSender scribeFilesSender) {
        super(context, scheduledExecutorService, xVar);
        this.f120279f = scribeFilesSender;
        mo118030a(uVar.f120347h);
    }
}
