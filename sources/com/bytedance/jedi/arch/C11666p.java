package com.bytedance.jedi.arch;

import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.jedi.arch.p */
public final class C11666p implements C11665o {

    /* renamed from: a */
    private boolean f31352a = true;

    /* renamed from: a */
    public final <S extends C11670t, VM extends JediViewModel<S>, T extends C11664n<S, VM>> T mo29189a(Class<VM> cls) {
        C7573i.m23587b(cls, "clazz");
        StringBuilder sb = new StringBuilder();
        sb.append(cls.getName());
        sb.append("_MiddlewareBinding");
        String sb2 = sb.toString();
        T t = null;
        try {
            if (this.f31352a) {
                Object obj = C11667q.f31353a.get(sb2);
                if (((Class) obj) != null || !C11667q.f31353a.containsKey(sb2)) {
                    Class cls2 = (Class) obj;
                    if (cls2 == null) {
                        cls2 = Class.forName(sb2);
                        C11667q.f31353a.put(sb2, cls2);
                    }
                    T newInstance = cls2.newInstance();
                    if (!(newInstance instanceof C11664n)) {
                        newInstance = null;
                    }
                    T t2 = (C11664n) newInstance;
                    if (t2 != null) {
                        this.f31352a = false;
                        t = t2;
                    }
                } else {
                    this.f31352a = false;
                    return null;
                }
            }
        } catch (Exception unused) {
            C11667q.f31353a.put(sb2, null);
            this.f31352a = false;
        }
        return t;
    }
}
