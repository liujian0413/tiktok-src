package com.p280ss.android.ugc.aweme.commercialize.p1118b;

import android.content.Context;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.ugc.aweme.commercialize.link.C24778g;
import com.p280ss.android.ugc.aweme.commercialize.link.p1129a.C24767a.C24768a;
import com.p280ss.android.ugc.aweme.commercialize.log.C24976t;
import com.p280ss.android.ugc.aweme.commercialize.model.LinkData;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p280ss.android.ugc.aweme.p984ad.p985a.C22378c;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commercialize.b.b */
public final class C24553b implements C22378c {
    /* renamed from: a */
    public final String mo58841a() {
        return AppLog.getServerDeviceId();
    }

    /* renamed from: a */
    public final void mo58842a(Context context, Aweme aweme) {
        C24976t.m82012R(context, aweme);
    }

    /* renamed from: b */
    public final void mo58849b(Context context, Aweme aweme) {
        C24976t.m82013S(context, aweme);
    }

    /* renamed from: c */
    public final void mo58852c(Context context, Aweme aweme) {
        C24976t.m82289x(context, aweme);
    }

    /* renamed from: d */
    public final void mo58854d(Context context, AwemeRawAd awemeRawAd) {
        C24976t.m82059a(context, awemeRawAd);
    }

    /* renamed from: b */
    public final void mo58850b(Context context, AwemeRawAd awemeRawAd) {
        C24976t.m82185c(context, awemeRawAd);
    }

    /* renamed from: c */
    public final void mo58853c(Context context, AwemeRawAd awemeRawAd) {
        C24976t.m82197d(context, awemeRawAd);
    }

    /* renamed from: a */
    public final void mo58843a(Context context, AwemeRawAd awemeRawAd) {
        C24976t.m82157b(context, awemeRawAd);
    }

    /* renamed from: a */
    public final void mo58844a(Context context, AwemeRawAd awemeRawAd, String str) {
        C24976t.m82198d(context, awemeRawAd, str);
    }

    /* renamed from: b */
    public final void mo58851b(Context context, String str, String str2, String str3) {
        C24976t.m82162b(context, str, str2, str3);
    }

    /* renamed from: a */
    public final void mo58845a(Context context, String str, String str2, String str3) {
        C24976t.m82189c(context, str, str2, str3);
    }

    /* renamed from: a */
    public final void mo58848a(String str, String str2, Aweme aweme, boolean z) {
        C24778g.m81309a(str, str2, aweme, z);
    }

    /* renamed from: a */
    public final void mo58847a(String str, Context context, LinkData linkData, Aweme aweme, String str2) {
        C24976t.m82038a(context, new C24768a().mo64781a(linkData).mo64782a(aweme).mo64787b(true).mo64784a(true).mo64783a(str).mo64786b(str2).mo64785a());
    }

    /* renamed from: a */
    public final void mo58846a(Context context, String str, String str2, String str3, long j, JSONObject jSONObject) {
        C6907h.m21519a(context, str, str2, str3, j, jSONObject);
    }
}
