package com.bytedance.ies.abmock;

import java.util.regex.Pattern;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.ies.abmock.l */
public final class C10293l {

    /* renamed from: a */
    private static final Pattern f27950a = Pattern.compile("_(\\w)");

    /* renamed from: a */
    public static final <T> T m30489a(String str, Class<T> cls) {
        C7573i.m23587b(str, "json");
        return C6389g.m19890a().mo15974a(str, cls);
    }
}
