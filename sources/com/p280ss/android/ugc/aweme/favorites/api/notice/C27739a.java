package com.p280ss.android.ugc.aweme.favorites.api.notice;

import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.mvp.p1415a.C34028a;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.favorites.api.notice.a */
public final class C27739a extends C34028a<CollectionNotice> {

    /* renamed from: a */
    private C27741a f73175a;

    /* renamed from: com.ss.android.ugc.aweme.favorites.api.notice.a$a */
    public interface C27741a {
        /* renamed from: a */
        void mo71225a(CollectionNotice collectionNotice);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(CollectionNotice collectionNotice) {
        super.handleData(collectionNotice);
        if (this.f73175a != null) {
            this.f73175a.mo71225a(collectionNotice);
        }
    }

    /* renamed from: a */
    public final void mo71222a(C27741a aVar) {
        this.f73175a = aVar;
        C23397p.m76735a().mo60807a(this.mHandler, new Callable() {
            public final Object call() throws Exception {
                return CollectionNoticeApi.m90942a();
            }
        }, 0);
    }
}
