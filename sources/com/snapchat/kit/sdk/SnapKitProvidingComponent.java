package com.snapchat.kit.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.C6600e;
import com.snapchat.kit.sdk.core.controller.LoginStateController;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.business.KitEventBaseFactory;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import com.snapchat.kit.sdk.core.networking.AuthTokenManager;
import com.snapchat.kit.sdk.core.networking.ClientFactory;

public interface SnapKitProvidingComponent {
    MetricQueue<ServerEvent> analyticsEventQueue();

    ClientFactory apiFactory();

    AuthTokenManager authTokenManager();

    String clientId();

    Context context();

    C6600e gson();

    KitEventBaseFactory kitEventBaseFactory();

    LoginStateController logoutController();

    MetricQueue<OpMetric> operationalMetricsQueue();

    String redirectUrl();

    SharedPreferences sharedPreferences();
}
