package com.p280ss.ttvideoengine.log;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.app.C22689a.C22704b;
import com.p280ss.ttvideoengine.p1812e.C46082g;
import com.p280ss.ttvideoengine.p1812e.C46083h;
import com.p280ss.ttvideoengine.p1816i.C46119e;
import com.p280ss.ttvideoengine.p1816i.C46123h;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.log.f */
public final class C46146f {

    /* renamed from: A */
    public String f118243A = "";

    /* renamed from: B */
    public String f118244B = "";

    /* renamed from: C */
    public int f118245C = Integer.MIN_VALUE;

    /* renamed from: D */
    public String f118246D = "default";

    /* renamed from: E */
    public String f118247E = "default";

    /* renamed from: F */
    public int f118248F;

    /* renamed from: G */
    public int f118249G;

    /* renamed from: H */
    public String f118250H = "";

    /* renamed from: I */
    public float f118251I = 1.0f;

    /* renamed from: J */
    public String f118252J = "";

    /* renamed from: K */
    public String f118253K = "";

    /* renamed from: L */
    public Context f118254L;

    /* renamed from: M */
    public long f118255M = -2147483648L;

    /* renamed from: N */
    public long f118256N = -2147483648L;

    /* renamed from: O */
    public long f118257O = -2147483648L;

    /* renamed from: P */
    public String f118258P = "";

    /* renamed from: Q */
    public String f118259Q = "";

    /* renamed from: R */
    public long f118260R = -2147483648L;

    /* renamed from: S */
    public long f118261S = -2147483648L;

    /* renamed from: T */
    public long f118262T = -2147483648L;

    /* renamed from: U */
    public int f118263U = Integer.MIN_VALUE;

    /* renamed from: V */
    public int f118264V = Integer.MIN_VALUE;

    /* renamed from: W */
    public int f118265W;

    /* renamed from: X */
    public int f118266X = Integer.MIN_VALUE;

    /* renamed from: Y */
    public int f118267Y = Integer.MIN_VALUE;

    /* renamed from: Z */
    public String f118268Z = "";

    /* renamed from: a */
    public C46141a f118269a;

    /* renamed from: aa */
    public int f118270aa = -1;

    /* renamed from: ab */
    public int f118271ab = -1;

    /* renamed from: ac */
    public int f118272ac = -1;

    /* renamed from: ad */
    public String f118273ad = "";

    /* renamed from: ae */
    public int f118274ae = -1;

    /* renamed from: af */
    public String f118275af = "";

    /* renamed from: ag */
    private Map f118276ag;

    /* renamed from: b */
    public String f118277b;

    /* renamed from: c */
    public String f118278c = "";

    /* renamed from: d */
    public String f118279d = "";

    /* renamed from: e */
    public String f118280e = "";

    /* renamed from: f */
    public String f118281f = "";

    /* renamed from: g */
    public String f118282g;

    /* renamed from: h */
    public String f118283h;

    /* renamed from: i */
    public String f118284i;

    /* renamed from: j */
    public String f118285j;

    /* renamed from: k */
    public String f118286k;

    /* renamed from: l */
    public String f118287l;

    /* renamed from: m */
    public String f118288m;

    /* renamed from: n */
    public String f118289n;

    /* renamed from: o */
    public String f118290o;

    /* renamed from: p */
    public int f118291p;

    /* renamed from: q */
    public String f118292q = "";

    /* renamed from: r */
    public String f118293r = "";

    /* renamed from: s */
    public int f118294s = Integer.MIN_VALUE;

    /* renamed from: t */
    public int f118295t = Integer.MIN_VALUE;

    /* renamed from: u */
    public int f118296u = Integer.MIN_VALUE;

    /* renamed from: v */
    public String f118297v = "";

    /* renamed from: w */
    public int f118298w = Integer.MIN_VALUE;

    /* renamed from: x */
    public int f118299x = Integer.MIN_VALUE;

