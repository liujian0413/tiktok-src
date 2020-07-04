package com.p280ss.android.ugc.aweme.main.p1386h;

import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.main.h.a */
public final class C33050a {
    /* renamed from: a */
    public static void m106732a(String str, String str2, String str3) {
        C6907h.onEvent(MobClick.obtain().setEventName("leave_others_homepage").setLabelName(str).setJsonObject(C6869c.m21381a().mo16887a("group_id", str2).mo16887a("author_id", str3).mo16888b()));
        C6907h.m21524a("leave_others_homepage", (Map) C22984d.m75611a().mo59973a("group_id", str2).mo59973a("author_id", str3).f60753a);
    }
}
