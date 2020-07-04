package com.p280ss.android.ugc.aweme.poi.utils;

import android.content.Context;
import com.p280ss.android.ugc.aweme.commercialize.log.C24976t;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25371n;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p280ss.android.ugc.aweme.poi.C35004a;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.poi.utils.c */
public final class C35443c implements C35004a {

    /* renamed from: a */
    public static final C35443c f92952a = new C35443c();

    private C35443c() {
    }

    /* renamed from: a */
    public final void mo88739a(Context context, Aweme aweme, String str) {
        C24976t.m82285v(context, aweme, str);
    }

    /* renamed from: b */
    public final void mo88744b(Context context, Aweme aweme, String str) {
        C24976t.m82282u(context, aweme, str);
    }

    /* renamed from: c */
    public final void mo88746c(Context context, Aweme aweme, String str) {
        C24976t.m82288w(context, aweme, str);
    }

    /* renamed from: d */
    public final void mo88748d(Context context, Aweme aweme, String str) {
        C24976t.m82290x(context, aweme, str);
    }

    /* renamed from: b */
    public final void mo88745b(Context context, AwemeRawAd awemeRawAd, String str) {
        C24976t.m82225g(context, awemeRawAd, str);
    }

    /* renamed from: c */
    public final void mo88747c(Context context, AwemeRawAd awemeRawAd, String str) {
        C24976t.m82158b(context, awemeRawAd, str);
    }

    /* renamed from: d */
    public final void mo88749d(Context context, AwemeRawAd awemeRawAd, String str) {
        C24976t.m82186c(context, awemeRawAd, str);
    }

    /* renamed from: a */
    public final void mo88741a(Context context, AwemeRawAd awemeRawAd, String str) {
        C24976t.m82217f(context, awemeRawAd, str);
    }

    /* renamed from: a */
    public final boolean mo88742a(Context context, String str, String str2) {
        C7573i.m23587b(str, "webUrl");
        C7573i.m23587b(str2, "title");
        return C25371n.m83459a(context, str, str2);
    }

    /* renamed from: a */
    public final boolean mo88743a(Context context, String str, boolean z) {
        C7573i.m23587b(str, "openUrl");
        return C25371n.m83463a(context, str, z);
    }

    /* renamed from: a */
    public final void mo88740a(Context context, Aweme aweme, String str, String str2) {
        C24976t.m82205e(context, aweme, str, str2);
    }
}
