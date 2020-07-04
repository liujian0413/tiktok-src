package com.p280ss.android.sdk.activity.model;

import android.os.Bundle;
import android.text.TextUtils;
import com.p280ss.android.download.api.model.C19393b;
import com.p280ss.android.p848c.p849a.p850a.C19226a;
import com.p280ss.android.p848c.p849a.p850a.C19226a.C19228a;
import com.p280ss.android.p848c.p849a.p850a.C19229b;
import com.p280ss.android.p848c.p849a.p850a.C19229b.C19231a;
import com.p280ss.android.p848c.p849a.p850a.C19232c;
import com.p280ss.android.p848c.p849a.p850a.C19232c.C19234a;
import com.p280ss.android.ugc.aweme.app.download.p1032c.C22947f;
import com.p280ss.android.ugc.aweme.commercialize.model.C24988a;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.sdk.activity.model.a */
public final class C20107a {

    /* renamed from: a */
    public String f54417a;

    /* renamed from: b */
    public long f54418b;

    /* renamed from: c */
    public String f54419c;

    /* renamed from: d */
    public String f54420d;

    /* renamed from: e */
    public String f54421e;

    /* renamed from: f */
    public String f54422f;

    /* renamed from: g */
    public String f54423g;

    /* renamed from: h */
    public String f54424h;

    /* renamed from: i */
    public String f54425i;

    /* renamed from: j */
    public JSONObject f54426j;

    /* renamed from: k */
    public int f54427k;

    /* renamed from: l */
    public boolean f54428l;

    /* renamed from: m */
    public C19393b f54429m;

    /* renamed from: n */
    private int f54430n;

    /* renamed from: o */
    private JSONObject f54431o;

    /* renamed from: p */
    private String f54432p;

    /* renamed from: q */
    private int f54433q;

    /* renamed from: a */
    private int m66298a() {
        if (this.f54433q == 1) {
            return 0;
        }
        return this.f54433q;
    }

    /* renamed from: c */
    public static C19226a m66303c(C20107a aVar) {
        return new C19228a().mo50938a(aVar.f54427k).mo50942b(aVar.m66298a()).mo50940a(true).mo50944c(aVar.f54428l).mo50941a();
    }

    /* renamed from: a */
    public static C19229b m66299a(String str) {
        return C22947f.m75522a().mo59939a(new C19231a().mo50975a(str).mo50978b(str).mo50986h("click_start_detail").mo50987i("click_pause_detail").mo50988j("click_continue_detail").mo50989k("click_install_detail").mo50990l("click_open_detail").mo50991m("storage_deny_detail").mo50973a(1).mo50976a(false).mo50979b(true).mo50981c(false), str);
    }

    /* renamed from: b */
    public static C19229b m66302b(C20107a aVar) {
        AwemeRawAd awemeRawAd = new AwemeRawAd();
        awemeRawAd.setCreativeId(Long.valueOf(aVar.f54418b));
        awemeRawAd.setLogExtra(aVar.f54420d);
        return C22947f.m75522a().mo59939a(new C19231a().mo50975a("landing_ad").mo50978b("landing_ad").mo50986h("click_start").mo50987i("click_pause").mo50988j("click_continue").mo50989k("click_install").mo50990l("click_open").mo50991m("storage_deny").mo50973a(1).mo50976a(false).mo50979b(true).mo50981c(false).mo50974a((Object) new C24988a(awemeRawAd, "button")), aVar.f54424h);
    }

    /* renamed from: a */
    public static C19232c m66300a(C20107a aVar) {
        long j;
        long j2 = 0;
        try {
            j = Long.parseLong(aVar.f54417a);
            try {
                j2 = Long.parseLong(aVar.f54419c);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            j = 0;
        }
        return C22947f.m75522a().mo59940a(new C19234a().mo51019a(j).mo51027b(j2).mo51021a(aVar.f54420d).mo51030d(aVar.f54423g).mo51028b(aVar.f54421e).mo51031e(aVar.f54422f).mo51020a(aVar.f54429m).mo51024a(aVar.f54426j), aVar.f54432p);
    }

    /* renamed from: a */
    public final void mo53849a(Bundle bundle) {
        if (bundle != null) {
            this.f54417a = bundle.getString("aweme_creative_id", "");
            this.f54419c = bundle.getString("aweme_group_id", "");
            this.f54420d = bundle.getString("bundle_download_app_log_extra");
            this.f54421e = bundle.getString("aweme_package_name");
            this.f54423g = bundle.getString("bundle_download_url");
            this.f54422f = bundle.getString("bundle_download_app_name");
            this.f54430n = bundle.getInt("bundle_app_ad_from", 0);
            this.f54425i = bundle.getString("bundle_download_app_extra");
            this.f54433q = bundle.getInt("bundle_download_mode");
            this.f54428l = bundle.getBoolean("bundle_support_multiple_download");
            try {
                this.f54431o = new JSONObject(bundle.getString("aweme_json_extra", ""));
            } catch (Exception unused) {
            }
            this.f54432p = bundle.getString("bundle_ad_quick_app_url");
            this.f54427k = bundle.getInt("bundle_link_mode", 0);
            this.f54429m = new C19393b(bundle.getString("bundle_open_url"), bundle.getString("bundle_web_url"), bundle.getString("bundle_web_title"));
            switch (this.f54430n) {
                case 1:
                    this.f54424h = "feed_download_ad";
                    break;
                case 2:
                    this.f54424h = "detail_download_ad";
                    break;
                case 3:
                    this.f54424h = "comment_download_ad";
                    break;
                case 4:
                    this.f54424h = "wap";
                    break;
                case 5:
                    this.f54424h = "landing_ad";
                    break;
                case 6:
                    this.f54424h = "landing_ad";
                    break;
                default:
                    this.f54424h = "draw_ad";
                    break;
            }
            try {
                this.f54418b = Long.parseLong(this.f54417a);
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: a */
    public static C19232c m66301a(String str, String str2, String str3, String str4, String str5, String str6, String str7, JSONObject jSONObject, String str8) {
        HashMap hashMap;
        long j;
        if (!TextUtils.isEmpty(str6)) {
            hashMap = new HashMap();
            hashMap.put("User-Agent", str6);
        } else {
            hashMap = null;
        }
        try {
            j = Long.parseLong(str);
            try {
                jSONObject.putOpt("ext_value", Long.valueOf(Long.parseLong(str2)));
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            j = 0;
        }
        return C22947f.m75522a().mo59940a(new C19234a().mo51019a(j).mo51021a(str3).mo51030d(str5).mo51031e(str4).mo51032f(str7).mo51023a((Map<String, String>) hashMap).mo51024a(jSONObject), str8);
    }
}
