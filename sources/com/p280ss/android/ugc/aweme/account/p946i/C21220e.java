package com.p280ss.android.ugc.aweme.account.p946i;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.account.i.e */
public final class C21220e {
    /* renamed from: a */
    public static String m71415a(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("group_id");
        if (TextUtils.isEmpty(string)) {
            string = "";
        }
        return string;
    }

    /* renamed from: b */
    public static String m71418b(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("log_pb");
        if (TextUtils.isEmpty(string)) {
            string = "";
        }
        return string;
    }

    /* renamed from: a */
    public static JSONObject m71417a(Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            for (String str : map.keySet()) {
                try {
                    if (TextUtils.equals("log_pb", str)) {
                        jSONObject.put(str, new JSONObject((String) map.get(str)));
                    } else {
                        jSONObject.put(str, map.get(str));
                    }
                } catch (JSONException unused) {
                }
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static String m71416a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1530308138:
                if (str.equals("qzone_sns")) {
                    c = 0;
                    break;
                }
                break;
            case -1134307907:
                if (str.equals("toutiao")) {
                    c = 3;
                    break;
                }
                break;
            case -791575966:
                if (str.equals("weixin")) {
                    c = 1;
                    break;
                }
                break;
            case -471473230:
                if (str.equals("sina_weibo")) {
                    c = 2;
                    break;
                }
                break;
            case 635922494:
                if (str.equals("toutiao_v2")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return "qq";
            case 1:
                return "weixin";
            case 2:
                return "weibo";
            case 3:
            case 4:
                return "toutiao";
            default:
                return str;
        }
    }
}
