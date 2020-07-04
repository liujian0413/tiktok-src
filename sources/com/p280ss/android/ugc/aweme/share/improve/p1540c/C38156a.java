package com.p280ss.android.ugc.aweme.share.improve.p1540c;

import android.content.Context;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25329c;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.share.improve.c.a */
public final class C38156a {
    /* renamed from: a */
    public static final boolean m121902a(C38389f fVar, Context context, Aweme aweme, String str) {
        C7573i.m23587b(fVar, "$this$checkAdxStatus");
        C7573i.m23587b(context, "context");
        C7573i.m23587b(aweme, "aweme");
        C7573i.m23587b(str, "eventType");
        if (!C25329c.m83220c(aweme)) {
            return true;
        }
        C6907h.m21524a("dou_promote_layer_show", (Map) C22984d.m75611a().mo59973a("enter_from", str).mo59973a("group_id", aweme.getAid()).mo59973a("author_id", aweme.getAuthorUid()).f60753a);
        C10761a.m31399c(context, (int) R.string.e4).mo25750a();
        return false;
    }
}
