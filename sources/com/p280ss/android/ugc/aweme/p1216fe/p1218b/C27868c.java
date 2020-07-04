package com.p280ss.android.ugc.aweme.p1216fe.p1218b;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.google.gson.C6709k;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.b.c */
public final class C27868c {
    /* renamed from: a */
    private static JSONArray m91295a(ReadableArray readableArray) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < readableArray.size(); i++) {
            switch (readableArray.getType(i)) {
                case Null:
                    jSONArray.put(JSONObject.NULL);
                    break;
                case Boolean:
                    jSONArray.put(readableArray.getBoolean(i));
                    break;
                case Number:
                    try {
                        jSONArray.put(readableArray.getInt(i));
                        break;
                    } catch (Exception unused) {
                        jSONArray.put(readableArray.getDouble(i));
                        break;
                    }
                case String:
                    jSONArray.put(readableArray.getString(i));
                    break;
                case Map:
                    jSONArray.put(m91296a(readableArray.getMap(i)));
                    break;
                case Array:
                    jSONArray.put(m91295a(readableArray.getArray(i)));
                    break;
            }
        }
        return jSONArray;
    }

    /* renamed from: a */
    private static WritableArray m91293a(JSONArray jSONArray) throws JSONException {
        WritableArray createArray = Arguments.createArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if ((obj instanceof Float) || (obj instanceof Double)) {
                createArray.pushDouble(jSONArray.getDouble(i));
            } else if (obj instanceof Long) {
                Long l = (Long) obj;
                int longValue = (int) l.longValue();
                if (((double) longValue) == l.doubleValue()) {
                    createArray.pushInt(jSONArray.getInt(i));
                } else {
                    createArray.pushDouble(jSONArray.getDouble(i));
                }
            } else if (obj instanceof Number) {
                createArray.pushInt(jSONArray.getInt(i));
            } else if (obj instanceof String) {
                createArray.pushString(jSONArray.getString(i));
            } else if (obj instanceof JSONObject) {
                createArray.pushMap(m91294a(jSONArray.getJSONObject(i)));
            } else if (obj instanceof Boolean) {
                createArray.pushBoolean(jSONArray.getBoolean(i));
            } else if (obj instanceof JSONArray) {
                createArray.pushArray(m91293a(jSONArray.getJSONArray(i)));
            } else if (obj == JSONObject.NULL) {
                createArray.pushNull();
            }
        }
        return createArray;
    }

    /* renamed from: a */
    public static WritableMap m91294a(JSONObject jSONObject) throws JSONException {
        WritableMap createMap = Arguments.createMap();
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            Object obj = jSONObject.get(str);
            if ((obj instanceof Float) || (obj instanceof Double)) {
                createMap.putDouble(str, jSONObject.getDouble(str));
            } else if (obj instanceof Long) {
                Long l = (Long) obj;
                int longValue = (int) l.longValue();
                if (((double) longValue) == l.doubleValue()) {
                    createMap.putInt(str, jSONObject.getInt(str));
                } else {
                    createMap.putDouble(str, jSONObject.getDouble(str));
                }
            } else if (obj instanceof Number) {
                createMap.putInt(str, jSONObject.getInt(str));
            } else if (obj instanceof String) {
                createMap.putString(str, jSONObject.getString(str));
            } else if (obj instanceof JSONObject) {
                createMap.putMap(str, m91294a(jSONObject.getJSONObject(str)));
            } else if (obj instanceof JSONArray) {
                createMap.putArray(str, m91293a(jSONObject.getJSONArray(str)));
            } else if (obj instanceof Boolean) {
                createMap.putBoolean(str, jSONObject.getBoolean(str));
            } else if (obj instanceof C6709k) {
                createMap.putString(str, obj.toString());
            } else if (obj == JSONObject.NULL) {
                createMap.putNull(str);
            }
        }
        return createMap;
    }

    /* renamed from: a */
    public static JSONObject m91296a(ReadableMap readableMap) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            switch (readableMap.getType(nextKey)) {
                case Null:
                    jSONObject.put(nextKey, JSONObject.NULL);
                    break;
                case Boolean:
                    jSONObject.put(nextKey, readableMap.getBoolean(nextKey));
                    break;
                case Number:
                    try {
                        jSONObject.put(nextKey, readableMap.getInt(nextKey));
                        break;
                    } catch (Exception unused) {
                        jSONObject.put(nextKey, readableMap.getDouble(nextKey));
                        break;
                    }
                case String:
                    jSONObject.put(nextKey, readableMap.getString(nextKey));
                    break;
                case Map:
                    jSONObject.put(nextKey, m91296a(readableMap.getMap(nextKey)));
                    break;
                case Array:
                    jSONObject.put(nextKey, m91295a(readableMap.getArray(nextKey)));
                    break;
            }
        }
        return jSONObject;
    }
}
