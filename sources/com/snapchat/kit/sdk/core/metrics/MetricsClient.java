package com.snapchat.kit.sdk.core.metrics;

import com.snapchat.kit.sdk.core.metrics.model.Metrics;
import com.snapchat.kit.sdk.core.metrics.model.ServerEventBatch;
import retrofit2.C48475b;
import retrofit2.p363b.C7725a;
import retrofit2.p363b.C7739o;

public interface MetricsClient {
    @C7739o(mo20429a = "/v1/sdk/metrics/business")
    C48475b<Void> postAnalytics(@C7725a ServerEventBatch serverEventBatch);

    @C7739o(mo20429a = "/v1/sdk/metrics/operational")
    C48475b<Void> postOperationalMetrics(@C7725a Metrics metrics);
}
