package com.p280ss.android.ugc.aweme.main;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.experiment.NotificationTabStyleExperiment;
import com.p280ss.android.ugc.aweme.notice.api.C34315c;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;

/* renamed from: com.ss.android.ugc.aweme.main.df */
public final class C32971df {

    /* renamed from: a */
    public static final C32971df f85924a = new C32971df();

    private C32971df() {
    }

    /* renamed from: c */
    public static final boolean m106596c() {
        if (C6399b.m19947w()) {
            if (C34315c.m110982b(12)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public static final int m106597d() {
        return C34315c.m110974a(99, 7, 3, 6, 2);
    }

    /* renamed from: a */
    public static final int m106592a() {
        int a = C34315c.m110974a(99);
        if (C6399b.m19947w()) {
            return a + C34315c.m110974a(47, 7, 3, 6, 44, 62);
        }
        return a;
    }

    /* renamed from: b */
    public static final boolean m106594b() {
        if (NotificationTabStyleExperiment.isNewStyleTabBadge()) {
            return C34315c.m110982b(43, 12, 13, 47, 62, 61, 46, 14, 21, 11, BaseNotice.HASHTAG, 1000);
        }
        return C34315c.m110982b(46, 11, 12, BaseNotice.HASHTAG, 1000);
    }

    /* renamed from: b */
    public static final boolean m106595b(int i) {
        if (NotificationTabStyleExperiment.isNewStyleTabBadge()) {
            if (i == 99 || i == 7 || i == 3 || i == 6 || i == 2) {
                return true;
            }
            return false;
        } else if (i == 47 || i == 62 || i == 61 || i == 99 || i == 21 || i == 7 || i == 3 || i == 6 || i == 44) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public static final boolean m106593a(int i) {
        if (NotificationTabStyleExperiment.isNewStyleTabBadge()) {
            if (i == 43 || i == 12 || i == 13 || i == 47 || i == 62 || i == 61 || i == 46 || i == 14 || i == 21 || i == 11 || i == 101 || i == 1000) {
                return true;
            }
            return false;
        } else if (i == 46 || i == 11 || i == 101 || i == 1000) {
            return true;
        } else {
            return false;
        }
    }
}
