package com.p280ss.android.ugc.aweme.utils;

import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.utils.ba */
public final class C42967ba {

    /* renamed from: a */
    private HashMap<String, Object> f111529a = new HashMap<>();

    /* renamed from: a */
    public static C42967ba m136396a() {
        return new C42967ba();
    }

    /* renamed from: b */
    public final synchronized JSONObject mo104681b() {
        try {
        } catch (Exception unused) {
            return null;
        }
        return new JSONObject(this.f111529a);
    }

    /* renamed from: a */
    public final C42967ba mo104679a(String str, Integer num) {
        this.f111529a.put(str, num);
        return this;
    }

    /* renamed from: a */
    public final C42967ba mo104680a(String str, String str2) {
        this.f111529a.put(str, str2);
        return this;
    }
}
