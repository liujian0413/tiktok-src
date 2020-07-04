package com.p280ss.android.ugc.aweme.detail.p1166j;

import com.p280ss.android.ugc.aweme.discover.mixfeed.C26754d;
import com.p280ss.android.ugc.aweme.discover.mixfeed.C26756f;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.detail.j.h */
public final class C26103h extends C26099d<C26756f, C26754d> {
    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final List<C26754d> mo67677e() {
        C26756f fVar = (C26756f) this.f67571b;
        if (fVar != null) {
            return fVar.getItems();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final List<Aweme> mo67678f() {
        List list;
        C26756f fVar = (C26756f) this.f67571b;
        if (fVar != null) {
            list = fVar.getItems();
        } else {
            list = null;
        }
        List<Aweme> a = C26756f.m87814a(list);
        C7573i.m23582a((Object) a, "SearchMixFeedModel.getAwemes(mModel?.items)");
        return a;
    }

    /* renamed from: b */
    public final /* synthetic */ String mo67676b(Object obj) {
        return m85754a((C26754d) obj);
    }

    /* renamed from: a */
    private static String m85754a(C26754d dVar) {
        if (dVar != null) {
            Aweme aweme = dVar.getAweme();
            if (aweme != null) {
                String m = C33230ac.m107238m(aweme);
                C7573i.m23582a((Object) m, "MobUtils.getAid(data?.aweme ?: return \"\")");
                return m;
            }
        }
        return "";
    }
}
