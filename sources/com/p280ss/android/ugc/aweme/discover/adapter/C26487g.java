package com.p280ss.android.ugc.aweme.discover.adapter;

import com.p280ss.android.ugc.aweme.commercialize.log.C24939aj;
import com.p280ss.android.ugc.aweme.commercialize.log.C24958f;
import com.p280ss.android.ugc.aweme.discover.model.HotSearchItem;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.g */
final /* synthetic */ class C26487g implements C24939aj {

    /* renamed from: a */
    private final HotSearchItem f69862a;

    C26487g(HotSearchItem hotSearchItem) {
        this.f69862a = hotSearchItem;
    }

    /* renamed from: a */
    public final void mo63403a(String str, String str2, long j) {
        C24958f.m81906a(str, str2, j).mo65276b("track_url").mo65266a("track_ad").mo65285g("click").mo65261a(this.f69862a.getAdData()).mo65278b();
    }
}
