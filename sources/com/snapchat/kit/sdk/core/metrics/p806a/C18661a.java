package com.snapchat.kit.sdk.core.metrics.p806a;

import android.content.SharedPreferences;
import com.snapchat.kit.sdk.core.dagger.scope.SnapConnectScope;
import com.snapchat.kit.sdk.core.metrics.C18664b;
import com.snapchat.kit.sdk.core.metrics.MetricPublisher;
import com.snapchat.kit.sdk.core.metrics.MetricPublisher.PublishCallback;
import com.snapchat.kit.sdk.core.metrics.MetricsClient;
import com.snapchat.kit.sdk.core.metrics.model.Metrics;
import com.snapchat.kit.sdk.core.metrics.model.Metrics.Builder;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric;
import com.snapchat.kit.sdk.core.metrics.p807b.C18665a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import retrofit2.C48475b;
import retrofit2.C48478d;
import retrofit2.C48516l;

@SnapConnectScope
/* renamed from: com.snapchat.kit.sdk.core.metrics.a.a */
public final class C18661a implements MetricPublisher<OpMetric> {

    /* renamed from: a */
    private final SharedPreferences f50430a;

    /* renamed from: b */
    private final MetricsClient f50431b;

    /* renamed from: c */
    private final C18665a f50432c;

    public final List<C18664b<OpMetric>> getPersistedEvents() {
        return this.f50432c.mo48919a(OpMetric.ADAPTER, this.f50430a.getString("unsent_operational_metrics", null));
    }

    public final void persistMetrics(List<C18664b<OpMetric>> list) {
        this.f50430a.edit().putString("unsent_operational_metrics", this.f50432c.mo48918a(list)).apply();
    }

    /* renamed from: a */
    private static Metrics m61178a(List<OpMetric> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (OpMetric opMetric : list) {
            if (opMetric.counter_metric != null) {
                arrayList.add(opMetric.counter_metric);
            } else if (opMetric.timer_metric != null) {
                arrayList2.add(opMetric.timer_metric);
            } else if (opMetric.level_metric != null) {
                arrayList3.add(opMetric.level_metric);
            }
        }
        return new Builder().counters(arrayList).timers(arrayList2).levels(arrayList3).build();
    }

    public final void publishMetrics(List<OpMetric> list, final PublishCallback publishCallback) {
        this.f50431b.postOperationalMetrics(m61178a(list)).mo123283a(new C48478d<Void>() {
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
                    return;
                }
                try {
                    publishCallback.onServerError(new Error(lVar.f123665c.string()));
                } catch (IOException | NullPointerException unused) {
                    publishCallback.onServerError(new Error("response unsuccessful"));
                }
            }
        });
    }

    C18661a(SharedPreferences sharedPreferences, MetricsClient metricsClient, C18665a aVar) {
        this.f50430a = sharedPreferences;
        this.f50431b = metricsClient;
        this.f50432c = aVar;
    }
}
