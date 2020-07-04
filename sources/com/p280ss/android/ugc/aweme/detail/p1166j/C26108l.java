package com.p280ss.android.ugc.aweme.detail.p1166j;

import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.poi.model.C35120j;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.detail.j.l */
public final class C26108l extends C26099d<C35120j, Aweme> {
    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final List<Aweme> mo67677e() {
        C35120j jVar = (C35120j) this.f67571b;
        if (jVar != null) {
            return jVar.getItems();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final List<Aweme> mo67678f() {
        C35120j jVar = (C35120j) this.f67571b;
        if (jVar != null) {
            return jVar.getItems();
        }
        return null;
    }

    /* renamed from: b */
    public final /* synthetic */ String mo67676b(Object obj) {
        return m85766a((Aweme) obj);
    }

    /* renamed from: a */
    private static String m85766a(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        String m = C33230ac.m107238m(aweme);
        C7573i.m23582a((Object) m, "MobUtils.getAid(data ?: return \"\")");
        return m;
    }
}
