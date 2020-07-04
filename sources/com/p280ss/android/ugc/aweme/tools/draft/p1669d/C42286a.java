package com.p280ss.android.ugc.aweme.tools.draft.p1669d;

import com.p280ss.android.ugc.aweme.draft.C27304c;
import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35592u;
import com.p280ss.android.ugc.aweme.tools.draft.C42297n;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.d.a */
public final class C42286a implements C35592u {

    /* renamed from: a */
    private final List<C27304c> f110041a = new ArrayList();

    /* renamed from: a */
    public final int mo90399a() {
        return 2;
    }

    /* renamed from: b */
    public final int mo90403b() {
        return 3;
    }

    /* renamed from: c */
    public final List<C27311c> mo90405c() {
        List<C27311c> b = C42297n.m134523a().mo103779b();
        C7573i.m23582a((Object) b, "DraftDBHelper.getInstance().queryList()");
        return b;
    }

    /* renamed from: a */
    public final long mo90400a(C27311c cVar) {
        C7573i.m23587b(cVar, "draft");
        return C42297n.m134523a().mo103781c(cVar);
    }

    /* renamed from: b */
    public final int mo90404b(C27311c cVar) {
        C7573i.m23587b(cVar, "draft");
        return C42297n.m134523a().mo103777b(cVar);
    }

    /* renamed from: a */
    public final void mo90401a(C27304c cVar) {
        C7573i.m23587b(cVar, "listener");
        if (!this.f110041a.contains(cVar)) {
            this.f110041a.add(cVar);
        }
    }

    /* renamed from: a */
    public final void mo90402a(C27311c cVar, boolean z) {
        C7573i.m23587b(cVar, "draft");
        for (C27304c a : this.f110041a) {
            a.mo70116a(cVar, z);
        }
    }
}
