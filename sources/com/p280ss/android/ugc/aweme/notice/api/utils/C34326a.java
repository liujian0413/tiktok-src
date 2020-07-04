package com.p280ss.android.ugc.aweme.notice.api.utils;

import com.bytedance.ies.abmock.C6384b;
import com.p280ss.android.ugc.aweme.notice.api.p1426ab.NoticeJediAB;

/* renamed from: com.ss.android.ugc.aweme.notice.api.utils.a */
public final class C34326a {

    /* renamed from: a */
    public static final C34326a f89474a = new C34326a();

    /* renamed from: b */
    private static final boolean f89475b;

    private C34326a() {
    }

    /* renamed from: a */
    public static final boolean m111019a() {
        return f89475b;
    }

    static {
        boolean z;
        if (C6384b.m19835a().mo15287a(NoticeJediAB.class, true, "notice_jedi_ab", C6384b.m19835a().mo15295d().notice_jedi_ab, 0) == NoticeJediAB.USE_JEDI) {
            z = true;
        } else {
            z = false;
        }
        f89475b = z;
    }
}
