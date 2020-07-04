package com.snapchat.kit.sdk.creative.api;

import android.content.Context;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import com.snapchat.kit.sdk.creative.p809b.C18708a;
import com.snapchat.kit.sdk.creative.p809b.C18710c;
import dagger.p1859a.C47373d;
import javax.p1876a.C47883a;

public final class SnapCreativeKitApi_Factory implements C47373d<SnapCreativeKitApi> {
    private final C47883a<String> clientIdProvider;
    private final C47883a<Context> contextProvider;
    private final C47883a<C18710c> creativeKitOpMetricsManagerProvider;
    private final C47883a<C18708a> eventFactoryProvider;
    private final C47883a<MetricQueue<ServerEvent>> eventQueueProvider;
    private final C47883a<String> redirectUrlProvider;

    public final SnapCreativeKitApi get() {
        SnapCreativeKitApi snapCreativeKitApi = new SnapCreativeKitApi((Context) this.contextProvider.get(), (String) this.clientIdProvider.get(), (String) this.redirectUrlProvider.get(), (C18710c) this.creativeKitOpMetricsManagerProvider.get(), (MetricQueue) this.eventQueueProvider.get(), (C18708a) this.eventFactoryProvider.get());
        return snapCreativeKitApi;
    }

    public SnapCreativeKitApi_Factory(C47883a<Context> aVar, C47883a<String> aVar2, C47883a<String> aVar3, C47883a<C18710c> aVar4, C47883a<MetricQueue<ServerEvent>> aVar5, C47883a<C18708a> aVar6) {
        this.contextProvider = aVar;
        this.clientIdProvider = aVar2;
        this.redirectUrlProvider = aVar3;
        this.creativeKitOpMetricsManagerProvider = aVar4;
        this.eventQueueProvider = aVar5;
        this.eventFactoryProvider = aVar6;
    }

    public static C47373d<SnapCreativeKitApi> create(C47883a<Context> aVar, C47883a<String> aVar2, C47883a<String> aVar3, C47883a<C18710c> aVar4, C47883a<MetricQueue<ServerEvent>> aVar5, C47883a<C18708a> aVar6) {
        SnapCreativeKitApi_Factory snapCreativeKitApi_Factory = new SnapCreativeKitApi_Factory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6);
        return snapCreativeKitApi_Factory;
    }

    public static SnapCreativeKitApi newSnapCreativeKitApi(Context context, String str, String str2, C18710c cVar, MetricQueue<ServerEvent> metricQueue, C18708a aVar) {
        SnapCreativeKitApi snapCreativeKitApi = new SnapCreativeKitApi(context, str, str2, cVar, metricQueue, aVar);
        return snapCreativeKitApi;
    }
}
