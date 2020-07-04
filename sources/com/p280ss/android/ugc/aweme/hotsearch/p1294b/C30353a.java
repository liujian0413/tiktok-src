package com.p280ss.android.ugc.aweme.hotsearch.p1294b;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.hotsearch.b.a */
public final class C30353a {
    /* renamed from: a */
    public static void m99181a(Aweme aweme, int i, String str, int i2) {
        if (aweme != null) {
            C22984d a = new C22984d().mo59973a("group_id", aweme.getAid()).mo59973a("author_id", aweme.getAuthorUid()).mo59973a("action_type", str).mo59970a(POIService.KEY_ORDER, i);
            if (TextUtils.equals("click", str)) {
                a.mo59973a("log_pb", C28199ae.m92689a().mo71791a(C33230ac.m107219c(aweme)));
                C6907h.m21525a("hot_search_video_keyword", C33230ac.m107211a(a.f60753a));
                return;
            }
            C6907h.m21524a("hot_search_video_keyword", (Map) a.f60753a);
        }
    }
}
