package com.p280ss.android.ugc.aweme.web.jsbridge;

import com.bytedance.ies.web.p582a.C11093e;
import com.bytedance.ies.web.p582a.C11097i;
import com.p280ss.android.ugc.aweme.notice.api.p1429sp.C34322c;
import com.p280ss.android.ugc.aweme.notice.api.p1429sp.C34323d;
import com.p280ss.android.ugc.aweme.p313im.C30553b;
import com.p280ss.android.ugc.aweme.p313im.service.p326f.C7102a;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.ah */
public final class C43496ah implements C11093e {
    public final void call(C11097i iVar, JSONObject jSONObject) throws Exception {
        ((C34322c) C34323d.m111009a(C34322c.class)).mo60347a(true);
        C7102a noticeSession = C30553b.m99810g().getNoticeSession("game_helper");
        if (noticeSession != null) {
            noticeSession.f19948l = 1;
            C30553b.m99810g().updateNoticeSession(noticeSession);
        }
    }
}
