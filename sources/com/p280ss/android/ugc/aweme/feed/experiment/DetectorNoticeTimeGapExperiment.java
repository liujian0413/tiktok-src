package com.p280ss.android.ugc.aweme.feed.experiment;

import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.abmock.p260a.C6381a;
import com.bytedance.ies.abmock.p260a.C6382b;

@C6381a(mo15284a = "network_notice_time")
/* renamed from: com.ss.android.ugc.aweme.feed.experiment.DetectorNoticeTimeGapExperiment */
public final class DetectorNoticeTimeGapExperiment {
    @C6382b(mo15285a = true)
    private static final long DEFAULT_TIME_GAP = 15000;
    public static final DetectorNoticeTimeGapExperiment INSTANCE = new DetectorNoticeTimeGapExperiment();
    private static long timeGap;

    private DetectorNoticeTimeGapExperiment() {
    }

    public final long getTimeGap() {
        return timeGap;
    }

    static {
        long a = C6384b.m19835a().mo15288a(DetectorNoticeTimeGapExperiment.class, true, "network_notice_time", C6384b.m19835a().mo15295d().network_notice_time, 15000);
        if (a <= 0) {
            a = 15000;
        }
        timeGap = a;
    }

    public final void setTimeGap(long j) {
        timeGap = j;
    }
}
