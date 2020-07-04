package com.bytedance.android.livesdkapi.depend.p442e;

/* renamed from: com.bytedance.android.livesdkapi.depend.e.a */
public class C9312a<T> {

    /* renamed from: a */
    public String f25503a;

    /* renamed from: b */
    public String f25504b;

    /* renamed from: c */
    public T f25505c;

    /* renamed from: d */
    public Class<T> f25506d;

    /* renamed from: a */
    public T mo22117a() {
        return C9313b.m27683a(this);
    }

    /* renamed from: a */
    public void mo22118a(T t) {
        C9313b.m27686a(this, t);
    }

    public C9312a(String str, T t) {
        this("tt_live_sdk", str, t.getClass(), t);
    }

    public C9312a(String str, String str2, T t) {
        this(str, str2, t.getClass(), t);
    }

    private C9312a(String str, String str2, Class<T> cls, T t) {
        this.f25504b = str;
        this.f25503a = str2;
        this.f25505c = t;
        this.f25506d = cls;
        if (t == null) {
            if (this.f25506d == Integer.class || this.f25506d == Short.class) {
                this.f25505c = Integer.valueOf(0);
            } else if (this.f25506d == Long.class) {
                this.f25505c = Long.valueOf(0);
            } else if (this.f25506d == Double.class) {
                this.f25505c = Double.valueOf(0.0d);
            } else if (this.f25506d == Float.class) {
                this.f25505c = Float.valueOf(0.0f);
            } else if (this.f25506d == Boolean.class) {
                this.f25505c = Boolean.valueOf(false);
            }
        }
    }
}
