package com.bytedance.android.livesdk.browser.jsbridge.p199a;

import com.bytedance.android.livesdkapi.depend.message.MessageType;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.a.f */
public class C4036f {

    /* renamed from: a */
    private JSONObject f12015a;

    /* renamed from: a */
    public final Set<MessageType> mo11655a() {
        HashSet hashSet = new HashSet();
        if (this.f12015a == null) {
            return hashSet;
        }
        try {
            JSONArray jSONArray = this.f12015a.getJSONArray("type_list");
            for (int i = 0; i < jSONArray.length(); i++) {
                String string = jSONArray.getString(i);
                MessageType[] values = MessageType.values();
                int length = values.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    MessageType messageType = values[i2];
                    if (messageType.getWsMethod().equals(string)) {
                        hashSet.add(messageType);
                        break;
                    }
                    i2++;
                }
            }
        } catch (JSONException unused) {
        }
        return hashSet;
    }

    public C4036f(JSONObject jSONObject) {
        this.f12015a = jSONObject;
    }
}
