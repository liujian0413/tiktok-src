package com.p280ss.android.ugc.aweme.feed.preload;

import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.imagepipeline.common.C13596d;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.request.C13842b;
import com.facebook.imagepipeline.request.ImageRequest;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.feed.C28434i;
import com.p280ss.android.ugc.aweme.feed.cache.IFeedApi;
import com.p280ss.android.ugc.aweme.feed.experiment.FeedCacheEnabledExperiment;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.feed.preload.n */
public final class C28673n extends C28653a<FeedItemList> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo73714a() throws Exception {
        return m94339f();
    }

    /* renamed from: e */
    public final boolean mo73723e() {
        if (C6399b.m19944t()) {
            return C6384b.m19835a().mo15292a(FeedCacheEnabledExperiment.class, true, "is_feed_load_cache", C6384b.m19835a().mo15295d().is_feed_load_cache, true);
        }
        return false;
    }

    /* renamed from: f */
    private static FeedItemList m94339f() throws Exception {
        int i;
        if (C28434i.m93483l() != null) {
            return null;
        }
        C28659e a = C28662h.m94303a().mo73724a(3);
        a.mo73716b();
        FeedItemList feedItemList = (FeedItemList) a.mo73717c();
        if (feedItemList != null) {
            return feedItemList;
        }
        if (C28434i.m93482k()) {
            i = 4;
        } else {
            i = 0;
        }
        return ((IFeedApi) ServiceManager.get().getService(IFeedApi.class)).fetchFeedList(0, 0, 0, 6, null, null, i, 0, "", null, null, 0, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo73715a(Object obj) throws Exception {
        m94338a((FeedItemList) obj);
    }

    /* renamed from: a */
    private static void m94338a(FeedItemList feedItemList) throws Exception {
        if (feedItemList != null && !C6307b.m19566a((Collection<T>) feedItemList.getItems())) {
            Aweme aweme = (Aweme) feedItemList.getItems().get(0);
            if (C13380c.m39173d()) {
                ImageRequest[] a = C23323e.m76520a(aweme.getVideo().getOriginCover(), (C13596d) null, Priority.HIGH, (C13842b) null);
                if (a != null && a.length != 0) {
                    C13380c.m39172c().mo33172a(a[0], (Object) C6399b.m19921a());
                }
            }
        }
    }
}
