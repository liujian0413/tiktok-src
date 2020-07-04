package com.bytedance.frameworks.baselib.network.http.cronet.impl;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.app.C22689a.C22704b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.frameworks.baselib.network.http.cronet.impl.f */
public final class C10132f {

    /* renamed from: a */
    public int f27584a;

    /* renamed from: b */
    public long f27585b;

    /* renamed from: c */
    public int f27586c;

    /* renamed from: d */
    public int f27587d;

    /* renamed from: e */
    public int f27588e;

    /* renamed from: f */
    public String f27589f;

    /* renamed from: g */
    public List<C10135c> f27590g = new ArrayList();

    /* renamed from: h */
    public String f27591h;

    /* renamed from: i */
    public String f27592i;

    /* renamed from: j */
    public String f27593j;

    /* renamed from: k */
    public int f27594k;

    /* renamed from: l */
    public String f27595l;

    /* renamed from: m */
    public int f27596m;

    /* renamed from: n */
    public String f27597n;

    /* renamed from: o */
    public int f27598o;

    /* renamed from: p */
    public int f27599p;

    /* renamed from: q */
    public String f27600q;

    /* renamed from: r */
    public String f27601r;

    /* renamed from: s */
    public String f27602s;

    /* renamed from: com.bytedance.frameworks.baselib.network.http.cronet.impl.f$a */
    public static class C10133a extends C10135c {

        /* renamed from: a */
        public String f27603a;

        /* renamed from: b */
        public int f27604b;

        /* renamed from: c */
        public int f27605c;

        /* renamed from: d */
        public List<String> f27606d = new ArrayList();

        /* renamed from: a */
        public static C10133a m30088a(JSONObject jSONObject) {
            try {
                C10133a aVar = new C10133a();
                aVar.f27603a = jSONObject.getString("host");
                aVar.f27604b = jSONObject.getInt("error");
                aVar.f27605c = jSONObject.getInt("cost");
                JSONArray optJSONArray = jSONObject.optJSONArray("ips");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        if (optJSONArray.get(i) != null && (optJSONArray.get(i) instanceof String)) {
                            String str = (String) optJSONArray.get(i);
                            if (!TextUtils.isEmpty(str)) {
                                aVar.f27606d.add(str);
                            }
                        }
                    }
                }
                return aVar;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.cronet.impl.f$b */
    public static class C10134b extends C10135c {

        /* renamed from: a */
        public String f27607a;

        /* renamed from: b */
        public int f27608b;

        /* renamed from: c */
        public int f27609c;

        /* renamed from: d */
        public int f27610d;

        /* renamed from: e */
        public String f27611e;

        /* renamed from: f */
        public int f27612f;

        /* renamed from: g */
        public int f27613g;

        /* renamed from: h */
        public int f27614h;

        /* renamed from: i */
        public int f27615i;

        /* renamed from: j */
        public int f27616j;

        /* renamed from: k */
        public int f27617k;

        /* renamed from: l */
        public int f27618l;

        /* renamed from: m */
        public int f27619m;

        /* renamed from: n */
        public int f27620n;

        /* renamed from: o */
        public int f27621o;

        /* renamed from: p */
        public int f27622p;

