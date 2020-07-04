package com.p280ss.android.ugc.aweme.detail.p1166j;

import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.poi.model.C35122k;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.detail.j.k */
public final class C26107k extends C26099d<C35122k, Aweme> {
    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final List<Aweme> mo67677e() {
        C35122k kVar = (C35122k) this.f67571b;
        if (kVar != null) {
            List<Aweme> items = kVar.getItems();
            if (items != null) {
                return items;
            }
        }
        return new ArrayList<>();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final List<Aweme> mo67678f() {
        C35122k kVar = (C35122k) this.f67571b;
        if (kVar != null) {
            List<Aweme> items = kVar.getItems();
            if (items != null) {
                return items;
            }
        }
        return new ArrayList<>();
    }

    /* renamed from: b */
    public final /* synthetic */ String mo67676b(Object obj) {
        return m85762a((Aweme) obj);
    }

    /* renamed from: a */
    private static String m85762a(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        String m = C33230ac.m107238m(aweme);
        C7573i.m23582a((Object) m, "MobUtils.getAid(data ?: return \"\")");
        return m;
    }
}
