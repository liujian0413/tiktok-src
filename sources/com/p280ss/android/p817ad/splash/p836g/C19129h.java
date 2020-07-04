package com.p280ss.android.p817ad.splash.p836g;

import android.content.Intent;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.TouchDelegate;
import android.view.View;
import android.view.WindowManager;
import com.C1642a;
import com.p280ss.android.p817ad.splash.C18948b;
import com.p280ss.android.p817ad.splash.C19150l;
import com.p280ss.android.p817ad.splash.core.C19025f;
import com.p280ss.android.p817ad.splash.core.C19044j;
import com.p280ss.android.p817ad.splash.core.C19062u;
import com.p280ss.android.p817ad.splash.core.p827b.C18985b;
import com.p280ss.android.p817ad.splash.core.p828c.C19001b;
import com.p280ss.android.p817ad.splash.core.p828c.C19006e;
import com.p280ss.android.p817ad.splash.core.p828c.C19008g;
import com.p280ss.android.p817ad.splash.core.p828c.C19009h;
import com.p280ss.android.p817ad.splash.core.p828c.C19010i;
import com.p280ss.android.p817ad.splash.core.p828c.C19012k;
import com.p280ss.android.p817ad.splash.p824b.C18949a;
import com.p280ss.android.ugc.aweme.app.C22909c;
import com.p280ss.android.ugc.aweme.app.application.C22863b;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.g.h */
public final class C19129h {

    /* renamed from: a */
    private static final Map<String, String> f51714a = new HashMap();

    /* renamed from: b */
    private static final Set<String> f51715b = new HashSet();

    /* renamed from: a */
    public static boolean m62708a(long j, long j2) {
        return j2 > j;
    }

    /* renamed from: a */
    public static boolean m62707a() {
        C18948b f = C19025f.m62159f();
        if (f == null) {
            return false;
        }
        return f51715b.contains(f.mo50356a());
    }

    /* renamed from: a */
    public static boolean m62712a(C19062u uVar) {
        int n = uVar.mo50633n();
        return n > 0 && uVar.mo50636q() >= n;
    }

    /* renamed from: a */
    public static boolean m62710a(C19006e eVar, C19062u uVar) {
        return eVar != null && eVar.mo50507a() && m62713a(eVar.f51330d, uVar);
    }

    /* renamed from: a */
    public static boolean m62711a(C19012k kVar, C19062u uVar) {
        return kVar != null && kVar.mo50509a() && m62713a(kVar.f51352d, uVar);
    }

    /* renamed from: a */
    private static boolean m62713a(String str, C19062u uVar) {
        if (C19132j.m62736a(str)) {
            return false;
        }
        String c = m62721c(str);
        if (C19132j.m62736a(c)) {
            return false;
        }
        if (new File(c).exists()) {
            return uVar.mo50624h(str);
        }
        uVar.mo50622g(str);
        return false;
    }

