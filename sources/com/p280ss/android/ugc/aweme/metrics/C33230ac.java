package com.p280ss.android.ugc.aweme.metrics;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.IAccountService;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.feed.C28290d;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.NearbyCities.CityBean;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.metrics.ac */
public final class C33230ac {

    /* renamed from: a */
    public static String f86491a = "";

    /* renamed from: b */
    public static String f86492b = "";

    /* renamed from: b */
    public static String m107214b() {
        return f86491a;
    }

    /* renamed from: a */
    public static String m107204a() {
        CityBean b = C28290d.m93040b();
        if (b == null) {
            CityBean c = C28290d.m93042c();
            if (c == null) {
                return "";
            }
            if (c.code == null) {
                return "";
            }
            return c.code;
        } else if (b.code == null) {
            return "";
        } else {
            return b.code;
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m107212a(IllegalArgumentException illegalArgumentException) {
        throw illegalArgumentException;
    }

    /* renamed from: f */
    public static boolean m107226f(String str) {
        return TextUtils.equals("homepage_familiar", str);
    }

    /* renamed from: g */
    public static boolean m107228g(String str) {
        return TextUtils.equals("challenge", str);
    }

    /* renamed from: h */
    public static boolean m107230h(String str) {
        return "homepage_hot".equals(str);
    }

    /* renamed from: i */
    public static String m107232i(String str) {
        return m107210a(str, 0);
    }

    /* renamed from: b */
    public static int m107213b(Music music) {
        if (music == null) {
            return 0;
        }
        return music.getUserCount();
    }

    /* renamed from: i */
    public static String m107231i(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        return m107218b(aweme.getDistance());
    }

    /* renamed from: j */
    public static String m107234j(String str) {
        return C28199ae.m92689a().mo71791a(m107210a(str, 0));
    }

    /* renamed from: m */
    public static String m107238m(Aweme aweme) {
        if (aweme != null) {
            return aweme.getAid();
        }
        return "";
    }

    /* renamed from: q */
    public static String m107242q(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        return aweme.getDesc();
    }

    /* renamed from: r */
    public static String m107243r(Aweme aweme) {
        if (aweme != null) {
            return aweme.getAuthorUid();
        }
        return "";
    }

    /* renamed from: u */
    public static String m107246u(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        return aweme.getMixId();
    }

    /* renamed from: a */
    public static String m107205a(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if (aweme.getAuthor() != null) {
            return aweme.getAuthor().getUid();
        }
        return "";
    }

    /* renamed from: c */
    public static String m107219c(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if (aweme.getRequestId() != null) {
            return aweme.getRequestId();
        }
        return "";
    }

    /* renamed from: d */
    public static String m107221d(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if (aweme.getAwemeType() == 13) {
            aweme = aweme.getForwardItem();
        }
        if (aweme == null || !aweme.isImage()) {
            return "0";
        }
        return "1";
    }

    /* renamed from: e */
    public static String m107223e(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if (aweme.getPoiStruct() != null) {
            return aweme.getPoiStruct().getPoiId();
        }
        return "";
    }

    /* renamed from: f */
    public static String m107225f(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if (aweme.getPoiStruct() != null) {
            return aweme.getPoiStruct().getBackendTypeCode();
        }
        return "";
    }

    /* renamed from: g */
    public static String m107227g(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if (aweme.getPoiStruct() != null) {
            return aweme.getPoiStruct().getPoiName();
        }
        return "";
    }

    /* renamed from: h */
    public static String m107229h(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if (aweme.getPoiStruct() != null) {
            return String.valueOf(aweme.getPoiStruct().typeCode);
        }
        return "";
    }

    /* renamed from: l */
    public static String m107237l(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        int awemeType = aweme.getAwemeType();
        if (awemeType == 2) {
            return "photo";
        }
        if (awemeType != 101) {
            return "video";
        }
        return "live";
    }

    /* renamed from: n */
    public static String m107239n(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if (aweme.isImage()) {
            return "1";
        }
        return "0";
    }

    /* renamed from: o */
    public static String m107240o(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if (aweme.isImage()) {
            return "photo";
        }
        return "video";
    }

    /* renamed from: s */
    public static String m107244s(Aweme aweme) {
        if (aweme == null || aweme.getAuthor() == null) {
            return "";
        }
        return aweme.getAuthor().getSecUid();
    }

    /* renamed from: v */
    public static String m107247v(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if (aweme.isForwardAweme() || !TextUtils.isEmpty(aweme.getRepostFromUserId())) {
            return "repost";
        }
        return "item";
    }

    /* renamed from: b */
    public static String m107215b(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        User author = aweme.getAuthor();
        if (author == null || !author.isLive()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(author.roomId);
        return sb.toString();
    }

    /* renamed from: c */
    public static boolean m107220c(String str) {
        if ("homepage_fresh".equalsIgnoreCase(str) || "poi_page".equalsIgnoreCase(str) || "poi_page_hot".equalsIgnoreCase(str) || "poi_page_new".equalsIgnoreCase(str) || "categorized_city_poi".equalsIgnoreCase(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m107224e(String str) {
        if (TextUtils.equals("homepage_follow", str) || TextUtils.equals("homepage_friends", str)) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static Long m107233j(Aweme aweme) {
        long j = 0;
        if (aweme == null) {
            return Long.valueOf(0);
        }
        if (aweme.getAwemeType() == 13) {
            aweme = aweme.getForwardItem();
        }
        if (aweme == null) {
            return Long.valueOf(0);
        }
        if (aweme.getMusic() != null) {
            j = aweme.getMusic().getId();
        }
        return Long.valueOf(j);
    }

    /* renamed from: k */
    public static String m107236k(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if (aweme.getAwemeType() == 13) {
            aweme = aweme.getForwardItem();
        }
        if (aweme == null) {
            return "";
        }
        if (aweme.getMusic() == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(aweme.getMusic().getId());
        return sb.toString();
    }

    /* renamed from: p */
    public static boolean m107241p(Aweme aweme) {
        IAccountUserService userService = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).userService();
        if (aweme == null || !TextUtils.equals(aweme.getAuthorUid(), userService.getCurUserId())) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    public static String m107245t(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if (aweme.getDistributeType() == 1) {
            return "short";
        }
        if (aweme.getDistributeType() == 2) {
            return "long_direct";
        }
        if (aweme.getDistributeType() == 3) {
            return "long_with_short";
        }
        return "";
    }

    /* renamed from: w */
    public static String m107248w(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if (aweme.isForwardAweme()) {
            return aweme.getAuthorUid();
        }
        if (!TextUtils.isEmpty(aweme.getRepostFromUserId())) {
            return aweme.getRepostFromUserId();
        }
        return aweme.getAuthorUid();
    }

    /* renamed from: a */
    public static String m107207a(Music music) {
        if (music == null) {
            return "";
        }
        return music.getMusicName();
    }

    /* renamed from: b */
    public static String m107217b(User user) {
        if (user == null) {
            return "";
        }
        return user.getUid();
    }

    /* renamed from: k */
    private static Object m107235k(String str) throws JSONException {
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            String a = C28199ae.m92689a().mo71791a(str);
            if (C7163a.m22363a() && TextUtils.isEmpty(a) && !TextUtils.isEmpty(str)) {
                StringBuilder sb = new StringBuilder("仅 local_test，after convert ,log_pb shouldn't be null,log_pb:");
                sb.append(str);
                new Handler(Looper.getMainLooper()).post(new C33231ad(new IllegalArgumentException(sb.toString())));
            }
            return a;
        }
    }

    /* renamed from: a */
    public static String m107208a(User user) {
        if (user != null) {
            return user.getUid();
        }
        return "";
    }

    /* renamed from: b */
    public static String m107218b(String str) {
        float f;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if ("<1km".equalsIgnoreCase(str)) {
            return "type_0_1";
        }
        if (">100km".equalsIgnoreCase(str)) {
            return "type_20+";
        }
        int indexOf = str.indexOf("km");
        if (indexOf == -1) {
            return "";
        }
        try {
            f = Float.parseFloat(str.substring(0, indexOf));
        } catch (Exception unused) {
            f = 0.0f;
        }
        if (f <= 1.0f) {
            return "type_0_1";
        }
        if (f > 1.0f && f <= 3.0f) {
            return "type_1_3";
        }
        if (f > 3.0f && f <= 5.0f) {
            return "type_3_5";
        }
        if (f > 5.0f && f <= 10.0f) {
            return "type_5_10";
        }
        if (f > 10.0f && f <= 20.0f) {
            return "type_10_20";
        }
        if (f > 20.0f) {
            return "type_20+";
        }
        return "";
    }

    /* renamed from: d */
    public static boolean m107222d(String str) {
        if ("homepage_hot".equals(str) || "homepage_follow".equals(str) || "rec_follow".equals(str) || "homepage_fresh".equals(str) || "general_search".equals(str) || "search_result".equals(str) || "search_sug".equals(str) || "homepage_channel".equals(str) || "others_homepage".equals(str) || "find_friends".equals(str) || "categorized_city_poi".equalsIgnoreCase(str) || "challenge".equalsIgnoreCase(str) || "hot_search_video_board".equals(str) || "homepage_country".equals(str) || "homepage_friends".equals(str) || "personal_homepage".equals(str) || "playlist".equals(str) || "homepage_fresh_feed".equalsIgnoreCase(str) || "like_list".equals(str) || "homepage_familiar".equals(str) || TextUtils.equals("discovery_category", str)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static String m107209a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int indexOf = str.indexOf("km");
        if (indexOf != -1) {
            return str.substring(0, indexOf);
        }
        return "";
    }

    /* renamed from: a */
    public static JSONObject m107211a(Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            for (String str : map.keySet()) {
                try {
                    String str2 = (String) map.get(str);
                    if (TextUtils.equals("log_pb", str)) {
                        if (C7163a.m22363a() && TextUtils.isEmpty(str2)) {
                            StringBuilder sb = new StringBuilder("maybe is bug,should fix it?");
                            sb.append(map.toString());
                            C6921a.m21552a(4, "MobUtils", sb.toString());
                        }
                        jSONObject.put(str, m107235k(str2));
                    } else {
                        jSONObject.put(str, str2);
                    }
                } catch (JSONException e) {
                    C6921a.m21559a((Throwable) e);
                }
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static String m107206a(Aweme aweme, int i) {
        if (aweme == null) {
            return "";
        }
        return m107210a(aweme.getAid(), i);
    }

    /* renamed from: b */
    public static String m107216b(Aweme aweme, int i) {
        JSONObject requestIdAndOrderJsonObject = ((IRequestIdService) ServiceManager.get().getService(IRequestIdService.class)).getRequestIdAndOrderJsonObject(aweme, i);
        if (requestIdAndOrderJsonObject != null) {
            return requestIdAndOrderJsonObject.optString(POIService.KEY_ORDER);
        }
        return "";
    }

    /* renamed from: a */
    public static String m107210a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i);
        return ((IRequestIdService) ServiceManager.get().getService(IRequestIdService.class)).getRequestIdAndIndex(sb.toString()).f61058a;
    }
}
