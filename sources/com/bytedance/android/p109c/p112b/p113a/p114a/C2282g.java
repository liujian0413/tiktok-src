package com.bytedance.android.p109c.p112b.p113a.p114a;

import com.bytedance.android.p109c.p112b.p113a.C2275a;
import java.util.List;

/* renamed from: com.bytedance.android.c.b.a.a.g */
public final class C2282g {
    /* renamed from: a */
    public static int m9815a(int i, String str) {
        int b = C2275a.m9791b(str);
        return b + C2275a.m9794e(b) + C2275a.m9794e((i << 3) | 0);
    }

    /* renamed from: a */
    public static int m9816a(int i, List<String> list) {
        int i2 = 0;
        for (String a : list) {
            i2 += m9815a(10, a);
        }
        return i2;
    }

    /* renamed from: a */
    public static void m9817a(C2275a aVar, int i, String str) {
        aVar.mo8071b((i << 3) | 2);
        aVar.mo8071b(C2275a.m9791b(str));
        aVar.mo8069a(str);
    }

    /* renamed from: a */
    public static void m9818a(C2275a aVar, int i, List<String> list) {
        for (String a : list) {
            m9817a(aVar, 10, a);
        }
    }
}
