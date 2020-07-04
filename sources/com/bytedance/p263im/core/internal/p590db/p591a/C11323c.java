package com.bytedance.p263im.core.internal.p590db.p591a;

import android.text.TextUtils;
import com.bytedance.p263im.core.internal.p590db.p592b.C11327a;
import com.bytedance.p263im.core.internal.p590db.p592b.C11351d;
import com.bytedance.p263im.core.internal.utils.C11404d;
import com.bytedance.p263im.core.p584a.C11198c;
import com.bytedance.p263im.core.p586b.C11209d;

/* renamed from: com.bytedance.im.core.internal.db.a.c */
public final class C11323c {

    /* renamed from: a */
    private static String f30667a;

    /* renamed from: b */
    private static volatile C11351d f30668b;

    /* renamed from: a */
    public static synchronized C11351d m33202a() {
        synchronized (C11323c.class) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(C11198c.m32777a().f30372b.mo27230a());
                sb.append("_im.db");
                String sb2 = sb.toString();
                if (f30668b == null || !sb2.equals(f30667a) || !f30668b.mo27366a()) {
                    if (f30668b != null) {
                        m33203a(f30668b);
                    }
                    C11198c.m32777a().f30372b.mo27240g();
                    C11327a a = m33201a(sb2);
                    a.mo27333c();
                    f30667a = sb2;
                    f30668b = a.mo27332b();
                    C11351d dVar = f30668b;
                    return dVar;
                }
                C11351d dVar2 = f30668b;
                return dVar2;
            } catch (Exception e) {
                C11404d.m33585a("getIMDB", (Throwable) e);
                C11209d.m32824a(e);
            }
        }
    }

    /* renamed from: a */
    private static void m33203a(C11351d dVar) {
        if (dVar != null) {
            try {
                dVar.mo27368b();
            } catch (Exception e) {
                C11404d.m33585a("close db", (Throwable) e);
                C11209d.m32824a(e);
            }
        }
    }

    /* renamed from: a */
    private static C11327a m33201a(String str) {
        if (!C11198c.m32777a().mo27248b().f30405e || TextUtils.isEmpty(C11198c.m32777a().mo27248b().f30424x)) {
            return new C11322b(C11198c.m32777a().f30371a, str);
        }
        return new C11325e(C11198c.m32777a().f30371a, str, C11198c.m32777a().mo27248b().f30424x);
    }
}
