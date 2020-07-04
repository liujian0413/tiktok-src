package com.p280ss.android.ugc.aweme.feed;

import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.feed.model.NearbyCities.CityBean;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.utils.C42996by;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.feed.d */
public final class C28290d {

    /* renamed from: a */
    public static CityBean f74552a;

    /* renamed from: f */
    private static Keva m93045f() {
        return Keva.getRepo("SelectOldCities");
    }

    /* renamed from: e */
    public static String m93044e() {
        String a = m93037a();
        if (TextUtils.isEmpty(a)) {
            return m93043d();
        }
        return a;
    }

    /* renamed from: b */
    public static CityBean m93040b() {
        try {
            return (CityBean) C42996by.m136484a(m93038a(""), CityBean.class);
        } catch (Exception e) {
            C6869c a = C6869c.m21381a();
            a.mo16887a("poi_class_code", C33230ac.f86491a);
            StringBuilder sb = new StringBuilder("getSelectCity:");
            sb.append(e.getMessage());
            a.mo16887a("err_msg", sb.toString());
            m93039a(a.mo16888b());
            return null;
        }
    }

    /* renamed from: a */
    public static String m93037a() {
        CityBean cityBean;
        try {
            cityBean = (CityBean) C42996by.m136484a(m93038a(""), CityBean.class);
        } catch (Exception e) {
            C6869c a = C6869c.m21381a();
            a.mo16887a("poi_class_code", C33230ac.f86491a);
            StringBuilder sb = new StringBuilder("getSelectCityCode:");
            sb.append(e.getMessage());
            a.mo16887a("err_msg", sb.toString());
            m93039a(a.mo16888b());
            cityBean = null;
        }
        if (cityBean == null) {
            return "";
        }
        return cityBean.code;
    }

    /* renamed from: c */
    public static CityBean m93042c() {
        CityBean cityBean;
        if (f74552a != null) {
            CityBean cityBean2 = f74552a;
            f74552a = null;
            return cityBean2;
        }
        try {
            cityBean = (CityBean) C42996by.m136484a(m93041b(""), CityBean.class);
        } catch (Exception e) {
            C6869c a = C6869c.m21381a();
            a.mo16887a("poi_class_code", C33230ac.f86491a);
            StringBuilder sb = new StringBuilder("getCurrentCity:");
            sb.append(e.getMessage());
            a.mo16887a("err_msg", sb.toString());
            m93039a(a.mo16888b());
            cityBean = null;
        }
        return cityBean;
    }

    /* renamed from: d */
    public static String m93043d() {
        CityBean cityBean;
        try {
            cityBean = (CityBean) C42996by.m136484a(m93041b(""), CityBean.class);
        } catch (Exception e) {
            C6869c a = C6869c.m21381a();
            a.mo16887a("poi_class_code", C33230ac.f86491a);
            StringBuilder sb = new StringBuilder("getCurrentCityCode:");
            sb.append(e.getMessage());
            a.mo16887a("err_msg", sb.toString());
            m93039a(a.mo16888b());
            cityBean = null;
        }
        if (cityBean == null) {
            return "";
        }
        return cityBean.code;
    }

    /* renamed from: a */
    private static void m93039a(JSONObject jSONObject) {
        C6877n.m21407a("poi_log", "poi_city", jSONObject);
    }

    /* renamed from: a */
    private static String m93038a(String str) {
        return m93045f().getString("select_city", str);
    }

    /* renamed from: b */
    private static String m93041b(String str) {
        return m93045f().getString("current_city", str);
    }
}
