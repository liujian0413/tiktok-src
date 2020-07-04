package com.p280ss.video.rtc.base.utils;

import com.google.gson.C6600e;
import com.google.gson.C6607f;

/* renamed from: com.ss.video.rtc.base.utils.JsonUtils */
public class JsonUtils {
    private static final C6600e sGson = new C6607f().mo15992f();

    public static String toJson(Object obj) {
        return sGson.mo15979b(obj);
    }

    public static <T> T fromJson(String str, Class<T> cls) {
        return sGson.mo15974a(str, cls);
    }

    public static <T> T convert(Object obj, Class<T> cls) {
        C6600e eVar = sGson;
        return eVar.mo15974a(eVar.mo15979b(obj), cls);
    }
}