    /* renamed from: y */
    public String f118300y = "";

    /* renamed from: z */
    public String f118301z = "";

    /* renamed from: a */
    public final void mo112441a() {
        mo112445b(null);
    }

    /* renamed from: a */
    private static String m144713a(Context context) {
        if (context == null) {
            return "unknown";
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return "unavailable";
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
            return "unavailable";
        }
        NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
        if (networkInfo != null) {
            State state = networkInfo.getState();
            if (state != null && (state == State.CONNECTED || state == State.CONNECTING)) {
                return "WIFI";
            }
        }
        switch (((TelephonyManager) context.getSystemService("phone")).getNetworkType()) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return "2G";
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return "3G";
            case 13:
                return "4G";
            default:
                return "wwan";
        }
    }

    C46146f(C46141a aVar) {
        this.f118269a = aVar;
        this.f118282g = C46119e.m144517a(null);
    }

    /* renamed from: a */
    public final void mo112443a(C46083h hVar) {
        if (hVar != null) {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            if (hVar.f117858d != null) {
                List<C46082g> a = hVar.f117858d.mo112249a();
                if (a != null && a.size() > 0) {
                    for (C46082g gVar : a) {
                        String resolution = gVar.f117830b.toString(gVar.f117802B);
                        hashMap.put(resolution, Long.valueOf(gVar.mo112222d(12)));
                        hashMap2.put(resolution, gVar.mo112220b(8));
                    }
                }
            }
            HashMap hashMap3 = new HashMap();
            hashMap3.put("duration", Integer.valueOf(hVar.mo112223a(3)));
            hashMap3.put("size", hashMap);
            hashMap3.put("codec", hashMap2);
            hashMap3.put("vtype", hVar.mo112241e());
            hashMap3.put("dynamic_type", hVar.mo112242f());
            this.f118276ag = hashMap3;
        }
    }

    /* renamed from: b */
    public final void mo112445b(C46083h hVar) {
        Object obj;
        this.f118253K = m144713a(this.f118254L);
        if (this.f118276ag != null) {
            if (this.f118295t <= 0) {
                this.f118295t = ((Integer) this.f118276ag.get("duration")).intValue() * 1000;
            }
            Object obj2 = ((Map) this.f118276ag.get("size")).get(this.f118244B);
            int i = -1;
            if (obj2 != null) {
                i = ((Long) obj2).intValue();
            }
            this.f118296u = i;
            Map map = (Map) this.f118276ag.get("codec");
            if (map.get(this.f118244B) != null) {
                obj = map.get(this.f118244B);
            } else {
                obj = "";
            }
            this.f118297v = (String) obj;
            this.f118300y = (String) this.f118276ag.get("vtype");
            this.f118301z = (String) this.f118276ag.get("dynamic_type");
        }
        if (this.f118269a != null) {
            Map a = this.f118269a.mo112102a();
            if (a != null) {
                this.f118278c = (String) a.get("pv");
                this.f118279d = (String) a.get("pc");
                this.f118280e = (String) a.get("sv");
                this.f118281f = (String) a.get("sdk_version");
            }
            String a2 = this.f118269a.mo112101a(0);
            if (!TextUtils.isEmpty(a2)) {
                this.f118297v = a2;
            }
            this.f118299x = this.f118269a.mo112105c(24);
            this.f118298w = this.f118269a.mo112105c(25);
            String c = this.f118269a.mo112106c();
            StringBuilder sb = new StringBuilder("brian info from mdl: ");
            sb.append(c);
            sb.append(", traceID: ");
            sb.append(this.f118252J);
            C46123h.m144545a("VideoEventBase", sb.toString());
            if (c != null) {
                try {
                    JSONObject jSONObject = new JSONObject(c);
                    if (!jSONObject.isNull("cur_req_pos")) {
                        this.f118255M = ((Number) jSONObject.get("cur_req_pos")).longValue();
                    }
                    if (!jSONObject.isNull("cur_end_pos")) {
                        this.f118256N = ((Number) jSONObject.get("cur_end_pos")).longValue();
                    }
                    if (!jSONObject.isNull("cur_cache_pos")) {
                        this.f118257O = ((Number) jSONObject.get("cur_cache_pos")).longValue();
                    }
                    if (!jSONObject.isNull("down_pos")) {
                        this.f118261S = ((Number) jSONObject.get("down_pos")).longValue();
                    }
                    if (!jSONObject.isNull("err_code")) {
                        this.f118265W = ((Integer) jSONObject.get("err_code")).intValue();
                    }
                    if (!jSONObject.isNull("player_wait_num")) {
                        this.f118263U = ((Integer) jSONObject.get("player_wait_num")).intValue();
                    }
                    if (!jSONObject.isNull("player_wait_time")) {
                        this.f118262T = ((Number) jSONObject.get("player_wait_time")).longValue();
                    }
                    if (!jSONObject.isNull("reply_size")) {
                        this.f118260R = ((Number) jSONObject.get("reply_size")).longValue();
                    }
                    if (!jSONObject.isNull("stage")) {
                        this.f118264V = ((Integer) jSONObject.get("stage")).intValue();
                    }
                    if (!jSONObject.isNull("cur_host")) {
                        this.f118259Q = jSONObject.get("cur_host").toString();
                    }
                    if (!jSONObject.isNull("cur_ip")) {
                        this.f118258P = jSONObject.get("cur_ip").toString();
                    }
                    if (!jSONObject.isNull("cur_task_num")) {
                        this.f118266X = ((Integer) jSONObject.get("cur_task_num")).intValue();
                    }
                    if (!jSONObject.isNull("speed")) {
                        this.f118267Y = ((Integer) jSONObject.get("speed")).intValue();
                    }
                    if (!jSONObject.isNull("file_key")) {
                        this.f118268Z = jSONObject.get("file_key").toString();
                    }
                    if (!jSONObject.isNull("is_socrf")) {
                        this.f118270aa = ((Integer) jSONObject.get("is_socrf")).intValue();
                    }
                    if (!jSONObject.isNull("req_num")) {
                        this.f118271ab = ((Integer) jSONObject.get("req_num")).intValue();
                    }
                    if (!jSONObject.isNull("url_index")) {
                        this.f118272ac = ((Integer) jSONObject.get("url_index")).intValue();
                    }
                    if (!jSONObject.isNull("re_url")) {
                        this.f118273ad = jSONObject.get("re_url").toString();
                    }
                    if (!jSONObject.isNull("cur_source")) {
                        this.f118274ae = ((Integer) jSONObject.get("cur_source")).intValue();
                    }
                    if (!jSONObject.isNull("extra_info")) {
                        this.f118275af = jSONObject.get("extra_info").toString();
                    }
                } catch (JSONException unused) {
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo112446b(String str, String str2) {
        this.f118243A = str2;
        this.f118244B = str;
    }

    /* renamed from: a */
    public final void mo112444a(String str, String str2) {
        this.f118292q = str;
        this.f118277b = str2;
        this.f118282g = C46119e.m144517a(this.f118277b);
    }

    /* renamed from: a */
    public final void mo112442a(int i, String str) {
        switch (i) {
            case 0:
                this.f118293r = "local_url";
                break;
            case 1:
                this.f118293r = "dir_url";
                break;
            case 2:
                this.f118293r = "playitem";
                break;
            case 3:
                this.f118293r = "preload";
                break;
            case 4:
                this.f118293r = C22704b.f60414c;
                break;
            case 5:
                this.f118293r = "vid";
                break;
            case 6:
                this.f118293r = "fd";
                break;
            case 7:
                this.f118293r = "mds";
                break;
        }
        this.f118292q = str;
    }
}
