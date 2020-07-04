package com.p280ss.android.ugc.aweme.app.download.p1032c;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import com.p280ss.android.download.api.model.C19393b;
import com.p280ss.android.p848c.p849a.p850a.C19232c;
import com.p280ss.android.p848c.p849a.p850a.C19232c.C19234a;
import com.p280ss.android.ugc.aweme.commercialize.log.C24976t;
import com.p280ss.android.ugc.aweme.commercialize.p1114a.C24504a.C24505a;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25352e;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.app.download.c.c */
public final class C22944c {
    /* renamed from: a */
    public static C19232c m75515a(Context context, AwemeRawAd awemeRawAd) {
        return m75516a(context, awemeRawAd, false, null);
    }

    /* renamed from: a */
    public static C19232c m75517a(String str, MobClick mobClick) {
        long j;
        try {
            j = Long.parseLong(mobClick.getValue());
        } catch (Exception unused) {
            j = 0;
        }
        return new C19234a().mo51025a(false).mo51027b(mobClick.getExtValueLong()).mo51019a(j).mo51030d(str).mo51024a(mobClick.getExtJson()).mo51026a();
    }

    /* renamed from: a */
    public static C19232c m75516a(Context context, AwemeRawAd awemeRawAd, boolean z, String str) {
        long j;
        List list = null;
        if (awemeRawAd == null) {
            return null;
        }
        try {
            j = Long.parseLong(C24976t.m82140b(awemeRawAd));
            try {
                if (awemeRawAd.getClickTrackUrlList() != null) {
                    list = awemeRawAd.getClickTrackUrlList().getUrlList();
                }
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            j = 0;
        }
        String openUrl = awemeRawAd.getOpenUrl();
        if (z && C25352e.m83361c(openUrl)) {
            Builder buildUpon = Uri.parse(C24505a.f64678a).buildUpon();
            if (str != null) {
                buildUpon.appendQueryParameter("tag", str);
            }
            openUrl = C25352e.m83325a(openUrl, buildUpon.toString());
        }
        return C22947f.m75522a().mo59940a(new C19234a().mo51019a(j).mo51027b(C24976t.m82021a(awemeRawAd)).mo51021a(awemeRawAd.getLogExtra()).mo51028b(awemeRawAd.getPackageName()).mo51030d(awemeRawAd.getDownloadUrl()).mo51029c(C25352e.m83320a()).mo51031e(awemeRawAd.getAppName()).mo51022a(list).mo51020a(new C19393b(openUrl, awemeRawAd.getWebUrl(), awemeRawAd.getWebTitle())), awemeRawAd.getQuickAppUrl());
    }
}
