package com.bytedance.ies.p555c.p556a;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ies.c.a.b */
public final class C10711b {

    /* renamed from: a */
    private static List<C10712a> f28630a = new ArrayList();

    /* renamed from: com.bytedance.ies.c.a.b$a */
    public static class C10712a {

        /* renamed from: a */
        public boolean f28631a;

        /* renamed from: b */
        public String f28632b;

        /* renamed from: c */
        public String f28633c;

        public C10712a(boolean z, String str, String str2) {
            this.f28631a = z;
            this.f28632b = str;
            this.f28633c = str2;
        }
    }

    /* renamed from: a */
    public static void m31284a(String str, String str2) {
        if (C10710a.m31283a()) {
            synchronized (f28630a) {
                f28630a.add(new C10712a(false, str, str2));
            }
        }
    }

    /* renamed from: b */
    public static void m31285b(String str, String str2) {
        if (C10710a.m31283a()) {
            synchronized (f28630a) {
                f28630a.add(new C10712a(true, str, str2));
            }
        }
    }
}
