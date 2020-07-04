package com.bytedance.apm.util;

import android.app.PendingIntent;
import android.net.Uri;
import android.text.TextUtils;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.util.o */
public final class C9651o {
    /* renamed from: a */
    public static String m28539a(Object[] objArr) {
        int a = C9639b.m28513a(objArr, PendingIntent.class);
        if (a >= 0) {
            PendingIntent pendingIntent = objArr[a];
            if (pendingIntent != null) {
                return C9643f.m28533a(pendingIntent);
            }
        }
        return "";
    }

    /* renamed from: a */
    public static List<String> m28540a(JSONObject jSONObject, String str) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray(str);
            if (C6291h.m19519a(optJSONArray)) {
                return null;
            }
            int length = optJSONArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                String string = optJSONArray.getString(i);
                if (!TextUtils.isEmpty(string)) {
                    arrayList.add(string);
                }
            }
            return arrayList;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static List<Pattern> m28543b(JSONObject jSONObject, String str) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray(str);
            if (optJSONArray != null && optJSONArray.length() > 0) {
                int length = optJSONArray.length();
                ArrayList arrayList = new ArrayList(length);
                for (int i = 0; i < length; i++) {
                    String string = optJSONArray.getString(i);
                    if (!TextUtils.isEmpty(string)) {
                        arrayList.add(Pattern.compile(string));
                    }
                }
                return arrayList;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m28541a(String str, List<String> list) {
        if (C6292i.m19525a(list) || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            String host = Uri.parse(str).getHost();
            for (String equalsIgnoreCase : list) {
                if (host.equalsIgnoreCase(equalsIgnoreCase)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m28542a(String str, List<String> list, List<Pattern> list2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!C6292i.m19525a(list)) {
            for (String contains : list) {
                if (str.contains(contains)) {
                    return true;
                }
            }
        }
        try {
            String path = new URI(str).getPath();
            if (!C6292i.m19525a(list2)) {
                for (Pattern matcher : list2) {
                    if (matcher.matcher(path).matches()) {
                        return true;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }
}
