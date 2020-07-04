package com.p280ss.android.ugc.aweme.detail.p1166j;

import com.p280ss.android.ugc.aweme.familiar.p965a.C21709a;
import com.p280ss.android.ugc.aweme.familiar.p965a.C21712c;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.detail.j.e */
public final class C26100e extends C26099d<C21712c, C21709a> {
    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final List<C21709a> mo67677e() {
        C21712c cVar = (C21712c) this.f67571b;
        if (cVar != null) {
            return cVar.getItems();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final List<Aweme> mo67678f() {
        C21712c cVar = (C21712c) this.f67571b;
        if (cVar != null) {
            return cVar.mo57987b();
        }
        return null;
    }

    /* renamed from: b */
    public final /* synthetic */ String mo67676b(Object obj) {
        return m85742a((C21709a) obj);
    }

    /* renamed from: a */
    private static String m85742a(C21709a aVar) {
        if (aVar != null) {
            String m = C33230ac.m107238m(aVar.getAweme());
            if (m != null) {
                return m;
            }
        }
        return "";
    }
}
