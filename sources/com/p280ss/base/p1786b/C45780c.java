package com.p280ss.base.p1786b;

import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import com.google.p268a.p269a.p270a.p271a.p272a.C6497a;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.base.b.c */
public final class C45780c {
    /* renamed from: a */
    public static boolean m143739a() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static String m143740b(String str) {
        try {
            return new String(Base64.decode(str, 2), "UTF-8");
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static String m143738a(Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    jSONObject.put(str, map.get(str));
                }
            } catch (JSONException unused) {
            }
        }
        return jSONObject.toString();
    }

    /* renamed from: a */
    public static String m143737a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String str2 = "";
            for (byte b : MessageDigest.getInstance("MD5").digest(str.getBytes())) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    hexString = "0".concat(String.valueOf(hexString));
                }
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(hexString);
                str2 = sb.toString();
            }
            return str2;
        } catch (NoSuchAlgorithmException e) {
            C6497a.m20185b(e);
            return "";
        }
    }
}
