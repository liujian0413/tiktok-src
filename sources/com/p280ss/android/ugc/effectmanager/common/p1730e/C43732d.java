package com.p280ss.android.ugc.effectmanager.common.p1730e;

import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.effectmanager.common.e.d */
public final class C43732d {

    /* renamed from: a */
    public HashMap<String, Object> f113231a = new HashMap<>();

    /* renamed from: a */
    public static C43732d m138588a() {
        return new C43732d();
    }

    /* renamed from: b */
    public final synchronized JSONObject mo105777b() {
        try {
        } catch (Exception unused) {
            return null;
        }
        return new JSONObject(this.f113231a);
    }

    /* renamed from: a */
    public final C43732d mo105774a(String str, Integer num) {
        this.f113231a.put(str, num);
        return this;
    }

    /* renamed from: a */
    public final C43732d mo105775a(String str, Long l) {
        this.f113231a.put(str, l);
        return this;
    }

    /* renamed from: a */
    public final C43732d mo105776a(String str, String str2) {
        this.f113231a.put(str, str2);
        return this;
    }
}
