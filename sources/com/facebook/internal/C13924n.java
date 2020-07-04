package com.facebook.internal;

import android.net.Uri;
import java.util.EnumSet;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.n */
public final class C13924n {

    /* renamed from: a */
    public boolean f36837a;

    /* renamed from: b */
    public String f36838b;

    /* renamed from: c */
    public boolean f36839c;

    /* renamed from: d */
    public int f36840d;

    /* renamed from: e */
    public EnumSet<SmartLoginOption> f36841e;

    /* renamed from: f */
    public Map<String, Map<String, C13925a>> f36842f;

    /* renamed from: g */
    public boolean f36843g;

    /* renamed from: h */
    public C13912i f36844h;

    /* renamed from: i */
    public String f36845i;

    /* renamed from: j */
    public String f36846j;

    /* renamed from: k */
    public boolean f36847k;

    /* renamed from: l */
    public boolean f36848l;

    /* renamed from: m */
    public String f36849m;

    /* renamed from: n */
    public JSONArray f36850n;

    /* renamed from: o */
    public boolean f36851o;

    /* renamed from: com.facebook.internal.n$a */
    public static class C13925a {

        /* renamed from: a */
        public String f36852a;

        /* renamed from: b */
        public String f36853b;

        /* renamed from: c */
        public Uri f36854c;

        /* renamed from: d */
        public int[] f36855d;

        /* renamed from: a */
        private static int[] m41096a(JSONArray jSONArray) {
            if (jSONArray == null) {
                return null;
            }
            int length = jSONArray.length();
            int[] iArr = new int[length];
            for (int i = 0; i < length; i++) {
                int optInt = jSONArray.optInt(i, -1);
                if (optInt == -1) {
                    String optString = jSONArray.optString(i);
                    if (!C13967z.m41249a(optString)) {
                        try {
                            optInt = Integer.parseInt(optString);
                        } catch (NumberFormatException unused) {
                            optInt = -1;
                        }
                    }
                }
                iArr[i] = optInt;
            }
            return iArr;
        }

        /* renamed from: a */
        public static C13925a m41095a(JSONObject jSONObject) {
            String optString = jSONObject.optString("name");
            Uri uri = null;
            if (C13967z.m41249a(optString)) {
                return null;
            }
            String[] split = optString.split("\\|");
            if (split.length != 2) {
                return null;
            }
            String str = split[0];
            String str2 = split[1];
            if (C13967z.m41249a(str) || C13967z.m41249a(str2)) {
                return null;
            }
            String optString2 = jSONObject.optString("url");
            if (!C13967z.m41249a(optString2)) {
                uri = Uri.parse(optString2);
            }
            return new C13925a(str, str2, uri, m41096a(jSONObject.optJSONArray("versions")));
        }

        private C13925a(String str, String str2, Uri uri, int[] iArr) {
            this.f36852a = str;
            this.f36853b = str2;
            this.f36854c = uri;
            this.f36855d = iArr;
        }
    }

    /* renamed from: a */
    public static C13925a m41094a(String str, String str2, String str3) {
        if (C13967z.m41249a(str2) || C13967z.m41249a(str3)) {
            return null;
        }
        C13924n a = C13926o.m41097a(str);
        if (a != null) {
            Map map = (Map) a.f36842f.get(str2);
            if (map != null) {
                return (C13925a) map.get(str3);
            }
        }
        return null;
    }

    public C13924n(boolean z, String str, boolean z2, int i, EnumSet<SmartLoginOption> enumSet, Map<String, Map<String, C13925a>> map, boolean z3, C13912i iVar, String str2, String str3, boolean z4, boolean z5, JSONArray jSONArray, String str4, boolean z6) {
        this.f36837a = z;
        this.f36838b = str;
        this.f36839c = z2;
        this.f36842f = map;
        this.f36844h = iVar;
        this.f36840d = i;
        this.f36843g = z3;
        this.f36841e = enumSet;
        this.f36845i = str2;
        this.f36846j = str3;
        this.f36847k = z4;
        this.f36848l = z5;
        this.f36850n = jSONArray;
        this.f36849m = str4;
        this.f36851o = z6;
    }
}
