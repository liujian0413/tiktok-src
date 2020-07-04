package com.p280ss.android.ugc.aweme.util;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.util.q */
public final class C42893q {
    /* renamed from: a */
    public static JSONObject m136189a(ReadableMap readableMap) {
        return new JSONObject(readableMap.toHashMap());
    }

    /* renamed from: a */
    public static void m136190a(Callback callback, int i) {
        m136191a(callback, i, null);
    }

    /* renamed from: a */
    public static void m136191a(Callback callback, int i, String str) {
        m136192a(callback, i, str, null);
    }

    /* renamed from: a */
    private static void m136192a(Callback callback, int i, String str, WritableMap writableMap) {
        if (callback != null) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("code", i);
            createMap.putString("message", str);
            createMap.putMap("data", null);
            callback.invoke(createMap);
        }
    }
}
