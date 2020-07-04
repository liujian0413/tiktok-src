package com.p280ss.android.ugc.aweme.crossplatform.platform.p1153rn.p1154a;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableMap;
import com.p280ss.android.common.util.NetworkUtils;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.miniapp_api.services.C7167b;
import com.p280ss.android.ugc.aweme.utils.C43102em;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.rn.a.a */
public final class C25910a {
    /* renamed from: a */
    public static WritableMap m85196a() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("appName", C6399b.m19929e());
        createMap.putInt("aid", C6399b.m19935k());
        createMap.putString("appVersion", C6399b.m19934j());
        createMap.putInt("versionCode", (int) C6399b.m19933i());
        createMap.putString("netType", NetworkUtils.getNetworkAccessType(C6399b.m19921a()));
        createMap.putString("device_id", C43102em.m136719a());
        createMap.putString("user_id", C6861a.m21337f().getCurUserId());
        createMap.putString("channel", C6399b.m19941q());
        createMap.putBoolean("ironManSupported", C7167b.m22380b().mo18647a().checkMiniAppEnable(C6399b.m19921a()));
        return createMap;
    }

    /* renamed from: a */
    private static JSONArray m85198a(ReadableArray readableArray) {
        JSONArray jSONArray = new JSONArray();
        int size = readableArray.size();
        if (size > 0) {
            for (int i = 0; i < size; i++) {
                switch (readableArray.getType(i)) {
                    case Map:
                        jSONArray.put(m85199a(readableArray.getMap(i)));
                        break;
                    case Array:
                        jSONArray.put(m85198a(readableArray.getArray(i)));
                        break;
                    case Number:
                        double d = readableArray.getDouble(i);
                        long j = (long) d;
                        if (d != ((double) j)) {
                            try {
                                jSONArray.put(d);
                                break;
                            } catch (JSONException unused) {
                                break;
                            }
                        } else {
                            jSONArray.put(j);
                            break;
                        }
                    case Boolean:
                        jSONArray.put(readableArray.getBoolean(i));
                        break;
                    case String:
                        jSONArray.put(readableArray.getString(i));
                        break;
                }
            }
        }
        return jSONArray;
    }

    /* renamed from: a */
    public static JSONObject m85199a(ReadableMap readableMap) {
        JSONObject jSONObject = new JSONObject();
        try {
            ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                switch (readableMap.getType(nextKey)) {
                    case Map:
                        jSONObject.put(nextKey, m85199a(readableMap.getMap(nextKey)));
                        break;
                    case Array:
                        jSONObject.put(nextKey, m85198a(readableMap.getArray(nextKey)));
                        break;
                    case Number:
                        double d = readableMap.getDouble(nextKey);
                        long j = (long) d;
                        if (d != ((double) j)) {
                            jSONObject.put(nextKey, d);
                            break;
                        } else {
                            jSONObject.put(nextKey, j);
                            break;
                        }
                    case Boolean:
                        jSONObject.put(nextKey, readableMap.getBoolean(nextKey));
                        break;
                    case String:
                        jSONObject.put(nextKey, readableMap.getString(nextKey));
                        break;
                }
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static String m85197a(String str, ReadableMap readableMap) {
        switch (readableMap.getType(str)) {
            case Map:
                return m85199a(readableMap.getMap(str)).toString();
            case Array:
                return m85198a(readableMap.getArray(str)).toString();
            case Number:
                double d = readableMap.getDouble(str);
                long j = (long) d;
                if (d == ((double) j)) {
                    return String.valueOf(j);
                }
                return String.valueOf(d);
            case Boolean:
                return String.valueOf(readableMap.getBoolean(str));
            case String:
                return readableMap.getString(str);
            default:
                return null;
        }
    }
}
