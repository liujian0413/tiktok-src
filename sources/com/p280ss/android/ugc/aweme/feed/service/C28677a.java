package com.p280ss.android.ugc.aweme.feed.service;

import com.p280ss.android.ugc.aweme.feed.adapter.C28134ag;
import com.p280ss.android.ugc.aweme.feed.adapter.C28197y;
import com.p280ss.android.ugc.aweme.feed.guide.C28394j;
import com.p280ss.android.ugc.aweme.feed.panel.C28649y;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;

/* renamed from: com.ss.android.ugc.aweme.feed.service.a */
public final class C28677a {

    /* renamed from: a */
    private static volatile IFeedComponentService f75548a;

    /* renamed from: a */
    public static C28681e m94347a() {
        return m94353g().getFeedWidgetService();
    }

    /* renamed from: b */
    public static C28134ag m94348b() {
        return m94353g().getVideoViewHolderService();
    }

    /* renamed from: c */
    public static C28649y m94349c() {
        return m94353g().getFeedFragmentPanelService();
    }

    /* renamed from: d */
    public static C28197y m94350d() {
        return m94353g().getFeedAdapterService();
    }

    /* renamed from: e */
    public static C28394j m94351e() {
        return m94353g().getGuideService();
    }

    /* renamed from: f */
    public static C28680d m94352f() {
        return m94353g().getFeedExperimentService();
    }

    /* renamed from: g */
    private static IFeedComponentService m94353g() {
        if (f75548a == null) {
            f75548a = (IFeedComponentService) ServiceManager.get().getService(IFeedComponentService.class);
        }
        return f75548a;
    }
}
