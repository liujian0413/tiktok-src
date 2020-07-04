package com.p280ss.android.deviceregister;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.deviceregister.l */
final class C19334l {

    /* renamed from: a */
    final String f52291a;

    /* renamed from: b */
    final Integer f52292b;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final JSONObject mo51253a() {
        try {
            return new JSONObject(this.f52291a);
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Timestamp{timestampPrimaryId=");
        sb.append(this.f52292b);
        sb.append('}');
        return sb.toString();
    }

    C19334l(String str, Integer num) {
        this.f52291a = str;
        this.f52292b = num;
    }

    C19334l(Map<String, Long> map, Integer num) {
        this.f52291a = new JSONObject(map).toString();
        this.f52292b = num;
    }
}
