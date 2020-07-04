package com.p280ss.android.vesdk;

import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vesdk.ab */
public final class C45251ab {

    /* renamed from: a */
    public static boolean f116417a;

    /* renamed from: b */
    public static boolean f116418b;

    /* renamed from: c */
    public static boolean f116419c;

    /* renamed from: d */
    public static Map<String, Long> f116420d = new HashMap();

    /* renamed from: e */
    private static boolean f116421e;

    /* renamed from: f */
    private static boolean f116422f;

    /* renamed from: a */
    public static boolean m142755a() {
        return f116421e;
    }

    /* renamed from: b */
    public static boolean m142756b() {
        return f116422f;
    }

    /* renamed from: a */
    public static void m142753a(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if ((i & 8) == 8) {
            z = true;
        } else {
            z = false;
        }
        f116421e = z;
        if ((i & 64) == 64) {
            z2 = true;
        } else {
            z2 = false;
        }
        f116422f = z2;
        if ((i & 512) == 512) {
            z3 = true;
        } else {
            z3 = false;
        }
        f116418b = z3;
        if ((i & VideoCacheReadBuffersizeExperiment.DEFAULT) == 8192) {
            z4 = true;
        }
        f116419c = z4;
    }

    /* renamed from: a */
    public static void m142754a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str2 = (String) keys.next();
                try {
                    f116420d.put(str2, Long.valueOf(jSONObject.getLong(str2)));
                } catch (JSONException unused) {
                }
            }
        } catch (JSONException unused2) {
        }
    }
}
