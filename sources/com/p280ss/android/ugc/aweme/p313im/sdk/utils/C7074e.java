package com.p280ss.android.ugc.aweme.p313im.sdk.utils;

import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.framwork.core.monitor.C6379c;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.statisticlogger.C10981a;
import com.p280ss.android.ugc.aweme.framework.services.IUserService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.e */
public final class C7074e {
    /* renamed from: d */
    public static long m22072d() {
        return Long.parseLong(m22069b().toString());
    }

    /* renamed from: e */
    public static CharSequence m22073e() {
        String d = C10981a.m32174d();
        if (TextUtils.isEmpty(d)) {
            return "-1";
        }
        return d;
    }

    /* renamed from: a */
    public static boolean m22066a() {
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (iUserService == null || !iUserService.isLogin()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static CharSequence m22069b() {
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (iUserService == null) {
            return "-1";
        }
        return iUserService.getCurrentUserID();
    }

    /* renamed from: c */
    public static User m22071c() {
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (iUserService == null) {
            return null;
        }
        return iUserService.getCurrentUser();
    }

    /* renamed from: f */
    public static String m22074f() {
        String str = "";
        try {
            TelephonyManager telephonyManager = (TelephonyManager) C6399b.m19921a().getSystemService("phone");
            if (telephonyManager == null) {
                return str;
            }
            str = telephonyManager.getNetworkOperator();
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            return "";
        } catch (Exception unused) {
        }
    }

    /* renamed from: g */
    public static String m22075g() {
        String str = "";
        try {
            TelephonyManager telephonyManager = (TelephonyManager) C6399b.m19921a().getSystemService("phone");
            if (telephonyManager == null) {
                return str;
            }
            str = telephonyManager.getSimOperator();
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            return "";
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static boolean m22067a(IMUser iMUser) {
        if (iMUser == null || !m22069b().equals(iMUser.getUid())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m22068a(String str) {
        return m22069b().equals(str);
    }

    /* renamed from: b */
    public static void m22070b(String str, Map<String, Object> map) {
        m22064a(str, null, map, "im_error_event");
    }

    /* renamed from: a */
    public static void m22065a(String str, Map<String, Object> map) {
        m22063a(str, null, map);
    }

    /* renamed from: a */
    public static void m22063a(String str, String str2, Map<String, Object> map) {
        m22064a(str, str2, map, "im_event");
    }

    /* renamed from: a */
    private static void m22064a(String str, String str2, Map<String, Object> map, String str3) {
        JSONObject jSONObject = new JSONObject();
        if (map != null && !map.isEmpty()) {
            try {
                if (TextUtils.isEmpty(str2)) {
                    jSONObject.put("service", str);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append("_");
                    sb.append(str2);
                    jSONObject.put("service", sb.toString());
                }
                for (Entry entry : map.entrySet()) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
                C6379c.m19826a(str3, jSONObject);
            } catch (JSONException unused) {
            }
        }
    }
}
