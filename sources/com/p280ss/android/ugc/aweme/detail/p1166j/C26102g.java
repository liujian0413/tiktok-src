package com.p280ss.android.ugc.aweme.detail.p1166j;

import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.newfollow.model.C34145b;
import com.p280ss.android.ugc.aweme.poi.model.C35105b;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.detail.j.g */
public final class C26102g extends C26099d<C35105b, C34145b> {
    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final List<C34145b> mo67677e() {
        C35105b bVar = (C35105b) this.f67571b;
        if (bVar != null) {
            return bVar.getItems();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final List<Aweme> mo67678f() {
        List list;
        C35105b bVar = (C35105b) this.f67571b;
        if (bVar != null) {
            list = bVar.getItems();
        } else {
            list = null;
        }
        List<Aweme> a = C35105b.m113258a(list);
        C7573i.m23582a((Object) a, "PoiAwemeFeedModel.getAwemes(mModel?.items)");
        return a;
    }

    /* renamed from: b */
    public final /* synthetic */ String mo67676b(Object obj) {
        return m85750a((C34145b) obj);
    }

    /* renamed from: a */
    private static String m85750a(C34145b bVar) {
        if (bVar != null) {
            Aweme aweme = bVar.getAweme();
            if (aweme != null) {
                String m = C33230ac.m107238m(aweme);
                C7573i.m23582a((Object) m, "MobUtils.getAid(data?.aweme ?: return \"\")");
                return m;
            }
        }
        return "";
    }
}
