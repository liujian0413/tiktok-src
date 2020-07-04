package com.p280ss.android.ugc.aweme.commercialize.splash.livesplash;

import com.google.gson.p277b.C6597a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.livesplash.LiveAwesomeData;
import com.p280ss.android.ugc.aweme.feed.model.livesplash.LiveAwesomeSplashInfo;

/* renamed from: com.ss.android.ugc.aweme.commercialize.splash.livesplash.c */
public final class C25072c {

    /* renamed from: a */
    public static final C25072c f66180a = new C25072c();

    /* renamed from: com.ss.android.ugc.aweme.commercialize.splash.livesplash.c$a */
    public static final class C25073a extends C6597a<LiveAwesomeData> {
        C25073a() {
        }
    }

    private C25072c() {
    }

    /* renamed from: c */
    public static final boolean m82577c(Aweme aweme) {
        if (aweme == null || aweme.getLiveAwesomeSplashInfo() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public static final LiveAwesomeSplashInfo m82582h(Aweme aweme) {
        if (aweme != null) {
            return aweme.getLiveAwesomeSplashInfo();
        }
        return null;
    }

    /* renamed from: a */
    public static final boolean m82575a(Aweme aweme) {
        if (aweme != null) {
            LiveAwesomeSplashInfo liveAwesomeSplashInfo = aweme.getLiveAwesomeSplashInfo();
            if (liveAwesomeSplashInfo != null && liveAwesomeSplashInfo.getTopviewValid()) {
                return liveAwesomeSplashInfo.isTopViewData();
            }
            return false;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m82576b(Aweme aweme) {
        if (aweme != null) {
            LiveAwesomeSplashInfo liveAwesomeSplashInfo = aweme.getLiveAwesomeSplashInfo();
            if (liveAwesomeSplashInfo != null && liveAwesomeSplashInfo.isTopViewData()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public static final boolean m82578d(Aweme aweme) {
        if (aweme != null) {
            LiveAwesomeSplashInfo liveAwesomeSplashInfo = aweme.getLiveAwesomeSplashInfo();
            if (liveAwesomeSplashInfo != null && !liveAwesomeSplashInfo.isTopViewData()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public static final boolean m82579e(Aweme aweme) {
        if (!m82575a(aweme)) {
            return true;
        }
        if (aweme != null) {
            LiveAwesomeSplashInfo liveAwesomeSplashInfo = aweme.getLiveAwesomeSplashInfo();
            if (liveAwesomeSplashInfo != null && liveAwesomeSplashInfo.getHasShown()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public static final void m82580f(Aweme aweme) {
        if (m82575a(aweme) && aweme != null) {
            LiveAwesomeSplashInfo liveAwesomeSplashInfo = aweme.getLiveAwesomeSplashInfo();
            if (liveAwesomeSplashInfo != null) {
                liveAwesomeSplashInfo.setHasShown(true);
            }
        }
    }

    /* renamed from: g */
    public static final boolean m82581g(Aweme aweme) {
        if (m82575a(aweme) && aweme != null) {
            LiveAwesomeSplashInfo liveAwesomeSplashInfo = aweme.getLiveAwesomeSplashInfo();
            if (liveAwesomeSplashInfo == null || !liveAwesomeSplashInfo.getTopviewValid()) {
                return true;
            }
            long endTime = liveAwesomeSplashInfo.getEndTime();
            if (endTime != 0 && endTime >= System.currentTimeMillis() / 1000) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0011 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0012  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.p280ss.android.ugc.aweme.feed.model.livesplash.LiveAwesomeData m82583i(com.p280ss.android.ugc.aweme.feed.model.Aweme r2) {
        /*
            r0 = 0
            if (r2 == 0) goto L_0x000e
            com.ss.android.ugc.aweme.feed.model.livesplash.LiveAwesomeSplashInfo r2 = r2.getLiveAwesomeSplashInfo()
            if (r2 == 0) goto L_0x000e
            java.lang.String r2 = r2.getLiveData()
            goto L_0x000f
        L_0x000e:
            r2 = r0
        L_0x000f:
            if (r2 != 0) goto L_0x0012
            return r0
        L_0x0012:
            com.google.gson.e r0 = new com.google.gson.e
            r0.<init>()
            com.ss.android.ugc.aweme.commercialize.splash.livesplash.c$a r1 = new com.ss.android.ugc.aweme.commercialize.splash.livesplash.c$a
            r1.<init>()
            java.lang.reflect.Type r1 = r1.type
            java.lang.Object r2 = r0.mo15975a(r2, r1)
            com.ss.android.ugc.aweme.feed.model.livesplash.LiveAwesomeData r2 = (com.p280ss.android.ugc.aweme.feed.model.livesplash.LiveAwesomeData) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.splash.livesplash.C25072c.m82583i(com.ss.android.ugc.aweme.feed.model.Aweme):com.ss.android.ugc.aweme.feed.model.livesplash.LiveAwesomeData");
    }
}