    /* renamed from: a */
    public static List<C19001b> m62703a(JSONArray jSONArray, long j, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    C19001b bVar = new C19001b();
                    bVar.mo50475a(optJSONObject, j, z);
                    if (!z && bVar.mo50489l()) {
                        C18985b.m61973a();
                        C18985b.m61976a(bVar, "topview_boarding");
                    }
                    arrayList.add(bVar);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static List<C19001b> m62702a(JSONArray jSONArray, long j) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    C19001b bVar = new C19001b();
                    bVar.mo50474a(optJSONObject, j);
                    arrayList.add(bVar);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static List<C19001b> m62704a(JSONArray jSONArray, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    C19001b bVar = new C19001b();
                    bVar.mo50473a(optJSONObject);
                    if (!z) {
                        arrayList.add(bVar);
                    } else if (System.currentTimeMillis() <= bVar.mo50481e()) {
                        arrayList.add(bVar);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static Map<String, C19001b> m62705a(List<C19001b> list) {
        HashMap hashMap = new HashMap();
        if (C19126e.m62680a(list)) {
            return hashMap;
        }
        for (C19001b bVar : list) {
            if (!TextUtils.isEmpty(bVar.mo50488k())) {
                hashMap.put(bVar.mo50488k(), bVar);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static <E extends C19010i> List<C19001b> m62700a(Map<String, C19001b> map, List<E> list) {
        ArrayList arrayList = new ArrayList();
        if (C19126e.m62680a(list) || map == null) {
            return arrayList;
        }
        for (E e : list) {
            C19001b bVar = (C19001b) map.get(e.mo50470B());
            if (bVar != null) {
                if (e instanceof C19009h) {
                    bVar.f51295g = ((C19009h) e).f51340a;
                    bVar.f51308t = true;
                }
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static boolean m62709a(C19001b bVar) {
        long currentTimeMillis = System.currentTimeMillis();
        Calendar instance = Calendar.getInstance();
        instance.set(11, 23);
        instance.set(12, 59);
        instance.set(13, 59);
        instance.set(14, 999);
        return bVar.mo50480d() <= instance.getTimeInMillis() && currentTimeMillis < bVar.mo50481e();
    }

    /* renamed from: a */
    public static void m62706a(View view, int i, int i2, int i3, int i4) {
        View view2 = (View) view.getParent();
        final View view3 = view;
        final int i5 = i;
        final int i6 = i2;
        final int i7 = i3;
        final int i8 = i4;
        C191301 r1 = new Runnable() {
            public final void run() {
                if (view3 != null && view3.getParent() != null) {
                    Rect rect = new Rect();
                    view3.setEnabled(true);
                    view3.getHitRect(rect);
                    rect.top -= i5;
                    rect.bottom += i6;
                    rect.left -= i7;
                    rect.right += i8;
                    TouchDelegate touchDelegate = new TouchDelegate(rect, view3);
                    if (View.class.isInstance(view3.getParent())) {
                        ((View) view3.getParent()).setTouchDelegate(touchDelegate);
                    }
                }
            }
        };
        view2.post(r1);
    }

    /* renamed from: b */
    public static int m62714b() {
        int i = m62727i();
        if (i <= 0) {
            return m62728j();
        }
        return i;
    }

    /* renamed from: g */
    public static boolean m62725g() {
        C19150l K = C19025f.m62097K();
        if (K != null) {
            return K.mo50853a();
        }
        return false;
    }

    /* renamed from: i */
    private static int m62727i() {
        return (int) C19137n.m62745a(C19025f.m62096J(), (float) C19025f.m62098L());
    }

    /* renamed from: h */
    public static int m62726h() {
        int a = (int) C19137n.m62745a(C19025f.m62096J(), (float) C19025f.m62107U());
        if (a > 0) {
            return a;
        }
        return (m62714b() / 2) - C19025f.m62096J().getResources().getDimensionPixelSize(R.dimen.me);
    }

    /* renamed from: d */
    public static String m62722d() {
        C19008g gVar = C19044j.m62231a().f51462c;
        if (gVar == null) {
            return null;
        }
        List<C19001b> list = gVar.f51335a;
        if (C19126e.m62680a(list)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            String j = ((C19001b) list.get(i)).mo50487j();
            if (!TextUtils.isEmpty(j)) {
                sb.append(j);
                if (i != list.size() - 1) {
                    sb.append(",");
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: e */
    public static String m62723e() {
        StringBuilder sb = new StringBuilder(5120);
        C18948b f = C19025f.m62159f();
        f.f51076a = true;
        if (f != null) {
            try {
                String t = C19062u.m62368a().mo50639t();
                sb.append("/api/ad/v3/splash/creatives/");
                sb.append("?_unused=0");
                sb.append(m62729k());
                sb.append(f.toString());
                if (!TextUtils.isEmpty(t)) {
                    sb.append(t);
                }
                if (C19025f.m62109W() != -1) {
                    sb.append("&is_cold_start=");
                    sb.append(C19025f.m62109W());
                }
            } catch (Exception unused) {
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("getCommonParamsForRealtimeRequest is not allowed to assigned null");
    }

    /* renamed from: f */
    public static String m62724f() {
        StringBuilder sb = new StringBuilder(5120);
        C18948b f = C19025f.m62159f();
        f.f51076a = true;
        if (f != null) {
            try {
                String t = C19062u.m62368a().mo50639t();
                sb.append("/api/ad/v2/ack/splash/");
                sb.append("?_unused=0");
                sb.append(m62729k());
                sb.append(f.toString());
                if (!TextUtils.isEmpty(t)) {
                    sb.append(t);
                }
                sb.append("&refresh_num=");
                sb.append(C19062u.m62368a().mo50637r());
                if (C19025f.m62109W() != -1) {
                    sb.append("&is_cold_start=");
                    sb.append(C19025f.m62109W());
                }
            } catch (Exception unused) {
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("getCommonParamsForRealtimeRequest is not allowed to assigned null");
    }

    /* renamed from: j */
    private static int m62728j() {
        int i;
        Point point = new Point();
        WindowManager windowManager = (WindowManager) C19025f.m62096J().getSystemService("window");
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getSize(point);
        }
        double d = (double) C19025f.m62096J().getResources().getDisplayMetrics().density;
        if (d <= 1.1d) {
            i = 100;
        } else if (d <= 1.6d) {
            i = 960;
        } else {
            i = 1260;
        }
        return (((point.y - C19137n.m62751b(C19025f.m62096J())) * C34943c.f91127w) / i) + ((int) C19137n.m62745a(C19025f.m62096J(), 25.0f));
    }

    /* renamed from: c */
    public static String m62720c() {
        C18948b f = C19025f.m62159f();
        f.f51076a = true;
        HashMap I = C19025f.m62095I();
        if (f == null) {
            return null;
        }
        String str = (String) f51714a.get(f.mo50356a());
        if (C19132j.m62736a(str)) {
            return null;
        }
        StringBuilder sb = new StringBuilder(5120);
        try {
            sb.append("/api/ad/splash/");
            sb.append(str);
            if (C19025f.m62110X()) {
                sb.append("/v14/");
            } else {
                sb.append("/v16/");
            }
            sb.append("?_unused=0");
            sb.append(m62729k());
            sb.append(f.toString());
            sb.append("&app_name=");
            sb.append(str);
            if (I != null) {
                sb.append(m62697a(I));
            }
            sb.append("&refresh_num=");
            sb.append(C19062u.m62368a().mo50637r() + 1);
            if (C19025f.m62109W() != -1) {
                sb.append("&is_cold_start=");
                sb.append(C19025f.m62109W());
            }
        } catch (Exception unused) {
        }
        return sb.toString();
    }

    /* renamed from: k */
    private static StringBuilder m62729k() {
        StringBuilder sb = new StringBuilder(PreloadTask.BYTE_UNIT_NUMBER);
        TelephonyManager telephonyManager = (TelephonyManager) C19025f.m62096J().getSystemService("phone");
        if (telephonyManager != null) {
            String networkOperatorName = telephonyManager.getNetworkOperatorName();
            if (!C19132j.m62736a(networkOperatorName)) {
                sb.append("&carrier=");
                sb.append(Uri.encode(networkOperatorName));
            }
            String networkOperator = telephonyManager.getNetworkOperator();
            if (!C19132j.m62736a(networkOperator)) {
                sb.append("&mcc_mnc=");
                sb.append(Uri.encode(networkOperator));
            }
        }
        DisplayMetrics displayMetrics = C19025f.m62096J().getResources().getDisplayMetrics();
        int b = displayMetrics.heightPixels - C19137n.m62751b(C19025f.m62096J());
        sb.append("&ad_area=");
        sb.append(displayMetrics.widthPixels);
        sb.append("x");
        sb.append(b);
        sb.append("&sdk_version=");
        sb.append(C19025f.m62102P());
        sb.append("&os_api=");
        sb.append(VERSION.SDK_INT);
        sb.append("&device_platform=android");
        sb.append("&os_version=");
        sb.append(VERSION.RELEASE);
        sb.append("&display_density=");
        sb.append(displayMetrics.widthPixels);
        sb.append("x");
        sb.append(displayMetrics.heightPixels);
        sb.append("&dpi=");
        sb.append(C19137n.m62746a(C19025f.m62096J()));
        sb.append("&device_brand=");
        sb.append(Uri.encode(Build.BRAND));
        sb.append("&device_type=");
        sb.append(Uri.encode(Build.MODEL));
        int b2 = m62714b();
        if (b2 > 0) {
            sb.append("&bh=");
            sb.append(b2);
        }
        sb.append("&display_dpi=");
        sb.append(displayMetrics.densityDpi);
        sb.append("&density=");
        sb.append(displayMetrics.density);
        String e = C19128g.m62692e(C19025f.m62096J());
        if (!C19132j.m62736a(e)) {
            sb.append("&ac=");
            sb.append(Uri.encode(e));
        }
        return sb;
    }

    static {
        f51714a.put("1128", "aweme");
        f51714a.put("1180", "trill");
        f51714a.put(C22863b.f60589a, "musical");
        f51714a.put("13", "news_article");
        f51714a.put("35", "news_article_lite");
        f51714a.put("32", "video_article");
        f51714a.put("1106", "topbuzz");
        f51714a.put("1116", "topbuzz");
        f51714a.put("1131", "topbuzz");
        f51714a.put("1184", "topbuzz");
        f51714a.put("1104", "topbuzz");
        f51714a.put("1117", "topbuzz");
        f51714a.put("1132", "topbuzz");
        f51714a.put("1185", "topbuzz");
        f51714a.put("1239", "topbuzz");
        f51714a.put("1197", "topbuzz");
        f51714a.put("1193", "topbuzz");
        f51714a.put("1222", "topbuzz");
        f51714a.put("1211", "topbuzz");
        f51714a.put("1194", "topbuzz");
        f51714a.put("1124", "topbuzz");
        f51714a.put("1125", "topbuzz");
        f51714a.put("1245", "topbuzz");
        f51714a.put("1113", "topbuzz");
        f51714a.put("1342", "topbuzz");
        f51714a.put("1346", "topbuzz");
        f51714a.put("1145", "live_i18n");
        f51714a.put("1164", "flipagram");
        f51714a.put("7", "neihan");
        f51714a.put("10001", "faceu");
        f51714a.put("1207", "learning");
        f51714a.put("36", "automobile");
        f51714a.put("150121", "beauty_me");
        f51714a.put("1372", "beauty_me_oversea");
        f51714a.put("1319", "super");
        f51714a.put("1370", "f100");
        f51714a.put("1488", "f101");
        f51714a.put("1353", "hively");
        f51714a.put("1354", "hively");
        f51714a.put("1112", "live_stream");
        f51714a.put("1350", "live_stream_lite");
        f51714a.put("1398", "homed");
        f51715b.add("1180");
        f51715b.add(C22863b.f60589a);
        f51715b.add("1106");
        f51715b.add("1116");
        f51715b.add("1131");
        f51715b.add("1184");
        f51715b.add("1104");
        f51715b.add("1117");
        f51715b.add("1132");
        f51715b.add("1185");
        f51715b.add("1239");
        f51715b.add("1197");
        f51715b.add("1193");
        f51715b.add("1222");
        f51715b.add("1211");
        f51715b.add("1194");
        f51715b.add("1124");
        f51715b.add("1125");
        f51715b.add("1245");
        f51715b.add("1113");
        f51715b.add("1342");
        f51715b.add("1346");
        f51715b.add("1372");
    }

    /* renamed from: a */
    public static List<C19001b> m62701a(JSONArray jSONArray) {
        return m62704a(jSONArray, false);
    }

    /* renamed from: a */
    public static String m62696a(C19012k kVar) {
        if (kVar == null || kVar.f51351c == null || kVar.f51351c.isEmpty()) {
            return null;
        }
        return C19136m.m62743a((String) kVar.f51351c.get(0));
    }

    /* renamed from: b */
    public static String m62715b(C19006e eVar) {
        if (eVar == null || !eVar.mo50507a()) {
            return null;
        }
        return m62721c(eVar.f51330d);
    }

    /* renamed from: a */
    public static String m62695a(C19006e eVar) {
        if (eVar == null) {
            return null;
        }
        List<String> list = eVar.f51327a;
        if (list == null || list.isEmpty()) {
            return null;
        }
        String str = (String) list.get(0);
        if (C19132j.m62736a(str) && list.size() >= 2) {
            str = (String) list.get(1);
            if (C19132j.m62736a(str) && list.size() >= 3) {
                str = (String) list.get(2);
            }
        }
        return str;
    }

    /* renamed from: b */
    public static String m62716b(C19012k kVar) {
        if (kVar == null || !kVar.mo50509a()) {
            return null;
        }
        return m62721c(kVar.f51352d);
    }

    /* renamed from: c */
    private static String m62721c(String str) {
        if (C19132j.m62736a(str)) {
            return null;
        }
        String E = C19025f.m62091E();
        if (TextUtils.isEmpty(E)) {
            return null;
        }
        try {
            File file = new File(E);
            if (!file.isDirectory()) {
                file.delete();
            }
            if (!file.exists()) {
                file.mkdirs();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(E);
            sb.append(C19122a.m62654a(str));
            return sb.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static int m62693a(String str) {
        if (C19132j.m62736a(str)) {
            return 0;
        }
        try {
            String scheme = Uri.parse(str).getScheme();
            if (C19132j.m62736a(scheme)) {
                return 0;
            }
            if (C19138o.m62753a(str)) {
                return 2;
            }
            if (C19025f.m62159f() != null && "13".equals(C19025f.m62159f().mo50356a())) {
                if ("jdsdk".equalsIgnoreCase(scheme)) {
                    return 3;
                }
                if ("taobaosdk".equalsIgnoreCase(scheme)) {
                    return 4;
                }
            }
            if (C19138o.m62754b(str)) {
                return 5;
            }
            return 1;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: b */
    public static List<C19010i> m62717b(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                String optString = jSONArray.optString(i);
                if (!TextUtils.isEmpty(optString)) {
                    arrayList.add(new C19010i(optString));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static JSONArray m62718b(List<C19001b> list) {
        JSONArray jSONArray = new JSONArray();
        if (C19126e.m62680a(list)) {
            return jSONArray;
        }
        try {
            for (C19001b bVar : list) {
                if (bVar.f51311w != null) {
                    jSONArray.put(bVar.f51311w);
                }
            }
        } catch (Exception unused) {
        }
        return jSONArray;
    }

    /* renamed from: a */
    private static String m62697a(HashMap<String, String> hashMap) {
        if (hashMap == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Entry entry : hashMap.entrySet()) {
            if (!C19132j.m62736a((String) entry.getKey()) && !C19132j.m62736a((String) entry.getValue())) {
                sb.append("&");
                sb.append(C1642a.m8034a("%s=%s", new Object[]{entry.getKey(), entry.getValue()}));
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static boolean m62719b(String str) {
        if (C19132j.m62736a(str)) {
            return false;
        }
        try {
            switch (m62693a(str)) {
                case 0:
                    return false;
                case 1:
                    Uri parse = Uri.parse(str);
                    if (C22909c.f60637a.equalsIgnoreCase(parse.getScheme())) {
                        return true;
                    }
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setData(parse);
                    return C19136m.m62744a(C19025f.m62096J(), intent);
                case 2:
                case 3:
                case 4:
                case 5:
                    return true;
                default:
                    return false;
            }
        } catch (Exception e) {
            C18949a.m61865a().mo50361a(e, "key_exception_open_url");
            return false;
        }
    }

    /* renamed from: a */
    public static String m62698a(boolean z) {
        C18948b f = C19025f.m62159f();
        f.f51076a = false;
        HashMap I = C19025f.m62095I();
        if (f == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(5120);
        try {
            String t = C19062u.m62368a().mo50639t();
            sb.append("/api/ad/v1/splash/stock/");
            sb.append("?_unused=0");
            sb.append(m62729k());
            sb.append(f.toString());
            if (I != null) {
                sb.append(m62697a(I));
            }
            if (z) {
                sb.append("&show_limit=1");
            } else {
                sb.append("&show_limit=0");
            }
            if (!TextUtils.isEmpty(t)) {
                sb.append(t);
            }
            sb.append("&refresh_num=");
            sb.append(C19062u.m62368a().mo50637r());
            if (C19025f.m62109W() != -1) {
                sb.append("&is_cold_start=");
                sb.append(C19025f.m62109W());
            }
        } catch (Exception unused) {
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static List<C19001b> m62699a(List<C19001b> list, List<C19001b> list2) {
        if (list == null) {
            list = new ArrayList<>();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            C19001b bVar = (C19001b) list.get(i);
            if (m62709a(bVar)) {
                arrayList.add(bVar);
                new StringBuilder("预加载: 本地首刷广告 ad:").append(bVar.mo50375n());
            } else {
                new StringBuilder("预加载: 本地首刷广告过期 ad:").append(bVar.mo50375n());
            }
        }
        ArrayList arrayList2 = new ArrayList();
        if (C19126e.m62680a(list2)) {
            return arrayList;
        }
        for (C19001b bVar2 : list2) {
            if (bVar2.f51304p == 1) {
                arrayList2.add(bVar2);
                new StringBuilder("预加载: 拉取首刷广告 ad:").append(bVar2.mo50375n());
            }
        }
        arrayList.removeAll(arrayList2);
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    /* renamed from: a */
    public static C19008g m62694a(JSONArray jSONArray, JSONArray jSONArray2, long j) {
        C19008g gVar = new C19008g();
        List<C19001b> a = m62702a(jSONArray2, j);
        List<C19001b> a2 = m62704a(jSONArray, true);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C19001b bVar : a2) {
            if (!C19132j.m62736a(bVar.mo50470B())) {
                arrayList.add(bVar);
            }
        }
        for (C19001b bVar2 : a) {
            if (bVar2.mo50489l()) {
                C18985b.m61973a();
                C18985b.m61976a(bVar2, "topview_boarding");
            }
            if (!C19132j.m62736a(bVar2.mo50470B())) {
                arrayList2.add(bVar2);
            }
        }
        arrayList.removeAll(arrayList2);
        arrayList.addAll(arrayList2);
        Map<String, C19001b> a3 = m62705a((List<C19001b>) arrayList);
        gVar.f51335a = arrayList;
        gVar.f51337c = a3;
        gVar.f51338d = a;
        return gVar;
    }
}
