package com.snapchat.kit.sdk.core.metrics.business;

import android.content.SharedPreferences;
import com.snapchat.kit.sdk.core.dagger.scope.SnapConnectScope;
import com.snapchat.kit.sdk.core.metrics.C18664b;
import com.snapchat.kit.sdk.core.metrics.MetricPublisher;
import com.snapchat.kit.sdk.core.metrics.MetricPublisher.PublishCallback;
import com.snapchat.kit.sdk.core.metrics.MetricsClient;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import com.snapchat.kit.sdk.core.metrics.model.ServerEventBatch;
import com.snapchat.kit.sdk.core.metrics.model.ServerEventBatch.Builder;
import com.snapchat.kit.sdk.core.metrics.p807b.C18665a;
import java.io.IOException;
import java.util.List;
import retrofit2.C48475b;
import retrofit2.C48478d;
import retrofit2.C48516l;

@SnapConnectScope
/* renamed from: com.snapchat.kit.sdk.core.metrics.business.a */
public final class C18668a implements MetricPublisher<ServerEvent> {

    /* renamed from: a */
    private final SharedPreferences f50444a;

    /* renamed from: b */
    private final C18676h f50445b;

    /* renamed from: c */
    private final MetricsClient f50446c;

    /* renamed from: d */
    private final C18665a f50447d;

    public final List<C18664b<ServerEvent>> getPersistedEvents() {
        return this.f50447d.mo48919a(ServerEvent.ADAPTER, this.f50444a.getString("unsent_analytics_events", null));
    }

    /* renamed from: a */
    private ServerEventBatch m61191a(List<ServerEvent> list) {
        return new Builder().server_events(list).max_sequence_id_on_instance(Long.valueOf(this.f50445b.f50461a)).build();
    }

    public final void persistMetrics(List<C18664b<ServerEvent>> list) {
        this.f50444a.edit().putString("unsent_analytics_events", this.f50447d.mo48918a(list)).apply();
    }

    public final void publishMetrics(List<ServerEvent> list, final PublishCallback publishCallback) {
        this.f50446c.postAnalytics(m61191a(list)).mo123283a(new C48478d<Void>() {
            /* renamed from: a */
            public final void mo48914a(C48475b<Void> bVar, Throwable th) {
                if (th instanceof IOException) {
                    publishCallback.onNetworkError();
                } else {
                    publishCallback.onServerError(new Error(th));
                }
            }

            /* renamed from: a */
            public final void mo48915a(C48475b<Void> bVar, C48516l<Void> lVar) {
                if (lVar.mo123310d()) {
                    publishCallback.onSuccess();
                }
                try {
                    publishCallback.onServerError(new Error(lVar.f123665c.string()));
                } catch (IOException | NullPointerException unused) {
                    publishCallback.onServerError(new Error("response unsuccessful"));
                }
            }
        });
    }

    C18668a(SharedPreferences sharedPreferences, C18676h hVar, MetricsClient metricsClient, C18665a aVar) {
        this.f50444a = sharedPreferences;
        this.f50445b = hVar;
        this.f50446c = metricsClient;
        this.f50447d = aVar;
    }
}
