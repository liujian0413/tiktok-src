package com.p280ss.android.ugc.aweme.notice;

import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.notice.api.p1428c.C34318a;
import com.p280ss.android.ugc.aweme.notice.api.p1428c.C34319b;
import com.p280ss.android.ugc.aweme.notification.NewsFragment;
import com.p280ss.android.ugc.aweme.notification.bridgeservice.INoticeBridgeService;

/* renamed from: com.ss.android.ugc.aweme.notice.b */
public final class C34344b implements C34319b {
    /* renamed from: b */
    public final C34318a mo87148b() {
        return new NewsFragment();
    }

    /* renamed from: a */
    public final <T extends AmeBaseFragment> Class<? extends T> mo87147a() {
        return ((INoticeBridgeService) ServiceManager.get().getService(INoticeBridgeService.class)).getNoticeFragmentClass();
    }
}
