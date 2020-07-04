package com.p280ss.android.ugc.aweme.feed.p1234j;

import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.feed.j.v */
public final class C28507v {
    /* renamed from: a */
    public static void m93710a(boolean z) {
        String str;
        String str2 = "follow_cancel_toast";
        C22984d a = C22984d.m75611a();
        String str3 = "final_status";
        if (z) {
            str = "confirm";
        } else {
            str = "cancel";
        }
        C6907h.m21524a(str2, (Map) a.mo59973a(str3, str).f60753a);
    }

    /* renamed from: a */
    public static void m93709a(Aweme aweme, String str) {
        C6907h.m21524a("follow_cancel", (Map) C22984d.m75611a().mo59973a("enter_from", "homepage_follow").mo59973a("enter_method", str).mo59973a("group_id", aweme.getAid()).mo59973a("log_pb", C28199ae.m92689a().mo71791a(aweme.getRequestId())).mo59973a("to_user_id", aweme.getAuthorUid()).mo59973a("author_id", aweme.getAuthorUid()).f60753a);
    }
}
