package com.snapchat.kit.sdk.core.metrics;

import android.content.SharedPreferences;
import com.snapchat.kit.sdk.core.dagger.scope.SnapConnectScope;
import com.snapchat.kit.sdk.core.metrics.business.C18668a;
import com.snapchat.kit.sdk.core.metrics.business.C18676h;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import com.snapchat.kit.sdk.core.metrics.p806a.C18661a;
import com.snapchat.kit.sdk.core.networking.ClientFactory;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.snapchat.kit.sdk.core.metrics.c */
public abstract class C18677c {
    @SnapConnectScope
    /* renamed from: a */
    static ScheduledExecutorService m61214a() {
        return C18678d.m61215a();
    }

    @SnapConnectScope
    /* renamed from: a */
    static MetricsClient m61211a(ClientFactory clientFactory) {
        return (MetricsClient) clientFactory.generateFingerprintedClient("https://api.snapkit.com", MetricsClient.class);
    }

    /* renamed from: a */
    static C18676h m61213a(SharedPreferences sharedPreferences) {
        C18676h hVar = new C18676h(sharedPreferences);
        hVar.mo48923a();
        return hVar;
    }

    @SnapConnectScope
    /* renamed from: a */
    static MetricQueue<OpMetric> m61210a(C18661a aVar, ScheduledExecutorService scheduledExecutorService) {
        C18653a aVar2 = new C18653a(aVar, scheduledExecutorService, 1);
        aVar2.mo48906a();
        return aVar2;
    }

    /* renamed from: a */
    static C18653a<ServerEvent> m61212a(C18668a aVar, ScheduledExecutorService scheduledExecutorService) {
        C18653a<ServerEvent> aVar2 = new C18653a<>(aVar, scheduledExecutorService, 1);
        aVar2.mo48906a();
        return aVar2;
    }
}
