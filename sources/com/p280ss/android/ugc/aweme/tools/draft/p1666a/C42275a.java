package com.p280ss.android.ugc.aweme.tools.draft.p1666a;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import com.p280ss.android.ugc.aweme.tools.draft.p1667b.C42278a;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.a.a */
public final class C42275a {
    /* renamed from: a */
    public static final boolean m134485a(C42278a aVar, C27311c cVar) {
        C7573i.m23587b(cVar, "draft");
        if (!(aVar == null || aVar.mo103759a() == null)) {
            List a = aVar.mo103759a();
            C7573i.m23582a((Object) a, "musicCollection.drafts");
            if (!a.isEmpty()) {
                Object obj = aVar.mo103759a().get(0);
                C7573i.m23582a(obj, "musicCollection.drafts[0]");
                if (!(((C27311c) obj).f72036e == null || cVar.f72036e == null)) {
                    Object obj2 = aVar.mo103759a().get(0);
                    C7573i.m23582a(obj2, "musicCollection.drafts[0]");
                    if (TextUtils.equals(((C27311c) obj2).f72036e.getPath(), cVar.f72036e.getPath())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
