package com.p280ss.android.ugc.aweme.poi.nearby.p1463a;

import com.p280ss.android.ugc.aweme.common.C25652b;
import com.p280ss.android.ugc.aweme.feed.C28410h;
import com.p280ss.android.ugc.aweme.poi.model.C35117g;
import com.p280ss.android.ugc.aweme.poi.model.PoiJoinActivityResponse;

/* renamed from: com.ss.android.ugc.aweme.poi.nearby.a.a */
public final class C35128a extends C25652b<C35117g, C35129b> {
    /* renamed from: b */
    public final void mo56977b() {
        if (this.f67572c != null && this.f67571b != null) {
            C28410h.m93358a(true);
            ((C35129b) this.f67572c).mo89420a((PoiJoinActivityResponse) ((C35117g) this.f67571b).getData());
        }
    }

    /* renamed from: a */
    public final void mo57296a(Exception exc) {
        super.mo57296a(exc);
        if (this.f67572c != null && this.f67571b != null) {
            ((C35129b) this.f67572c).mo89421a(exc);
        }
    }
}
