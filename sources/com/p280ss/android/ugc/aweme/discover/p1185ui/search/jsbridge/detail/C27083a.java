package com.p280ss.android.ugc.aweme.discover.p1185ui.search.jsbridge.detail;

import com.p280ss.android.ugc.aweme.discover.p1185ui.search.C27063a;
import com.p280ss.android.ugc.aweme.favorites.viewholder.C27834b;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.detail.a */
public final class C27083a {

    /* renamed from: a */
    public C27084a f71458a;

    /* renamed from: b */
    public C27084a f71459b;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.detail.a$a */
    public interface C27084a {
        /* renamed from: a */
        void mo69874a();

        /* renamed from: a */
        void mo69875a(List<Aweme> list, boolean z);
    }

    /* renamed from: a */
    public final void mo69872a(C27084a aVar) {
        this.f71458a = aVar;
        C27063a.m88825b("loadMore");
        C27834b.m91249a("loadMore");
    }

    /* renamed from: b */
    public final void mo69873b(C27084a aVar) {
        this.f71459b = aVar;
        C27063a.m88825b("loadLatest");
        C27834b.m91249a("loadLatest");
    }
}
