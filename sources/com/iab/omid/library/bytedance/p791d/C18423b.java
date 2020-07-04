package com.iab.omid.library.bytedance.p791d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build.VERSION;
import android.view.WindowManager;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.bytedance.d.b */
public final class C18423b {

    /* renamed from: a */
    static float f49963a = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: b */
    private static WindowManager f49964b;

    /* renamed from: c */
    private static String[] f49965c = {"x", "y", "width", "height"};

    /* renamed from: com.iab.omid.library.bytedance.d.b$a */
    static class C18424a {

        /* renamed from: a */
        final float f49966a;

        /* renamed from: b */
        final float f49967b;

        C18424a(float f, float f2) {
            this.f49966a = f;
            this.f49967b = f2;
        }
    }

    /* renamed from: a */
    private static float m60650a(int i) {
        return ((float) i) / f49963a;
    }

    /* renamed from: a */
    public static JSONObject m60651a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", (double) m60650a(i));
            jSONObject.put("y", (double) m60650a(i2));
            jSONObject.put("width", (double) m60650a(i3));
            jSONObject.put("height", (double) m60650a(i4));
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m60652a(Context context) {
        if (context != null) {
            f49963a = context.getResources().getDisplayMetrics().density;
            f49964b = (WindowManager) context.getSystemService("window");
        }
    }

    /* renamed from: a */
    public static void m60653a(JSONObject jSONObject) {
        C18424a b = m60659b(jSONObject);
        try {
            jSONObject.put("width", (double) b.f49966a);
            jSONObject.put("height", (double) b.f49967b);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public static void m60654a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public static void m60655a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException unused) {
            StringBuilder sb = new StringBuilder("JSONException during JSONObject.put for name [");
            sb.append(str);
            sb.append("]");
        }
    }

    /* renamed from: a */
    public static void m60656a(JSONObject jSONObject, List<String> list) {
        JSONArray jSONArray = new JSONArray();
        for (String put : list) {
            jSONArray.put(put);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public static void m60657a(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
                jSONObject.put("childViews", optJSONArray);
            }
            optJSONArray.put(jSONObject2);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    private static boolean m60658a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }

    /* renamed from: b */
    private static C18424a m60659b(JSONObject jSONObject) {
        float f;
        float f2 = 0.0f;
        if (VERSION.SDK_INT < 17) {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                float f3 = 0.0f;
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        double optDouble = optJSONObject.optDouble("x");
                        double optDouble2 = optJSONObject.optDouble("y");
                        double optDouble3 = optJSONObject.optDouble("width");
                        double optDouble4 = optJSONObject.optDouble("height");
                        f2 = Math.max(f2, (float) (optDouble + optDouble3));
                        f3 = Math.max(f3, (float) (optDouble2 + optDouble4));
                    }
                }
                f = f3;
                return new C18424a(f2, f);
            }
        } else if (f49964b != null) {
            Point point = new Point(0, 0);
            f49964b.getDefaultDisplay().getRealSize(point);
            f2 = m60650a(point.x);
            f = m60650a(point.y);
            return new C18424a(f2, f);
        }
        f = 0.0f;
        return new C18424a(f2, f);
    }

    /* renamed from: b */
    public static boolean m60660b(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        return jSONObject != null && jSONObject2 != null && m60661c(jSONObject, jSONObject2) && m60662d(jSONObject, jSONObject2) && m60663e(jSONObject, jSONObject2) && m60664f(jSONObject, jSONObject2);
    }

    /* renamed from: c */
    private static boolean m60661c(JSONObject jSONObject, JSONObject jSONObject2) {
        String[] strArr;
        for (String str : f49965c) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m60662d(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    /* renamed from: e */
    private static boolean m60663e(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m60658a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (!optJSONArray.optString(i, "").equals(optJSONArray2.optString(i, ""))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    private static boolean m60664f(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m60658a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (!m60660b(optJSONArray.optJSONObject(i), optJSONArray2.optJSONObject(i))) {
                return false;
            }
        }
        return true;
    }
}
