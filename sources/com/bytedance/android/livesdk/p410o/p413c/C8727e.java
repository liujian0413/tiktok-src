package com.bytedance.android.livesdk.p410o.p413c;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.o.c.e */
public final class C8727e implements C8725c {

    /* renamed from: b */
    private static final Map<String, C8725c> f23736b;

    /* renamed from: a */
    C8725c f23737a;

    /* renamed from: com.bytedance.android.livesdk.o.c.e$a */
    static final class C8728a {

        /* renamed from: a */
        public static final C8725c f23738a = new C8727e();
    }

    /* renamed from: c */
    public static C8725c m26082c() {
        return C8728a.f23738a;
    }

    /* renamed from: b */
    public final boolean mo21731b() {
        return m26083d().mo21731b();
    }

    /* renamed from: a */
    public final boolean mo21730a() {
        return m26083d().mo21730a();
    }

    /* renamed from: d */
    private C8725c m26083d() {
        if (this.f23737a == null) {
            this.f23737a = new C8723a();
            String str = Build.MANUFACTURER;
            if (!TextUtils.isEmpty(str)) {
                String upperCase = str.toUpperCase();
                if (f23736b.containsKey(upperCase)) {
                    this.f23737a = (C8725c) f23736b.get(upperCase);
                }
            }
        }
        return this.f23737a;
    }

    static {
        HashMap hashMap = new HashMap();
        f23736b = hashMap;
        hashMap.put("VIVO", new C8730g());
        f23736b.put("MEIZU", new C8726d());
        f23736b.put("HUAWEI", new C8724b());
        f23736b.put("XIAOMI", new C8731h());
        f23736b.put("OPPO", new C8729f());
    }

    /* renamed from: a */
    public final Intent mo21729a(Context context) {
        return m26083d().mo21729a(context);
    }
}
