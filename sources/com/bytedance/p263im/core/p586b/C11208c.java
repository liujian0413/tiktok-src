package com.bytedance.p263im.core.p586b;

import java.util.HashMap;

/* renamed from: com.bytedance.im.core.b.c */
public final class C11208c {

    /* renamed from: a */
    private String f30427a;

    /* renamed from: b */
    private String f30428b;

    /* renamed from: c */
    private HashMap<String, Object> f30429c = new HashMap<>();

    /* renamed from: d */
    private HashMap<String, Object> f30430d = new HashMap<>();

    /* renamed from: a */
    public static C11208c m32815a() {
        return new C11208c();
    }

    /* renamed from: b */
    public final void mo27260b() {
        C11209d.m32828a(this.f30427a, this.f30428b, this.f30429c, this.f30430d);
    }

    private C11208c() {
    }

    /* renamed from: a */
    public final C11208c mo27256a(String str) {
        this.f30427a = str;
        return this;
    }

    /* renamed from: b */
    public final C11208c mo27258b(String str) {
        this.f30428b = str;
        return this;
    }

    /* renamed from: b */
    public final C11208c mo27259b(String str, Object obj) {
        this.f30430d.put(str, obj);
        return this;
    }

    /* renamed from: a */
    public final C11208c mo27257a(String str, Object obj) {
        this.f30429c.put(str, obj);
        return this;
    }
}
