package com.p280ss.android.ugc.aweme.detail.p1166j;

import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.newfollow.model.C34145b;
import com.p280ss.android.ugc.aweme.poi.p335ui.detail.p1475b.C35324c;
import com.p280ss.android.ugc.aweme.poi.p335ui.detail.p1475b.C35324c.C35325a;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.detail.j.n */
public final class C26110n extends C26099d<C35324c, C34145b> {
    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final List<C34145b> mo67677e() {
        C35324c cVar = (C35324c) this.f67571b;
        if (cVar != null) {
            return cVar.getItems();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final List<Aweme> mo67678f() {
        List list;
        C35324c cVar = (C35324c) this.f67571b;
        if (cVar != null) {
            list = cVar.getItems();
        } else {
            list = null;
        }
        return C35325a.m114027a(list);
    }

    /* renamed from: b */
    public final /* synthetic */ String mo67676b(Object obj) {
        return m85775a((C34145b) obj);
    }

    /* renamed from: a */
    private static String m85775a(C34145b bVar) {
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
