package com.p280ss.android.ugc.aweme.qrcode.p1498d;

import com.google.gson.C6600e;
import com.google.gson.p277b.C6597a;
import com.p280ss.android.ugc.aweme.router.C37286v;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.qrcode.d.a */
public final class C37070a {

    /* renamed from: a */
    public static final C37070a f97027a = new C37070a();

    /* renamed from: com.ss.android.ugc.aweme.qrcode.d.a$a */
    public static final class C37071a extends C6597a<Map<String, ? extends Object>> {
        C37071a() {
        }
    }

    private C37070a() {
    }

    /* renamed from: a */
    public static final Map<String, Object> m119196a(String str) {
        C7573i.m23587b(str, "url");
        try {
            return (Map) new C6600e().mo15975a(C37286v.m119759b(str, "meta_params"), new C37071a().type);
        } catch (Exception unused) {
            return null;
        }
    }
}