        /* renamed from: a */
        public static C10134b m30089a(JSONObject jSONObject) {
            try {
                C10134b bVar = new C10134b();
                bVar.f27607a = jSONObject.getString("url");
                bVar.f27608b = jSONObject.getInt("httpcode");
                bVar.f27609c = jSONObject.getInt("error");
                bVar.f27610d = jSONObject.getInt("timeout");
                bVar.f27611e = jSONObject.getString("addr");
                bVar.f27612f = jSONObject.getInt("port");
                bVar.f27613g = jSONObject.getInt("cached");
                bVar.f27614h = jSONObject.getInt("sock_reused");
                bVar.f27615i = jSONObject.getInt("totalcost");
                bVar.f27616j = jSONObject.getInt("dnscost");
                bVar.f27617k = jSONObject.getInt("tcpcost");
                bVar.f27618l = jSONObject.getInt("sslcost");
                bVar.f27619m = jSONObject.getInt("sendcost");
                bVar.f27620n = jSONObject.getInt("waitcost");
                bVar.f27621o = jSONObject.getInt("recvcost");
                bVar.f27622p = jSONObject.getInt("recvd_bytes");
                return bVar;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.cronet.impl.f$c */
    public static class C10135c {
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.cronet.impl.f$d */
    public static class C10136d extends C10135c {

        /* renamed from: a */
        public String f27623a;

        /* renamed from: b */
        public int f27624b;

        /* renamed from: c */
        public int f27625c;

        /* renamed from: d */
        public List<String> f27626d = new ArrayList();

        /* renamed from: a */
        public static C10136d m30090a(JSONObject jSONObject) {
            try {
                C10136d dVar = new C10136d();
                dVar.f27623a = jSONObject.getString("host");
                dVar.f27624b = jSONObject.getInt("error");
                dVar.f27625c = jSONObject.getInt("cost");
                JSONArray optJSONArray = jSONObject.optJSONArray("ips");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        if (optJSONArray.get(i) != null && (optJSONArray.get(i) instanceof String)) {
                            String str = (String) optJSONArray.get(i);
                            if (!TextUtils.isEmpty(str)) {
                                dVar.f27626d.add(str);
                            }
                        }
                    }
                }
                return dVar;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.cronet.impl.f$e */
    public static class C10137e extends C10135c {

        /* renamed from: a */
        public String f27627a;

        /* renamed from: b */
        public String f27628b;

        /* renamed from: c */
        public int f27629c;

        /* renamed from: d */
        public int f27630d;

        /* renamed from: e */
        public int f27631e;

        /* renamed from: f */
        public int f27632f;

        /* renamed from: a */
        public static C10137e m30091a(JSONObject jSONObject) {
            try {
                C10137e eVar = new C10137e();
                eVar.f27627a = jSONObject.getString("host");
                eVar.f27628b = jSONObject.getString("ip");
                eVar.f27629c = jSONObject.getInt("error");
                eVar.f27630d = jSONObject.getInt("ping_times");
                eVar.f27631e = jSONObject.getInt("succ_times");
                eVar.f27632f = jSONObject.getInt("avg_cost");
                return eVar;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.cronet.impl.f$f */
    public static class C10138f extends C10135c {

        /* renamed from: a */
        public String f27633a;

        /* renamed from: b */
        public String f27634b;

        /* renamed from: c */
        public int f27635c;

        /* renamed from: d */
        public int f27636d;

        /* renamed from: e */
        public List<C10139g> f27637e = new ArrayList();

        /* renamed from: a */
        public static C10138f m30092a(JSONObject jSONObject) {
            try {
                C10138f fVar = new C10138f();
                fVar.f27633a = jSONObject.getString("host");
                fVar.f27634b = jSONObject.getString("ip");
                fVar.f27635c = jSONObject.getInt("error");
                fVar.f27636d = jSONObject.getInt("hops");
                JSONArray optJSONArray = jSONObject.optJSONArray(C22704b.f60415d);
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        C10139g a = C10139g.m30093a((JSONObject) optJSONArray.get(i));
                        if (a != null) {
                            fVar.f27637e.add(a);
                        }
                    }
                }
                return fVar;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.cronet.impl.f$g */
    public static class C10139g {

        /* renamed from: a */
        public int f27638a;

        /* renamed from: b */
        public int f27639b;

        /* renamed from: c */
        public String f27640c;

        /* renamed from: d */
        public int f27641d;

        /* renamed from: a */
        public static C10139g m30093a(JSONObject jSONObject) {
            try {
                C10139g gVar = new C10139g();
                gVar.f27640c = jSONObject.getString("ip");
                gVar.f27638a = jSONObject.getInt("sendhops");
                gVar.f27639b = jSONObject.getInt("replyhops");
                gVar.f27641d = jSONObject.getInt("cost");
                return gVar;
            } catch (Throwable unused) {
                return null;
            }
        }
    }
}
