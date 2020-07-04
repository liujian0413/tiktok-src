package com.p280ss.android.ugc.aweme.detail.p1166j;

import com.p280ss.android.ugc.aweme.common.p1144e.C25675c;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.poi.model.C35123l;
import com.p280ss.android.ugc.aweme.poi.model.feed.C35116f;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.detail.j.m */
public final class C26109m extends C26099d<C35123l, C35116f> {
    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final List<C35116f> mo67677e() {
        C35123l lVar = (C35123l) this.f67571b;
        if (lVar != null) {
            return lVar.getItems();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final List<Aweme> mo67678f() {
        List list;
        C35123l lVar = (C35123l) this.f67571b;
        if (lVar != null) {
            list = lVar.getItems();
        } else {
            list = null;
        }
        List<Aweme> a = C35123l.m113334a(list);
        C7573i.m23582a((Object) a, "PoiRankFilterModel.getAwemes(mModel?.items)");
        return a;
    }

    /* renamed from: b */
    public final /* synthetic */ String mo67676b(Object obj) {
        return m85770a((C35116f) obj);
    }

    /* renamed from: a */
    public final void mo57296a(Exception exc) {
        super.mo57296a(exc);
        if (this.f67572c != null) {
            ((C25675c) this.f67572c).mo59105a_(exc);
        }
    }

    /* renamed from: a */
    private static String m85770a(C35116f fVar) {
        if (fVar != null) {
            Aweme aweme = fVar.f91860c;
            if (aweme != null) {
                String m = C33230ac.m107238m(aweme);
                C7573i.m23582a((Object) m, "MobUtils.getAid(data?.aweme ?: return \"\")");
                return m;
            }
        }
        return "";
    }
}
