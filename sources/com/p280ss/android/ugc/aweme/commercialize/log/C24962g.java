package com.p280ss.android.ugc.aweme.commercialize.log;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.commercialize.link.p1129a.C24767a;
import com.p280ss.android.ugc.aweme.commercialize.log.RawURLGetter.C24924a;
import com.p280ss.android.ugc.aweme.commercialize.model.LinkData;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commercialize.log.g */
public class C24962g {

    /* renamed from: a */
    public static final String f65833a = "g";

    /* renamed from: a */
    public static void m81958a(AwemeRawAd awemeRawAd) {
        if (awemeRawAd != null) {
            UrlModel clickTrackUrlList = awemeRawAd.getClickTrackUrlList();
            if (clickTrackUrlList != null) {
                m81954a((C24939aj) new C24965j(awemeRawAd), (Collection<String>) clickTrackUrlList.getUrlList(), true);
            }
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m81959a(AwemeRawAd awemeRawAd, String str, String str2, long j) {
        if (C6399b.m19944t()) {
            C24958f.m81906a(str, str2, j).mo65287i("track_url").mo65266a("track_ad").mo65285g("click").mo65274b(awemeRawAd).mo65281c();
        } else {
            C24958f.m81906a(str, str2, j).mo65276b("track_url").mo65266a("track_ad").mo65285g("click").mo65263a(awemeRawAd).mo65270a(C6399b.m19921a());
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m81957a(Aweme aweme, String str, String str2, long j) {
        if (C6399b.m19944t()) {
            C24958f.m81906a(str, str2, j).mo65287i("track_url").mo65266a("track_ad").mo65285g("play_over").mo65273b(aweme).mo65281c();
        } else {
            C24958f.m81906a(str, str2, j).mo65276b("track_url").mo65266a("track_ad").mo65285g("play_over").mo65262a(aweme).mo65270a(C6399b.m19921a());
        }
    }

    /* renamed from: a */
    private static void m81960a(String str, boolean z, C24939aj ajVar) {
        long currentTimeMillis = System.currentTimeMillis();
        String a = m81950a(str, currentTimeMillis);
        if (z) {
            a = C6319n.m19595b(a);
        }
        Uri parse = Uri.parse(a);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("track_url", a);
            jSONObject.put("scheme", parse.getScheme());
            jSONObject.put("host", parse.getHost());
            jSONObject.put("path", parse.getPath());
            jSONObject.put("ref", "native");
        } catch (JSONException unused) {
        }
        C24971p pVar = new C24971p(ajVar, a, currentTimeMillis, jSONObject);
        RawURLGetter.m81769a(a, (C24924a) pVar);
    }

    /* renamed from: a */
    public static void m81956a(Aweme aweme) {
        if (aweme != null) {
            m81954a((C24939aj) new C24963h(aweme), (Collection<String>) aweme.getRawAdShowTrackUrlList(), false);
        }
    }

    /* renamed from: b */
    public static void m81963b(Aweme aweme) {
        if (aweme != null) {
            m81954a((C24939aj) new C24964i(aweme), (Collection<String>) aweme.getRawAdClickTrackUrlList(), true);
        }
    }

    /* renamed from: c */
    public static void m81965c(Aweme aweme) {
        if (aweme != null) {
            m81954a((C24939aj) new C24966k(aweme), (Collection<String>) aweme.getRawAdPlayTrackUrlList(), false);
        }
    }

    /* renamed from: d */
    public static void m81967d(Aweme aweme) {
        if (aweme != null) {
            m81954a((C24939aj) new C24967l(aweme), (Collection<String>) aweme.getRawAdEffectivePlayTrackUrlList(), false);
        }
    }

    /* renamed from: e */
    public static void m81969e(Aweme aweme) {
        if (aweme != null) {
            m81954a((C24939aj) new C24968m(aweme), (Collection<String>) aweme.getRawAdPlayOverTrackUrlList(), false);
        }
    }

    /* renamed from: a */
    private static String m81949a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            String serverDeviceId = AppLog.getServerDeviceId();
            if (TextUtils.isEmpty(serverDeviceId)) {
                return str;
            }
            if (str.contains("__IMEI__")) {
                str = str.replace("__IMEI__", serverDeviceId);
            }
            return str;
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m81951a(C24767a aVar) {
        if (aVar != null && aVar.f65239b != null) {
            LinkData linkData = aVar.f65239b;
            if (TextUtils.equals(aVar.f65238a, "show") || TextUtils.equals(aVar.f65238a, "comment_show")) {
                m81952a((C24939aj) new C24969n(linkData), linkData.getTrackUrlList(), false);
                return;
            }
            if (TextUtils.equals(aVar.f65238a, "click")) {
                m81952a((C24939aj) new C24970o(linkData), linkData.getClickTrackUrlList(), true);
            }
        }
    }

    /* renamed from: a */
    private static String m81950a(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            if (str.contains("{TS}") || str.contains("__TS__")) {
                String replace = str.replace("{TS}", String.valueOf(j));
                try {
                    str = replace.replace("__TS__", String.valueOf(j));
                } catch (Exception unused) {
                    str = replace;
                }
            }
            String serverDeviceId = AppLog.getServerDeviceId();
            if (TextUtils.isEmpty(serverDeviceId)) {
                return str;
            }
            if ((str.contains("{UID}") || str.contains("__UID__")) && C6399b.m19944t()) {
                String replace2 = str.replace("{UID}", serverDeviceId);
                try {
                    str = replace2.replace("__UID__", serverDeviceId);
                } catch (Exception unused2) {
                    str = replace2;
                }
            }
            return str;
        } catch (Exception unused3) {
        }
    }

    /* renamed from: a */
    public static void m81952a(C24939aj ajVar, UrlModel urlModel, boolean z) {
        if (urlModel != null && urlModel.getUrlList() != null && !urlModel.getUrlList().isEmpty()) {
            m81954a(ajVar, (Collection<String>) urlModel.getUrlList(), z);
        }
    }

    /* renamed from: b */
    public static void m81961b(C24939aj ajVar, UrlModel urlModel, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (urlModel != null && !C6307b.m19566a((Collection<T>) urlModel.getUrlList())) {
            for (String a : urlModel.getUrlList()) {
                arrayList.add(m81949a(a));
            }
        }
        m81954a(ajVar, (Collection<String>) arrayList, true);
    }

    /* renamed from: a */
    public static void m81954a(C24939aj ajVar, Collection<String> collection, boolean z) {
        if (!C6307b.m19566a(collection)) {
            for (String str : collection) {
                if (!TextUtils.isEmpty(str)) {
                    m81960a(str, z, ajVar);
                }
            }
        }
    }

    /* renamed from: b */
    static final /* synthetic */ void m81962b(LinkData linkData, String str, String str2, long j) {
        if (C6399b.m19944t()) {
            C24958f.m81906a(str, str2, j).mo65287i("track_url").mo65266a("track_ad").mo65285g("show").mo65280c(linkData.creativeId).mo65286h(linkData.logExtra).mo65281c();
        } else {
            C24958f.m81906a(str, str2, j).mo65276b("track_url").mo65266a("track_ad").mo65285g("show").mo65256a(linkData).mo65278b();
        }
    }

    /* renamed from: c */
    static final /* synthetic */ void m81966c(Aweme aweme, String str, String str2, long j) {
        if (C6399b.m19944t()) {
            C24958f.m81906a(str, str2, j).mo65287i("track_url").mo65266a("track_ad").mo65285g("play").mo65273b(aweme).mo65281c();
        } else {
            C24958f.m81906a(str, str2, j).mo65276b("track_url").mo65266a("track_ad").mo65285g("play").mo65262a(aweme).mo65270a(C6399b.m19921a());
        }
    }

    /* renamed from: d */
    static final /* synthetic */ void m81968d(Aweme aweme, String str, String str2, long j) {
        if (C6399b.m19944t()) {
            C24958f.m81906a(str, str2, j).mo65287i("track_url").mo65266a("track_ad").mo65285g("click").mo65273b(aweme).mo65281c();
        } else {
            C24958f.m81906a(str, str2, j).mo65276b("track_url").mo65266a("track_ad").mo65285g("click").mo65262a(aweme).mo65270a(C6399b.m19921a());
        }
    }

    /* renamed from: e */
    static final /* synthetic */ void m81970e(Aweme aweme, String str, String str2, long j) {
        if (C6399b.m19944t()) {
            C24958f.m81906a(str, str2, j).mo65287i("track_url").mo65266a("track_ad").mo65285g("show").mo65273b(aweme).mo65281c();
        } else {
            C24958f.m81906a(str, str2, j).mo65276b("track_url").mo65266a("track_ad").mo65285g("show").mo65262a(aweme).mo65270a(C6399b.m19921a());
        }
    }

    /* renamed from: b */
    static final /* synthetic */ void m81964b(Aweme aweme, String str, String str2, long j) {
        if (C6399b.m19944t()) {
            C24958f.m81906a(str, str2, j).mo65287i("track_url").mo65266a("track_ad").mo65285g("play_valid").mo65273b(aweme).mo65281c();
        } else {
            C24958f.m81906a(str, str2, j).mo65276b("track_url").mo65266a("track_ad").mo65285g("play_valid").mo65262a(aweme).mo65270a(C6399b.m19921a());
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m81955a(LinkData linkData, String str, String str2, long j) {
        if (C6399b.m19944t()) {
            C24958f.m81906a(str, str2, j).mo65287i("track_url").mo65266a("track_ad").mo65285g("click").mo65280c(linkData.creativeId).mo65286h(linkData.logExtra).mo65281c();
        } else {
            C24958f.m81906a(str, str2, j).mo65266a("track_ad").mo65276b("track_url").mo65285g("click").mo65256a(linkData).mo65278b();
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m81953a(C24939aj ajVar, String str, long j, JSONObject jSONObject, int i, boolean z, Exception exc) {
        if (ajVar != null) {
            ajVar.mo63403a(str, String.valueOf(i), j);
        }
        if (exc != null) {
            C6921a.m21554a(exc);
            try {
                jSONObject.put("error_message", exc.getMessage());
            } catch (JSONException unused) {
            }
        }
        try {
            jSONObject.put("status_code", i);
        } catch (JSONException unused2) {
        }
        C6877n.m21444a("aweme_third_party_track_url_succeed_rate", z ? 1 : 0, jSONObject);
    }
}
