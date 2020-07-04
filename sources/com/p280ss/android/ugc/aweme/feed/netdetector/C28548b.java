package com.p280ss.android.ugc.aweme.feed.netdetector;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.feed.experiment.DetectorEnableExperiment;
import com.p280ss.android.ugc.aweme.feed.experiment.DetectorNoticeEnableExperiment;
import com.p280ss.android.ugc.aweme.feed.netdetector.base.C28553b;
import com.p280ss.android.ugc.aweme.feed.netdetector.base.C28555d;
import com.p280ss.android.ugc.aweme.feed.netdetector.fetchfeed.C28568e;

/* renamed from: com.ss.android.ugc.aweme.feed.netdetector.b */
public final class C28548b {
    /* renamed from: a */
    public static final boolean m93759a(int i) {
        return i == 1 || i == 0;
    }

    /* renamed from: a */
    public static final boolean m93758a() {
        if (!DetectorEnableExperiment.INSTANCE.getEnableDetector() || !C6399b.m19944t()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static final boolean m93760b() {
        if (!m93758a() || !DetectorNoticeEnableExperiment.INSTANCE.getEnableDetector()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final C28553b m93757a(int i, int i2) {
        boolean a;
        if (m93759a(i) && (m93758a() & C28556c.m93777a(C6399b.m19921a()))) {
            return C28545a.f75190b.mo73256a((C28555d) new C28568e(C28545a.f75190b.mo73257a()));
        }
        return null;
    }
}
