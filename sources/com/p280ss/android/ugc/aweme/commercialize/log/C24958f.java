package com.p280ss.android.ugc.aweme.commercialize.log;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.commercialize.C24671f;
import com.p280ss.android.ugc.aweme.commercialize.model.LinkData;
import com.p280ss.android.ugc.aweme.commercialize.model.SearchAdData;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.discover.model.Banner;
import com.p280ss.android.ugc.aweme.discover.model.Category;
import com.p280ss.android.ugc.aweme.discover.model.CategoryListAdInfo;
import com.p280ss.android.ugc.aweme.discover.model.HotSearchAdData;
import com.p280ss.android.ugc.aweme.experiment.p1209a.C27686a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p280ss.android.ugc.aweme.net.C34108z;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commercialize.log.f */
public class C24958f {

    /* renamed from: a */
    private static C24961b f65825a;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.log.f$a */
    static class C24960a {

        /* renamed from: a */
        public JSONObject f65826a;

        private C24960a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo65250a() {
            this.f65826a = null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final JSONObject mo65254b() {
            if (this.f65826a == null) {
                this.f65826a = new JSONObject();
            }
            return this.f65826a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo65251a(String str, int i) {
            try {
                mo65254b().put(str, 1);
            } catch (JSONException unused) {
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo65252a(String str, long j) {
            try {
                mo65254b().put(str, j);
            } catch (JSONException unused) {
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo65253a(String str, Object obj) {
            try {
                mo65254b().put(str, obj);
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.log.f$b */
    public static class C24961b {

        /* renamed from: a */
        public final C24960a f65827a = new C24960a();

        /* renamed from: b */
        private String f65828b;

        /* renamed from: c */
        private String f65829c;

        /* renamed from: d */
        private String f65830d;

        /* renamed from: e */
        private String f65831e;

        /* renamed from: f */
        private String f65832f;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo65269a() {
            this.f65828b = null;
            this.f65829c = null;
            this.f65830d = null;
            this.f65831e = null;
            this.f65827a.mo65250a();
        }

        /* renamed from: a */
        public final C24961b mo65268a(boolean z) {
            this.f65827a.mo65251a("is_i18n_sdk", 1);
            this.f65827a.mo65253a("value", (Object) "1590015508824073");
            return this;
        }

        /* renamed from: a */
        public final C24961b mo65263a(AwemeRawAd awemeRawAd) {
            if (awemeRawAd != null) {
                mo65264a(awemeRawAd.getCreativeId());
                mo65286h(awemeRawAd.getLogExtra());
                this.f65827a.mo65253a("ad_id", (Object) awemeRawAd.getAdId());
            }
            return this;
        }

        /* renamed from: a */
        public final C24961b mo65265a(Object obj) {
            this.f65827a.mo65253a("ad_extra_data", (Object) new C6600e().mo15979b(obj));
            return this;
        }

        /* renamed from: a */
        public final C24961b mo65267a(JSONObject jSONObject) {
            this.f65827a.mo65253a("ad_extra_data", (Object) jSONObject);
            return this;
        }

        /* renamed from: a */
        public final void mo65270a(Context context) {
            if (context == null) {
                context = C6399b.m19921a();
            }
            Context context2 = context;
            m81913b(context2);
            C24671f.m80851a().mo64665a(context2, this.f65828b, this.f65829c, this.f65827a.f65826a, (this.f65830d == null || !this.f65830d.matches("[+-]?\\d+")) ? "0" : this.f65830d, m81915d());
            C24958f.m81907a(this);
        }

        /* renamed from: d */
        private long m81915d() {
            try {
                if (this.f65831e != null) {
                    return Long.parseLong(this.f65831e);
                }
                return 0;
            } catch (NumberFormatException unused) {
                return 0;
            }
        }

        /* renamed from: c */
        public final void mo65281c() {
            m81914c((Context) null);
        }

        /* renamed from: b */
        public final void mo65278b() {
            mo65270a((Context) null);
        }

        /* renamed from: a */
        public final C24961b mo65266a(String str) {
            this.f65828b = str;
            return this;
        }

        /* renamed from: b */
        public final C24961b mo65276b(String str) {
            this.f65829c = str;
            return this;
        }

        /* renamed from: c */
        public final C24961b mo65280c(String str) {
            this.f65830d = str;
            return this;
        }

        /* renamed from: d */
        public final C24961b mo65282d(String str) {
            this.f65831e = str;
            return this;
        }

        /* renamed from: i */
        public final C24961b mo65287i(String str) {
            this.f65832f = str;
            return this;
        }

        /* renamed from: a */
        public final C24961b mo65255a(long j) {
            this.f65827a.mo65252a("duration", j);
            return this;
        }

        /* renamed from: b */
        public final C24961b mo65271b(long j) {
            this.f65827a.mo65252a("video_length", j);
            return this;
        }

        /* renamed from: c */
        public final C24961b mo65279c(Long l) {
            this.f65827a.mo65253a("ad_id", (Object) l);
            return this;
        }

        /* renamed from: f */
        public final C24961b mo65284f(String str) {
            this.f65827a.mo65253a("item_id", (Object) str);
            return this;
        }

        /* renamed from: g */
        public final C24961b mo65285g(String str) {
            this.f65827a.mo65253a("track_label", (Object) str);
            return this;
        }

        /* renamed from: h */
        public final C24961b mo65286h(String str) {
            this.f65827a.mo65253a("log_extra", (Object) str);
            return this;
        }

        /* renamed from: a */
        public final C24961b mo65264a(Long l) {
            String str;
            if (l == null) {
                str = null;
            } else {
                str = l.toString();
            }
            this.f65830d = str;
            return this;
        }

        /* renamed from: b */
        public final C24961b mo65272b(LinkData linkData) {
            if (linkData != null) {
                mo65280c(linkData.creativeId);
                mo65286h(linkData.logExtra);
            }
            return this;
        }

        /* renamed from: e */
        public final C24961b mo65283e(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f65827a.mo65253a("refer", (Object) str);
            }
            return this;
        }

        /* renamed from: b */
        private void m81913b(Context context) {
            this.f65827a.mo65253a("is_ad_event", (Object) "1");
            String f = NetworkUtils.m19552f(context);
            if (!C6319n.m19593a(f)) {
                this.f65827a.mo65253a("nt", (Object) f);
            }
        }

        /* renamed from: a */
        public final C24961b mo65257a(SearchAdData searchAdData) {
            if (searchAdData != null) {
                mo65264a(Long.valueOf(searchAdData.f65873id));
                mo65286h(searchAdData.logExtra);
                this.f65827a.mo65252a("ad_id", searchAdData.adId);
            }
            return this;
        }

        /* renamed from: a */
        public final C24961b mo65256a(LinkData linkData) {
            String str;
            String str2;
            if (linkData != null) {
                if (linkData.creativeId == null) {
                    str = "";
                } else {
                    str = linkData.creativeId;
                }
                mo65280c(str);
                if (linkData.logExtra == null) {
                    str2 = "";
                } else {
                    str2 = linkData.logExtra;
                }
                mo65286h(str2);
                this.f65827a.mo65252a("ad_id", -1);
            }
            return this;
        }

        /* renamed from: b */
        public final C24961b mo65273b(Aweme aweme) {
            if (!(aweme == null || aweme.getAwemeRawAd() == null)) {
                mo65274b(aweme.getAwemeRawAd());
            }
            return this;
        }

        /* renamed from: a */
        public final C24961b mo65258a(Banner banner) {
            String str;
            if (banner != null) {
                mo65264a(Long.valueOf(banner.getCreativeId()));
                if (banner.getLogExtra() == null) {
                    str = "";
                } else {
                    str = banner.getLogExtra();
                }
                mo65286h(str);
                this.f65827a.mo65252a("ad_id", -1);
            }
            return this;
        }

        /* renamed from: b */
        public final C24961b mo65274b(AwemeRawAd awemeRawAd) {
            if (awemeRawAd != null) {
                mo65264a(awemeRawAd.getCreativeId());
                mo65275b(awemeRawAd.getGroupId());
                mo65286h(awemeRawAd.getLogExtra());
            }
            return this;
        }

        /* renamed from: c */
        private void m81914c(Context context) {
            m81913b(C6399b.m19921a());
            HashMap hashMap = new HashMap();
            try {
                hashMap.put("category", "umeng");
                if (!TextUtils.isEmpty(this.f65828b)) {
                    hashMap.put("tag", this.f65828b);
                }
                if (!TextUtils.isEmpty(this.f65829c)) {
                    hashMap.put("label", this.f65829c);
                }
                if (!TextUtils.isEmpty(this.f65830d)) {
                    hashMap.put("value", this.f65830d);
                }
                if (!TextUtils.isEmpty(this.f65831e)) {
                    hashMap.put("ext_value", this.f65831e);
                }
                JSONObject b = this.f65827a.mo65254b();
                Iterator keys = b.keys();
                while (keys.hasNext()) {
                    String str = (String) keys.next();
                    if (!TextUtils.equals("has_v3", str)) {
                        try {
                            Object opt = b.opt(str);
                            if (opt instanceof String) {
                                hashMap.put(str, (String) opt);
                            } else {
                                hashMap.put(str, new C6600e().mo15979b(opt));
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
                if (!TextUtils.isEmpty(this.f65832f)) {
                    C6907h.m21524a(this.f65832f, (Map) hashMap);
                }
            } catch (Exception unused2) {
            }
            C24958f.m81907a(this);
        }

        /* renamed from: a */
        public final C24961b mo65259a(Category category) {
            String str;
            if (category != null) {
                mo65264a(Long.valueOf(category.getCreativeId()));
                if (category.getLogExtra() == null) {
                    str = "";
                } else {
                    str = category.getLogExtra();
                }
                mo65286h(str);
                this.f65827a.mo65252a("ad_id", -1);
            }
            return this;
        }

        /* renamed from: b */
        public final C24961b mo65275b(Long l) {
            String str;
            if (l == null) {
                str = null;
            } else {
                str = l.toString();
            }
            this.f65831e = str;
            return this;
        }

        /* renamed from: a */
        public final C24961b mo65260a(CategoryListAdInfo categoryListAdInfo) {
            if (categoryListAdInfo != null) {
                mo65264a(categoryListAdInfo.getCreativeId());
                mo65286h(categoryListAdInfo.getLogExtra());
                if (categoryListAdInfo.getAdId() == null) {
                    this.f65827a.mo65252a("ad_id", -1);
                } else {
                    this.f65827a.mo65253a("ad_id", (Object) categoryListAdInfo.getAdId());
                }
            }
            return this;
        }

        /* renamed from: b */
        public final C24961b mo65277b(JSONObject jSONObject) {
            if (jSONObject != null) {
                Iterator keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String str = (String) keys.next();
                    this.f65827a.mo65253a(str, jSONObject.opt(str));
                }
            }
            return this;
        }

        /* renamed from: a */
        public final C24961b mo65261a(HotSearchAdData hotSearchAdData) {
            if (hotSearchAdData != null) {
                mo65264a(Long.valueOf(hotSearchAdData.getCreativeId()));
                mo65286h(hotSearchAdData.getLogExtra());
                this.f65827a.mo65252a("ad_id", -1);
            }
            return this;
        }

        /* renamed from: a */
        public final C24961b mo65262a(Aweme aweme) {
            if (!(aweme == null && aweme.getAwemeRawAd() == null)) {
                mo65264a(aweme.getAwemeRawAd().getCreativeId());
                mo65286h(aweme.getAwemeRawAd().getLogExtra());
                this.f65827a.mo65253a("ad_id", (Object) aweme.getAwemeRawAd().getAdId());
            }
            return this;
        }
    }

    /* renamed from: a */
    public static C24961b m81905a() {
        C24961b bVar;
        synchronized (C24958f.class) {
            if (f65825a != null) {
                bVar = f65825a;
                f65825a = null;
            } else {
                bVar = null;
            }
        }
        if (bVar == null) {
            return new C24961b();
        }
        bVar.mo65269a();
        return bVar;
    }

    /* renamed from: a */
    static void m81907a(C24961b bVar) {
        synchronized (C24958f.class) {
            if (f65825a == null) {
                f65825a = bVar;
                bVar.mo65269a();
            }
        }
    }

    /* renamed from: a */
    public static C24961b m81906a(String str, String str2, long j) {
        String str3;
        C24961b a = m81905a();
        a.f65827a.mo65253a("ad_event_priority", (Object) "10");
        a.f65827a.mo65253a("ad_event_type", (Object) "monitor");
        a.f65827a.mo65253a("track_url_list", (Object) str);
        a.f65827a.mo65253a("track_status", (Object) str2);
        a.f65827a.mo65252a("ts", j);
        if (C6399b.m19944t() || C27686a.m90835a()) {
            str3 = RawURLGetter.m81764a();
        } else {
            str3 = C34108z.m109785a(C6399b.m19921a());
        }
        if (!TextUtils.isEmpty(str3)) {
            a.f65827a.mo65253a("user_agent", (Object) str3);
        }
        return a;
    }
}
