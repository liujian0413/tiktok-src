package com.p280ss.android.ugc.aweme.app;

import com.p280ss.android.ugc.aweme.antiaddic.p1010a.C22555a;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.base.p1058c.C23283b;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.app.ae */
public final class C22769ae {

    /* renamed from: a */
    private C22555a f60458a;

    /* renamed from: b */
    private C22903bl<Long> f60459b;

    /* renamed from: c */
    private volatile long f60460c;

    /* renamed from: com.ss.android.ugc.aweme.app.ae$a */
    static class C22771a {

        /* renamed from: a */
        public static C22769ae f60462a = new C22769ae();
    }

    /* renamed from: a */
    public static C22769ae m75151a() {
        return C22771a.f60462a;
    }

    /* renamed from: b */
    public final long mo59822b() {
        return Math.max(0, this.f60460c);
    }

    private C22769ae() {
        this.f60458a = new C22555a(0) {
            /* renamed from: a */
            public final C22903bl<Long> mo59195a() {
                return SharePrefCache.inst().getLastFeedTime();
            }
        };
        this.f60459b = SharePrefCache.inst().getLastFeedCount();
        this.f60460c = ((Long) this.f60459b.mo59877d()).longValue();
        C42961az.m136382c(this);
    }

    /* renamed from: a */
    private void m75152a(long j) {
        this.f60460c = j;
        this.f60459b.mo59871a(Long.valueOf(this.f60460c));
    }

    @C7709l(mo20401b = true)
    public final void onQueryUserFinishedEvent(C23283b bVar) {
        ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).setFeedCount(0);
        m75152a(-1);
    }

    /* renamed from: a */
    public final void mo59821a(FeedItemList feedItemList) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f60458a.mo59197b(currentTimeMillis)) {
                m75152a(-1);
            }
            m75152a(this.f60460c + 1);
            this.f60458a.mo59196a(currentTimeMillis);
            long j = this.f60460c;
            if (!(feedItemList == null || feedItemList.getItems() == null)) {
                for (Aweme feedCount : feedItemList.getItems()) {
                    feedCount.setFeedCount(j);
                }
            }
        } catch (Exception unused) {
        }
    }
}
