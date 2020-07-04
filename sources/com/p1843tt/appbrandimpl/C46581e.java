package com.p1843tt.appbrandimpl;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28503s;
import com.p280ss.android.ugc.aweme.miniapp_api.model.event.MpCommonEvent.C33461a;
import com.p280ss.android.ugc.aweme.miniapp_api.p1397a.C33430e;
import java.util.Collection;
import java.util.List;

/* renamed from: com.tt.appbrandimpl.e */
public class C46581e {

    /* renamed from: a */
    public static final String f120067a = "e";

    /* renamed from: b */
    private C46577b f120068b;

    /* renamed from: c */
    private C25674b f120069c;

    /* renamed from: d */
    private String f120070d;

    /* renamed from: e */
    private String f120071e;

    /* renamed from: com.tt.appbrandimpl.e$a */
    static class C46582a {

        /* renamed from: a */
        public static final C46581e f120072a = new C46581e();
    }

    /* renamed from: a */
    public static C46581e m146380a() {
        return C46582a.f120072a;
    }

    /* renamed from: a */
    public final void mo115780a(String str, String str2, String str3, int i, C33430e eVar) {
        long j;
        if (TextUtils.equals("fetch_video", str)) {
            if (!TextUtils.equals(this.f120070d, str2)) {
                this.f120068b = null;
                this.f120069c = null;
                this.f120070d = str2;
            }
            if (!TextUtils.equals(this.f120071e, str3)) {
                this.f120068b = null;
                this.f120069c = null;
                this.f120071e = str3;
            }
            if (this.f120068b == null) {
                this.f120068b = new C46577b();
            }
            if (this.f120069c == null) {
                this.f120069c = new C25674b();
            }
            this.f120069c.mo66536a(this.f120068b);
            FeedItemList feedItemList = (FeedItemList) this.f120068b.getData();
            if (feedItemList != null) {
                j = feedItemList.cursor;
            } else {
                j = 0;
            }
            if (this.f120068b.isHasMore() || j == 0) {
                this.f120069c.mo56976a(Integer.valueOf(4), str2, str3, Long.valueOf(j), Integer.valueOf(10));
            }
            return;
        }
        if (TextUtils.equals("open_video", str)) {
            List items = this.f120068b.getItems();
            if (i >= 0 && i < items.size() && !C6307b.m19566a((Collection<T>) items)) {
                eVar.mo85669a(new C33461a().mo85774b(((Aweme) items.get(i)).getAid()).mo85773a());
                C28503s.m93679a((C25673a) this.f120068b);
            }
        }
    }
}
