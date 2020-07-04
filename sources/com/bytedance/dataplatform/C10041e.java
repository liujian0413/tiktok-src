package com.bytedance.dataplatform;

import java.lang.reflect.Type;

/* renamed from: com.bytedance.dataplatform.e */
public final class C10041e {

    /* renamed from: a */
    private static C10042a f27333a;

    /* renamed from: com.bytedance.dataplatform.e$a */
    public interface C10042a {
        /* renamed from: a */
        <T> T mo24686a(String str, Type type);
    }

    /* renamed from: a */
    static <T> T m29840a(String str, Type type) {
        if (f27333a == null) {
            return null;
        }
        return f27333a.mo24686a(str, type);
    }
}
