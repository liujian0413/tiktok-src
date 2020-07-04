package com.bytedance.android.livesdk.p410o.p411a;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.o.a.e */
public final class C8711e implements C8710d {

    /* renamed from: a */
    private Map<String, C8710d> f23719a;

    /* renamed from: b */
    private C8710d f23720b;

    /* renamed from: com.bytedance.android.livesdk.o.a.e$a */
    static final class C8712a {

        /* renamed from: a */
        public static final C8711e f23721a = new C8711e();
    }

    /* renamed from: a */
    public static C8711e m26032a() {
        return C8712a.f23721a;
    }

    C8711e() {
        m26033b();
    }

    /* renamed from: b */
    private void m26033b() {
        this.f23719a = new HashMap();
        this.f23719a.put("android.permission.CAMERA", new C8708b());
        this.f23719a.put("android.permission.RECORD_AUDIO", new C8707a());
        this.f23719a.put("android.permission.READ_CONTACTS", new C8713f());
        this.f23720b = new C8709c();
    }

    /* renamed from: a */
    public final boolean mo21711a(Context context, String str) {
        if (this.f23719a.containsKey(str)) {
            return ((C8710d) this.f23719a.get(str)).mo21711a(context, str);
        }
        return this.f23720b.mo21711a(context, str);
    }

    /* renamed from: a */
    public final boolean mo21712a(Context context, String[] strArr) {
        for (String a : strArr) {
            if (!mo21711a(context, a)) {
                return false;
            }
        }
        return true;
    }
}
