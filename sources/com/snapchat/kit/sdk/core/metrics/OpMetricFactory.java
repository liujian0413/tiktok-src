package com.snapchat.kit.sdk.core.metrics;

import com.snapchat.kit.sdk.core.metrics.model.CounterMetric;
import com.snapchat.kit.sdk.core.metrics.model.LevelMetric;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric;
import com.snapchat.kit.sdk.core.metrics.model.TimerMetric;
import com.snapchat.kit.sdk.core.metrics.model.Timestamp;
import com.snapchat.kit.sdk.core.metrics.model.Timestamp.Builder;
import java.util.concurrent.TimeUnit;

public class OpMetricFactory {

    /* renamed from: a */
    private static final long f50411a = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: b */
    private static final int f50412b = ((int) TimeUnit.MILLISECONDS.toNanos(1));

    /* renamed from: a */
    private static Timestamp m61166a() {
        long currentTimeMillis = System.currentTimeMillis();
        return new Builder().seconds(Long.valueOf(currentTimeMillis / f50411a)).nanos(Integer.valueOf(((int) (currentTimeMillis % f50411a)) * f50412b)).build();
    }

    public static OpMetric createCount(String str, long j) {
        return new OpMetric.Builder().counter_metric(new CounterMetric.Builder().name(str).count(Long.valueOf(j)).timestamp(m61166a()).build()).build();
    }

    public static OpMetric createLevel(String str, long j) {
        return new OpMetric.Builder().level_metric(new LevelMetric.Builder().name(str).level(Long.valueOf(j)).timestamp(m61166a()).build()).build();
    }

    public static OpMetric createTimer(String str, long j) {
        return new OpMetric.Builder().timer_metric(new TimerMetric.Builder().name(str).latency_millis(Long.valueOf(j)).timestamp(m61166a()).build()).build();
    }
}
