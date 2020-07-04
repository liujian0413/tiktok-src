package com.p280ss.android.ugc.aweme.feed.p1233i;

import com.p280ss.android.ugc.aweme.common.C25652b;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;

/* renamed from: com.ss.android.ugc.aweme.feed.i.u */
public final class C28470u extends C25652b<C28468t, C28465q> {
    /* renamed from: b */
    public final void mo56977b() {
        if (this.f67572c != null && this.f67571b != null) {
            StringBuilder sb = new StringBuilder("onItemDelete ");
            sb.append((String) ((C28468t) this.f67571b).getData());
            C6921a.m21552a(6, "DeleteAweme", sb.toString());
            ((C28465q) this.f67572c).mo67620b_((String) ((C28468t) this.f67571b).getData());
        }
    }

    /* renamed from: a */
    public final void mo57296a(Exception exc) {
        if (this.f67572c != null) {
            ((C28465q) this.f67572c).mo67624e(exc);
        }
    }
}
