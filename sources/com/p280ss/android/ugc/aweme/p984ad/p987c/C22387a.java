package com.p280ss.android.ugc.aweme.p984ad.p987c;

import android.content.Context;
import android.text.TextUtils;
import bolts.C1592h;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.collection.C6307b;
import com.google.gson.C18373n;
import com.google.gson.C6711m;
import com.p280ss.android.common.util.NetworkUtils;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.commercialize.log.C24956e.C24957a;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p280ss.android.ugc.aweme.p984ad.p985a.C22375a;
import com.p280ss.android.ugc.aweme.p984ad.p985a.C22378c;
import com.p280ss.android.ugc.aweme.p984ad.p989e.C22456d;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.ad.c.a */
public final class C22387a {
    /* renamed from: n */
    private static boolean m74141n(Context context, AwemeRawAd awemeRawAd) {
        return (context == null || awemeRawAd == null) ? false : true;
    }

    /* renamed from: a */
    private static void m74126a(final List<String> list, boolean z) {
        if (!C6307b.m19566a((Collection<T>) list)) {
            C1592h.m7853a((Callable<TResult>) new Callable<Void>(true) {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public Void call() throws Exception {
                    try {
                        for (String str : list) {
                            if (!TextUtils.isEmpty(str)) {
                                String a = C22387a.m74115a(str);
                                if (true) {
                                    a = C6319n.m19595b(a);
                                }
                                NetworkUtils.executeGet(40960, a, false, false);
                            }
                        }
                    } catch (Exception unused) {
                    }
                    return null;
                }
            });
        }
    }

    /* renamed from: a */
    private static void m74123a(Context context, String str, String str2, JSONObject jSONObject, AwemeRawAd awemeRawAd) {
        m74124a(context, str, str2, jSONObject, m74127b(awemeRawAd), m74114a(awemeRawAd));
    }

    /* renamed from: a */
    private static void m74124a(Context context, String str, String str2, JSONObject jSONObject, String str3, long j) {
        if (TextUtils.equals("click", str2)) {
            m74125a(str, str3, j, jSONObject);
            try {
                jSONObject.put("has_v3", 1);
            } catch (JSONException unused) {
            }
        }
        C22378c cVar = C22375a.m74074a().f59713g;
        if (cVar != null) {
            cVar.mo58846a(context, str, str2, str3, j, jSONObject);
        } else if (C22456d.m74328a()) {
            throw new IllegalStateException("IAdLogDepend is null! Fail!");
        }
        C22456d.m74328a();
    }

