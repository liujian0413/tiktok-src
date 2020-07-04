package com.p280ss.android.ugc.aweme.experiment;

import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.abmock.p260a.C6381a;
import com.bytedance.ies.abmock.p260a.C6382b;
import com.bytedance.ies.abmock.p260a.C6383c;
import java.util.concurrent.TimeUnit;

@C6381a(mo15284a = "follow_feed_auto_refresh_after_restart_duration")
@C6383c
/* renamed from: com.ss.android.ugc.aweme.experiment.AutoRefreshAfterRestartExperiment */
public final class AutoRefreshAfterRestartExperiment {
    @C6382b
    private static final int AUTO_REFRESH_1 = 1;
    @C6382b
    private static final int AUTO_REFRESH_120 = 120;
    @C6382b
    private static final int AUTO_REFRESH_30 = 30;
    @C6382b
    private static final int AUTO_REFRESH_5 = 5;
    @C6382b(mo15285a = true)
    private static final int DEFAULT = 0;
    public static final AutoRefreshAfterRestartExperiment INSTANCE = new AutoRefreshAfterRestartExperiment();

    private AutoRefreshAfterRestartExperiment() {
    }

    public static /* synthetic */ void autoRefreshDuration$annotations() {
    }

    public static final long getAutoRefreshDuration() {
        int a = C6384b.m19835a().mo15287a(AutoRefreshAfterRestartExperiment.class, false, "follow_feed_auto_refresh_after_restart_duration", C6384b.m19835a().mo15295d().follow_feed_auto_refresh_after_restart_duration, 0);
        if (a <= 0) {
            return Long.MAX_VALUE;
        }
        return TimeUnit.MINUTES.toMillis((long) a);
    }
}
