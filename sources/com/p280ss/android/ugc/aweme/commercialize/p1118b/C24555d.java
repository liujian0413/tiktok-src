package com.p280ss.android.ugc.aweme.commercialize.p1118b;

import android.content.Context;
import com.p280ss.android.download.api.p858b.C19386b;
import com.p280ss.android.downloadlib.C19535g;
import com.p280ss.android.p848c.p849a.p850a.C19226a;
import com.p280ss.android.p848c.p849a.p850a.C19229b;
import com.p280ss.android.p848c.p849a.p850a.C19229b.C19231a;
import com.p280ss.android.p848c.p849a.p850a.C19232c;
import com.p280ss.android.ugc.aweme.app.download.config.DownloaderManagerHolder;
import com.p280ss.android.ugc.aweme.app.download.p1032c.C22942a;
import com.p280ss.android.ugc.aweme.app.download.p1032c.C22943b;
import com.p280ss.android.ugc.aweme.app.download.p1032c.C22944c;
import com.p280ss.android.ugc.aweme.app.download.p1032c.C22947f;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p280ss.android.ugc.aweme.p984ad.p985a.C22381f;

/* renamed from: com.ss.android.ugc.aweme.commercialize.b.d */
public final class C24555d implements C22381f {
    /* renamed from: a */
    public final C19535g mo58870a() {
        return DownloaderManagerHolder.m75524a();
    }

    /* renamed from: a */
    public final C19226a mo58865a(AwemeRawAd awemeRawAd) {
        return C22942a.m75508a(awemeRawAd);
    }

    /* renamed from: a */
    public final C19229b mo58866a(C19231a aVar, String str) {
        return C22947f.m75522a().mo59939a(aVar, str);
    }

    /* renamed from: a */
    public final C19232c mo58867a(Context context, Aweme aweme) {
        return C22944c.m75515a(context, aweme.getAwemeRawAd());
    }

    /* renamed from: a */
    public final C19386b mo58868a(String str, AwemeRawAd awemeRawAd) {
        return C22943b.m75513b("comment_first_ad", awemeRawAd);
    }

    /* renamed from: a */
    public final C19386b mo58869a(String str, AwemeRawAd awemeRawAd, String str2) {
        return C22943b.m75511a(str, awemeRawAd, str2);
    }
}
