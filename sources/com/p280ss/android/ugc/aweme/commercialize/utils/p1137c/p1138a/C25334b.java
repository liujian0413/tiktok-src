package com.p280ss.android.ugc.aweme.commercialize.utils.p1137c.p1138a;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25222ad;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25371n;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.c.a.b */
public final class C25334b {

    /* renamed from: a */
    public static final C25334b f66724a = new C25334b();

    private C25334b() {
    }

    /* renamed from: a */
    public static final boolean m83258a(Context context, String str, Aweme aweme, int i) {
        if (context == null || aweme == null || !aweme.isAd() || TextUtils.isEmpty(str)) {
            return false;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd == null) {
            return false;
        }
        C7573i.m23582a((Object) awemeRawAd, "aweme.awemeRawAd ?: return false");
        Intent a = C25222ad.m82926a(context);
        a.putExtra("url", str);
        Long creativeId = awemeRawAd.getCreativeId();
        C7573i.m23582a((Object) creativeId, "ad.creativeId");
        a.putExtra("ad_id", creativeId.longValue());
        a.putExtra("ad_type", awemeRawAd.getType());
        a.putExtra("ad_system_origin", awemeRawAd.getSystemOrigin());
        Long creativeId2 = awemeRawAd.getCreativeId();
        C7573i.m23582a((Object) creativeId2, "ad.creativeId");
        a.putExtra("ad_id", creativeId2.longValue());
        a.putExtra("bundle_download_app_log_extra", awemeRawAd.getLogExtra());
        a.putExtra("aweme_id", aweme.getAid());
        a.putExtra("click_from", i);
        return C25371n.m83445a(context, a);
    }
}
