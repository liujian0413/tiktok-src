package com.bytedance.ies.bullet.kit.p261rn.p546c;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.bullet.kit.rn.c.b */
public final class C10494b {
    /* renamed from: a */
    private static WritableArray m30887a(JSONArray jSONArray) throws JSONException {
        WritableArray createArray = Arguments.createArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if ((obj instanceof Float) || (obj instanceof Double)) {
                createArray.pushDouble(jSONArray.getDouble(i));
            } else if (obj instanceof Number) {
                createArray.pushInt(jSONArray.getInt(i));
            } else if (obj instanceof String) {
                createArray.pushString(jSONArray.getString(i));
            } else if (obj instanceof JSONObject) {
                createArray.pushMap(m30888a(jSONArray.getJSONObject(i)));
            } else if (obj instanceof Boolean) {
                createArray.pushBoolean(jSONArray.getBoolean(i));
            } else if (obj instanceof JSONArray) {
                createArray.pushArray(m30887a(jSONArray.getJSONArray(i)));
            } else if (obj == JSONObject.NULL) {
                createArray.pushNull();
            }
        }
        return createArray;
    }

    /* renamed from: a */
    public static WritableMap m30888a(JSONObject jSONObject) throws JSONException {
        WritableMap createMap = Arguments.createMap();
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            Object obj = jSONObject.get(str);
            if ((obj instanceof Float) || (obj instanceof Double)) {
                createMap.putDouble(str, jSONObject.getDouble(str));
            } else if (obj instanceof Number) {
                createMap.putInt(str, jSONObject.getInt(str));
            } else if (obj instanceof String) {
                createMap.putString(str, jSONObject.getString(str));
            } else if (obj instanceof JSONObject) {
                createMap.putMap(str, m30888a(jSONObject.getJSONObject(str)));
            } else if (obj instanceof JSONArray) {
                createMap.putArray(str, m30887a(jSONObject.getJSONArray(str)));
            } else if (obj instanceof Boolean) {
                createMap.putBoolean(str, jSONObject.getBoolean(str));
            } else if (obj == JSONObject.NULL) {
                createMap.putNull(str);
            }
        }
        return createMap;
    }

    /* renamed from: a */
    private static JSONArray m30889a(ReadableArray readableArray) throws JSONException {
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
                    jSONArray.put(m30890a(readableArray.getMap(i)));
                    break;
                case Array:
                    jSONArray.put(m30889a(readableArray.getArray(i)));
                    break;
            }
        }
        return jSONArray;
    }

    /* renamed from: a */
    public static JSONObject m30890a(ReadableMap readableMap) throws JSONException {
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
                    jSONObject.put(nextKey, m30890a(readableMap.getMap(nextKey)));
                    break;
                case Array:
                    jSONObject.put(nextKey, m30889a(readableMap.getArray(nextKey)));
                    break;
            }
        }
        return jSONObject;
    }
}
