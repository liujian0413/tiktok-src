package com.p280ss.android.ugc.p302a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.a.a */
public final class C6843a {

    /* renamed from: a */
    private String f19478a;

    /* renamed from: b */
    private Class f19479b;

    /* renamed from: c */
    private Object[] f19480c;

    /* renamed from: d */
    private Class f19481d;

    /* renamed from: e */
    private Class f19482e;

    /* renamed from: f */
    private C6849c f19483f;

    /* renamed from: g */
    private C6853f f19484g;

    /* renamed from: h */
    private C6850d f19485h;

    /* renamed from: i */
    private int f19486i;

    /* renamed from: j */
    private C6852e<Class> f19487j;

    /* renamed from: b */
    public final C6843a mo16705b() {
        this.f19486i = 1001;
        return this;
    }

    /* renamed from: c */
    public final <T> T mo16706c() {
        return m21278d();
    }

    /* renamed from: a */
    public final C6843a mo16703a() {
        this.f19486i = 1002;
        return this;
    }

    /* renamed from: d */
    private <T> T m21278d() {
        Object obj;
        if (this.f19483f != null) {
            if (this.f19478a != null) {
                obj = this.f19483f.mo16711a(this.f19478a, this.f19480c);
            } else if (this.f19479b != null) {
                obj = this.f19483f.mo16712a(this.f19479b, this.f19480c);
            }
            if (obj == null && this.f19484g != null) {
                obj = C6853f.m21299a(this.f19478a);
            }
            if (obj == null && this.f19485h != null) {
                obj = this.f19485h.get(this.f19481d, this.f19482e);
            }
            return m21277a((T) obj);
        }
        obj = null;
        obj = C6853f.m21299a(this.f19478a);
        obj = this.f19485h.get(this.f19481d, this.f19482e);
        return m21277a((T) obj);
    }

    /* renamed from: a */
    private C6843a m21274a(C6849c cVar) {
        cVar.getClass();
        this.f19483f = cVar;
        return this;
    }

    /* renamed from: a */
    public static C6843a m21275a(Class cls) {
        return new C6843a(cls, cls);
    }

    /* renamed from: a */
    private <T> T m21277a(T t) {
        if (t == null) {
            return null;
        }
        if (t instanceof List) {
            if (this.f19486i == 1002) {
                List list = (List) t;
                if (list.isEmpty()) {
                    return null;
                }
                return list.get(0);
            } else if (this.f19486i == 1001) {
                T arrayList = new ArrayList();
                if (this.f19487j != null) {
                    for (Object next : (List) t) {
                        if (this.f19487j.mo16715a(next.getClass())) {
                            arrayList.add(next);
                        }
                    }
                } else {
                    arrayList.addAll((Collection) t);
                }
                t = arrayList;
            }
        } else if (this.f19486i == 1001) {
            T arrayList2 = new ArrayList();
            arrayList2.add(t);
            return arrayList2;
        }
        return t;
    }

    /* renamed from: a */
    public final C6843a mo16704a(C6850d dVar) {
        dVar.getClass();
        this.f19485h = dVar;
        return this;
    }

    private C6843a(Class cls, Class cls2) {
        cls.getClass();
        this.f19479b = cls;
        this.f19481d = cls2;
        mo16705b();
        m21274a((C6849c) new C6849c() {
        });
        mo16704a((C6850d) new C6850d() {
        });
    }

    /* renamed from: a */
    public static C6843a m21276a(Class cls, Class cls2) {
        return new C6843a(cls, null);
    }
}