    /* renamed from: a */
    private static void m74125a(String str, String str2, long j, JSONObject jSONObject) {
        long j2;
        try {
            j2 = Long.parseLong(str2);
        } catch (Exception unused) {
            j2 = 0;
        }
        JSONObject jSONObject2 = null;
        if (jSONObject != null) {
            jSONObject2 = new JSONObject();
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str3 = (String) keys.next();
                if (!TextUtils.equals("has_v3", str3)) {
                    try {
                        jSONObject2.put(str3, jSONObject.opt(str3));
                    } catch (JSONException unused2) {
                    }
                }
            }
        }
        new C24957a().mo65248c(str).mo65247b("realtime_click").mo65242a(j2).mo65246b(j).mo65244a(jSONObject2).mo65245a().mo65241a();
        m74120a(jSONObject);
    }

    /* renamed from: a */
    private static long m74114a(AwemeRawAd awemeRawAd) {
        Long groupId = awemeRawAd.getGroupId();
        if (groupId == null) {
            return 0;
        }
        return groupId.longValue();
    }

    /* renamed from: b */
    private static String m74127b(AwemeRawAd awemeRawAd) {
        Long creativeId = awemeRawAd.getCreativeId();
        if (creativeId == null) {
            return "0";
        }
        return String.valueOf(creativeId);
    }

    /* renamed from: c */
    private static void m74130c(AwemeRawAd awemeRawAd) {
        if (awemeRawAd != null) {
            UrlModel clickTrackUrlList = awemeRawAd.getClickTrackUrlList();
            if (clickTrackUrlList != null) {
                m74126a(clickTrackUrlList.getUrlList(), true);
            }
        }
    }

    /* renamed from: a */
    public static String m74115a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            if (str.contains("{TS}") || str.contains("__TS__")) {
                long currentTimeMillis = System.currentTimeMillis();
                String replace = str.replace("{TS}", String.valueOf(currentTimeMillis));
                try {
                    str = replace.replace("__TS__", String.valueOf(currentTimeMillis));
                } catch (Exception unused) {
                    str = replace;
                }
            }
            C22378c cVar = C22375a.m74074a().f59713g;
            if (cVar == null) {
                return str;
            }
            String a = cVar.mo58841a();
            if (TextUtils.isEmpty(a)) {
                return str;
            }
            if (str.contains("{UID}") || str.contains("__UID__")) {
                String replace2 = str.replace("{UID}", a);
                try {
                    str = replace2.replace("__UID__", a);
                } catch (Exception unused2) {
                    str = replace2;
                }
            }
            return str;
        } catch (Exception unused3) {
        }
    }

    /* renamed from: a */
    private static JSONObject m74120a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            C6711m m = new C18373n().mo47346a(jSONObject.getString("log_extra")).mo16136m();
            JSONObject jSONObject2 = new JSONObject();
            if (m.mo16149b("rit") != null) {
                jSONObject2.put("ctr_rit", m.mo16149b("rit").mo15998c());
            }
            return jSONObject2;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static void m74129c(Context context, AwemeRawAd awemeRawAd) {
        m74122a(context, "ad_click", awemeRawAd, m74116a(context, awemeRawAd, "raw feed comment end ad click"));
    }

    /* renamed from: d */
    public static void m74131d(Context context, AwemeRawAd awemeRawAd) {
        m74122a(context, "click_coupon", awemeRawAd, m74116a(context, awemeRawAd, "raw feed comment coupon click"));
    }

    /* renamed from: e */
    public static void m74132e(Context context, AwemeRawAd awemeRawAd) {
        m74122a(context, "click_source", awemeRawAd, m74116a(context, awemeRawAd, "raw feed comment end click source"));
    }

    /* renamed from: f */
    public static void m74133f(Context context, AwemeRawAd awemeRawAd) {
        m74122a(context, "click_title", awemeRawAd, m74116a(context, awemeRawAd, "raw feed comment end click title"));
    }

    /* renamed from: g */
    public static void m74134g(Context context, AwemeRawAd awemeRawAd) {
        m74122a(context, "click_call", awemeRawAd, m74116a(context, awemeRawAd, "raw feed comment end click call"));
    }

    /* renamed from: h */
    public static void m74135h(Context context, AwemeRawAd awemeRawAd) {
        m74122a(context, "click_start", awemeRawAd, m74116a(context, awemeRawAd, "raw feed comment end click start"));
    }

    /* renamed from: i */
    public static void m74136i(Context context, AwemeRawAd awemeRawAd) {
        m74122a(context, "close", awemeRawAd, m74116a(context, awemeRawAd, "raw feed comment end click close"));
    }

    /* renamed from: j */
    public static void m74137j(Context context, AwemeRawAd awemeRawAd) {
        m74122a(context, "click_redpacket", awemeRawAd, m74116a(context, awemeRawAd, "raw feed comment end click red packet"));
    }

    /* renamed from: k */
    public static void m74138k(Context context, AwemeRawAd awemeRawAd) {
        m74123a(context, "comment_end_ad", "click_message", m74117a(context, awemeRawAd, "raw ad click", false), awemeRawAd);
    }

    /* renamed from: l */
    public static void m74139l(Context context, AwemeRawAd awemeRawAd) {
        m74123a(context, "comment_end_ad", "click_message", m74117a(context, awemeRawAd, "raw ad click", false), awemeRawAd);
    }

    /* renamed from: m */
    public static void m74140m(Context context, AwemeRawAd awemeRawAd) {
        m74123a(context, "comment_end_ad", "click_message", m74117a(context, awemeRawAd, "raw ad click", false), awemeRawAd);
    }

    /* renamed from: b */
    public static void m74128b(Context context, AwemeRawAd awemeRawAd) {
        m74122a(context, "click", awemeRawAd, m74117a(context, awemeRawAd, "raw feed comment end click", true));
        m74130c(awemeRawAd);
    }

    /* renamed from: a */
    public static void m74121a(Context context, AwemeRawAd awemeRawAd) {
        m74122a(context, "comment_end_show", awemeRawAd, m74116a(context, awemeRawAd, "raw feed comment end show"));
    }

    /* renamed from: a */
    private static JSONObject m74116a(Context context, AwemeRawAd awemeRawAd, String str) {
        if (awemeRawAd == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("log_extra", awemeRawAd.getLogExtra());
            jSONObject.put("is_ad_event", "1");
            String networkAccessType = NetworkUtils.getNetworkAccessType(context);
            if (!C6319n.m19593a(networkAccessType)) {
                jSONObject.put("nt", networkAccessType);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    private static JSONObject m74119a(Context context, JSONObject jSONObject, String str) throws JSONException {
        if (!TextUtils.isEmpty(str)) {
            jSONObject.put("log_extra", str);
        }
        jSONObject.put("is_ad_event", "1");
        String networkAccessType = NetworkUtils.getNetworkAccessType(context);
        if (!C6319n.m19593a(networkAccessType)) {
            jSONObject.put("nt", networkAccessType);
        }
        return jSONObject;
    }

    /* renamed from: a */
    private static JSONObject m74117a(Context context, AwemeRawAd awemeRawAd, String str, boolean z) {
        return m74118a(context, awemeRawAd, str, z, null);
    }

    /* renamed from: a */
    private static void m74122a(Context context, String str, AwemeRawAd awemeRawAd, JSONObject jSONObject) {
        if (m74141n(context, awemeRawAd)) {
            m74123a(context, "comment_end_ad", str, jSONObject, awemeRawAd);
        }
    }

    /* renamed from: a */
    private static JSONObject m74118a(Context context, AwemeRawAd awemeRawAd, String str, boolean z, Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        if (awemeRawAd == null) {
            return jSONObject;
        }
        try {
            m74119a(context, jSONObject, awemeRawAd.getLogExtra());
            if (z) {
                jSONObject.put("has_v3", "1");
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
