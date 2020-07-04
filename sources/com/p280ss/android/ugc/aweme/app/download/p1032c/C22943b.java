package com.p280ss.android.ugc.aweme.app.download.p1032c;

import com.p280ss.android.download.api.p858b.C19386b;
import com.p280ss.android.p848c.p849a.p850a.C19229b.C19231a;
import com.p280ss.android.ugc.aweme.commercialize.model.C24988a;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* renamed from: com.ss.android.ugc.aweme.app.download.c.b */
public final class C22943b {
    /* renamed from: a */
    public static C19386b m75510a(String str, AwemeRawAd awemeRawAd) {
        return C22947f.m75522a().mo59939a(new C19231a().mo50975a(str).mo50978b(str).mo50981c(false).mo50974a((Object) awemeRawAd), str);
    }

    /* renamed from: b */
    public static C19386b m75513b(String str, AwemeRawAd awemeRawAd) {
        return C22947f.m75522a().mo59939a(new C19231a().mo50975a(str).mo50978b(str).mo50980c(str).mo50982d(str).mo50983e(str).mo50984f(str).mo50985g(str).mo50981c(false).mo50974a((Object) awemeRawAd), str);
    }

    /* renamed from: a */
    public static C19386b m75511a(String str, AwemeRawAd awemeRawAd, String str2) {
        return C22947f.m75522a().mo59939a(new C19231a().mo50975a(str).mo50978b(str).mo50980c(str).mo50982d(str).mo50983e(str).mo50984f(str).mo50985g(str).mo50981c(false).mo50974a((Object) new C24988a(awemeRawAd, str2)), str);
    }

    /* renamed from: a */
    public static C19386b m75512a(String str, AwemeRawAd awemeRawAd, boolean z) {
        String str2;
        C22946e a = C22947f.m75522a();
        C19231a a2 = new C19231a().mo50975a(str).mo50978b(str).mo50981c(false).mo50974a((Object) awemeRawAd);
        if (z) {
            str2 = "click_start_detail";
        } else {
            str2 = "click_start";
        }
        return a.mo59939a(a2.mo50986h(str2).mo50987i("click_pause_detail").mo50988j("click_continue_detail").mo50989k("click_install_detail").mo50990l("click_open_detail"), str);
    }

    /* renamed from: b */
    public static C19386b m75514b(String str, AwemeRawAd awemeRawAd, String str2) {
        return C22947f.m75522a().mo59939a(new C19231a().mo50975a(str).mo50978b(str).mo50981c(false).mo50974a((Object) awemeRawAd).mo50974a((Object) new C24988a(awemeRawAd, str2)), str);
    }
}
