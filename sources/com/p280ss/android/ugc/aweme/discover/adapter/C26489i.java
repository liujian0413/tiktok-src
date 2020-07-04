package com.p280ss.android.ugc.aweme.discover.adapter;

import com.p280ss.android.ugc.aweme.commercialize.log.C24939aj;
import com.p280ss.android.ugc.aweme.commercialize.log.C24958f;
import com.p280ss.android.ugc.aweme.discover.model.HotSearchItem;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.i */
final /* synthetic */ class C26489i implements C24939aj {

    /* renamed from: a */
    private final HotSearchItem f69864a;

    C26489i(HotSearchItem hotSearchItem) {
        this.f69864a = hotSearchItem;
    }

    /* renamed from: a */
    public final void mo63403a(String str, String str2, long j) {
        C24958f.m81906a(str, str2, j).mo65276b("track_url").mo65266a("track_ad").mo65285g("show").mo65261a(this.f69864a.getAdData()).mo65278b();
    }
}
