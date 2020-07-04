package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C14793ay;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.oj */
public final class C15924oj {
    /* renamed from: a */
    public static List<String> m51487a(JSONObject jSONObject, String str) throws JSONException {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(optJSONArray.length());
        for (int i = 0; i < optJSONArray.length(); i++) {
            arrayList.add(optJSONArray.getString(i));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    public static void m51488a(Context context, String str, abj abj, String str2, boolean z, List<String> list) {
        if (list != null && !list.isEmpty()) {
            String str3 = z ? "1" : "0";
            for (String a : list) {
                String a2 = m51486a(m51486a(m51486a(m51486a(m51486a(m51486a(m51486a(a, "@gw_adlocid@", str2), "@gw_adnetrefresh@", str3), "@gw_qdata@", abj.f39878r.f44746i), "@gw_sdkver@", str), "@gw_sessid@", bym.m50300e()), "@gw_seqnum@", abj.f39870j), "@gw_adnetstatus@", abj.f39880t);
                if (abj.f39875o != null) {
                    a2 = m51486a(m51486a(a2, "@gw_adnetid@", abj.f39875o.f44716b), "@gw_allocid@", abj.f39875o.f44718d);
                }
                acl.m45528a(context, str, abd.m45356a(a2, context, abj.f39855P));
            }
        }
    }

    /* renamed from: a */
    public static void m51489a(Context context, String str, List<String> list, String str2, String str3, zzbaz zzbaz) {
        if (list != null && !list.isEmpty()) {
            String a = m51485a(str2);
            String a2 = m51485a(str3);
            long a3 = C14793ay.m42901g().mo38684a();
            for (String a4 : list) {
                String a5 = m51486a(m51486a(m51486a(a4, "@gw_rwd_userid@", Uri.encode(a)), "@gw_rwd_custom_data@", Uri.encode(a2)), "@gw_tmstmp@", Long.toString(a3));
                if (zzbaz != null) {
                    a5 = m51486a(m51486a(a5, "@gw_rwd_itm@", Uri.encode(zzbaz.f45667a)), "@gw_rwd_amt@", Integer.toString(zzbaz.f45668b));
                }
                acl.m45528a(context, str, a5);
            }
        }
    }

    /* renamed from: a */
    private static String m51486a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    /* renamed from: a */
    private static String m51485a(String str) {
        return (TextUtils.isEmpty(str) || !afg.m45762c()) ? str : "fakeForAdDebugLog";
    }

    /* renamed from: a */
    public static boolean m51490a(String str, int[] iArr) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String[] split = str.split("x");
        if (split.length != 2) {
            return false;
        }
        try {
            iArr[0] = Integer.parseInt(split[0]);
            iArr[1] = Integer.parseInt(split[1]);
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
