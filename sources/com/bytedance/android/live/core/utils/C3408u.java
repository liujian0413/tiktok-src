package com.bytedance.android.live.core.utils;

import android.text.TextUtils;
import com.bytedance.android.live.C2317a;
import com.google.gson.C18373n;
import com.google.gson.C6711m;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

/* renamed from: com.bytedance.android.live.core.utils.u */
public final class C3408u {

    /* renamed from: a */
    private static C18373n f10214a = new C18373n();

    /* renamed from: a */
    public static C6711m m12667a(String str) throws JsonParseException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return f10214a.mo47346a(str).mo16136m();
        } catch (Throwable th) {
            throw new JsonParseException(th);
        }
    }

    /* renamed from: a */
    public static String m12669a(Object obj) throws JsonParseException {
        if (obj == null) {
            return "";
        }
        try {
            return C2317a.m9932a().mo15979b(obj);
        } catch (Throwable th) {
            throw new JsonParseException(th);
        }
    }

    /* renamed from: a */
    public static <T> T m12668a(String str, Type type) {
        if (str == null) {
            return null;
        }
        try {
            return C2317a.m9932a().mo15975a(str, type);
        } catch (Exception unused) {
            return null;
        }
    }
}
