package com.bytedance.p066a.p067a.p068a;

import java.lang.ref.WeakReference;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.a.a.a.f */
final class C2071f {

    /* renamed from: a */
    public Method f7135a;

    /* renamed from: b */
    public Class<?> f7136b;

    /* renamed from: c */
    private WeakReference<Object> f7137c;

    /* renamed from: a */
    public final Object mo7729a() {
        return this.f7137c.get();
    }

    public C2071f(Object obj, Method method) {
        this.f7137c = new WeakReference<>(obj);
        this.f7135a = method;
        this.f7136b = obj.getClass();
    }
}
