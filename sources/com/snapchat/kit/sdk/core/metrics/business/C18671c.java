package com.snapchat.kit.sdk.core.metrics.business;

import android.os.Build.VERSION;
import com.snapchat.kit.sdk.core.dagger.scope.SnapConnectScope;
import com.snapchat.kit.sdk.core.metrics.C18653a;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent.Builder;

@SnapConnectScope
/* renamed from: com.snapchat.kit.sdk.core.metrics.business.c */
public final class C18671c implements MetricQueue<ServerEvent> {

    /* renamed from: a */
    private final C18676h f50454a;

    /* renamed from: b */
    private final C18653a<ServerEvent> f50455b;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void push(ServerEvent serverEvent) {
        String str;
        Builder os_type = serverEvent.newBuilder().sequence_id(Long.valueOf(this.f50454a.mo48924b())).os_type("Android");
        if (VERSION.RELEASE == null) {
            str = "";
        } else {
            str = VERSION.RELEASE;
        }
        this.f50455b.push(os_type.os_version(str).build());
    }

    C18671c(C18676h hVar, C18653a<ServerEvent> aVar) {
        this.f50454a = hVar;
        this.f50455b = aVar;
    }
}
