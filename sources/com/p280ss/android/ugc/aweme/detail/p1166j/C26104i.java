package com.p280ss.android.ugc.aweme.detail.p1166j;

import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.follow.presenter.C29452a;
import com.p280ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.newfollow.userstate.C34180a;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.detail.j.i */
public final class C26104i extends C26099d<C34180a, FollowFeed> {
    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final List<FollowFeed> mo67677e() {
        if (this.f67571b == null) {
            return null;
        }
        return ((C34180a) this.f67571b).getItems();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final List<Aweme> mo67678f() {
        return C29452a.m96923a(((C34180a) this.f67571b).getItems());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ String mo67676b(Object obj) {
        return m85758a((FollowFeed) obj);
    }

    /* renamed from: a */
    private static String m85758a(FollowFeed followFeed) {
        if (followFeed == null) {
            return "";
        }
        return C33230ac.m107238m(followFeed.getAweme());
    }
}
