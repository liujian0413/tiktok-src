package com.p280ss.android.ugc.aweme.feed.panel;

import com.p280ss.android.ugc.aweme.feed.adapter.C28130ac;
import com.p280ss.android.ugc.aweme.feed.event.C28319b;
import java.util.Map;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.ss.android.ugc.aweme.feed.panel.t */
final /* synthetic */ class C28644t implements C7326g {

    /* renamed from: a */
    private final Map f75489a;

    /* renamed from: b */
    private final C28319b f75490b;

    C28644t(Map map, C28319b bVar) {
        this.f75489a = map;
        this.f75490b = bVar;
    }

    public final void accept(Object obj) {
        ((C28130ac) obj).mo71551a(this.f75489a, this.f75490b.f74643b);
    }
}
